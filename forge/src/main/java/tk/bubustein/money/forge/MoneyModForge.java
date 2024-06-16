package tk.bubustein.money.forge;

import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerAboutToStartEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;
import net.minecraftforge.registries.RegistryObject;
import tk.bubustein.money.MoneyMod;
import tk.bubustein.money.villager.ModVillagers;
import java.lang.reflect.InvocationTargetException;

@Mod(MoneyMod.MOD_ID)
public class MoneyModForge {
    public MoneyModForge() {
        MoneyMod.init();
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        MoneyExpectPlatformImpl.BLOCKS.register(bus);
        MoneyExpectPlatformImpl.ITEMS.register(bus);
        MoneyExpectPlatformImpl.POI_TYPES.register(bus);
        MoneyExpectPlatformImpl.PROFESSIONS.register(bus);
        bus.addListener(this::setup);
        MinecraftForge.EVENT_BUS.register(this);
    }
    @SubscribeEvent
    public void onServerAboutToStartEvent(ServerAboutToStartEvent event) {
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
                e.printStackTrace();
            }
        }
    }
}