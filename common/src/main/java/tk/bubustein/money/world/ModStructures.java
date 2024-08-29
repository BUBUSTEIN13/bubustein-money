package tk.bubustein.money.world;

import net.minecraft.world.level.levelgen.feature.StructureFeature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

public class ModStructures {
    public static final StructureFeature<NoneFeatureConfiguration> MANSION = new MansionFeature(NoneFeatureConfiguration.CODEC);
}