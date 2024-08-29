package tk.bubustein.money.forge;

import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredStructureFeature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.flat.FlatLevelGeneratorSettings;
import tk.bubustein.money.MoneyMod;
import tk.bubustein.money.world.ModStructures;

public class ConfiguredStructureRegistryForge {
    public static ConfiguredStructureFeature<?, ?> CONFIGURED_MANSION = ModStructures.MANSION.configured(FeatureConfiguration.NONE);

    public static void registerConfiguredStructures() {
        Registry<ConfiguredStructureFeature<?, ?>> registry = BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE;
        Registry.register(registry, new ResourceLocation(MoneyMod.MOD_ID, "mansion"), CONFIGURED_MANSION);
        FlatLevelGeneratorSettings.STRUCTURE_FEATURES.put(ModStructures.MANSION, CONFIGURED_MANSION);
    }
}