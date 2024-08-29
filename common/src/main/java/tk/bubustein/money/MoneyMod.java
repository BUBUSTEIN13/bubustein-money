package tk.bubustein.money;

import me.shedaniel.architectury.registry.CreativeTabs;
import net.minecraft.core.WritableRegistry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.apache.logging.log4j.LogManager;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.level.levelgen.feature.structures.StructureTemplatePool;
import org.apache.logging.log4j.Logger;
import tk.bubustein.money.block.ModBlocks;
import tk.bubustein.money.item.ModItems;
import tk.bubustein.money.recipe.ModRecipes;
import tk.bubustein.money.screen.ModMenuTypes;
import tk.bubustein.money.util.JigsawHelper;
import tk.bubustein.money.villager.ModVillagers;

public class MoneyMod {
    public static final String MOD_ID = "bubusteinmoneymod";
    public static final Logger LOGGER = LogManager.getLogger();

    public static final CreativeModeTab BANKNOTES = CreativeTabs.create(new ResourceLocation(MoneyMod.MOD_ID, "banknotes"), () ->
            new ItemStack(ModItems.Euro500.get()));
    public static final CreativeModeTab COINS = CreativeTabs.create(new ResourceLocation(MoneyMod.MOD_ID, "coins"), () ->
            new ItemStack(ModItems.Euro2.get()));
    public static final CreativeModeTab SPECIAL = CreativeTabs.create(new ResourceLocation(MoneyMod.MOD_ID, "special"), () ->
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
        LOGGER.info("[" + MOD_ID + "] Generating Mansions. . .");
        LOGGER.info("[" + MOD_ID + "] Making new jobs. . .");
        ModVillagers.init();
        LOGGER.info("[" + MOD_ID + "] The Mod has been loaded successfully");
    }
    public static void registerJigsaws(MinecraftServer server){
        WritableRegistry<StructureTemplatePool> templatePoolRegistry = server.registryAccess().registry(Registry.TEMPLATE_POOL_REGISTRY).get();

        ResourceLocation plainsPoolLocation = new ResourceLocation("minecraft:village/plains/houses");
        ResourceLocation desertPoolLocation = new ResourceLocation("minecraft:village/desert/houses");
        ResourceLocation savannaPoolLocation = new ResourceLocation("minecraft:village/savanna/houses");
        ResourceLocation snowyPoolLocation = new ResourceLocation("minecraft:village/snowy/houses");
        ResourceLocation taigaPoolLocation = new ResourceLocation("minecraft:village/taiga/houses");

        JigsawHelper.addBuildingToPool(templatePoolRegistry, plainsPoolLocation, "bubusteinmoneymod:banker_house", 20);
        JigsawHelper.addBuildingToPool(templatePoolRegistry, desertPoolLocation, "bubusteinmoneymod:banker_house", 7);
        JigsawHelper.addBuildingToPool(templatePoolRegistry, savannaPoolLocation, "bubusteinmoneymod:banker_house", 20);
        JigsawHelper.addBuildingToPool(templatePoolRegistry, taigaPoolLocation, "bubusteinmoneymod:banker_house", 20);
        JigsawHelper.addBuildingToPool(templatePoolRegistry, snowyPoolLocation, "bubusteinmoneymod:banker_house", 7);
    }
}