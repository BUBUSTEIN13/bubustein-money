package tk.bubustein.money.recipe;

import com.google.gson.JsonObject;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.world.item.crafting.CraftingBookCategory;

public abstract class BankMachineRecipeBuilder {
    public BankMachineRecipeBuilder() {
    }

    protected static CraftingBookCategory determineBookCategory(RecipeCategory recipeCategory) {
        return switch (recipeCategory) {
            case BUILDING_BLOCKS -> CraftingBookCategory.BUILDING;
            case TOOLS, COMBAT -> CraftingBookCategory.EQUIPMENT;
            case REDSTONE -> CraftingBookCategory.REDSTONE;
            default -> CraftingBookCategory.MISC;
        };
    }

    protected abstract static class BankMachineResult implements FinishedRecipe {
        public void serializeRecipeData(JsonObject jsonObject) {

        }
    }
}