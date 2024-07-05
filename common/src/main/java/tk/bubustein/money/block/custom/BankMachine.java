package tk.bubustein.money.block.custom;

import dev.architectury.registry.menu.MenuRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;
import tk.bubustein.money.screen.BankMachineMenu;

@SuppressWarnings("deprecation")
public class BankMachine extends Block {
    public static Component TITLE = Component.literal("Bank Machine");
    public BankMachine() {
        super(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE).strength(2.5f).requiresCorrectToolForDrops());
    }
    @Override
    public @NotNull InteractionResult use(BlockState blockState, Level level, BlockPos pos, Player player, InteractionHand interactionHand, BlockHitResult blockHitResult){
        if (!level.isClientSide) {
            MenuRegistry.openExtendedMenu((ServerPlayer) player, blockState.getMenuProvider(level, pos), friendlyByteBuf -> {});
            return InteractionResult.CONSUME;
        }
        return InteractionResult.SUCCESS;
    }
    @Override
    public MenuProvider getMenuProvider(BlockState blockState, Level level, BlockPos blockPos) {
        return new SimpleMenuProvider((i, inventory, player) ->
                new BankMachineMenu(i, inventory, ContainerLevelAccess.create(level, blockPos)), TITLE);
    }
}