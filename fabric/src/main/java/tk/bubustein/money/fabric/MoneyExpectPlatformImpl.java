package tk.bubustein.money.fabric;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.block.Block;
import tk.bubustein.money.MoneyExpectPlatform;
import net.fabricmc.loader.api.FabricLoader;
import tk.bubustein.money.MoneyMod;
import tk.bubustein.money.recipe.BankMachineRecipeShaped;
import tk.bubustein.money.recipe.BankMachineRecipeShapeless;
import java.nio.file.Path;
import java.util.function.Supplier;
public class MoneyExpectPlatformImpl {
    /**
     * This is our actual method to {@link MoneyExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }
    public static <T extends Block> Supplier<T> registerBlock(String name, Supplier<T> block) {
        var registry = Registry.register(Registry.BLOCK, new ResourceLocation(MoneyMod.MOD_ID, name), block.get());
        return () -> registry;
    }
    public static <T extends Item> Supplier<T> registerItem(String name, Supplier<T> item) {
        var registry = Registry.register(Registry.ITEM, new ResourceLocation(MoneyMod.MOD_ID, name), item.get());
        return () -> registry;
    }
    public static Supplier<PoiType> registerPoiType(String name, Supplier<PoiType> poiType) {
        var registry = Registry.register(Registry.POINT_OF_INTEREST_TYPE, new ResourceLocation(MoneyMod.MOD_ID, name), poiType.get());
        return () -> registry;
    }
    public static Supplier<VillagerProfession> registerProfession(String name, Supplier<VillagerProfession> profession) {
        var registry = Registry.register(Registry.VILLAGER_PROFESSION, new ResourceLocation(MoneyMod.MOD_ID, name), profession.get());
        return () -> registry;
    }
    public static RecipeSerializer<BankMachineRecipeShaped> getBankMachineShapedSerializer() {
        return BankMachineRecipeShaped.Serializer.INSTANCE;
    }
    public static RecipeSerializer<BankMachineRecipeShapeless> getBankMachineShapelessSerializer() {
        return BankMachineRecipeShapeless.Serializer.INSTANCE;
    }
}