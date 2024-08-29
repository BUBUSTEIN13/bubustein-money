package tk.bubustein.money.forge;

import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.levelgen.feature.StructureFeature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import tk.bubustein.money.MoneyMod;
import tk.bubustein.money.MoneyExpectPlatform;
import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import tk.bubustein.money.forge.recipe.ForgeBankMachineRecipeShaped;
import tk.bubustein.money.forge.recipe.ForgeBankMachineRecipeShapeless;
import java.nio.file.Path;
import java.util.function.Supplier;
public class MoneyExpectPlatformImpl {
    /**
     * This is our actual method to {@link MoneyExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MoneyMod.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoneyMod.MOD_ID);
    public static final DeferredRegister<PoiType> POI_TYPES = DeferredRegister.create(ForgeRegistries.POI_TYPES, MoneyMod.MOD_ID);
    public static final DeferredRegister<StructureFeature<?>> STRUCTURES = DeferredRegister.create(ForgeRegistries.STRUCTURE_FEATURES, MoneyMod.MOD_ID);
    public static final DeferredRegister<VillagerProfession> PROFESSIONS = DeferredRegister.create(ForgeRegistries.PROFESSIONS, MoneyMod.MOD_ID);
    public static <T extends Block> Supplier<T> registerBlock(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }
    public static <T extends Item> Supplier<T> registerItem(String name, Supplier<T> item) {
        return ITEMS.register(name, item);
    }
    public static Supplier<VillagerProfession> registerProfession(String name, Supplier<VillagerProfession> profession) {
        return PROFESSIONS.register(name, profession);
    }
    public static Supplier<PoiType> registerPoiType(String name, Supplier<PoiType> poiType) {
        return POI_TYPES.register(name, poiType);
    }
    public static RecipeSerializer<ForgeBankMachineRecipeShaped> getBankMachineShapedSerializer() {
        return ForgeBankMachineRecipeShaped.Serializer.INSTANCE;
    }
    public static RecipeSerializer<ForgeBankMachineRecipeShapeless> getBankMachineShapelessSerializer() {
        return ForgeBankMachineRecipeShapeless.Serializer.INSTANCE;
    }
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
        BLOCKS.register(eventBus);
        POI_TYPES.register(eventBus);
        PROFESSIONS.register(eventBus);
        STRUCTURES.register(eventBus);
    }
}