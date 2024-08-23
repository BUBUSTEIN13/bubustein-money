package tk.bubustein.money;

import com.mojang.logging.LogUtils;
import dev.architectury.registry.CreativeTabRegistry;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.levelgen.structure.pools.StructureTemplatePool;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessorList;
import org.slf4j.Logger;
import tk.bubustein.money.block.ModBlocks;
import tk.bubustein.money.item.ModItems;
import tk.bubustein.money.recipe.ModRecipes;
import tk.bubustein.money.screen.ModMenuTypes;
import tk.bubustein.money.util.JigsawHelper;
import tk.bubustein.money.villager.ModVillagers;
public class MoneyMod {
    public static final String MOD_ID = "bubusteinmoneymod";
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final CreativeModeTab BANKNOTES = CreativeTabRegistry.create(new ResourceLocation(MoneyMod.MOD_ID, "banknotes"), () ->
            new ItemStack(ModItems.Euro500.get()));
    public static final CreativeModeTab COINS = CreativeTabRegistry.create(new ResourceLocation(MoneyMod.MOD_ID, "coins"), () ->
            new ItemStack(ModItems.Euro2.get()));
    public static final CreativeModeTab SPECIAL = CreativeTabRegistry.create(new ResourceLocation(MoneyMod.MOD_ID, "special"), () ->
            new ItemStack(ModBlocks.ATM.get()));
    public static void init() {
        LOGGER.info("[" + MOD_ID + "] Printing money. . . ;)");
        ModItems.init();
        LOGGER.info("[" + MOD_ID + "] Crafting ATM. . .");
        ModBlocks.init();
        LOGGER.info("[" + MOD_ID + "] Registering Bank Machine GUI. . .");
        ModMenuTypes.init();
        LOGGER.info("[" + MOD_ID + "] Registering Bank Machine Recipes. . .");
        ModRecipes.init();
        LOGGER.info("[" + MOD_ID + "] Making new jobs. . .");
        ModVillagers.init();
        LOGGER.info("[" + MOD_ID + "] The Mod has been loaded successfully");
    }
    public static void registerJigsaws(MinecraftServer server){
        Registry<StructureTemplatePool> templatePoolRegistry = server.registryAccess().registry(Registry.TEMPLATE_POOL_REGISTRY).orElseThrow();
        Registry<StructureProcessorList> processorListRegistry = server.registryAccess().registry(Registry.PROCESSOR_LIST_REGISTRY).orElseThrow();

        ResourceLocation plainsPoolLocation = new ResourceLocation("minecraft:village/plains/houses");
        ResourceLocation desertPoolLocation = new ResourceLocation("minecraft:village/desert/houses");
        ResourceLocation savannaPoolLocation = new ResourceLocation("minecraft:village/savanna/houses");
        ResourceLocation snowyPoolLocation = new ResourceLocation("minecraft:village/snowy/houses");
        ResourceLocation taigaPoolLocation = new ResourceLocation("minecraft:village/taiga/houses");

        JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, plainsPoolLocation, "bubusteinmoneymod:banker_house", 20);
        JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, desertPoolLocation, "bubusteinmoneymod:banker_house", 7);
        JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, savannaPoolLocation, "bubusteinmoneymod:banker_house", 20);
        JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, taigaPoolLocation, "bubusteinmoneymod:banker_house", 20);
        JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, snowyPoolLocation, "bubusteinmoneymod:banker_house", 7);
    }
}