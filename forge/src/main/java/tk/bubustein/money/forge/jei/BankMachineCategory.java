package tk.bubustein.money.forge.jei;

import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.api.helpers.IGuiHelper;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;
import tk.bubustein.money.MoneyMod;
import tk.bubustein.money.block.ModBlocks;
import tk.bubustein.money.block.custom.BankMachine;
import tk.bubustein.money.recipe.BankMachineRecipe;
import java.util.Arrays;
import java.util.List;

public class BankMachineCategory implements IRecipeCategory<BankMachineRecipe> {
    public final static ResourceLocation UID = new ResourceLocation(MoneyMod.MOD_ID, "bank_machine");
    private final IDrawable background;
    private final IDrawable icon;
    public BankMachineCategory(IGuiHelper guiHelper) {
        this.background = guiHelper.createDrawable(new ResourceLocation(MoneyMod.MOD_ID, "textures/container/bank_machine.png"), 29, 16, 116, 54);
        this.icon = guiHelper.createDrawableIngredient(new ItemStack(ModBlocks.BANK_MACHINE.get()));
    }
    @Override
    public ResourceLocation getUid() {
        return UID;
    }
    @Override
    public Class<? extends BankMachineRecipe> getRecipeClass() {
        return BankMachineRecipe.class;
    }
    @Override
    public String getTitle() {
        return BankMachine.TITLE.getString();
    }
    @Override
    public IDrawable getBackground() {
        return background;
    }
    @Override
    public IDrawable getIcon() {
        return icon;
    }
    @Override
    public void setIngredients(BankMachineRecipe recipe, IIngredients ingredients) {
        ingredients.setInputIngredients(recipe.getIngredients());
        ingredients.setOutput(VanillaTypes.ITEM, recipe.getResultItem());
    }
    @Override
    public void setRecipe(@NotNull IRecipeLayout recipeLayout, BankMachineRecipe recipe, @NotNull IIngredients ingredients) {
        List<Ingredient> inputs = recipe.getIngredients();
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                int index = row * 3 + col;
                if (index < inputs.size()) {
                    recipeLayout.getItemStacks().init(index, true, col * 18, row * 18);
                    recipeLayout.getItemStacks().set(index, Arrays.asList(inputs.get(index).getItems()));
                }
            }
        }
        recipeLayout.getItemStacks().init(9, false, 95, 18);
        recipeLayout.getItemStacks().set(9, recipe.getResultItem());
    }
}