package tk.bubustein.money.fabric;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import tk.bubustein.money.MoneyExpectPlatform;
import tk.bubustein.money.MoneyMod;
import tk.bubustein.money.mixin.PoiTypesInvoker;

import java.nio.file.Path;
import java.util.Set;
import java.util.function.Supplier;

public class MoneyExpectPlatformImpl {
    /**
     * This is our actual method to {@link MoneyExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }
    public static <T extends Block> Supplier<T> registerBlock(String name, Supplier<T> block) {
        T registry = Registry.register(Registry.BLOCK, new ResourceLocation(MoneyMod.MOD_ID, name), block.get());
        return () -> registry;
    }

    public static <T extends Item> Supplier<T> registerItem(String name, Supplier<T> item) {
        T registry = Registry.register(Registry.ITEM, new ResourceLocation(MoneyMod.MOD_ID, name), item.get());
        return () -> registry;
    }

    public static Supplier<PoiType> registerPoiType(String name, Supplier<PoiType> poiType) {
        PoiType registry = Registry.register(Registry.POINT_OF_INTEREST_TYPE, new ResourceLocation(MoneyMod.MOD_ID, name), poiType.get());
        return () -> registry;
    }
    public static Supplier<VillagerProfession> registerProfession(String name, Supplier<VillagerProfession> profession) {
        VillagerProfession registry = Registry.register(Registry.VILLAGER_PROFESSION, new ResourceLocation(MoneyMod.MOD_ID, name), profession.get());
        return () -> registry;
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
    }
}
