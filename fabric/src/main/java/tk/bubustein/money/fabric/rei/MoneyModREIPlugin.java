package tk.bubustein.money.fabric.rei;

import me.shedaniel.rei.api.RecipeHelper;
import me.shedaniel.rei.api.plugins.REIPluginV0;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Recipe;
import tk.bubustein.money.MoneyMod;
import tk.bubustein.money.recipe.BankMachineRecipeShaped;
import tk.bubustein.money.recipe.BankMachineRecipeShapeless;
import tk.bubustein.money.recipe.ModRecipes;

public class MoneyModREIPlugin implements REIPluginV0 {
    public static final ResourceLocation BANK_MACHINE = new ResourceLocation(MoneyMod.MOD_ID, "bank_machine");
    @Override
    public ResourceLocation getPluginIdentifier() {
        return BANK_MACHINE;
    }
    @Override
    public void registerPluginCategories(RecipeHelper registry) {
        registry.registerCategories(new BankMachineCategory());
    }
    @Override
    public void registerRecipeDisplays(RecipeHelper registry) {
        registry.registerRecipes(BANK_MACHINE, (Recipe recipe) -> recipe instanceof BankMachineRecipeShapeless && recipe.getType() == ModRecipes.BANK_MACHINE_RECIPE, BankMachineDisplayShapeless::new);
        registry.registerRecipes(BANK_MACHINE, (Recipe recipe) -> recipe instanceof BankMachineRecipeShaped && recipe.getType() == ModRecipes.BANK_MACHINE_RECIPE, BankMachineDisplayShaped::new);
    }
}