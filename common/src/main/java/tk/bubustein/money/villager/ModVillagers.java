package tk.bubustein.money.villager;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import me.shedaniel.architectury.registry.trade.SimpleTrade;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import tk.bubustein.money.block.ModBlocks;
import tk.bubustein.money.item.ModItems;
import tk.bubustein.money.mixin.PoiTypesInvoker;
import tk.bubustein.money.mixin.VillagerProfessionInvoker;
import java.util.Set;
import java.util.function.Supplier;

import tk.bubustein.money.MoneyExpectPlatform;
public class ModVillagers {
    public static final Supplier<PoiType> BANKER_POI = MoneyExpectPlatform.registerPoiType("banker_poi",
            () -> PoiTypesInvoker.invokeConstructor("banker_poi", getBlockStates(ModBlocks.BANK_MACHINE), 1, 1));
    public static final Supplier<PoiType> EXCHANGER_POI = MoneyExpectPlatform.registerPoiType("exchanger_poi",
            () -> PoiTypesInvoker.invokeConstructor("exchanger_poi", getBlockStates(ModBlocks.ATM), 1, 1));
    public static final Supplier<VillagerProfession> BANKER = MoneyExpectPlatform.registerProfession("banker", () ->
            VillagerProfessionInvoker.invokeConstructor("banker", BANKER_POI.get() ,ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_LIBRARIAN));
    public static final Supplier<VillagerProfession> EXCHANGER = MoneyExpectPlatform.registerProfession("exchanger",
            () -> VillagerProfessionInvoker.invokeConstructor("exchanger", EXCHANGER_POI.get(), ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_LIBRARIAN));

