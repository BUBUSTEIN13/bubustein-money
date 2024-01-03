package com.bubustein.money.villager;

import com.bubustein.money.MoneyMod;
import com.bubustein.money.block.ModBlocks;
import com.google.common.collect.ImmutableSet;
import net.fabricmc.fabric.api.object.builder.v1.villager.VillagerProfessionBuilder;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class ModVillagers {

    public static final RegistryKey<PointOfInterestType> BANKER_POI_KEY = poiKey("banker_poi");
    public static final RegistryKey<PointOfInterestType> EXCHANGER_POI_KEY = poiKey("exchanger_poi");
    public static final PointOfInterestType BANKER_POI =registerPoi("banker_poi", ModBlocks.BANK_MACHINE);
    public static final PointOfInterestType EXCHANGER_POI = registerPoi("exchanger_poi", ModBlocks.ATM);

    public static final VillagerProfession BANKER = registerProfession("banker", BANKER_POI_KEY);
    public static final VillagerProfession EXCHANGER = registerProfession("exchanger", EXCHANGER_POI_KEY);

    private static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(MoneyMod.MOD_ID, name),
                new VillagerProfession(name, entry -> entry.matchesKey(type), entry -> entry.matchesKey(type),
                        ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_LIBRARIAN));
    }

    public static PointOfInterestType registerPoi(String name, Block block) {
        return PointOfInterestHelper.register(new Identifier(MoneyMod.MOD_ID, name),
                1, 1, ImmutableSet.copyOf(block.getStateManager().getStates()));
    }
    private static RegistryKey<PointOfInterestType> poiKey(String name) {
        return RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, new Identifier(MoneyMod.MOD_ID, name));
    }

    public static void registerVillagers() {
        MoneyMod.LOGGER.debug("Registering Villagers for " + MoneyMod.MOD_ID);
    }


}
