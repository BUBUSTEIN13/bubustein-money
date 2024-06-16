package tk.bubustein.money.forge;

<<<<<<< Updated upstream
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.fml.RegistryObject;
=======
>>>>>>> Stashed changes
import tk.bubustein.money.MoneyMod;
import tk.bubustein.money.MoneyExpectPlatform;
import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import tk.bubustein.money.block.ModBlocks;

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
    public static final DeferredRegister<VillagerProfession> PROFESSIONS = DeferredRegister.create(ForgeRegistries.PROFESSIONS, MoneyMod.MOD_ID);
<<<<<<< Updated upstream

=======
>>>>>>> Stashed changes
    public static <T extends Block> Supplier<T> registerBlock(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }
    public static <T extends Item> Supplier<T> registerItem(String name, Supplier<T> item) {
        return ITEMS.register(name, item);
    }
    public static Supplier<VillagerProfession> registerProfession(String name, Supplier<VillagerProfession> profession) {
        return PROFESSIONS.register(name, profession);
    }
<<<<<<< Updated upstream

    public static Supplier<PoiType> registerPoiType(String name, Supplier<PoiType> poiType) {
        return POI_TYPES.register(name, poiType);
    }
    public static CreativeModeTab registerCreativeModeTab(ResourceLocation name, Supplier<ItemStack> icon) {
        return new CreativeModeTab(name.getNamespace() + "." + name.getPath()) {
            @Override
            public ItemStack makeIcon() {
                return icon.get();
            }
        };
    }
    public static boolean generatePlainsHouses() {
        return true;
    }
    public static boolean generateTaigaHouses() {
        return true;
    }
    public static boolean generateSavannaHouses() {
        return true;
    }
    public static boolean generateSnowyHouses() {
        return true;
    }
    public static boolean generateDesertHouses() {
        return true;
=======
    public static Supplier<PoiType> registerPoiType(String name, Supplier<PoiType> poiType) {
        return POI_TYPES.register(name, poiType);
>>>>>>> Stashed changes
    }
}
