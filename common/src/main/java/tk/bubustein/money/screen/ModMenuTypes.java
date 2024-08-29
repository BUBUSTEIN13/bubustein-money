package tk.bubustein.money.screen;

import me.shedaniel.architectury.registry.DeferredRegister;
import me.shedaniel.architectury.registry.MenuRegistry;
import me.shedaniel.architectury.registry.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.world.inventory.MenuType;
import tk.bubustein.money.MoneyMod;

public class ModMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(MoneyMod.MOD_ID, Registry.MENU_REGISTRY);
    public static final RegistrySupplier<MenuType<BankMachineMenu>> BANK_MACHINE_MENU = MENUS.register("bank_machine_menu",
            () -> MenuRegistry.of(BankMachineMenu::new));
    public static void init(){
        MENUS.register();
    }
}