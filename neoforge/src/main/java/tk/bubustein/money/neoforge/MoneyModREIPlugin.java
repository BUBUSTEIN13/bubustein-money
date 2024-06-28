package tk.bubustein.money.neoforge;

import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.category.CategoryRegistry;
import me.shedaniel.rei.api.client.registry.display.DisplayRegistry;
import me.shedaniel.rei.api.common.entry.EntryIngredient;
import me.shedaniel.rei.api.common.util.EntryIngredients;
import me.shedaniel.rei.api.common.util.EntryStacks;
import me.shedaniel.rei.forge.REIPluginClient;
import tk.bubustein.money.MoneyMod;
import tk.bubustein.money.block.ModBlocks;
import tk.bubustein.money.compat.BankMachineCategory;
import tk.bubustein.money.compat.BankMachineDisplay;
import tk.bubustein.money.recipe.BankMachineRecipe;
import tk.bubustein.money.recipe.ModRecipes;
import java.util.List;
import static tk.bubustein.money.MoneyMod.LOGGER;
import java.util.Optional;

@REIPluginClient
public class MoneyModREIPlugin implements REIClientPlugin {
    @Override
    public void registerCategories(CategoryRegistry registry) {
        registry.add(new BankMachineCategory());
        registry.addWorkstations(BankMachineCategory.BANK_MACHINE_CATEGORY, EntryStacks.of(ModBlocks.BANK_MACHINE.get()));
        LOGGER.info("[" + MoneyMod.MOD_ID + "] Bank Machine Category has been registered successfully.");
    }
    @Override
    public void registerDisplays(DisplayRegistry registry) {
        registry.registerRecipeFiller(BankMachineRecipe.class, ModRecipes.BANK_MACHINE_RECIPE.get(), recipe -> {
            List<EntryIngredient> inputs = EntryIngredients.ofIngredients(recipe.value().getIngredients());
            List<EntryIngredient> outputs = List.of(EntryIngredients.of(recipe.value().getResultItem(null)));
            return new BankMachineDisplay(inputs, outputs, Optional.of(recipe));
    });
        LOGGER.info("[" + MoneyMod.MOD_ID + "] Bank Machine Display has been registered successfully.");
    }
}