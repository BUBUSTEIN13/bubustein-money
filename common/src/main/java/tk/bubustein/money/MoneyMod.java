package tk.bubustein.money;

import com.mojang.logging.LogUtils;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.level.levelgen.structure.pools.StructureTemplatePool;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessorList;
import org.slf4j.Logger;
import tk.bubustein.money.block.ModBlocks;
import tk.bubustein.money.item.ModItems;
import tk.bubustein.money.util.JigsawHelper;
import tk.bubustein.money.villager.ModVillagers;
public class MoneyMod {
    public static final String MOD_ID = "bubusteinmoneymod";
    public static final Logger LOGGER = LogUtils.getLogger();

    public static void init() {
        LOGGER.info("[" + MOD_ID + "] Printing money. . . ;)");
        ModItems.init();
        ModBlocks.init();
        ModVillagers.init();
        LOGGER.info("[" + MOD_ID + "] The operation has been done successfully");
    }
    public static void registerJigsaws(MinecraftServer server){
        Registry<StructureTemplatePool> templatePoolRegistry = server.registryAccess().registry(Registry.TEMPLATE_POOL_REGISTRY).orElseThrow();
        Registry<StructureProcessorList> processorListRegistry = server.registryAccess().registry(Registry.PROCESSOR_LIST_REGISTRY).orElseThrow();

        ResourceLocation plainsPoolLocation = new ResourceLocation("minecraft:village/plains/houses");
        ResourceLocation desertPoolLocation = new ResourceLocation("minecraft:village/desert/houses");
        ResourceLocation savannaPoolLocation = new ResourceLocation("minecraft:village/savanna/houses");
        ResourceLocation snowyPoolLocation = new ResourceLocation("minecraft:village/snowy/houses");
        ResourceLocation taigaPoolLocation = new ResourceLocation("minecraft:village/taiga/houses");

        JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, plainsPoolLocation, "bubusteinmoneymod:plains_banker_house_3", 20);
        JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, desertPoolLocation, "bubusteinmoneymod:plains_banker_house_3", 7);
        JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, savannaPoolLocation, "bubusteinmoneymod:plains_banker_house_3", 20);
        JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, taigaPoolLocation, "bubusteinmoneymod:plains_banker_house_3", 20);
        JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, snowyPoolLocation, "bubusteinmoneymod:plains_banker_house_3", 7);
    }
}