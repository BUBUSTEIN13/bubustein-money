package tk.bubustein.money.fabric.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeOutput;
import tk.bubustein.money.item.ModItems;
import tk.bubustein.money.recipe.BankMachineRecipeShaped;

import java.util.concurrent.CompletableFuture;

public class MoneyRecipeDataGen extends FabricRecipeProvider {
    public MoneyRecipeDataGen(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture){
        super(output, registriesFuture);
    }

    @Override
    public void buildRecipes(RecipeOutput exporter) {
        /*
        pressurePlate();
        woodenBoat();
        oneToOneConversionRecipe();
        */
        /* BRAZILIAN REAL
        pressurePlate(exporter, ModItems.BRCentavo10.get(), ModItems.BRCentavo5.get());
        woodenBoat(exporter, ModItems.BRCentavo25.get(), ModItems.BRCentavo5.get());
        pressurePlate(exporter, ModItems.BRCentavo50.get(), ModItems.BRCentavo25.get());
        pressurePlate(exporter, ModItems.BRReal1.get(), ModItems.BRCentavo50.get());
        pressurePlate(exporter, ModItems.BRReal2.get(), ModItems.BRReal1.get());
        woodenBoat(exporter, ModItems.BRReal5.get(), ModItems.BRReal1.get());
        pressurePlate(exporter, ModItems.BRReal10.get(), ModItems.BRReal5.get());
        pressurePlate(exporter, ModItems.BRReal20.get(), ModItems.BRReal10.get());
        woodenBoat(exporter, ModItems.BRReal50.get(), ModItems.BRReal10.get());
        pressurePlate(exporter, ModItems.BRReal100.get(), ModItems.BRReal50.get());
        pressurePlate(exporter, ModItems.BRReal200.get(), ModItems.BRReal100.get());

        oneToOneConversionRecipe(exporter, ModItems.BRCentavo5.get(), ModItems.BRCentavo10.get(), "BRL", 2);
        oneToOneConversionRecipe(exporter, ModItems.BRCentavo5.get(), ModItems.BRCentavo25.get(), "BRL", 5);
        oneToOneConversionRecipe(exporter, ModItems.BRCentavo25.get(), ModItems.BRCentavo50.get(), "BRL", 2);
        oneToOneConversionRecipe(exporter, ModItems.BRCentavo50.get(), ModItems.BRReal1.get(), "BRL", 2);
        oneToOneConversionRecipe(exporter, ModItems.BRReal1.get(), ModItems.BRReal2.get(), "BRL", 2);
        oneToOneConversionRecipe(exporter, ModItems.BRReal1.get(), ModItems.BRReal5.get(), "BRL", 5);
        oneToOneConversionRecipe(exporter, ModItems.BRReal5.get(), ModItems.BRReal10.get(), "BRL", 2);
        oneToOneConversionRecipe(exporter, ModItems.BRReal10.get(), ModItems.BRReal20.get(), "BRL", 2);
        oneToOneConversionRecipe(exporter, ModItems.BRReal10.get(), ModItems.BRReal50.get(), "BRL", 5);
        oneToOneConversionRecipe(exporter, ModItems.BRReal50.get(), ModItems.BRReal100.get(), "BRL", 2);
        oneToOneConversionRecipe(exporter, ModItems.BRReal100.get(), ModItems.BRReal200.get(), "BRL", 2);

        */
        // ZAR
        /*
        pressurePlate(exporter, ModItems.ZACent20.get(), ModItems.ZACent10.get());
        woodenBoat(exporter, ModItems.ZACent50.get(), ModItems.ZACent10.get());
        pressurePlate(exporter, ModItems.ZARand1.get(), ModItems.ZACent50.get());
        pressurePlate(exporter, ModItems.ZARand2.get(), ModItems.ZARand1.get());
        woodenBoat(exporter, ModItems.ZARand5.get(), ModItems.ZARand1.get());
        pressurePlate(exporter, ModItems.ZARand10.get(), ModItems.ZARand5.get());
        pressurePlate(exporter, ModItems.ZARand20.get(), ModItems.ZARand10.get());
        woodenBoat(exporter, ModItems.ZARand50.get(), ModItems.ZARand10.get());
        pressurePlate(exporter, ModItems.ZARand100.get(), ModItems.ZARand50.get());
        pressurePlate(exporter, ModItems.ZARand200.get(), ModItems.ZARand100.get());
        
        oneToOneConversionRecipe(exporter, ModItems.ZACent10.get(), ModItems.ZACent20.get(), "ZAR", 2);
        oneToOneConversionRecipe(exporter, ModItems.ZACent10.get(), ModItems.ZACent50.get(), "ZAR", 5);
        oneToOneConversionRecipe(exporter, ModItems.ZACent50.get(), ModItems.ZARand1.get(), "ZAR", 2);
        oneToOneConversionRecipe(exporter, ModItems.ZARand1.get(), ModItems.ZARand2.get(), "ZAR", 2);
        oneToOneConversionRecipe(exporter, ModItems.ZARand1.get(), ModItems.ZARand5.get(), "ZAR", 5);
        oneToOneConversionRecipe(exporter, ModItems.ZARand5.get(), ModItems.ZARand10.get(), "ZAR", 2);
        oneToOneConversionRecipe(exporter, ModItems.ZARand10.get(), ModItems.ZARand20.get(), "ZAR", 2);
        oneToOneConversionRecipe(exporter, ModItems.ZARand10.get(), ModItems.ZARand50.get(), "ZAR", 5);
        oneToOneConversionRecipe(exporter, ModItems.ZARand50.get(), ModItems.ZARand100.get(), "ZAR", 2);
        oneToOneConversionRecipe(exporter, ModItems.ZARand100.get(), ModItems.ZARand200.get(), "ZAR", 2);
        */
    }
}
