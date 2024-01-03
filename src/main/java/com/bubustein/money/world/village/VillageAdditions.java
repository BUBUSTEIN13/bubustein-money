package com.bubustein.money.world.village;

import com.bubustein.money.MoneyMod;
import fzzyhmstrs.structurized_reborn.impl.FabricStructurePoolRegistry;
import net.minecraft.util.Identifier;

public class VillageAdditions {
    public static void registerNewVillageStructures() {
        FabricStructurePoolRegistry.registerSimple(
                new Identifier("minecraft:village/plains/houses"),
                new Identifier(MoneyMod.MOD_ID, "plains_banker_house_1"),
                20
        );
        FabricStructurePoolRegistry.registerSimple(
                new Identifier("minecraft:village/taiga/houses"),
                new Identifier(MoneyMod.MOD_ID, "plains_banker_house_1"),
                20
        );
        FabricStructurePoolRegistry.registerSimple(
                new Identifier("minecraft:village/snowy/houses"),
                new Identifier(MoneyMod.MOD_ID, "plains_banker_house_1"),
                7
        );
        FabricStructurePoolRegistry.registerSimple(
                new Identifier("minecraft:village/savanna/houses"),
                new Identifier(MoneyMod.MOD_ID, "plains_banker_house_1"),
                20
        );
        FabricStructurePoolRegistry.registerSimple(
                new Identifier("minecraft:village/desert/houses"),
                new Identifier(MoneyMod.MOD_ID, "plains_banker_house_1"),
                7
        );
    }
}