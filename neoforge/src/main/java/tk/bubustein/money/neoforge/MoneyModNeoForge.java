package tk.bubustein.money.neoforge;

import dev.architectury.registry.menu.MenuRegistry;
import net.minecraft.client.gui.screens.MenuScreens;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerAboutToStartEvent;
import tk.bubustein.money.MoneyMod;
import net.neoforged.bus.api.IEventBus;
import tk.bubustein.money.screen.BankMachineScreen;
import tk.bubustein.money.screen.ModMenuTypes;
import tk.bubustein.money.villager.ModVillagers;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
@Mod(MoneyMod.MOD_ID)
public class MoneyModNeoForge {
    public MoneyModNeoForge(IEventBus modEventBus) {
        MoneyMod.init();
        modEventBus.addListener(this::setup);
        MoneyExpectPlatformImpl.register(modEventBus);
        NeoForge.EVENT_BUS.register(this);
    }
    @SubscribeEvent
    public void onServerAboutToStartEvent(ServerAboutToStartEvent event) {
        MoneyMod.registerJigsaws(event.getServer());
    }
    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(ModVillagers::fillTradeData);
    }
    @Mod.EventBusSubscriber(modid = MoneyMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        private static void onClientSetup(FMLClientSetupEvent event){
            //MenuRegistry.registerScreenFactory(ModMenuTypes.BANK_MACHINE_MENU.get(), BankMachineScreen::new);
            MenuScreens.register(ModMenuTypes.BANK_MACHINE_MENU.get(), BankMachineScreen::new);
        }
    }
}