package tk.bubustein.money.block.custom;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class BankMachine extends Block {
    public BankMachine() {
        super(BlockBehaviour.Properties.of(Material.WOOD).strength(2.5f).requiresCorrectToolForDrops());
    }
}
