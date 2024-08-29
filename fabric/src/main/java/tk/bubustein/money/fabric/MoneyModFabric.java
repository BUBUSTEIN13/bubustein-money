package tk.bubustein.money.fabric;

import net.fabricmc.fabric.api.biome.v1.*;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerWorldEvents;
import net.fabricmc.fabric.api.structure.v1.FabricStructureBuilder;
import net.fabricmc.fabric.mixin.structure.StructuresConfigAccessor;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.StructureSettings;
import net.minecraft.world.level.levelgen.feature.ConfiguredStructureFeature;
import net.minecraft.world.level.levelgen.feature.StructureFeature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.StructureFeatureConfiguration;
import tk.bubustein.money.MoneyMod;
import net.fabricmc.api.ModInitializer;
import tk.bubustein.money.mixin.PoiTypesInvoker;
import tk.bubustein.money.villager.ModVillagers;
import tk.bubustein.money.world.MansionFeature;
import tk.bubustein.money.world.ModStructures;

import java.util.HashMap;
import java.util.Map;

public class MoneyModFabric implements ModInitializer {

    public static final ResourceKey<ConfiguredStructureFeature<?, ?>> CONFIGURED_MANSION_KEY = ResourceKey.create(Registry.CONFIGURED_STRUCTURE_FEATURE_REGISTRY, new ResourceLocation(MoneyMod.MOD_ID, "mansion"));
    @Override
    public void onInitialize() {
        MoneyMod.init();
        FabricStructureBuilder.create(new ResourceLocation(MoneyMod.MOD_ID, "mansion"), ModStructures.MANSION).step(GenerationStep.Decoration.SURFACE_STRUCTURES)
                .defaultConfig(17, 12, 496982001).adjustsSurface().register();
        ConfiguredStructureFeature<?, ?> mansionConfigured = new ConfiguredStructureFeature<>(
               ModStructures.MANSION, NoneFeatureConfiguration.INSTANCE);
        Registry.register(BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE, CONFIGURED_MANSION_KEY.location(), mansionConfigured);
        BiomeModifications.create(new ResourceLocation(MoneyMod.MOD_ID, "biome_modifications"))
                .add(ModificationPhase.ADDITIONS,
                        BiomeSelectors.includeByKey(
                                ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:desert")),
                                ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:plains")),
                                ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:savanna")),
                                ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:snowy_tundra")),
                                ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:taiga")),
                                ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:sunflower_plains"))
                        ),
                        context -> context.getGenerationSettings().addStructure(CONFIGURED_MANSION_KEY)
                );
        addStructureSpawningToOverworld();
        ModVillagers.fillTradeData();
        registerPOIs();
        ServerLifecycleEvents.SERVER_STARTING.register(MoneyMod::registerJigsaws);
    }
    void registerPOIs() {
        PoiTypesInvoker.invokeRegisterBlockStates(ModVillagers.BANKER_POI.get());
        PoiTypesInvoker.invokeRegisterBlockStates(ModVillagers.EXCHANGER_POI.get());
    }
    private static void addStructureSpawningToOverworld() {
        ServerWorldEvents.LOAD.register((MinecraftServer minecraftServer, ServerLevel serverLevel) -> {
            if (serverLevel.dimension() == Level.OVERWORLD) {
                Map<StructureFeature<?>, StructureFeatureConfiguration> tempMap = new HashMap<>(serverLevel.getChunkSource().getGenerator().getSettings().structureConfig());
                tempMap.put(ModStructures.MANSION, StructureSettings.DEFAULTS.get(ModStructures.MANSION));
                ((StructuresConfigAccessor) serverLevel.getChunkSource().getGenerator().getSettings()).setStructures(tempMap);
            }
        });
    }
}