package com.bubustein.money.data;

import com.bubustein.money.item.ModItemGroup;
import com.bubustein.money.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;

import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeBookCategory;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import java.util.List;
import java.util.function.Consumer;


public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }
    @Override
    public void generate(RecipeExporter exporter) {
        // EURO COMPUNERE
        offerPressurePlateRecipe(exporter, ModItems.Ecent2, ModItems.Ecent1);
        offerBoatRecipe(exporter, ModItems.Ecent5, ModItems.Ecent1);
        offerPressurePlateRecipe(exporter, ModItems.Ecent10, ModItems.Ecent5);
        offerPressurePlateRecipe(exporter, ModItems.Ecent20, ModItems.Ecent10);
        offerBoatRecipe(exporter, ModItems.Ecent50, ModItems.Ecent10);
        offerPressurePlateRecipe(exporter, ModItems.Euro1, ModItems.Ecent50);
        offerPressurePlateRecipe(exporter, ModItems.Euro2, ModItems.Euro1);
        offerBoatRecipe(exporter, ModItems.Euro5, ModItems.Euro1);
        offerPressurePlateRecipe(exporter, ModItems.Euro10, ModItems.Euro5);
        offerPressurePlateRecipe(exporter, ModItems.Euro20, ModItems.Euro10);
        offerBoatRecipe(exporter, ModItems.Euro50, ModItems.Euro10);
        offerPressurePlateRecipe(exporter, ModItems.Euro100, ModItems.Euro50);
        offerPressurePlateRecipe(exporter, ModItems.Euro200, ModItems.Euro100);
        offerBoatRecipe(exporter, ModItems.Euro500, ModItems.Euro100);

        // USD COMPUNERE
        offerBoatRecipe(exporter, ModItems.Cent5, ModItems.Cent1);
        offerPressurePlateRecipe(exporter, ModItems.Cent10, ModItems.Cent5);
        offerBoatRecipe(exporter, ModItems.Cent25, ModItems.Cent5);
        offerPressurePlateRecipe(exporter, ModItems.Cent50, ModItems.Cent25);
        offerPressurePlateRecipe(exporter, ModItems.Dollar1, ModItems.Cent50);
        offerBoatRecipe(exporter, ModItems.Dollar5, ModItems.Dollar1);
        offerPressurePlateRecipe(exporter, ModItems.Dollar10, ModItems.Dollar5);
        offerPressurePlateRecipe(exporter, ModItems.Dollar20, ModItems.Dollar10);
        offerBoatRecipe(exporter, ModItems.Dollar50, ModItems.Dollar10);
        offerPressurePlateRecipe(exporter, ModItems.Dollar100, ModItems.Dollar50);

        // GBP COMPUNERE
        offerPressurePlateRecipe(exporter, ModItems.Pence2, ModItems.Pence1);
        offerBoatRecipe(exporter, ModItems.Pence5, ModItems.Pence1);
        offerPressurePlateRecipe(exporter, ModItems.Pence10, ModItems.Pence5);
        offerPressurePlateRecipe(exporter, ModItems.Pence20, ModItems.Pence10);
        offerBoatRecipe(exporter, ModItems.Pence50, ModItems.Pence10);
        offerPressurePlateRecipe(exporter, ModItems.Pound1, ModItems.Pence50);
        offerPressurePlateRecipe(exporter, ModItems.Pound2, ModItems.Pound1);
        offerBoatRecipe(exporter, ModItems.Pound5, ModItems.Pound1);
        offerPressurePlateRecipe(exporter, ModItems.Pound10, ModItems.Pound5);
        offerPressurePlateRecipe(exporter, ModItems.Pound20, ModItems.Pound10);
        offerBoatRecipe(exporter, ModItems.Pound50, ModItems.Pound10);
        offerPressurePlateRecipe(exporter, ModItems.Pound100, ModItems.Pound50);

        // CAD COMPUNERE
        offerPressurePlateRecipe(exporter, ModItems.CCent10, ModItems.CCent5);
        offerBoatRecipe(exporter, ModItems.CCent25, ModItems.CCent5);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.Loonie, 1).input('#', ModItems.CCent25).pattern("##").pattern("##").criterion(FabricRecipeProvider.hasItem(ModItems.CCent25),
                FabricRecipeProvider.conditionsFromItem(ModItems.CCent25)).offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.Loonie)));
        offerPressurePlateRecipe(exporter, ModItems.Toonie, ModItems.Loonie);
        offerBoatRecipe(exporter, ModItems.DollarC5, ModItems.Loonie);
        offerPressurePlateRecipe(exporter, ModItems.DollarC10, ModItems.DollarC5);
        offerPressurePlateRecipe(exporter, ModItems.DollarC20, ModItems.DollarC10);
        offerBoatRecipe(exporter, ModItems.DollarC50, ModItems.DollarC10);
        offerPressurePlateRecipe(exporter, ModItems.DollarC100, ModItems.DollarC50);

        // LEU ROMANESC COMPUNERE
        offerBoatRecipe(exporter, ModItems.Bani5, ModItems.Ban1);
        offerPressurePlateRecipe(exporter, ModItems.Bani10, ModItems.Bani5);
        offerBoatRecipe(exporter, ModItems.Bani50, ModItems.Bani10);
        offerPressurePlateRecipe(exporter, ModItems.Leu1, ModItems.Bani50);
        offerBoatRecipe(exporter, ModItems.Lei5, ModItems.Leu1);
        offerPressurePlateRecipe(exporter, ModItems.Lei10, ModItems.Lei5);
        offerPressurePlateRecipe(exporter, ModItems.Lei20, ModItems.Lei10);
        offerBoatRecipe(exporter, ModItems.Lei50, ModItems.Lei10);
        offerPressurePlateRecipe(exporter, ModItems.Lei100, ModItems.Lei50);
        offerPressurePlateRecipe(exporter, ModItems.Lei200, ModItems.Lei100);
        offerBoatRecipe(exporter, ModItems.Lei500, ModItems.Lei100);

        // LEU MOLDOVENESC COMPUNERE
        offerPressurePlateRecipe(exporter, ModItems.BaniMD10, ModItems.BanMD5);
        offerBoatRecipe(exporter, ModItems.BaniMD25, ModItems.BanMD5);
        offerPressurePlateRecipe(exporter, ModItems.BaniMD50, ModItems.BaniMD25);
        offerPressurePlateRecipe(exporter, ModItems.LeuMD1, ModItems.BaniMD50);
        offerPressurePlateRecipe(exporter, ModItems.LeuMD2, ModItems.LeuMD1);
        offerBoatRecipe(exporter, ModItems.LeiMD5, ModItems.LeuMD1);
        offerPressurePlateRecipe(exporter, ModItems.LeiMD10, ModItems.LeiMD5);
        offerPressurePlateRecipe(exporter, ModItems.LeiMD20, ModItems.LeiMD10);
        offerBoatRecipe(exporter, ModItems.LeiMD50, ModItems.LeiMD10);
        offerPressurePlateRecipe(exporter, ModItems.LeiMD100, ModItems.LeiMD50);
        offerPressurePlateRecipe(exporter, ModItems.LeiMD200, ModItems.LeiMD100);
        offerBoatRecipe(exporter, ModItems.LeiMD500, ModItems.LeiMD100);
        offerPressurePlateRecipe(exporter, ModItems.LeiMD1000, ModItems.LeiMD500);

        // FRANCS
        offerPressurePlateRecipe(exporter, ModItems.Centimes10, ModItems.Centimes5);
        offerPressurePlateRecipe(exporter, ModItems.Centimes20, ModItems.Centimes10);
        offerBoatRecipe(exporter, ModItems.HalfFranc, ModItems.Centimes10);
        offerPressurePlateRecipe(exporter, ModItems.Franc1, ModItems.HalfFranc);
        offerPressurePlateRecipe(exporter, ModItems.Franc2, ModItems.Franc1);
        offerBoatRecipe(exporter, ModItems.Franc5, ModItems.Franc1);
        offerPressurePlateRecipe(exporter, ModItems.Franc10, ModItems.Franc5);
        offerPressurePlateRecipe(exporter, ModItems.Franc20, ModItems.Franc10);
        offerBoatRecipe(exporter, ModItems.Franc50, ModItems.Franc10);
        offerPressurePlateRecipe(exporter, ModItems.Franc100, ModItems.Franc50);
        offerPressurePlateRecipe(exporter, ModItems.Franc200, ModItems.Franc100);
        offerBoatRecipe(exporter, ModItems.Franc1000, ModItems.Franc200);

        // AUD COMPUNERE
        offerPressurePlateRecipe(exporter, ModItems.ACent10, ModItems.ACent5);
        offerPressurePlateRecipe(exporter, ModItems.ACent20, ModItems.ACent10);
        offerBoatRecipe(exporter, ModItems.ACent50, ModItems.ACent10);
        offerPressurePlateRecipe(exporter, ModItems.DollarA1, ModItems.ACent50);
        offerPressurePlateRecipe(exporter, ModItems.DollarA2, ModItems.DollarA1);
        offerBoatRecipe(exporter, ModItems.DollarA5, ModItems.DollarA1);
        offerPressurePlateRecipe(exporter, ModItems.DollarA10, ModItems.DollarA5);
        offerPressurePlateRecipe(exporter, ModItems.DollarA20, ModItems.DollarA10);
        offerBoatRecipe(exporter, ModItems.DollarA50, ModItems.DollarA10);
        offerPressurePlateRecipe(exporter, ModItems.DollarA100, ModItems.DollarA50);

        // YEN COMPUNERE
        offerBoatRecipe(exporter, ModItems.Yen5, ModItems.Yen1);
        offerPressurePlateRecipe(exporter, ModItems.Yen10, ModItems.Yen5);
        offerBoatRecipe(exporter, ModItems.Yen50, ModItems.Yen10);
        offerPressurePlateRecipe(exporter,ModItems.Yen100, ModItems.Yen50);
        offerBoatRecipe(exporter, ModItems.Yen500, ModItems.Yen100);
        offerPressurePlateRecipe(exporter, ModItems.Yen1000, ModItems.Yen500);
        offerBoatRecipe(exporter, ModItems.Yen5000, ModItems.Yen1000);
        offerPressurePlateRecipe(exporter, ModItems.Yen10000, ModItems.Yen5000);


        // ROL 1900 COMPUNERE
        offerPressurePlateRecipe(exporter, ModItems.B2, ModItems.B1);
        offerBoatRecipe(exporter, ModItems.B5, ModItems.B1);
        offerPressurePlateRecipe(exporter, ModItems.B10, ModItems.B5);
        offerPressurePlateRecipe(exporter, ModItems.B20, ModItems.B10);
        offerBoatRecipe(exporter, ModItems.B50, ModItems.B10);
        offerPressurePlateRecipe(exporter, ModItems.L1, ModItems.B50);
        offerPressurePlateRecipe(exporter, ModItems.L2, ModItems.L1);
        offerBoatRecipe(exporter, ModItems.L5, ModItems.L1);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.L20, 1).input('#', ModItems.L5).pattern("##").pattern("##").criterion(FabricRecipeProvider.hasItem(ModItems.L5),
                FabricRecipeProvider.conditionsFromItem(ModItems.L5)).offerTo(exporter, FabricRecipeProvider.getRecipeName(ModItems.L20));
        //offerPressurePlateRecipe(exporter, ModItems.L25, ModItems.L12); L-am pus in Recipes manual.
        offerBoatRecipe(exporter, ModItems.L25, ModItems.L5);
        offerPressurePlateRecipe(exporter, ModItems.L50, ModItems.L25);
        offerPressurePlateRecipe(exporter, ModItems.L100, ModItems.L50);

        // LEVA BULGARIA
        offerShapelessRecipe(exporter, ModItems.Stotinka1, ModItems.Stotinka2, "Stotinka_Leva", 2);
        offerShapelessRecipe(exporter, ModItems.Stotinka1, ModItems.Stotinka5, "Stotinka_Leva", 5);
        offerShapelessRecipe(exporter, ModItems.Stotinka5, ModItems.Stotinka10, "Stotinka_Leva", 2);
        offerShapelessRecipe(exporter, ModItems.Stotinka10, ModItems.Stotinka20, "Stotinka_Leva", 2);
        offerShapelessRecipe(exporter, ModItems.Stotinka10, ModItems.Stotinka50, "Stotinka_Leva", 5);
        offerShapelessRecipe(exporter, ModItems.Stotinka50, ModItems.Leva1, "Stotinka_Leva", 2);
        offerShapelessRecipe(exporter, ModItems.Leva1, ModItems.Leva2, "Stotinka_Leva", 2);
        offerShapelessRecipe(exporter, ModItems.Leva1, ModItems.Leva5, "Stotinka_Leva", 5);
        offerShapelessRecipe(exporter, ModItems.Leva5, ModItems.Leva10, "Stotinka_Leva", 2);
        offerShapelessRecipe(exporter, ModItems.Leva10, ModItems.Leva20, "Stotinka_Leva", 2);
        offerShapelessRecipe(exporter, ModItems.Leva10, ModItems.Leva50, "Stotinka_Leva", 5);
        offerShapelessRecipe(exporter, ModItems.Leva50, ModItems.Leva100, "Stotinka_Leva", 2);

        /* ShapedRecipeJsonBuilder.create(ModItems.Leva5)
                .pattern("ABB")
                .pattern("RPB")
                .pattern("GQQ").input('A', Items.LAPIS_LAZULI).input('B', Items.RED_DYE).input('R', Items.REDSTONE)
                 .input('P', Items.PAPER).input('G', Items.GOLD_INGOT).input('Q', Items.PINK_DYE)
                 .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT), RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.Leva5)));

*/

        offerPressurePlateRecipe(exporter, ModItems.Stotinka2, ModItems.Stotinka1);
        offerBoatRecipe(exporter, ModItems.Stotinka5, ModItems.Stotinka1);
        offerPressurePlateRecipe(exporter, ModItems.Stotinka10, ModItems.Stotinka5);
        offerPressurePlateRecipe(exporter, ModItems.Stotinka20, ModItems.Stotinka10);
        offerBoatRecipe(exporter, ModItems.Stotinka50, ModItems.Stotinka10);
        offerPressurePlateRecipe(exporter, ModItems.Leva1, ModItems.Stotinka50);
        offerPressurePlateRecipe(exporter, ModItems.Leva2, ModItems.Leva1);
        offerBoatRecipe(exporter, ModItems.Leva5, ModItems.Leva1);
        offerPressurePlateRecipe(exporter, ModItems.Leva10, ModItems.Leva5);
        offerPressurePlateRecipe(exporter, ModItems.Leva20, ModItems.Leva10);
        offerBoatRecipe(exporter, ModItems.Leva50, ModItems.Leva10);
        offerPressurePlateRecipe(exporter, ModItems.Leva100, ModItems.Leva50);

        // COROANA CEHEASCA
        offerShapelessRecipe(exporter, ModItems.CZkr1, ModItems.CZkr2, "CZkr", 2);
        offerShapelessRecipe(exporter, ModItems.CZkr1, ModItems.CZkr5, "CZkr", 5);
        offerShapelessRecipe(exporter, ModItems.CZkr5, ModItems.CZkr10, "CZkr", 2);
        offerShapelessRecipe(exporter, ModItems.CZkr10, ModItems.CZkr20, "CZkr", 2);
        offerShapelessRecipe(exporter, ModItems.CZkr10, ModItems.CZkr50, "CZkr", 5);
        offerShapelessRecipe(exporter, ModItems.CZkr50, ModItems.CZkr100, "CZkr", 2);
        offerShapelessRecipe(exporter, ModItems.CZkr100, ModItems.CZkr200, "CZkr", 2);
        offerShapelessRecipe(exporter, ModItems.CZkr100, ModItems.CZkr500, "CZkr", 5);
        offerShapelessRecipe(exporter, ModItems.CZkr500, ModItems.CZkr1000, "CZkr", 2);
        offerShapelessRecipe(exporter, ModItems.CZkr1000, ModItems.CZkr2000, "CZkr", 2);
        offerShapelessRecipe(exporter, ModItems.CZkr1000, ModItems.CZkr5000, "CZkr", 5);




        offerPressurePlateRecipe(exporter, ModItems.CZkr2, ModItems.CZkr1);
        offerBoatRecipe(exporter, ModItems.CZkr5, ModItems.CZkr1);
        offerPressurePlateRecipe(exporter, ModItems.CZkr10, ModItems.CZkr5);
        offerPressurePlateRecipe(exporter, ModItems.CZkr20, ModItems.CZkr10);
        offerBoatRecipe(exporter, ModItems.CZkr50, ModItems.CZkr10);
        offerPressurePlateRecipe(exporter,ModItems.CZkr100, ModItems.CZkr50);
        offerPressurePlateRecipe(exporter,ModItems.CZkr200, ModItems.CZkr100);
        offerBoatRecipe(exporter, ModItems.CZkr500, ModItems.CZkr100);
        offerPressurePlateRecipe(exporter, ModItems.CZkr1000, ModItems.CZkr500);
        offerPressurePlateRecipe(exporter, ModItems.CZkr2000, ModItems.CZkr1000);
        offerBoatRecipe(exporter, ModItems.CZkr5000, ModItems.CZkr1000);


        // COROANA DANEZA
        offerShapelessRecipe(exporter, ModItems.DKAere50, ModItems.DKkr1, "DKkr",2);
        offerShapelessRecipe(exporter, ModItems.DKkr1, ModItems.DKkr2, "DKkr", 2);
        offerShapelessRecipe(exporter, ModItems.DKkr1, ModItems.DKkr5, "DKkr", 5);
        offerShapelessRecipe(exporter, ModItems.DKkr5, ModItems.DKkr10, "DKkr", 2);
        offerShapelessRecipe(exporter, ModItems.DKkr10, ModItems.DKkr20, "DKkr", 2);
        offerShapelessRecipe(exporter, ModItems.DKkr10, ModItems.DKkr50, "DKkr", 5);
        offerShapelessRecipe(exporter, ModItems.DKkr50, ModItems.DKkr100, "DKkr", 2);
        offerShapelessRecipe(exporter, ModItems.DKkr100, ModItems.DKkr200, "DKkr", 2);
        offerShapelessRecipe(exporter, ModItems.DKkr100, ModItems.DKkr500, "DKkr", 5);
        offerShapelessRecipe(exporter, ModItems.DKkr500, ModItems.DKkr1000, "DKkr", 2);




        offerPressurePlateRecipe(exporter, ModItems.DKkr1, ModItems.DKAere50);
        offerPressurePlateRecipe(exporter, ModItems.DKkr2, ModItems.DKkr1);
        offerBoatRecipe(exporter, ModItems.DKkr5, ModItems.DKkr1);
        offerPressurePlateRecipe(exporter, ModItems.DKkr10, ModItems.DKkr5);
        offerPressurePlateRecipe(exporter, ModItems.DKkr20, ModItems.DKkr10);
        offerBoatRecipe(exporter, ModItems.DKkr50, ModItems.DKkr10);
        offerPressurePlateRecipe(exporter,ModItems.DKkr100, ModItems.DKkr50);
        offerPressurePlateRecipe(exporter,ModItems.DKkr200, ModItems.DKkr100);
        offerBoatRecipe(exporter, ModItems.DKkr500, ModItems.DKkr100);
        offerPressurePlateRecipe(exporter, ModItems.DKkr1000, ModItems.DKkr500);


        // COROANA NORVEGIANA
        offerShapelessRecipe(exporter, ModItems.NOkr1, ModItems.NOkr5, "NOkr", 5);
        offerShapelessRecipe(exporter, ModItems.NOkr5, ModItems.NOkr10, "NOkr", 2);
        offerShapelessRecipe(exporter, ModItems.NOkr10, ModItems.NOkr20, "NOkr", 2);
        offerShapelessRecipe(exporter, ModItems.NOkr10, ModItems.NOkr50, "NOkr", 5);
        offerShapelessRecipe(exporter, ModItems.NOkr50, ModItems.NOkr100, "NOkr", 2);
        offerShapelessRecipe(exporter, ModItems.NOkr100, ModItems.NOkr200, "NOkr", 2);
        offerShapelessRecipe(exporter, ModItems.NOkr100, ModItems.NOkr500, "NOkr", 5);
        offerShapelessRecipe(exporter, ModItems.NOkr500, ModItems.NOkr1000, "NOkr", 2);



        offerBoatRecipe(exporter, ModItems.NOkr5, ModItems.NOkr1);
        offerPressurePlateRecipe(exporter, ModItems.NOkr10, ModItems.NOkr5);
        offerPressurePlateRecipe(exporter, ModItems.NOkr20, ModItems.NOkr10);
        offerBoatRecipe(exporter, ModItems.NOkr50, ModItems.NOkr10);
        offerPressurePlateRecipe(exporter,ModItems.NOkr100, ModItems.NOkr50);
        offerPressurePlateRecipe(exporter,ModItems.NOkr200, ModItems.NOkr100);
        offerBoatRecipe(exporter, ModItems.NOkr500, ModItems.NOkr100);
        offerPressurePlateRecipe(exporter, ModItems.NOkr1000, ModItems.NOkr500);

        // COROANA SUEDEZA
        offerShapelessRecipe(exporter, ModItems.SEkr1, ModItems.SEkr2, "SEkr", 2);
        offerShapelessRecipe(exporter, ModItems.SEkr1, ModItems.SEkr5, "SEkr", 5);
        offerShapelessRecipe(exporter, ModItems.SEkr5, ModItems.SEkr10, "SEkr", 2);
        offerShapelessRecipe(exporter, ModItems.SEkr10, ModItems.SEkr20, "SEkr", 2);
        offerShapelessRecipe(exporter, ModItems.SEkr10, ModItems.SEkr50, "SEkr", 5);
        offerShapelessRecipe(exporter, ModItems.SEkr50, ModItems.SEkr100, "SEkr", 2);
        offerShapelessRecipe(exporter, ModItems.SEkr100, ModItems.SEkr200, "SEkr", 2);
        offerShapelessRecipe(exporter, ModItems.SEkr100, ModItems.SEkr500, "SEkr", 5);
        offerShapelessRecipe(exporter, ModItems.SEkr500, ModItems.SEkr1000, "SEkr", 2);


        offerPressurePlateRecipe(exporter, ModItems.SEkr2, ModItems.SEkr1);
        offerBoatRecipe(exporter, ModItems.SEkr5, ModItems.SEkr1);
        offerPressurePlateRecipe(exporter, ModItems.SEkr10, ModItems.SEkr5);
        offerPressurePlateRecipe(exporter, ModItems.SEkr20, ModItems.SEkr10);
        offerBoatRecipe(exporter, ModItems.SEkr50, ModItems.SEkr10);
        offerPressurePlateRecipe(exporter,ModItems.SEkr100, ModItems.SEkr50);
        offerPressurePlateRecipe(exporter,ModItems.SEkr200, ModItems.SEkr100);
        offerBoatRecipe(exporter, ModItems.SEkr500, ModItems.SEkr100);
        offerPressurePlateRecipe(exporter, ModItems.SEkr1000, ModItems.SEkr500);


        // COROANA ISLANDEZA
        offerShapelessRecipe(exporter, ModItems.ISkr1, ModItems.ISkr5, "ISkr", 5);
        offerShapelessRecipe(exporter, ModItems.ISkr5, ModItems.ISkr10, "ISkr", 2);
        offerShapelessRecipe(exporter, ModItems.ISkr10, ModItems.ISkr50, "ISkr", 5);
        offerShapelessRecipe(exporter, ModItems.ISkr50, ModItems.ISkr100, "ISkr", 2);
        offerShapelessRecipe(exporter, ModItems.ISkr100, ModItems.ISkr500, "ISkr", 5);
        offerShapelessRecipe(exporter, ModItems.ISkr500, ModItems.ISkr1000, "ISkr", 2);
        offerShapelessRecipe(exporter, ModItems.ISkr1000, ModItems.ISkr2000, "ISkr", 2);
        offerShapelessRecipe(exporter, ModItems.ISkr1000, ModItems.ISkr5000, "ISkr", 5);
        offerShapelessRecipe(exporter, ModItems.ISkr5000, ModItems.ISkr10000, "ISkr", 2);

        offerBoatRecipe(exporter, ModItems.ISkr5, ModItems.ISkr1);
        offerPressurePlateRecipe(exporter, ModItems.ISkr10, ModItems.ISkr5);
        offerBoatRecipe(exporter, ModItems.ISkr50, ModItems.ISkr10);
        offerPressurePlateRecipe(exporter, ModItems.ISkr100, ModItems.ISkr50);
        offerBoatRecipe(exporter, ModItems.ISkr500, ModItems.ISkr100);
        offerPressurePlateRecipe(exporter, ModItems.ISkr1000, ModItems.ISkr500);
        offerPressurePlateRecipe(exporter, ModItems.ISkr2000, ModItems.ISkr1000);
        offerBoatRecipe(exporter, ModItems.ISkr5000, ModItems.ISkr1000);
        offerPressurePlateRecipe(exporter, ModItems.ISkr10000, ModItems.ISkr5000);


        // RUPIA INDIANA
        offerShapelessRecipe(exporter, ModItems.INr1, ModItems.INr2, "INr", 2);
        offerShapelessRecipe(exporter, ModItems.INr1, ModItems.INr5, "INr", 5);
        offerShapelessRecipe(exporter, ModItems.INr5, ModItems.INr10, "INr", 2);
        offerShapelessRecipe(exporter, ModItems.INr10, ModItems.INr20, "INr", 2);
        offerShapelessRecipe(exporter, ModItems.INr10, ModItems.INr50, "INr", 5);
        offerShapelessRecipe(exporter, ModItems.INr50, ModItems.INr100, "INr", 2);
        offerShapelessRecipe(exporter, ModItems.INr100, ModItems.INr200, "INr", 2);
        offerShapelessRecipe(exporter, ModItems.INr100, ModItems.INr500, "INr", 5);


        offerPressurePlateRecipe(exporter, ModItems.INr2, ModItems.INr1);
        offerBoatRecipe(exporter, ModItems.INr5, ModItems.INr1);
        offerPressurePlateRecipe(exporter, ModItems.INr10, ModItems.INr5);
        offerPressurePlateRecipe(exporter, ModItems.INr20, ModItems.INr10);
        offerBoatRecipe(exporter, ModItems.INr50, ModItems.INr10);
        offerPressurePlateRecipe(exporter,ModItems.INr100, ModItems.INr50);
        offerPressurePlateRecipe(exporter,ModItems.INr200, ModItems.INr100);
        offerBoatRecipe(exporter, ModItems.INr500, ModItems.INr100);

        // KR WON
        offerShapelessRecipe(exporter, ModItems.Won10, ModItems.Won50,"Won" ,5);
        offerShapelessRecipe(exporter, ModItems.Won50, ModItems.Won100,"Won" ,2);
        offerShapelessRecipe(exporter, ModItems.Won100, ModItems.Won500,"Won" ,5);
        offerShapelessRecipe(exporter, ModItems.Won500, ModItems.Won1000,"Won" ,2);
        offerShapelessRecipe(exporter, ModItems.Won1000, ModItems.Won5000,"Won" ,5);
        offerShapelessRecipe(exporter, ModItems.Won5000, ModItems.Won10000,"Won" ,2);
        offerShapelessRecipe(exporter, ModItems.Won10000, ModItems.Won50000,"Won" ,5);

        offerBoatRecipe(exporter, ModItems.Won50, ModItems.Won10);
        offerPressurePlateRecipe(exporter, ModItems.Won100, ModItems.Won50);
        offerBoatRecipe(exporter, ModItems.Won500, ModItems.Won100);
        offerPressurePlateRecipe(exporter, ModItems.Won1000, ModItems.Won500);
        offerBoatRecipe(exporter, ModItems.Won5000, ModItems.Won1000);
        offerPressurePlateRecipe(exporter, ModItems.Won10000, ModItems.Won5000);
        offerBoatRecipe(exporter, ModItems.Won50000, ModItems.Won10000);

        // CHINESE YUAN
        offerShapelessRecipe(exporter, ModItems.CNJiao1, ModItems.CNJiao5, "CNYuan", 5);
        offerShapelessRecipe(exporter, ModItems.CNJiao5, ModItems.CNYuan1, "CNYuan", 2);
        offerShapelessRecipe(exporter, ModItems.CNYuan1, ModItems.CNYuan5, "CNYuan", 5);
        offerShapelessRecipe(exporter, ModItems.CNYuan5, ModItems.CNYuan10, "CNYuan", 2);
        offerShapelessRecipe(exporter, ModItems.CNYuan10, ModItems.CNYuan20, "CNYuan", 2);
        offerShapelessRecipe(exporter, ModItems.CNYuan10, ModItems.CNYuan50, "CNYuan", 5);
        offerShapelessRecipe(exporter, ModItems.CNYuan50, ModItems.CNYuan100, "CNYuan", 2);

        offerBoatRecipe(exporter, ModItems.CNJiao5, ModItems.CNJiao1);
        offerPressurePlateRecipe(exporter, ModItems.CNYuan1, ModItems.CNJiao5);
        offerBoatRecipe(exporter, ModItems.CNYuan5, ModItems.CNYuan1);
        offerPressurePlateRecipe(exporter, ModItems.CNYuan10, ModItems.CNYuan5);
        offerPressurePlateRecipe(exporter, ModItems.CNYuan20, ModItems.CNYuan10);
        offerBoatRecipe(exporter, ModItems.CNYuan50, ModItems.CNYuan10);
        offerPressurePlateRecipe(exporter, ModItems.CNYuan100, ModItems.CNYuan50);

        // DINARUL SARBESC
        offerShapelessRecipe(exporter, ModItems.RSD1, ModItems.RSD5, "RSD", 5);
        offerShapelessRecipe(exporter, ModItems.RSD1, ModItems.RSD2, "RSD", 2);
        offerShapelessRecipe(exporter, ModItems.RSD5, ModItems.RSD10, "RSD", 2);
        offerShapelessRecipe(exporter, ModItems.RSD10, ModItems.RSD20, "RSD", 2);
        offerShapelessRecipe(exporter, ModItems.RSD10, ModItems.RSD50, "RSD", 5);
        offerShapelessRecipe(exporter, ModItems.RSD50, ModItems.RSD100, "RSD", 2);
        offerShapelessRecipe(exporter, ModItems.RSD100, ModItems.RSD200, "RSD", 2);
        offerShapelessRecipe(exporter, ModItems.RSD100, ModItems.RSD500, "RSD", 5);
        offerShapelessRecipe(exporter, ModItems.RSD500, ModItems.RSD1000, "RSD", 2);
        offerShapelessRecipe(exporter, ModItems.RSD1000, ModItems.RSD2000, "RSD", 2);
        offerShapelessRecipe(exporter, ModItems.RSD1000, ModItems.RSD5000, "RSD", 5);


        offerBoatRecipe(exporter, ModItems.RSD5, ModItems.RSD1);
        offerPressurePlateRecipe(exporter, ModItems.RSD2, ModItems.RSD1);
        offerPressurePlateRecipe(exporter, ModItems.RSD10, ModItems.RSD5);
        offerPressurePlateRecipe(exporter, ModItems.RSD20, ModItems.RSD10);
        offerBoatRecipe(exporter, ModItems.RSD50, ModItems.RSD10);
        offerPressurePlateRecipe(exporter,ModItems.RSD100, ModItems.RSD50);
        offerPressurePlateRecipe(exporter,ModItems.RSD200, ModItems.RSD100);
        offerBoatRecipe(exporter, ModItems.RSD500, ModItems.RSD100);
        offerPressurePlateRecipe(exporter, ModItems.RSD1000, ModItems.RSD500);
        offerPressurePlateRecipe(exporter, ModItems.RSD2000, ModItems.RSD1000);
        offerBoatRecipe(exporter, ModItems.RSD5000, ModItems.RSD1000);

        // ZLOTY POLONEZ
        offerShapelessRecipe(exporter, ModItems.Grosz1, ModItems.Grosz2, "PLN", 2);
        offerShapelessRecipe(exporter, ModItems.Grosz1, ModItems.Grosz5, "PLN", 5);
        offerShapelessRecipe(exporter, ModItems.Grosz5, ModItems.Grosz10, "PLN", 2);
        offerShapelessRecipe(exporter, ModItems.Grosz10, ModItems.Grosz20, "PLN", 2);
        offerShapelessRecipe(exporter, ModItems.Grosz10, ModItems.Grosz50, "PLN", 5);
        offerShapelessRecipe(exporter, ModItems.Grosz50, ModItems.Zloty1, "PLN", 2);
        offerShapelessRecipe(exporter, ModItems.Zloty1, ModItems.Zloty2, "PLN", 2);
        offerShapelessRecipe(exporter, ModItems.Zloty1, ModItems.Zloty5, "PLN", 5);
        offerShapelessRecipe(exporter, ModItems.Zloty5, ModItems.Zloty10, "PLN", 2);
        offerShapelessRecipe(exporter, ModItems.Zloty10, ModItems.Zloty20, "PLN", 2);
        offerShapelessRecipe(exporter, ModItems.Zloty10, ModItems.Zloty50, "PLN", 5);
        offerShapelessRecipe(exporter, ModItems.Zloty50, ModItems.Zloty100, "PLN", 2);
        offerShapelessRecipe(exporter, ModItems.Zloty100, ModItems.Zloty200, "PLN", 2);
        offerShapelessRecipe(exporter, ModItems.Zloty100, ModItems.Zloty500, "PLN", 5);


        offerPressurePlateRecipe(exporter, ModItems.Grosz2, ModItems.Grosz1);
        offerBoatRecipe(exporter, ModItems.Grosz5, ModItems.Grosz1);
        offerPressurePlateRecipe(exporter, ModItems.Grosz10, ModItems.Grosz5);
        offerPressurePlateRecipe(exporter, ModItems.Grosz20, ModItems.Grosz10);
        offerBoatRecipe(exporter, ModItems.Grosz50, ModItems.Grosz10);
        offerPressurePlateRecipe(exporter, ModItems.Zloty1, ModItems.Grosz50);
        offerPressurePlateRecipe(exporter, ModItems.Zloty2, ModItems.Zloty1);
        offerBoatRecipe(exporter, ModItems.Zloty5, ModItems.Zloty1);
        offerPressurePlateRecipe(exporter, ModItems.Zloty10, ModItems.Zloty5);
        offerPressurePlateRecipe(exporter, ModItems.Zloty20, ModItems.Zloty10);
        offerBoatRecipe(exporter, ModItems.Zloty50, ModItems.Zloty10);
        offerPressurePlateRecipe(exporter, ModItems.Zloty100, ModItems.Zloty50);
        offerPressurePlateRecipe(exporter, ModItems.Zloty200, ModItems.Zloty100);
        offerBoatRecipe(exporter, ModItems.Zloty500, ModItems.Zloty100);

        // FORINT HUF
        offerShapelessRecipe(exporter, ModItems.Ft5, ModItems.Ft10, "Forint", 2);
        offerShapelessRecipe(exporter, ModItems.Ft10, ModItems.Ft20, "Forint", 2);
        offerShapelessRecipe(exporter, ModItems.Ft10, ModItems.Ft50, "Forint", 5);
        offerShapelessRecipe(exporter, ModItems.Ft50, ModItems.Ft100, "Forint", 2);
        offerShapelessRecipe(exporter, ModItems.Ft100, ModItems.Ft200, "Forint", 2);
        offerShapelessRecipe(exporter, ModItems.Ft100, ModItems.Ft500, "Forint", 5);
        offerShapelessRecipe(exporter, ModItems.Ft500, ModItems.Ft1000, "Forint", 2);
        offerShapelessRecipe(exporter, ModItems.Ft1000, ModItems.Ft2000, "Forint", 2);
        offerShapelessRecipe(exporter, ModItems.Ft1000, ModItems.Ft5000, "Forint", 5);
        offerShapelessRecipe(exporter, ModItems.Ft5000, ModItems.Ft10000, "Forint", 2);
        offerShapelessRecipe(exporter, ModItems.Ft10000, ModItems.Ft20000, "Forint", 2);

      /*  ShapedRecipeJsonBuilder.create(ModItems.Ft500)
                .pattern("")
                .pattern("")
                .pattern("")
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.Ft500)));
                */


        offerPressurePlateRecipe(exporter, ModItems.Ft10, ModItems.Ft5);
        offerPressurePlateRecipe(exporter, ModItems.Ft20, ModItems.Ft10);
        offerBoatRecipe(exporter, ModItems.Ft50, ModItems.Ft10);
        offerPressurePlateRecipe(exporter,ModItems.Ft100, ModItems.Ft50);
        offerPressurePlateRecipe(exporter,ModItems.Ft200, ModItems.Ft100);
        offerBoatRecipe(exporter, ModItems.Ft500, ModItems.Ft100);
        offerPressurePlateRecipe(exporter, ModItems.Ft1000, ModItems.Ft500);
        offerPressurePlateRecipe(exporter, ModItems.Ft2000, ModItems.Ft1000);
        offerBoatRecipe(exporter, ModItems.Ft5000, ModItems.Ft1000);
        offerPressurePlateRecipe(exporter, ModItems.Ft10000, ModItems.Ft5000);
        offerPressurePlateRecipe(exporter, ModItems.Ft20000, ModItems.Ft10000);

    }

}