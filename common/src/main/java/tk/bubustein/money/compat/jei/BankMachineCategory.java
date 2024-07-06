package tk.bubustein.money.compat.jei;

import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;
import tk.bubustein.money.MoneyMod;
import tk.bubustein.money.block.ModBlocks;
import tk.bubustein.money.block.custom.BankMachine;
import tk.bubustein.money.recipe.BankMachineRecipe;
import java.util.List;

public class BankMachineCategory implements IRecipeCategory<BankMachineRecipe> {
    public static final RecipeType<BankMachineRecipe> RECIPE_TYPE = RecipeType.create(MoneyMod.MOD_ID, "bank_machine", BankMachineRecipe.class);
    private final IDrawable background;
    private final IDrawable icon;
    public BankMachineCategory(IGuiHelper guiHelper) {
        this.background = guiHelper.createDrawable(new ResourceLocation(MoneyMod.MOD_ID, "textures/container/bank_machine.png"), 29, 16, 116, 54);
        this.icon = guiHelper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(ModBlocks.BANK_MACHINE.get()));
    }
    @Override
    public @NotNull RecipeType<BankMachineRecipe> getRecipeType() {
        return RECIPE_TYPE;
    }
    @Override
    public @NotNull Component getTitle() {
        return BankMachine.TITLE;
    }
    @Override
    public @NotNull IDrawable getBackground() {
        return background;
    }
    @Override
    public @NotNull IDrawable getIcon() {
        return icon;
    }
    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, BankMachineRecipe recipe, IFocusGroup focuses) {
        List<Ingredient> ingredients = recipe.getIngredients();
        boolean isShapeless = recipe.isShapeless();
        if (isShapeless) {
            if (!ingredients.isEmpty() && !ingredients.get(0).isEmpty()) {
                builder.addSlot(RecipeIngredientRole.INPUT, 1 + 18, 1 + 18)
                        .addIngredients(ingredients.get(0));
            }
        } else {
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    int index = row * 3 + col;
                    if (index < ingredients.size() && !ingredients.get(index).isEmpty()) {
                        builder.addSlot(RecipeIngredientRole.INPUT, 1 + col * 18, 1 + row * 18)
                                .addIngredients(ingredients.get(index));
                    } else {
                        builder.addSlot(RecipeIngredientRole.INPUT, 1 + col * 18, 1 + row * 18)
                                .addItemStack(ItemStack.EMPTY);
                    }
                }
            }
        }
        builder.addSlot(RecipeIngredientRole.OUTPUT, 95, 18)
                .addItemStack(recipe.getResultItem());
    }
}