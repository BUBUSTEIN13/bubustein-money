package tk.bubustein.money.compat.rei;

import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.entry.EntryIngredient;
import me.shedaniel.rei.plugin.common.displays.crafting.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.*;
import tk.bubustein.money.recipe.BankMachineRecipe;
import java.util.*;

public class BankMachineDisplay extends DefaultCraftingDisplay<BankMachineRecipe> {
    public BankMachineDisplay(List<EntryIngredient> inputs, List<EntryIngredient> outputs, Optional<RecipeHolder<BankMachineRecipe>> recipe) {
        super(inputs, outputs, recipe);
        this.recipe = recipe;
    }
    @Override
    public CategoryIdentifier<?> getCategoryIdentifier() {
        return BankMachineCategory.BANK_MACHINE_CATEGORY;
    }
    public Optional<RecipeHolder<BankMachineRecipe>> getOptionalRecipe() {
        return recipe;
    }
    @Override
    public Optional<ResourceLocation> getDisplayLocation() {
        return getOptionalRecipe().map(RecipeHolder::id);
    }
    @Override
    public boolean isShapeless(){
        return getOptionalRecipe().map(holder -> holder.value().isShapeless()).orElse(false);
    }
    @Override
    public int getWidth() {
        return 3;
    }
    @Override
    public int getHeight() {
        return 3;
    }
}