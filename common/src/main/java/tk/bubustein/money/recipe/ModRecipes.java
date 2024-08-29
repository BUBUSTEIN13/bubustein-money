package tk.bubustein.money.recipe;

import me.shedaniel.architectury.registry.DeferredRegister;
import me.shedaniel.architectury.registry.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import tk.bubustein.money.MoneyExpectPlatform;
import tk.bubustein.money.MoneyMod;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(MoneyMod.MOD_ID, Registry.RECIPE_SERIALIZER_REGISTRY);
    public static final RecipeType<BankMachineRecipe> BANK_MACHINE_RECIPE = RecipeType.register(new ResourceLocation(MoneyMod.MOD_ID, "bank_machine").toString());
    public static final RegistrySupplier<RecipeSerializer<BankMachineRecipeShaped>> BANK_MACHINE_SHAPED = SERIALIZERS.register("bank_machine_shaped", MoneyExpectPlatform::getBankMachineShapedSerializer);
    public static final RegistrySupplier<RecipeSerializer<BankMachineRecipeShapeless>> BANK_MACHINE_SHAPELESS = SERIALIZERS.register("bank_machine_shapeless", MoneyExpectPlatform::getBankMachineShapelessSerializer);
    public static void init() {
        SERIALIZERS.register();
    }
}