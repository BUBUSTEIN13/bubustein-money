package tk.bubustein.money.fabric;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import tk.bubustein.money.MoneyMod;
import net.fabricmc.api.ModInitializer;
import tk.bubustein.money.villager.ModVillagers;
public class MoneyModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        MoneyMod.init();
        ModVillagers.fillTradeData();
        ServerLifecycleEvents.SERVER_STARTING.register(MoneyMod::registerJigsaws);
        }
    }