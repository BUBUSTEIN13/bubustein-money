package tk.bubustein.money.screen;

import net.minecraft.core.NonNullList;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.inventory.RecipeHolder;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
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
            itemStack.onCraftedBy(this.player.level, this.player, this.removeCount);
        }
        if (this.container instanceof RecipeHolder) {
            ((RecipeHolder)this.container).awardUsedRecipes(this.player);
        }
        this.removeCount = 0;
    }
    public void onTake(Player player, ItemStack itemStack) {
        this.checkTakeAchievements(itemStack);
        NonNullList<ItemStack> nonNullList = player.level.getRecipeManager().getRemainingItemsFor(ModRecipes.BANK_MACHINE_RECIPE.get(), this.craftSlots, player.level);
        for(int i = 0; i < nonNullList.size(); ++i) {
            ItemStack itemStack2 = this.craftSlots.getItem(i);
            ItemStack itemStack3 = nonNullList.get(i);
            if (!itemStack2.isEmpty()) {
                this.craftSlots.removeItem(i, 1);
                itemStack2 = this.craftSlots.getItem(i);
            }
            if (!itemStack3.isEmpty()) {
                if (itemStack2.isEmpty()) {
                    this.craftSlots.setItem(i, itemStack3);
                } else if (ItemStack.isSame(itemStack2, itemStack3) && ItemStack.tagMatches(itemStack2, itemStack3)) {
                    itemStack3.grow(itemStack2.getCount());
                    this.craftSlots.setItem(i, itemStack3);
                } else if (!this.player.getInventory().add(itemStack3)) {
                    this.player.drop(itemStack3, false);
                }
            }
        }

    }
}