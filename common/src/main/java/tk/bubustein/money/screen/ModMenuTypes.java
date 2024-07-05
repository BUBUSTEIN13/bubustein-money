package tk.bubustein.money.screen;

import dev.architectury.registry.menu.MenuRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.inventory.MenuType;
import tk.bubustein.money.MoneyMod;

public class ModMenuTypes {

    public static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(MoneyMod.MOD_ID, Registries.MENU);
    public static final RegistrySupplier<MenuType<BankMachineMenu>> BANK_MACHINE_MENU = MENUS.register("bank_machine_menu",
            () -> MenuRegistry.ofExtended((id, inventory, buf) -> new BankMachineMenu(id, inventory)));
    public static void init(){
        MENUS.register();
    }
}