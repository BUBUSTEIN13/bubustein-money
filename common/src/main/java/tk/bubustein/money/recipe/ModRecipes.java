package tk.bubustein.money.recipe;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import tk.bubustein.money.MoneyMod;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(MoneyMod.MOD_ID, Registry.RECIPE_SERIALIZER_REGISTRY);
    public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES = DeferredRegister.create(MoneyMod.MOD_ID, Registry.RECIPE_TYPE_REGISTRY);
    public static final RegistrySupplier<RecipeType<BankMachineRecipe>> BANK_MACHINE_RECIPE = RECIPE_TYPES.register("bank_machine", () -> new RecipeType<>() {
        @Override
        public int hashCode() {
            return super.hashCode();
        }
        @Override
        public String toString(){
            return super.toString();
        }
    });
    public static final RegistrySupplier<RecipeSerializer<BankMachineRecipeShaped>> BANK_MACHINE_SHAPED = SERIALIZERS.register("bank_machine_shaped", () -> BankMachineRecipeShaped.Serializer.INSTANCE);
    public static final RegistrySupplier<RecipeSerializer<BankMachineRecipeShapeless>> BANK_MACHINE_SHAPELESS = SERIALIZERS.register("bank_machine_shapeless", () -> BankMachineRecipeShapeless.Serializer.INSTANCE);
    public static void init(){
        SERIALIZERS.register();
        RECIPE_TYPES.register();
    }
}