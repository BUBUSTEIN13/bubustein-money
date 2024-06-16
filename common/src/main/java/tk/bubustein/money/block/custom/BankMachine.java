<<<<<<< Updated upstream
package tk.bubustein.money.block.custom;

import me.shedaniel.architectury.registry.BlockProperties;
import me.shedaniel.architectury.registry.ToolType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;

public class BankMachine extends Block {
    public BankMachine() {
        super(BlockProperties.of(Material.WOOD).tool(ToolType.AXE, 2).strength(2.5f).noOcclusion().requiresCorrectToolForDrops());
    }
}
=======
package tk.bubustein.money.block.custom;

import me.shedaniel.architectury.registry.BlockProperties;
import me.shedaniel.architectury.registry.ToolType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;

public class BankMachine extends Block {
    public BankMachine() {
        super(BlockProperties.of(Material.WOOD).tool(ToolType.AXE, 2).strength(2.5f).noOcclusion().requiresCorrectToolForDrops());
    }
}
>>>>>>> Stashed changes
