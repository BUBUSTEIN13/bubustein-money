package com.bubustein.money;


import com.bubustein.money.block.ModBlocks;
import com.bubustein.money.item.ModItemGroup;
import com.bubustein.money.util.ModCustomTrades;
import com.bubustein.money.villager.ModVillagers;
import com.bubustein.money.world.village.VillageAdditions;
import net.fabricmc.api.ModInitializer;
import com.bubustein.money.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



// Very important comment
public class MoneyMod implements ModInitializer {
    public static final String MOD_ID = "bubusteinmoneymod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItemGroup.registerItemGroup();

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        ModVillagers.registerVillagers();
        ModCustomTrades.registerTrades();
        VillageAdditions.registerNewVillageStructures();
    }
}