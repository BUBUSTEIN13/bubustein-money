package tk.bubustein.money.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerAboutToStartEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import tk.bubustein.money.MoneyMod;
import net.minecraftforge.eventbus.api.IEventBus;
import tk.bubustein.money.villager.ModVillagers;

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
    public void onServerAboutToStartEvent(ServerAboutToStartEvent event) {
        MoneyMod.registerJigsaws(event.getServer());
    }
    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(ModVillagers::fillTradeData);
    }
}