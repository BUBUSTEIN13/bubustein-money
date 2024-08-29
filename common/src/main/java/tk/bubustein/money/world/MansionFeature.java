package tk.bubustein.money.world;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.core.RegistryAccess;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeSource;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.WorldgenRandom;
import net.minecraft.world.level.levelgen.feature.StructureFeature;
import net.minecraft.world.level.levelgen.feature.configurations.JigsawConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.StructureFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.structures.JigsawPlacement;
import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraft.world.level.levelgen.structure.PoolElementStructurePiece;
import net.minecraft.world.level.levelgen.structure.StructureStart;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureManager;
import org.apache.logging.log4j.Level;
import tk.bubustein.money.MoneyMod;
import java.util.List;

public class MansionFeature extends StructureFeature<NoneFeatureConfiguration> {
    private static final List<MobSpawnSettings.SpawnerData> MANSION_ENEMIES = ImmutableList.of(
            new MobSpawnSettings.SpawnerData(EntityType.PILLAGER, 10, 20, 70),
            new MobSpawnSettings.SpawnerData(EntityType.WITCH, 8, 10, 30),
            new MobSpawnSettings.SpawnerData(EntityType.EVOKER, 5, 5, 15),
            new MobSpawnSettings.SpawnerData(EntityType.VINDICATOR, 10, 20, 50),
            new MobSpawnSettings.SpawnerData(EntityType.ILLUSIONER, 1, 1, 5)
    );
    public MansionFeature(Codec<NoneFeatureConfiguration> codec) {
        super(codec);
    }
    @Override
    public StructureStartFactory<NoneFeatureConfiguration> getStartFactory() {
        return MansionStart::new;
    }

    @Override
    public List<MobSpawnSettings.SpawnerData> getSpecialEnemies() {
        return MANSION_ENEMIES;
    }
    @Override
    public GenerationStep.Decoration step() {
        return GenerationStep.Decoration.SURFACE_STRUCTURES;
    }
    @Override
    protected boolean isFeatureChunk(ChunkGenerator chunkGenerator, BiomeSource biomeSource, long seed, WorldgenRandom random, int chunkX, int chunkZ, Biome biome, ChunkPos chunkPos, NoneFeatureConfiguration config) {
        if (random.nextInt(17) != 0) {
            return false;
        }
        return !isNearVillage(chunkGenerator, seed, random, chunkX, chunkZ);
    }
    private boolean isNearVillage(ChunkGenerator chunkGenerator, long seed, WorldgenRandom random, int chunkX, int chunkZ) {
        StructureFeatureConfiguration villageConfig = chunkGenerator.getSettings().getConfig(StructureFeature.VILLAGE);
        if (villageConfig == null) {
            return false;
        }
        int minDistance = 128;
        for (int x = chunkX - (minDistance / 16); x <= chunkX + (minDistance / 16); ++x) {
            for (int z = chunkZ - (minDistance / 16); z <= chunkZ + (minDistance / 16); ++z) {
                ChunkPos potentialChunkPos = StructureFeature.VILLAGE.getPotentialFeatureChunk(villageConfig, seed, random, x, z);
                int dx = x - potentialChunkPos.x;
                int dz = z - potentialChunkPos.z;
                if (dx * dx + dz * dz <= (minDistance / 16) * (minDistance / 16)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static class MansionStart extends StructureStart<NoneFeatureConfiguration> {
        public MansionStart(StructureFeature<NoneFeatureConfiguration> structure, int chunkX, int chunkZ, BoundingBox boundingBox, int references, long seed) {
            super(structure, chunkX, chunkZ, boundingBox, references, seed);
        }
        @Override
        public void generatePieces(RegistryAccess registryAccess, ChunkGenerator chunkGenerator, StructureManager structureManager, int i, int j, Biome biome, NoneFeatureConfiguration featureConfiguration) {
            int x = (i << 4) + 7;
            int z = (j << 4) + 7;
            BlockPos startPos = new BlockPos(x, -3, z);

            JigsawPlacement.addPieces(
                    registryAccess,
                    new JigsawConfiguration(() -> registryAccess.registryOrThrow(Registry.TEMPLATE_POOL_REGISTRY)
                            .get(new ResourceLocation(MoneyMod.MOD_ID, "mansion/start_pool")), 10),
                    PoolElementStructurePiece::new,
                    chunkGenerator,
                    structureManager,
                    startPos,
                    this.pieces,
                    this.random,
                    false,
                    true
            );
            this.pieces.forEach(piece -> piece.move(0, 1, 0));
            this.calculateBoundingBox();
            MoneyMod.LOGGER.log(Level.DEBUG, "Rundown MANSION at " +
                    this.pieces.get(0).getBoundingBox().x0 + " " +
                    this.pieces.get(0).getBoundingBox().y0 + " " +
                    this.pieces.get(0).getBoundingBox().z0);
        }
    }
}