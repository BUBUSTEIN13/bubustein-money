package tk.bubustein.money;
import com.mojang.logging.LogUtils;
import dev.architectury.registry.CreativeTabRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.item.ItemStack;
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
    public static CreativeTabRegistry.TabSupplier BANKNOTES = CreativeTabRegistry.create(new ResourceLocation(MOD_ID, "banknotes"),
            () -> new ItemStack(ModItems.Euro500.get()));
    public static CreativeTabRegistry.TabSupplier COINS = CreativeTabRegistry.create(new ResourceLocation(MOD_ID, "coins"),
            () -> new ItemStack(ModItems.Euro2.get()));
    public static CreativeTabRegistry.TabSupplier SPECIAL = CreativeTabRegistry.create(new ResourceLocation(MOD_ID, "special"),
            () -> new ItemStack(ModBlocks.ATM.get()));
    public static void init() {
        LOGGER.info("[" + MOD_ID + "] Printing money. . .");
        ModItems.init();
        ModBlocks.init();
        ModVillagers.init();
        LOGGER.info("[" + MOD_ID + "] The operation has been done successfully");
    }
    public static void registerJigsaws(MinecraftServer server){
        Registry<StructureTemplatePool> templatePoolRegistry = server.registryAccess().registry(Registries.TEMPLATE_POOL).orElseThrow();
        Registry<StructureProcessorList> processorListRegistry = server.registryAccess().registry(Registries.PROCESSOR_LIST).orElseThrow();

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