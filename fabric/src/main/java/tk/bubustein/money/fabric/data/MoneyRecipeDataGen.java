package tk.bubustein.money.fabric.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Items;
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
        BankMachineRecipeShapelessBuilder.shapeless(output, i).requires(input).group(string).unlockedBy(getHasName(input), has(input)).save(recipeOutput, getConversionRecipeName(output, input));
    }
    public static void fiveItems(RecipeOutput recipeOutput, ItemLike output, ItemLike input) {
        BankMachineRecipeShapedBuilder.shaped(output).define('#', input).pattern("# #").pattern("###").unlockedBy(getHasName(input), has(input)).save(recipeOutput);
    }
    public static void twoItems(RecipeOutput recipeOutput, ItemLike output, ItemLike input) {
        twoItemsBuilder(output, Ingredient.of(input)).unlockedBy(getHasName(input), has(input)).save(recipeOutput);
    }
    public static @NotNull RecipeBuilder twoItemsBuilder(ItemLike output, Ingredient ingredient) {
        return BankMachineRecipeShapedBuilder.shaped(output).define('#', ingredient).pattern("##");
    }

    @Override
    public void buildRecipes(RecipeOutput exporter) {
        /*
        BankMachineRecipeShapedBuilder.shaped(ModItems.PHP20.get())
                .unlockedBy(getHasName(ModItems.SpecialPaper.get()), has(ModItems.SpecialPaper.get()))
                .pattern("RLC").pattern("CPC").pattern("NGC")
                .define('R', Items.REDSTONE).define('L', Items.LAPIS_LAZULI)
                .define('P', ModItems.SpecialPaper.get()).define('C', Items.ORANGE_DYE)
                .define('N', Items.IRON_NUGGET)
                .define('G', Items.LIGHT_GRAY_DYE).save(exporter);
        conversionRecipe(exporter, ModItems.PHP500.get(), ModItems.PHP1000.get(), "", 2);
        conversionRecipe(exporter, ModItems.PHP100.get(), ModItems.PHP500.get(), "",5);
        conversionRecipe(exporter, ModItems.PHP100.get(), ModItems.PHP200.get(), "", 2);
        conversionRecipe(exporter, ModItems.PHP50.get(), ModItems.PHP100.get(), "", 2);
        conversionRecipe(exporter, ModItems.PHP10.get(), ModItems.PHP50.get(), "", 5);
        conversionRecipe(exporter, ModItems.PHP10.get(), ModItems.PHP20.get(), "", 2);
        conversionRecipe(exporter, ModItems.PHP5.get(), ModItems.PHP10.get(), "", 2);
        conversionRecipe(exporter, ModItems.PHP1.get(), ModItems.PHP5.get(), "", 5);
        conversionRecipe(exporter, ModItems.PHS25.get(), ModItems.PHP1.get(), "", 4);
        conversionRecipe(exporter, ModItems.PHS5.get(), ModItems.PHS25.get(), "", 5);
        conversionRecipe(exporter, ModItems.PHS1.get(), ModItems.PHS5.get(), "", 5);

        fiveItems(exporter, ModItems.PHS5.get(), ModItems.PHS1.get());
        fiveItems(exporter, ModItems.PHS25.get(), ModItems.PHS5.get());
        BankMachineRecipeShapedBuilder.shaped(ModItems.PHP1.get())
                .define('#', ModItems.PHS25.get())
                .pattern("##")
                .pattern("##")
                .unlockedBy(getHasName(ModItems.PHS25.get()), has(ModItems.PHS25.get()))
                .save(exporter);
        fiveItems(exporter, ModItems.PHP5.get(), ModItems.PHP1.get());
        twoItems(exporter, ModItems.PHP10.get(), ModItems.PHP5.get());
        twoItems(exporter, ModItems.PHP20.get(), ModItems.PHP10.get());
        fiveItems(exporter, ModItems.PHP50.get(), ModItems.PHP10.get());
        twoItems(exporter, ModItems.PHP100.get(), ModItems.PHP50.get());
        twoItems(exporter, ModItems.PHP200.get(), ModItems.PHP100.get());
        fiveItems(exporter, ModItems.PHP500.get(), ModItems.PHP100.get());
        twoItems(exporter, ModItems.PHP1000.get(), ModItems.PHP500.get());
        BankMachineRecipeShapedBuilder.shaped(ModItems.SpecialPaper.get(),1)
                .unlockedBy(getHasName(Items.PAPER), has(Items.PAPER))
                .pattern("RLG")
                .pattern("APG")
                .pattern("WWG")
                .define('P', Items.PAPER)
                .define('G', Items.GOLD_NUGGET)
                .define('R', Items.REDSTONE)
                .define('L', Items.LAPIS_LAZULI)
                .define('A', Items.LIGHT_GRAY_DYE)
                .define('W', Items.WHITE_DYE)
                .save(exporter);

        BankMachineRecipeShapedBuilder.shaped(ModItems.L12.get(),1)
                .pattern("GH")
                .pattern("##")
                .define('#', ModItems.L5.get())
                .define('G', ModItems.L2.get())
                .define('H', ModItems.B50.get())
                .unlockedBy(getHasName(ModItems.L5.get()), has(ModItems.L5.get()))
                .save(exporter);
        BankMachineRecipeShapedBuilder.shaped(ModItems.L5.get(),5).pattern("#G")
                .define('#', ModItems.L25.get())
                .define('G', Items.STICK)
                .unlockedBy(getHasName(ModItems.L25.get()), has(ModItems.L25.get()))
                .save(exporter);
        BankMachineRecipeShapedBuilder.shaped(ModItems.TRl5.get(), 1)
                .pattern("LGG")
                .pattern("OPR")
                .pattern("NDG")
                .define('L', Items.LAPIS_LAZULI)
                .define('G', Items.GRAY_DYE)
                .define('O', Items.ORANGE_DYE)
                .define('P', Items.PAPER)
                .define('R', Items.REDSTONE)
                .define('N', Items.IRON_NUGGET)
                .define('D', Items.LIGHT_GRAY_DYE)
                .unlockedBy(getHasName(Items.PAPER), has(Items.PAPER))
                .save(exporter);
        BankMachineRecipeShapedBuilder.shaped(ModItems.NZD5.get(), 1)
                .unlockedBy(getHasName(Items.PAPER), has(Items.PAPER))
                .pattern("OCO")
                .pattern("OPR")
                .pattern("LGO")
                .define('O', Items.ORANGE_DYE)
                .define('L', Items.LAPIS_LAZULI)
                .define('P', Items.PAPER)
                .define('C', Items.CYAN_DYE)
                .define('R', Items.REDSTONE)
                .define('G', Items.GOLD_NUGGET)
                .save(exporter);
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
        twoItems(exporter, ModItems.NZD100.get(), ModItems.NZD50.get());*/
    }
}