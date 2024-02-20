package tk.bubustein.money.block.custom;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class BankMachine extends Block {
    public BankMachine() {
        super(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE).strength(2.5f).requiresCorrectToolForDrops());
    }
}
