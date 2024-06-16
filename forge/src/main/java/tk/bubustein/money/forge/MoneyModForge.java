package tk.bubustein.money.forge;

import me.shedaniel.architectury.platform.forge.EventBuses;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerAboutToStartEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import tk.bubustein.money.MoneyMod;
import net.minecraftforge.eventbus.api.IEventBus;
import tk.bubustein.money.villager.ModVillagers;

import java.lang.reflect.InvocationTargetException;

@Mod(MoneyMod.MOD_ID)
public class MoneyModForge {
    public MoneyModForge() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        EventBuses.registerModEventBus(MoneyMod.MOD_ID, bus);
        MoneyMod.init();
        MoneyExpectPlatformImpl.BLOCKS.register(bus);
        MoneyExpectPlatformImpl.ITEMS.register(bus);
        MoneyExpectPlatformImpl.POI_TYPES.register(bus);
        MoneyExpectPlatformImpl.PROFESSIONS.register(bus);
        bus.addListener(this::setup);
        MinecraftForge.EVENT_BUS.register(this);
    }
    @SubscribeEvent
    public void onServerAboutToStartEvent(FMLServerAboutToStartEvent event) {
        MoneyMod.registerJigsaws(event.getServer());
    }
    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(ModVillagers::fillTradeData);
        event.enqueueWork(this::registerPOIs);
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