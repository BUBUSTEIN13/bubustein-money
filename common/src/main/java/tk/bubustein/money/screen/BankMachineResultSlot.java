package tk.bubustein.money.screen;

import net.minecraft.core.NonNullList;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.inventory.RecipeCraftingHolder;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.CraftingInput;
import org.jetbrains.annotations.NotNull;
import tk.bubustein.money.recipe.ModRecipes;

public class BankMachineResultSlot extends Slot {
    private final CraftingContainer craftSlots;
    private final Player player;
    private int removeCount;
    public BankMachineResultSlot(Player player, CraftingContainer craftingContainer, Container container, int i, int j, int k) {
        super(container, i, j, k);
        this.player = player;
        this.craftSlots = craftingContainer;
    }
    public boolean mayPlace(ItemStack itemStack) {
        return false;
    }
    public @NotNull ItemStack remove(int i) {
        if (this.hasItem()) {
            this.removeCount += Math.min(i, this.getItem().getCount());
        }
        return super.remove(i);
    }
    protected void onQuickCraft(ItemStack itemStack, int i) {
        this.removeCount += i;
        this.checkTakeAchievements(itemStack);
    }
    protected void onSwapCraft(int i) {
        this.removeCount += i;
    }
    protected void checkTakeAchievements(ItemStack itemStack) {
        if (this.removeCount > 0) {
            itemStack.onCraftedBy(this.player.level(), this.player, this.removeCount);
        }
        if (this.container instanceof RecipeCraftingHolder recipeCraftingHolder) {
            recipeCraftingHolder.awardUsedRecipes(this.player, this.craftSlots.getItems());
        }
        this.removeCount = 0;
    }
    public void onTake(Player player, ItemStack itemStack) {
        this.checkTakeAchievements(itemStack);
        CraftingInput.Positioned positioned = this.craftSlots.asPositionedCraftInput();
        CraftingInput craftingInput = positioned.input();
        int i = positioned.left();
        int j = positioned.top();
        NonNullList<ItemStack> nonNullList = player.level().getRecipeManager().getRemainingItemsFor(ModRecipes.BANK_MACHINE_RECIPE.get(), craftingInput, player.level());
        for(int k = 0; k < craftingInput.height(); ++k) {
            for(int l = 0; l < craftingInput.width(); ++l) {
                int m = l + i + (k + j) * this.craftSlots.getWidth();
                ItemStack itemStack2 = this.craftSlots.getItem(m);
                ItemStack itemStack3 = nonNullList.get(l + k * craftingInput.width());
                if (!itemStack2.isEmpty()) {
                    this.craftSlots.removeItem(m, 1);
                    itemStack2 = this.craftSlots.getItem(m);
                }
                if (!itemStack3.isEmpty()) {
                    if (itemStack2.isEmpty()) {
                        this.craftSlots.setItem(m, itemStack3);
                    } else if (ItemStack.isSameItemSameComponents(itemStack2, itemStack3)) {
                        itemStack3.grow(itemStack2.getCount());
                        this.craftSlots.setItem(m, itemStack3);
                    } else if (!this.player.getInventory().add(itemStack3)) {
                        this.player.drop(itemStack3, false);
                    }
                }
            }
        }
    }
    public boolean isFake() {
        return true;
    }
}