    public static Set<BlockState> getBlockStates(Supplier<Block> arg) {
        return ImmutableSet.copyOf(arg.get().getStateDefinition().getPossibleStates());
    }
    public static void init(){}
    public static void fillTradeData(){
        ItemStack stack = new ItemStack(Items.LAPIS_LAZULI,0);
        // BANKER TRADES
        VillagerTrades.ItemListing[] bankerLevel1 = new VillagerTrades.ItemListing[]{
                new SimpleTrade(
                        new ItemStack(ModItems.Euro5.get(), 10),
                        new ItemStack(Items.LAPIS_LAZULI, 1),
                        new ItemStack(Items.EMERALD, 1),
                        8,2,0.1F),
                new SimpleTrade(
                        new ItemStack(ModItems.Dollar5.get(), 10),
                        new ItemStack(Items.LAPIS_LAZULI, 1),
                        new ItemStack(Items.EMERALD, 1),
                        8,2,0.1F)
        };
        VillagerTrades.ItemListing[] bankerLevel2 = new VillagerTrades.ItemListing[]{
                new SimpleTrade(
                        new ItemStack(ModItems.Pound5.get(), 10),
                        stack,
                        new ItemStack(Items.EMERALD, 1),
                        10,5,0.1F
                ),
                new SimpleTrade(
                        new ItemStack(Items.EMERALD, 10),
                        new ItemStack(Items.PAPER, 1),
                        new ItemStack(ModItems.Pound100.get(), 1),
                        5,5,0.2F
                )
        };
        VillagerTrades.ItemListing[] bankerLevel3 = new VillagerTrades.ItemListing[]{
                new SimpleTrade(
                        new ItemStack(ModItems.L5.get(), 1),
                        new ItemStack(Items.GOLD_INGOT, 3),
                        new ItemStack(Items.EMERALD, 5),
                        5,10,0.9F
                ),
                new SimpleTrade(
                        new ItemStack(Items.EMERALD, 10),
                        new ItemStack(Items.PAPER, 1),
                        new ItemStack(ModItems.Dollar100.get(), 1),
                        5,10,0.2F
                )
        };
        VillagerTrades.ItemListing[] bankerLevel4 = new VillagerTrades.ItemListing[]{
                new SimpleTrade(
                        new ItemStack(Items.EMERALD, 52),
                        new ItemStack(Items.PAPER, 1),
                        new ItemStack(ModItems.Euro500.get(), 1),
                        4,20,0.2F
                )
        };
        VillagerTrades.ItemListing[] bankerLevel5 = new VillagerTrades.ItemListing[]{
                new SimpleTrade(
                        new ItemStack(Items.EMERALD, 32),
                        new ItemStack(Items.EMERALD, 64),
                        new ItemStack(ModItems.L50.get(), 1),
                        2,30,0.9F
                )
        };


        VillagerTrades.TRADES.put(BANKER.get(),toIntMap(ImmutableMap.of(1,bankerLevel1,2,bankerLevel2,3,bankerLevel3,4,bankerLevel4,5,bankerLevel5)));

        VillagerTrades.ItemListing[] exchangerLevel1 = new VillagerTrades.ItemListing[] {
                new SimpleTrade(
                        new ItemStack(ModItems.Dollar10.get(), 1),
                        new ItemStack(ModItems.Dollar1.get(),1),
                        new ItemStack(ModItems.Euro10.get(), 1),
                        10, 2, 0.1f
                ),
                new SimpleTrade(
                        new ItemStack(ModItems.Pound10.get(), 1),
                        stack,
                        new ItemStack(ModItems.Euro10.get(), 1),
                        10, 2, 0.1f
                ),
                new SimpleTrade(
                        new ItemStack(ModItems.Franc10.get(), 1),
                        stack,
                        new ItemStack(ModItems.Euro10.get(), 1),
                        10, 2, 0.1f
                ),
                new SimpleTrade(
                        new ItemStack(ModItems.Lei50.get(), 1),
                        stack,
                        new ItemStack(ModItems.Euro10.get(), 1),
                        10, 2, 0.1f
                ),
                new SimpleTrade(
                        new ItemStack(ModItems.Leva10.get(), 1),
                        stack,
                        new ItemStack(ModItems.Euro5.get(), 1),
                        10,2,0.1f
                ),
                new SimpleTrade(
                        new ItemStack(ModItems.Euro5.get(), 1),
                        stack,
                        new ItemStack(ModItems.Leva5.get(), 2),
                        10, 2, 0.1f
                ),
                new SimpleTrade(
                        new ItemStack(ModItems.Zloty10.get(), 1),
                        stack,
                        new ItemStack(ModItems.Euro2.get(), 1),
                        10, 2, 0.1f
                ),
                new SimpleTrade(
                        new ItemStack(ModItems.Euro5.get(), 1),
                        stack,
                        new ItemStack(ModItems.Zloty20.get(), 1),
                        10, 2, 0.1f
                ),
                new SimpleTrade(
                        new ItemStack(ModItems.INr100.get(), 1),
                        stack,
                        new ItemStack(ModItems.Dollar1.get(), 1),
                        10, 2, 0.1f
                ),
                new SimpleTrade(
                        new ItemStack(ModItems.Dollar5.get(), 1),
                        stack,
                        new ItemStack(ModItems.INr100.get(), 4),
                        10, 2, 0.1f
                )

        };
        VillagerTrades.ItemListing[] exchangerLevel2 = new VillagerTrades.ItemListing[]{
                new SimpleTrade(
                        new ItemStack(ModItems.DollarC10.get(), 1),
                        new ItemStack(ModItems.Loonie.get(),4),
                        new ItemStack(ModItems.Dollar10.get(), 1),
                        7, 5, 0.2f
                ),
                new SimpleTrade(
                        new ItemStack(ModItems.DollarA10.get(), 1),
                        stack,
                        new ItemStack(ModItems.Pound5.get(), 1),
                        7, 5, 0.2f
                ),
                new SimpleTrade(
                        new ItemStack(ModItems.CZkr100.get(), 1),
                        stack,
                        new ItemStack(ModItems.Euro2.get(), 2),
                        7, 5, 0.2f
                ),
                new SimpleTrade(
                        new ItemStack(ModItems.Euro5.get(), 1),
                        stack,
                        new ItemStack(ModItems.CZkr100.get(), 1),
                        7, 5, 0.2f
                ),
                new SimpleTrade(
                        new ItemStack(ModItems.NOkr50.get(), 1),
                        stack,
                        new ItemStack(ModItems.Euro2.get(), 2),
                        7, 5, 0.2f
                ),
                new SimpleTrade(
                        new ItemStack(ModItems.Euro5.get(), 1),
                        stack,
                        new ItemStack(ModItems.NOkr50.get(), 1),
                        7, 5, 0.2f
                ),
                new SimpleTrade(
                        new ItemStack(ModItems.RSD200.get(), 1),
                        stack,
                        new ItemStack(ModItems.Euro1.get(), 1),
                        7, 5, 0.2f
                ),
                new SimpleTrade(
                        new ItemStack(ModItems.Euro5.get(), 1),
                        stack,
                        new ItemStack(ModItems.RSD500.get(), 1),
                        7, 5, 0.2f
                ),
                new SimpleTrade(
                        new ItemStack(ModItems.ISkr1000.get(), 1),
                        stack,
                        new ItemStack(ModItems.Euro5.get(), 1),
                        7, 5, 0.2f
                ),
                new SimpleTrade(
                        new ItemStack(ModItems.Euro10.get(), 1),
                        stack,
                        new ItemStack(ModItems.ISkr500.get(), 3),
                        7, 5, 0.2f
                )
        };
        VillagerTrades.ItemListing[] exchangerLevel3 = new VillagerTrades.ItemListing[]{
                new SimpleTrade(
                        new ItemStack(ModItems.Yen50.get(), 3),
                        stack,
                        new ItemStack(ModItems.Dollar1.get(), 1),
                        5, 7, 0.2f
                ),
                new SimpleTrade(
                        new ItemStack(ModItems.Euro10.get(), 1),
                        stack,
                        new ItemStack(ModItems.Lei50.get(), 1),
                        5, 7, 0.2f
                ),
                new SimpleTrade(
                        new ItemStack(ModItems.DKkr50.get(), 1),
                        stack,
                        new ItemStack(ModItems.Euro2.get(), 3),
                        5, 7, 0.2f
                ),
                new SimpleTrade(
                        new ItemStack(ModItems.Euro5.get(), 1),
                        stack,
                        new ItemStack(ModItems.DKkr10.get(), 4),
                        5, 7, 0.2f
                ),
                new SimpleTrade(
                        new ItemStack(ModItems.Ft500.get(), 1),
                        stack,
                        new ItemStack(ModItems.Euro1.get(), 1),
                        5, 7, 0.2f
                ),
                new SimpleTrade(
                        new ItemStack(ModItems.Euro5.get(), 1),
                        stack,
                        new ItemStack(ModItems.Ft500.get(), 3),
                        5, 7, 0.2f
                ),
                new SimpleTrade(
                        new ItemStack(ModItems.SEkr20.get(), 1),
                        stack,
                        new ItemStack(ModItems.Euro1.get(), 1),
                        5, 7, 0.2f
                ),
                new SimpleTrade(
                        new ItemStack(ModItems.Euro5.get(), 1),
                        stack,
                        new ItemStack(ModItems.SEkr50.get(), 1),
                        5, 7, 0.2f
                ),
                new SimpleTrade(
                        new ItemStack(ModItems.CNYuan10.get(), 1),
                        stack,
                        new ItemStack(ModItems.Dollar1.get(), 1),
                        5, 7, 0.2f
                ),
                new SimpleTrade(
                        new ItemStack(ModItems.Dollar5.get(), 1),
                        stack,
                        new ItemStack(ModItems.CNYuan5.get(), 7),
                        5, 7, 0.2f
                )
        };
        VillagerTrades.ItemListing[] exchangerLevel4 = new VillagerTrades.ItemListing[]{
                new SimpleTrade(
                        new ItemStack(ModItems.Lei10.get(), 1),
                        stack,
                        new ItemStack(ModItems.LeiMD50.get(), 1),
                        5,10,0.2F
                ),
                new SimpleTrade(
                        new ItemStack(ModItems.Dollar5.get(), 1),
                        stack,
                        new ItemStack(ModItems.Yen50.get(), 15),
                        5,10,0.2F
                ),
                new SimpleTrade(
                        new ItemStack(ModItems.Won10000.get(), 2),
                        stack,
                        new ItemStack(ModItems.Dollar5.get(), 3),
                        5, 10, 0.2f
                ),
                new SimpleTrade(
                        new ItemStack(ModItems.Dollar10.get(), 1),
                        stack,
                        new ItemStack(ModItems.Won10000.get(), 1),
                        5, 10, 0.2f
                )
        };
        VillagerTrades.ItemListing[] exchangerLevel5 = new VillagerTrades.ItemListing[]{
                new SimpleTrade(
                        new ItemStack(ModItems.Euro50.get(), 1),
                        stack,
                        new ItemStack(ModItems.L1.get(), 1),
                        3,10,0.9F
                ),
                new SimpleTrade(
                        new ItemStack(ModItems.L5.get(), 1),
                        stack,
                        new ItemStack(ModItems.Euro50.get(), 5),
                        3,10,0.9F
                )
        };
        VillagerTrades.TRADES.put(EXCHANGER.get(), toIntMap(ImmutableMap.of(1, exchangerLevel1, 2, exchangerLevel2, 3, exchangerLevel3, 4, exchangerLevel4, 5, exchangerLevel5)));
    }
    private static Int2ObjectMap<VillagerTrades.ItemListing[]> toIntMap(ImmutableMap<Integer, VillagerTrades.ItemListing[]> p_221238_0_) {
        return new Int2ObjectOpenHashMap<>(p_221238_0_);
    }
}
