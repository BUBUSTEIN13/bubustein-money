package tk.bubustein.money.neoforge;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import static tk.bubustein.money.MoneyMod.LOGGER;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerAboutToStartEvent;
import tk.bubustein.money.MoneyMod;
import tk.bubustein.money.block.ModBlocks;
import net.neoforged.bus.api.IEventBus;
import tk.bubustein.money.mixin.PoiTypesInvoker;
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
        event.enqueueWork(() -> {
            ModVillagers.fillTradeData();
            registerBlockStates();
        });
    }
    void registerBlockStates() {
        PoiTypesInvoker.invokeGetBlockStates(ModBlocks.BANK_MACHINE.get()).forEach((state) -> PoiTypesInvoker.getTypeByState().put(state, BuiltInRegistries.POINT_OF_INTEREST_TYPE.getHolder(ResourceKey.create(Registries.POINT_OF_INTEREST_TYPE, new ResourceLocation(MoneyMod.MOD_ID, "bank_machine"))).get()));
        PoiTypesInvoker.invokeGetBlockStates(ModBlocks.ATM.get()).forEach((state) -> PoiTypesInvoker.getTypeByState().put(state, BuiltInRegistries.POINT_OF_INTEREST_TYPE.getHolder(ResourceKey.create(Registries.POINT_OF_INTEREST_TYPE, new ResourceLocation(MoneyMod.MOD_ID, "atm"))).get()));
    }
}