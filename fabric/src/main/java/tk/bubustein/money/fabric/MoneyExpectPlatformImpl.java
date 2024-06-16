package tk.bubustein.money.fabric;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import tk.bubustein.money.MoneyExpectPlatform;
import net.fabricmc.loader.api.FabricLoader;
import tk.bubustein.money.MoneyMod;
import tk.bubustein.money.mixin.PoiTypesInvoker;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public class MoneyExpectPlatformImpl {
    public static List<Supplier<Block>> REGISTERED_BLOCKS = new ArrayList<>();
    /**
     * This is our actual method to {@link MoneyExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }
    public static <T extends Block> Supplier<T> registerBlock(String name, Supplier<T> block) {
        var registry = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MoneyMod.MOD_ID, name), block.get());
        REGISTERED_BLOCKS.add(() -> registry);
        return () -> registry;
    }
    public static <T extends Item> Supplier<T> registerItem(String name, Supplier<T> item) {
        var registry = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MoneyMod.MOD_ID, name), item.get());
        return () -> registry;
    }
    public static Supplier<PoiType> registerPoiType(String name, Supplier<Set<BlockState>> matchingStates) {
        ResourceKey<PoiType> resourceKey = ResourceKey.create(Registries.POINT_OF_INTEREST_TYPE, new ResourceLocation(MoneyMod.MOD_ID, name));
        var registry = Registry.register(BuiltInRegistries.POINT_OF_INTEREST_TYPE, resourceKey, new PoiType(matchingStates.get(), 1, 1));
        PoiTypesInvoker.invokeRegisterBlockStates(BuiltInRegistries.POINT_OF_INTEREST_TYPE.getHolderOrThrow(resourceKey), matchingStates.get());
        return () -> registry;
    }
    public static Supplier<VillagerProfession> registerProfession(String name, Supplier<VillagerProfession> profession) {
        var registry = Registry.register(BuiltInRegistries.VILLAGER_PROFESSION, new ResourceLocation(MoneyMod.MOD_ID, name), profession.get());
        return () -> registry;
    }
}
