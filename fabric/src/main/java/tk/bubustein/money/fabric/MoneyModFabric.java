package tk.bubustein.money.fabric;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import tk.bubustein.money.MoneyMod;
import net.fabricmc.api.ModInitializer;
import tk.bubustein.money.command.ModCommands;
import tk.bubustein.money.villager.ModVillagers;

public class MoneyModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        MoneyMod.init();
        ServerLifecycleEvents.SERVER_STARTING.register(server -> {
            ModVillagers.fillTradeData(server);
            MoneyMod.registerJigsaws(server);
            MoneyMod.onServerStarting(server);
        });
        ServerLifecycleEvents.SERVER_STOPPING.register(MoneyMod::saveConfig);
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> ModCommands.register(dispatcher));
    }
}