package tk.bubustein.money.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import tk.bubustein.money.MoneyExpectPlatform;
import tk.bubustein.money.block.custom.ATM;
import tk.bubustein.money.block.custom.BankMachine;
import tk.bubustein.money.item.ModCreativeModeTab;

import java.util.function.Supplier;


public class ModBlocks {
    public static void init(){};
    public static final Supplier<Block> BANK_MACHINE = registerBlock("bank_machine", BankMachine::new);
    public static final Supplier<Block> ATM = registerBlock("atm", ATM::new);
    public static <T extends Block> Supplier<T> registerBlock(String name, Supplier<T> block) {
        Supplier<T> toReturn = MoneyExpectPlatform.registerBlock(name, block);
        MoneyExpectPlatform.registerItem(name, () -> new BlockItem(toReturn.get(), new Item.Properties().tab(ModCreativeModeTab.SPECIAL)));
        return toReturn;
    }
}