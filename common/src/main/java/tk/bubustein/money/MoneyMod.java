package tk.bubustein.money;
<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes
import net.minecraft.core.WritableRegistry;
import org.apache.logging.log4j.LogManager;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.level.levelgen.feature.structures.StructureTemplatePool;
import org.apache.logging.log4j.Logger;
import tk.bubustein.money.block.ModBlocks;
import tk.bubustein.money.item.ModItems;
import tk.bubustein.money.util.JigsawHelper;
import tk.bubustein.money.villager.ModVillagers;
<<<<<<< Updated upstream


public class MoneyMod {
    public static final String MOD_ID = "bubusteinmoneymod";
    public static final Logger LOGGER = LogManager.getLogger();

=======
public class MoneyMod {
    public static final String MOD_ID = "bubusteinmoneymod";
    public static final Logger LOGGER = LogManager.getLogger();
>>>>>>> Stashed changes
    public static void init() {

        LOGGER.info("[" + MOD_ID + "] Starting mod");

        ModItems.init();
        ModBlocks.init();
        ModVillagers.init();
<<<<<<< Updated upstream

        LOGGER.info("[" + MOD_ID + "] COMPLETED");
    }
=======
        LOGGER.info("[" + MOD_ID + "] The operation has been done successfully");
    }
    public static ResourceLocation id(String name) {
        return new ResourceLocation(MOD_ID, name);
    }
>>>>>>> Stashed changes

    public static void registerJigsaws(MinecraftServer server){
        WritableRegistry<StructureTemplatePool> templatePoolRegistry = server.registryAccess().registry(Registry.TEMPLATE_POOL_REGISTRY).get();

        ResourceLocation plainsPoolLocation = new ResourceLocation("minecraft:village/plains/houses");
        ResourceLocation desertPoolLocation = new ResourceLocation("minecraft:village/desert/houses");
        ResourceLocation savannaPoolLocation = new ResourceLocation("minecraft:village/savanna/houses");
        ResourceLocation snowyPoolLocation = new ResourceLocation("minecraft:village/snowy/houses");
        ResourceLocation taigaPoolLocation = new ResourceLocation("minecraft:village/taiga/houses");

<<<<<<< Updated upstream
        if(MoneyExpectPlatform.generatePlainsHouses()){
            JigsawHelper.addBuildingToPool(templatePoolRegistry,  plainsPoolLocation, "bubusteinmoneymod:plains_banker_house_2", 20);
        }
        if(MoneyExpectPlatform.generateDesertHouses()){
            JigsawHelper.addBuildingToPool(templatePoolRegistry,  desertPoolLocation, "bubusteinmoneymod:plains_banker_house_2", 7);
        }
        if(MoneyExpectPlatform.generateSavannaHouses()){
            JigsawHelper.addBuildingToPool(templatePoolRegistry,  savannaPoolLocation, "bubusteinmoneymod:plains_banker_house_2", 20);
        }
        if(MoneyExpectPlatform.generateTaigaHouses()){
            JigsawHelper.addBuildingToPool(templatePoolRegistry,  taigaPoolLocation, "bubusteinmoneymod:plains_banker_house_2", 20);
        }
        if(MoneyExpectPlatform.generateSnowyHouses()){
            JigsawHelper.addBuildingToPool(templatePoolRegistry,  snowyPoolLocation, "bubusteinmoneymod:plains_banker_house_2", 7);
        }
=======
        JigsawHelper.addBuildingToPool(templatePoolRegistry, plainsPoolLocation, "bubusteinmoneymod:plains_banker_house_3", 20);
        JigsawHelper.addBuildingToPool(templatePoolRegistry, desertPoolLocation, "bubusteinmoneymod:plains_banker_house_3", 7);
        JigsawHelper.addBuildingToPool(templatePoolRegistry, savannaPoolLocation, "bubusteinmoneymod:plains_banker_house_3", 20);
        JigsawHelper.addBuildingToPool(templatePoolRegistry, taigaPoolLocation, "bubusteinmoneymod:plains_banker_house_3", 20);
        JigsawHelper.addBuildingToPool(templatePoolRegistry, snowyPoolLocation, "bubusteinmoneymod:plains_banker_house_3", 7);
>>>>>>> Stashed changes
    }
}


