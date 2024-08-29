package tk.bubustein.money.screen;

import java.util.Objects;
import java.util.Optional;
import net.minecraft.network.protocol.game.ClientboundContainerSetSlotPacket;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import tk.bubustein.money.block.ModBlocks;
import tk.bubustein.money.recipe.BankMachineRecipe;
import tk.bubustein.money.recipe.ModRecipes;

public class BankMachineMenu extends AbstractContainerMenu {
    private final CraftingContainer craftSlots;
    private final ResultContainer resultSlots;
    private final ContainerLevelAccess access;
    private final Player player;
    public BankMachineMenu(int i, Inventory inventory) {
        this(i, inventory, ContainerLevelAccess.NULL);
    }
    public BankMachineMenu(int i, Inventory inventory, ContainerLevelAccess containerLevelAccess) {
        super(ModMenuTypes.BANK_MACHINE_MENU.get(), i);
        this.craftSlots = new CraftingContainer(this, 3, 3);
        this.resultSlots = new ResultContainer();
        this.access = containerLevelAccess;
        this.player = inventory.player;
        this.addSlot(new BankMachineResultSlot(inventory.player, this.craftSlots, this.resultSlots, 0, 124, 35));
        int j;
        int k;
        for(j = 0; j < 3; ++j) {
            for(k = 0; k < 3; ++k) {
                this.addSlot(new Slot(this.craftSlots, k + j * 3, 30 + k * 18, 17 + j * 18));
            }
        }
        for(j = 0; j < 3; ++j) {
            for(k = 0; k < 9; ++k) {
                this.addSlot(new Slot(inventory, k + j * 9 + 9, 8 + k * 18, 84 + j * 18));
            }
        }
        for(j = 0; j < 9; ++j) {
            this.addSlot(new Slot(inventory, j, 8 + j * 18, 142));
        }
    }
    protected static void slotChangedCraftingGrid(int i, Level level, Player player, CraftingContainer craftingContainer, ResultContainer resultContainer) {
        if (!level.isClientSide) {
            ServerPlayer serverPlayer = (ServerPlayer)player;
            ItemStack itemStack = ItemStack.EMPTY;
            Optional<BankMachineRecipe> optional = Objects.requireNonNull(level.getServer()).getRecipeManager().getRecipeFor(ModRecipes.BANK_MACHINE_RECIPE, craftingContainer, level);
            if (optional.isPresent()) {
                BankMachineRecipe craftingRecipe = optional.get();
                if (resultContainer.setRecipeUsed(level, serverPlayer, craftingRecipe)) {
                    itemStack = craftingRecipe.assemble(craftingContainer);
                }
            }
            resultContainer.setItem(0, itemStack);
            serverPlayer.connection.send(new ClientboundContainerSetSlotPacket(i, 0, itemStack));
        }
    }
    public void slotsChanged(Container container) {
        this.access.execute((level, blockPos) -> slotChangedCraftingGrid(this.containerId, level, this.player, this.craftSlots, this.resultSlots));
    }
    public void removed(Player player) {
        super.removed(player);
        this.access.execute((level, blockPos) -> {
            this.clearContainer(player, level, this.craftSlots);
        });
    }
    public boolean stillValid(Player player) {
        return stillValid(this.access, player, ModBlocks.BANK_MACHINE.get());
    }
    public ItemStack quickMoveStack(Player player, int i) {
        ItemStack itemStack = ItemStack.EMPTY;
        Slot slot = this.slots.get(i);
        if (slot != null && slot.hasItem()) {
            ItemStack itemStack2 = slot.getItem();
            itemStack = itemStack2.copy();
            if (i == 0) {
                this.access.execute((level, blockPos) -> {
                    itemStack2.getItem().onCraftedBy(itemStack2, level, player);
                });
                if (!this.moveItemStackTo(itemStack2, 10, 46, true)) {
                    return ItemStack.EMPTY;
                }
                slot.onQuickCraft(itemStack2, itemStack);
            } else if (i >= 10 && i < 46) {
                if (!this.moveItemStackTo(itemStack2, 1, 10, false)) {
                    if (i < 37) {
                        if (!this.moveItemStackTo(itemStack2, 37, 46, false)) {
                            return ItemStack.EMPTY;
                        }
                    } else if (!this.moveItemStackTo(itemStack2, 10, 37, false)) {
                        return ItemStack.EMPTY;
                    }
                }
            } else if (!this.moveItemStackTo(itemStack2, 10, 46, false)) {
                return ItemStack.EMPTY;
            }
            if (itemStack2.isEmpty()) {
                slot.set(ItemStack.EMPTY);
            } else {
                slot.setChanged();
            }
            if (itemStack2.getCount() == itemStack.getCount()) {
                return ItemStack.EMPTY;
            }
            ItemStack itemStack3 = slot.onTake(player, itemStack2);
            if (i == 0) {
                player.drop(itemStack3, false);
            }
        }
        return itemStack;
    }
    public boolean canTakeItemForPickAll(ItemStack itemStack, Slot slot) {
        return slot.container != this.resultSlots && super.canTakeItemForPickAll(itemStack, slot);
    }
}