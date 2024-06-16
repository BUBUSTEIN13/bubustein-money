package tk.bubustein.money;

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
public class MoneyMod {
    public static final String MOD_ID = "bubusteinmoneymod";
    public static final Logger LOGGER = LogManager.getLogger();
    public static void init() {
        LOGGER.info("[" + MOD_ID + "] Printing money. . . ;)");
        ModItems.init();
        ModBlocks.init();
        ModVillagers.init();
        LOGGER.info("[" + MOD_ID + "] The operation has been done successfully");
    }
    public static ResourceLocation id(String name) {
        return new ResourceLocation(MOD_ID, name);
    }

    public static void registerJigsaws(MinecraftServer server){
        WritableRegistry<StructureTemplatePool> templatePoolRegistry = server.registryAccess().registry(Registry.TEMPLATE_POOL_REGISTRY).get();

        ResourceLocation plainsPoolLocation = new ResourceLocation("minecraft:village/plains/houses");
        ResourceLocation desertPoolLocation = new ResourceLocation("minecraft:village/desert/houses");
        ResourceLocation savannaPoolLocation = new ResourceLocation("minecraft:village/savanna/houses");
        ResourceLocation snowyPoolLocation = new ResourceLocation("minecraft:village/snowy/houses");
        ResourceLocation taigaPoolLocation = new ResourceLocation("minecraft:village/taiga/houses");

        JigsawHelper.addBuildingToPool(templatePoolRegistry, plainsPoolLocation, "bubusteinmoneymod:plains_banker_house_3", 20);
        JigsawHelper.addBuildingToPool(templatePoolRegistry, desertPoolLocation, "bubusteinmoneymod:plains_banker_house_3", 7);
        JigsawHelper.addBuildingToPool(templatePoolRegistry, savannaPoolLocation, "bubusteinmoneymod:plains_banker_house_3", 20);
        JigsawHelper.addBuildingToPool(templatePoolRegistry, taigaPoolLocation, "bubusteinmoneymod:plains_banker_house_3", 20);
        JigsawHelper.addBuildingToPool(templatePoolRegistry, snowyPoolLocation, "bubusteinmoneymod:plains_banker_house_3", 7);
    }
}