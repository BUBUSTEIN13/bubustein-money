package tk.bubustein.money.recipe;

import net.minecraft.world.item.crafting.CraftingInput;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeType;
import org.jetbrains.annotations.NotNull;

public interface BankMachineRecipe extends Recipe<CraftingInput> {
    default @NotNull RecipeType<?> getType() {
        return ModRecipes.BANK_MACHINE_RECIPE.get();
    }
    boolean isShapeless();
}