package tk.bubustein.money.item;

import me.shedaniel.architectury.registry.CreativeTabs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import tk.bubustein.money.MoneyMod;
import tk.bubustein.money.block.ModBlocks;

public class ModCreativeModeTab {
    public static final CreativeModeTab BANKNOTES = CreativeTabs.create(new ResourceLocation(MoneyMod.MOD_ID, "banknotes"), () ->
            new ItemStack(ModItems.Euro500.get()));
    public static final CreativeModeTab COINS = CreativeTabs.create(new ResourceLocation(MoneyMod.MOD_ID, "coins"), () ->
            new ItemStack(ModItems.Euro2.get()));
    public static final CreativeModeTab SPECIAL = CreativeTabs.create(new ResourceLocation(MoneyMod.MOD_ID, "special"), () ->
            new ItemStack(ModBlocks.ATM.get()));
}