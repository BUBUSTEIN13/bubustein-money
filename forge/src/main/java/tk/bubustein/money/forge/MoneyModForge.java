package tk.bubustein.money.forge;

import me.shedaniel.architectury.platform.forge.EventBuses;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.FlatLevelSource;
import net.minecraft.world.level.levelgen.StructureSettings;
import net.minecraft.world.level.levelgen.feature.StructureFeature;
import net.minecraft.world.level.levelgen.feature.configurations.StructureFeatureConfiguration;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerAboutToStartEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;
import tk.bubustein.money.MoneyMod;
import net.minecraftforge.eventbus.api.IEventBus;
import tk.bubustein.money.screen.BankMachineScreen;
import tk.bubustein.money.screen.ModMenuTypes;
import tk.bubustein.money.villager.ModVillagers;
import tk.bubustein.money.world.ModStructures;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

@Mod(MoneyMod.MOD_ID)
public class MoneyModForge {
    public MoneyModForge() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        EventBuses.registerModEventBus(MoneyMod.MOD_ID, bus);
        MoneyMod.init();
        MoneyExpectPlatformImpl.register(bus);
        bus.addListener(this::setup);
        bus.addGenericListener(StructureFeature.class, this::onRegisterStructures);
        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.addListener(EventPriority.NORMAL, this::addDimensionalSpacing);
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH,this::onBiomeLoading);
    }
    @SubscribeEvent
    public void onServerAboutToStartEvent(FMLServerAboutToStartEvent event) {
        MoneyMod.registerJigsaws(event.getServer());
    }
    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ModVillagers.fillTradeData();
            registerPOIs();
        });
    }
    void registerPOIs() {
        for (RegistryObject<PoiType> poi : MoneyExpectPlatformImpl.POI_TYPES.getEntries()) {
            try {
                ObfuscationReflectionHelper.findMethod(PoiType.class, "registerBlockStates", PoiType.class).invoke(null, poi.get());
            } catch (InvocationTargetException | IllegalAccessException e) {
                e.fillInStackTrace();
            }
        }
    }
    private void onRegisterStructures(final RegistryEvent.Register<StructureFeature<?>> event){
        StructureRegistryForge.setupStructures(event);
        ConfiguredStructureRegistryForge.registerConfiguredStructures();
    }

    private static final List<ResourceKey<Biome>> VALID_BIOMES = Arrays.asList(
            ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:desert")),
            ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:plains")),
            ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:savanna")),
            ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:snowy_tundra")),
            ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:taiga")),
            ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:sunflower_plains"))
    );
    public void onBiomeLoading(final BiomeLoadingEvent event) {
        ResourceKey<Biome> biomeKey = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        if (VALID_BIOMES.contains(biomeKey)) {
            event.getGeneration().getStructures().add(() -> ConfiguredStructureRegistryForge.CONFIGURED_MANSION);
        }
    }
    public void addDimensionalSpacing(final WorldEvent.Load event) {
        if (event.getWorld() instanceof ServerLevel) {
            ServerLevel serverWorld = (ServerLevel) event.getWorld();

            if (serverWorld.getChunkSource().getGenerator() instanceof FlatLevelSource && serverWorld.dimension().equals(Level.OVERWORLD)) {
                MoneyMod.LOGGER.info("Skipping Flat Level Source for Overworld.");
                return;
            }
            if (serverWorld.getChunkSource().getGenerator() instanceof ChunkGenerator && serverWorld.dimension().equals(Level.NETHER)) {
                MoneyMod.LOGGER.info("Skipping for Nether dimension.");
                return;
            }
            if (serverWorld.getChunkSource().getGenerator() instanceof ChunkGenerator && serverWorld.dimension().equals(Level.END)) {
                MoneyMod.LOGGER.info("Skipping for End dimension.");
                return;
            }

            MoneyMod.LOGGER.info("Adding custom structures to dimension: {}", serverWorld.dimension().location());
            Map<StructureFeature<?>, StructureFeatureConfiguration> tempMap = new HashMap<>(serverWorld.getChunkSource().generator.getSettings().structureConfig());
            tempMap.putIfAbsent(ModStructures.MANSION, StructureSettings.DEFAULTS.get(ModStructures.MANSION));
            serverWorld.getChunkSource().generator.getSettings().structureConfig = tempMap;

        }
    }
    public static <T extends IForgeRegistryEntry<T>> T register(IForgeRegistry<T> registry, T entry, String registryKey) {
        entry.setRegistryName(new ResourceLocation(MoneyMod.MOD_ID, registryKey));
        registry.register(entry);
        return entry;
    }
    @Mod.EventBusSubscriber(modid = MoneyMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents{
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event){
            MenuScreens.register(ModMenuTypes.BANK_MACHINE_MENU.get(), BankMachineScreen::new);
        }
    }
}