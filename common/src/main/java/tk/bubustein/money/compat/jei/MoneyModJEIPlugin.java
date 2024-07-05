package tk.bubustein.money.compat.jei;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.crafting.RecipeManager;
import org.jetbrains.annotations.NotNull;
import tk.bubustein.money.MoneyMod;
import tk.bubustein.money.recipe.BankMachineRecipe;
import tk.bubustein.money.recipe.ModRecipes;
import java.util.List;
import static tk.bubustein.money.MoneyMod.LOGGER;

@JeiPlugin
@Environment(EnvType.CLIENT)
public class MoneyModJEIPlugin implements IModPlugin {
    private static final ResourceLocation ID = new ResourceLocation(MoneyMod.MOD_ID, "jei_plugin");
    @Override
    public @NotNull ResourceLocation getPluginUid() {
        return ID;
    }
    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        LOGGER.info("[" + MoneyMod.MOD_ID +  "] Registering categories");
        registration.addRecipeCategories(new BankMachineCategory(registration.getJeiHelpers().getGuiHelper()));
    }
    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        LOGGER.info("[" + MoneyMod.MOD_ID +  "] Registering recipes");
        assert Minecraft.getInstance().level != null;
        RecipeManager recipeManager = Minecraft.getInstance().level.getRecipeManager();
        List<BankMachineRecipe> recipes = recipeManager.getAllRecipesFor(ModRecipes.BANK_MACHINE_RECIPE.get()).stream()
                .map(RecipeHolder::value)
                .toList();
        LOGGER.info( "[" + MoneyMod.MOD_ID +"] Loaded {} Bank Machine recipes", recipes.size());
        registration.addRecipes(BankMachineCategory.RECIPE_TYPE, recipes);
    }
}