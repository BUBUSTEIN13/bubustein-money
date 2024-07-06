package tk.bubustein.money.fabric;

import dev.architectury.registry.menu.MenuRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import tk.bubustein.money.screen.BankMachineScreen;
import tk.bubustein.money.screen.ModMenuTypes;

public class MoneyModClientFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ClientLifecycleEvents.CLIENT_STARTED.register(client -> MenuRegistry.registerScreenFactory(ModMenuTypes.BANK_MACHINE_MENU.get(), BankMachineScreen::new));
    }
}