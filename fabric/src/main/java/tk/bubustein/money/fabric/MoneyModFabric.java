package tk.bubustein.money.fabric;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import tk.bubustein.money.MoneyMod;
import net.fabricmc.api.ModInitializer;
import tk.bubustein.money.mixin.PoiTypesInvoker;
import tk.bubustein.money.villager.ModVillagers;
public class MoneyModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        MoneyMod.init();
        ModVillagers.fillTradeData();
        registerPOIs();
        ServerLifecycleEvents.SERVER_STARTING.register(MoneyMod::registerJigsaws);
<<<<<<< Updated upstream

=======
>>>>>>> Stashed changes
        }
        void registerPOIs(){
            PoiTypesInvoker.invokeRegisterBlockStates(ModVillagers.BANKER_POI.get());
            PoiTypesInvoker.invokeRegisterBlockStates(ModVillagers.EXCHANGER_POI.get());
        }
    }