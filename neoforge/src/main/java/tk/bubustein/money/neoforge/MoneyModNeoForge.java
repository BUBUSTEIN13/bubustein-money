package tk.bubustein.money.neoforge;

import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.commands.CommandSourceStack;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.RegisterCommandsEvent;
import net.neoforged.neoforge.event.server.ServerAboutToStartEvent;
import net.neoforged.neoforge.event.server.ServerStoppingEvent;
import tk.bubustein.money.MoneyMod;
import net.neoforged.bus.api.IEventBus;
import tk.bubustein.money.command.ModCommands;
import tk.bubustein.money.screen.BankMachineScreen;
import tk.bubustein.money.screen.ModMenuTypes;
import tk.bubustein.money.villager.ModVillagers;
import java.util.HashMap;

@Mod(MoneyMod.MOD_ID)
public class MoneyModNeoForge {
    public MoneyModNeoForge(IEventBus modEventBus) {
        MoneyMod.init();
        MoneyExpectPlatformImpl.register(modEventBus);
        NeoForge.EVENT_BUS.register(this);
    }
    @SubscribeEvent
    public void onServerAboutToStartEvent(ServerAboutToStartEvent event) {
        MoneyMod.registerJigsaws(event.getServer());
        ModVillagers.fillTradeData(event.getServer());
        MoneyMod.onServerStarting(event.getServer());
    }
    @SubscribeEvent
    public void ServerStopping(ServerStoppingEvent event){
        MoneyMod.saveConfig(event.getServer());
    }
    @SubscribeEvent
    public void onRegisterCommands(RegisterCommandsEvent event) {
        CommandDispatcher<CommandSourceStack> dispatcher = event.getDispatcher();
        ModCommands.register(dispatcher);
    }
    @EventBusSubscriber(modid = MoneyMod.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            registerScreens(new RegisterMenuScreensEvent(HashMap.newHashMap(1)));
        }
        @SubscribeEvent
        private static void registerScreens(RegisterMenuScreensEvent event) {
            event.register(ModMenuTypes.BANK_MACHINE_MENU.get(), BankMachineScreen::new);
        }
    }
}