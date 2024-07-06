package tk.bubustein.money.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerAboutToStartEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;
import net.minecraftforge.registries.RegistryObject;
import tk.bubustein.money.MoneyMod;
import tk.bubustein.money.screen.BankMachineScreen;
import tk.bubustein.money.screen.ModMenuTypes;
import tk.bubustein.money.villager.ModVillagers;
import java.lang.reflect.InvocationTargetException;

@Mod(MoneyMod.MOD_ID)
public class MoneyModForge {
    public MoneyModForge() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        EventBuses.registerModEventBus(MoneyMod.MOD_ID, bus);
        MoneyMod.init();
        MoneyExpectPlatformImpl.register(bus);
        bus.addListener(this::setup);
        MinecraftForge.EVENT_BUS.register(this);
    }
    @SubscribeEvent
    public void onServerAboutToStartEvent(ServerAboutToStartEvent event) {
        MoneyMod.registerJigsaws(event.getServer());
    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ModVillagers.fillTradeData();
            registerPOIs();
        });
    }
    void registerPOIs() {
        for (RegistryObject<PoiType> poi : MoneyExpectPlatformImpl.POI_TYPES.getEntries()) {
            try {
                ObfuscationReflectionHelper.findMethod(PoiType.class, "registerBlockStates", PoiType.class).invoke(null, poi.get());
            } catch (InvocationTargetException | IllegalAccessException e) {
                e.fillInStackTrace();
            }
        }
    }
    @Mod.EventBusSubscriber(modid = MoneyMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents{
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event){
            MenuScreens.register(ModMenuTypes.BANK_MACHINE_MENU.get(), BankMachineScreen::new);
        }
    }
}