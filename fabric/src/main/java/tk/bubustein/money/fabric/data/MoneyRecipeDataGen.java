package tk.bubustein.money.fabric.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tk.bubustein.money.item.ModItems;
import tk.bubustein.money.recipe.BankMachineRecipeShapedBuilder;
import tk.bubustein.money.recipe.BankMachineRecipeShapelessBuilder;
import java.util.concurrent.CompletableFuture;

public class MoneyRecipeDataGen extends FabricRecipeProvider {
    public MoneyRecipeDataGen(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture){
        super(output, registriesFuture);
    }
    public static void conversionRecipe(RecipeOutput recipeOutput, ItemLike output, ItemLike input, @Nullable String string) {
        conversionRecipe(recipeOutput, output, input, string, 1);
    }
    public static void conversionRecipe(RecipeOutput recipeOutput, ItemLike output, ItemLike input, @Nullable String string, int i) {
        BankMachineRecipeShapelessBuilder.shapeless(RecipeCategory.MISC, output, i).requires(input).group(string).unlockedBy(getHasName(input), has(input)).save(recipeOutput, getConversionRecipeName(output, input));
    }
    public static void fiveItems(RecipeOutput recipeOutput, ItemLike output, ItemLike input) {
        BankMachineRecipeShapedBuilder.shaped(RecipeCategory.MISC, output).define('#', input).pattern("# #").pattern("###").unlockedBy(getHasName(input), has(input)).save(recipeOutput);
    }
    public static void twoItems(RecipeOutput recipeOutput, ItemLike output, ItemLike input) {
        twoItemsBuilder(RecipeCategory.MISC, output, Ingredient.of(input)).unlockedBy(getHasName(input), has(input)).save(recipeOutput);
    }
    public static @NotNull RecipeBuilder twoItemsBuilder(RecipeCategory recipeCategory, ItemLike output, Ingredient ingredient) {
        return BankMachineRecipeShapedBuilder.shaped(recipeCategory, output).define('#', ingredient).pattern("##");
    }

    @Override
    public void buildRecipes(RecipeOutput exporter) {

        conversionRecipe(exporter, ModItems.TRl100.get(), ModItems.TRl200.get(), "",2);
        conversionRecipe(exporter, ModItems.TRl50.get(), ModItems.TRl100.get(), "",2);
        conversionRecipe(exporter, ModItems.TRl10.get(), ModItems.TRl50.get(), "", 5);
        conversionRecipe(exporter, ModItems.TRl10.get(), ModItems.TRl20.get(), "", 2);
        conversionRecipe(exporter, ModItems.TRl5.get(), ModItems.TRl10.get(), "", 2);
        conversionRecipe(exporter, ModItems.TRl1.get(), ModItems.TRl5.get(), "", 5);
        conversionRecipe(exporter, ModItems.TRk50.get(), ModItems.TRl1.get(), "",2);
        conversionRecipe(exporter, ModItems.TRk25.get(), ModItems.TRk50.get(), "", 2);
        conversionRecipe(exporter, ModItems.TRk5.get(), ModItems.TRk25.get(), "", 5);
        conversionRecipe(exporter, ModItems.TRk5.get(), ModItems.TRk10.get(), "", 2);
        conversionRecipe(exporter, ModItems.TRk1.get(), ModItems.TRk5.get(), "", 5);

        fiveItems(exporter, ModItems.TRk5.get(), ModItems.TRk1.get());
        twoItems(exporter, ModItems.TRk10.get(), ModItems.TRk5.get());
        fiveItems(exporter, ModItems.TRk25.get(), ModItems.TRk5.get());
        twoItems(exporter, ModItems.TRk50.get(), ModItems.TRk25.get());
        twoItems(exporter, ModItems.TRl1.get(), ModItems.TRk50.get());
        fiveItems(exporter, ModItems.TRl5.get(), ModItems.TRl1.get());
        twoItems(exporter, ModItems.TRl10.get(), ModItems.TRl5.get());
        twoItems(exporter, ModItems.TRl20.get(), ModItems.TRl10.get());
        fiveItems(exporter, ModItems.TRl50.get(), ModItems.TRl10.get());
        twoItems(exporter, ModItems.TRl100.get(), ModItems.TRl50.get());
        twoItems(exporter, ModItems.TRl200.get(), ModItems.TRl100.get());

        conversionRecipe(exporter, ModItems.NZD50.get(), ModItems.NZD100.get(), "", 2);
        conversionRecipe(exporter, ModItems.NZD10.get(), ModItems.NZD50.get(), "", 5);
        conversionRecipe(exporter, ModItems.NZD10.get(), ModItems.NZD20.get(), "", 2);
        conversionRecipe(exporter, ModItems.NZD5.get(), ModItems.NZD10.get(), "", 2);
        conversionRecipe(exporter, ModItems.NZD1.get(), ModItems.NZD5.get(), "", 5);
        conversionRecipe(exporter, ModItems.NZD1.get(), ModItems.NZD2.get(), "", 2);
        conversionRecipe(exporter, ModItems.NZCent50.get(), ModItems.NZD1.get(), "", 2);
        conversionRecipe(exporter, ModItems.NZCent10.get(), ModItems.NZCent50.get(), "", 5);
        conversionRecipe(exporter, ModItems.NZCent10.get(), ModItems.NZCent20.get(), "" ,2);

        twoItems(exporter, ModItems.NZCent20.get(), ModItems.NZCent10.get());
        fiveItems(exporter, ModItems.NZCent50.get(), ModItems.NZCent10.get());
        twoItems(exporter, ModItems.NZD1.get(), ModItems.NZCent50.get());
        twoItems(exporter, ModItems.NZD2.get(), ModItems.NZD1.get());
        fiveItems(exporter, ModItems.NZD5.get(), ModItems.NZD1.get());
        twoItems(exporter, ModItems.NZD10.get(), ModItems.NZD5.get());
        twoItems(exporter, ModItems.NZD20.get(), ModItems.NZD10.get());
        fiveItems(exporter, ModItems.NZD50.get(), ModItems.NZD10.get());
        twoItems(exporter, ModItems.NZD100.get(), ModItems.NZD50.get());

    }
}
