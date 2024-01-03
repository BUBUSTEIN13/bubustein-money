package com.bubustein.money.block;

import com.bubustein.money.MoneyMod;
import com.bubustein.money.block.custom.ATM;
import com.bubustein.money.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;


public class ModBlocks {

    public static final Block ATM = registerBlock("atm",
            new ATM(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(2.5f).nonOpaque().requiresTool()));
    public static final Block BANK_MACHINE = registerBlock("bank_machine",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(2.5f).requiresTool()));
    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MoneyMod.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        Item item = Registry.register(Registries.ITEM, new Identifier(MoneyMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        return item;
    }
    public static void registerModBlocks(){
        MoneyMod.LOGGER.debug("Registering ModBlocks for " + MoneyMod.MOD_ID);
    }
}
