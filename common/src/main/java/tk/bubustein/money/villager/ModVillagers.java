package tk.bubustein.money.villager;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import dev.architectury.registry.level.entity.trade.SimpleTrade;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.trading.ItemCost;
import tk.bubustein.money.MoneyExpectPlatform;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import tk.bubustein.money.block.ModBlocks;
import tk.bubustein.money.item.ModItems;
import tk.bubustein.money.mixin.PoiTypesInvoker;
import java.util.Optional;
import java.util.function.Supplier;

public class ModVillagers {
    public static void init(){}
    public static final Supplier<PoiType> BANKER_POI = MoneyExpectPlatform.registerPoiType("banker_poi", () -> PoiTypesInvoker.invokeGetBlockStates(ModBlocks.BANK_MACHINE.get()));
    public static final Supplier<PoiType> EXCHANGER_POI = MoneyExpectPlatform.registerPoiType("exchanger_poi", () -> PoiTypesInvoker.invokeGetBlockStates(ModBlocks.ATM.get()));
    public static final Supplier<VillagerProfession> BANKER = MoneyExpectPlatform.registerProfession("banker",
            () -> new VillagerProfession("banker", holder -> holder.value().equals(BANKER_POI.get()), holder -> holder.value().equals(BANKER_POI.get()), ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_LIBRARIAN));

    public static final Supplier<VillagerProfession> EXCHANGER = MoneyExpectPlatform.registerProfession("exchanger",
            () -> new VillagerProfession("exchanger", holder -> holder.value().equals(EXCHANGER_POI.get()), holder -> holder.value().equals(EXCHANGER_POI.get()), ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_LIBRARIAN));
    public static void fillTradeData(){
        ItemCost stack = new ItemCost(Items.LAPIS_LAZULI,0);
        // BANKER TRADES
        VillagerTrades.ItemListing[] bankerLevel1 = new VillagerTrades.ItemListing[]{
                new SimpleTrade(
                        new ItemCost(ModItems.Euro5.get(), 10),
                        Optional.of(new ItemCost(Items.LAPIS_LAZULI, 1)),
                        new ItemStack(Items.EMERALD, 1),
                        8,2,0.1F),
                new SimpleTrade(
                        new ItemCost(ModItems.Dollar5.get(), 10),
                        Optional.of(new ItemCost(Items.LAPIS_LAZULI, 1)),
                        new ItemStack(Items.EMERALD, 1),
                        8,2,0.1F)
        };
        VillagerTrades.ItemListing[] bankerLevel2 = new VillagerTrades.ItemListing[]{
                new SimpleTrade(
                        new ItemCost(ModItems.Pound5.get(), 10),
                        Optional.of(stack),
                        new ItemStack(Items.EMERALD, 1),
                        10,5,0.1F
                ),
                new SimpleTrade(
                        new ItemCost(Items.EMERALD, 10),
                        Optional.of(new ItemCost(Items.PAPER, 1)),
                        new ItemStack(ModItems.Pound50.get(), 2),
                        5,5,0.2F
                )
        };
        VillagerTrades.ItemListing[] bankerLevel3 = new VillagerTrades.ItemListing[]{
                new SimpleTrade(
                        new ItemCost(ModItems.L5.get(), 1),
                        Optional.of(new ItemCost(Items.GOLD_INGOT, 3)),
                        new ItemStack(Items.EMERALD, 5),
                        5,10,0.9F
                ),
                new SimpleTrade(
                        new ItemCost(Items.EMERALD, 10),
                        Optional.of(new ItemCost(Items.PAPER, 1)),
                        new ItemStack(ModItems.Dollar100.get(), 1),
                        5,10,0.2F
                )
        };
        VillagerTrades.ItemListing[] bankerLevel4 = new VillagerTrades.ItemListing[]{
                new SimpleTrade(
                        new ItemCost(Items.EMERALD, 52),
                        Optional.of(new ItemCost(Items.PAPER, 1)),
                        new ItemStack(ModItems.Euro500.get(), 1),
                        4,20,0.2F
                )
        };
        VillagerTrades.ItemListing[] bankerLevel5 = new VillagerTrades.ItemListing[]{
                new SimpleTrade(
                        new ItemCost(Items.EMERALD, 32),
                        Optional.of(new ItemCost(Items.EMERALD, 64)),
                        new ItemStack(ModItems.L50.get(), 1),
                        2,30,0.9F
                )
        };
        VillagerTrades.TRADES.put(BANKER.get(),toIntMap(ImmutableMap.of(1,bankerLevel1,2,bankerLevel2,3,bankerLevel3,4,bankerLevel4,5,bankerLevel5)));


        // EXCHANGER
        VillagerTrades.ItemListing[] exchangerLevel1 = new VillagerTrades.ItemListing[] {
                new SimpleTrade(
                        new ItemCost(ModItems.Dollar10.get(), 1),
                        Optional.of(new ItemCost(ModItems.Dollar1.get(),1)),
                        new ItemStack(ModItems.Euro10.get(), 1),
                        10, 2, 0.1f
                ),
                new SimpleTrade(
                        new ItemCost(ModItems.Pound10.get(), 1),
                        Optional.of(stack),
                        new ItemStack(ModItems.Euro10.get(), 1),
                        10, 2, 0.1f
                ),
                new SimpleTrade(
                        new ItemCost(ModItems.Franc10.get(), 1),
                        Optional.of(stack),
                        new ItemStack(ModItems.Euro10.get(), 1),
                        10, 2, 0.1f
                ),
                new SimpleTrade(
                        new ItemCost(ModItems.Lei50.get(), 1),
                        Optional.of(stack),
                        new ItemStack(ModItems.Euro10.get(), 1),
                        10, 2, 0.1f
                ),
                new SimpleTrade(
                        new ItemCost(ModItems.Leva10.get(), 1),
                        Optional.of(stack),
                        new ItemStack(ModItems.Euro5.get(), 1),
                        10,2,0.1f
                ),
                new SimpleTrade(
                        new ItemCost(ModItems.Euro5.get(), 1),
                        Optional.of(stack),
                        new ItemStack(ModItems.Leva5.get(), 2),
                        10, 2, 0.1f
                ),
                new SimpleTrade(
                        new ItemCost(ModItems.Zloty10.get(), 1),
                        Optional.of(stack),
                        new ItemStack(ModItems.Euro2.get(), 1),
                        10, 2, 0.1f
                ),
                new SimpleTrade(
                        new ItemCost(ModItems.Euro5.get(), 1),
                        Optional.of(stack),
                        new ItemStack(ModItems.Zloty20.get(), 1),
                        10, 2, 0.1f
                ),
                new SimpleTrade(
                        new ItemCost(ModItems.INr100.get(), 1),
                        Optional.of(stack),
                        new ItemStack(ModItems.Dollar1.get(), 1),
                        10, 2, 0.1f
                ),
                new SimpleTrade(
                        new ItemCost(ModItems.Dollar5.get(), 1),
                        Optional.of(stack),
                        new ItemStack(ModItems.INr100.get(), 4),
                        10, 2, 0.1f
                )
        };
        VillagerTrades.ItemListing[] exchangerLevel2 = new VillagerTrades.ItemListing[]{
                new SimpleTrade(
                        new ItemCost(ModItems.DollarC10.get(), 1),
                        Optional.of(new ItemCost(ModItems.Loonie.get(),4)),
                        new ItemStack(ModItems.Dollar10.get(), 1),
                        7, 5, 0.2f
                ),
                new SimpleTrade(
                        new ItemCost(ModItems.DollarA10.get(), 1),
                        Optional.of(stack),
                        new ItemStack(ModItems.Pound5.get(), 1),
                        7, 5, 0.2f
                ),
                new SimpleTrade(
                        new ItemCost(ModItems.CZkr100.get(), 1),
                        Optional.of(stack),
                        new ItemStack(ModItems.Euro2.get(), 2),
                        7, 5, 0.2f
                ),
                new SimpleTrade(
                        new ItemCost(ModItems.Euro5.get(), 1),
                        Optional.of(stack),
                        new ItemStack(ModItems.CZkr100.get(), 1),
                        7, 5, 0.2f
                ),
                new SimpleTrade(
                        new ItemCost(ModItems.NOkr50.get(), 1),
                        Optional.of(stack),
                        new ItemStack(ModItems.Euro2.get(), 2),
                        7, 5, 0.2f
                ),
                new SimpleTrade(
                        new ItemCost(ModItems.Euro5.get(), 1),
                        Optional.of(stack),
                        new ItemStack(ModItems.NOkr50.get(), 1),
                        7, 5, 0.2f
                ),
                new SimpleTrade(
                        new ItemCost(ModItems.RSD200.get(), 1),
                        Optional.of(stack),
                        new ItemStack(ModItems.Euro1.get(), 1),
                        7, 5, 0.2f
                ),
                new SimpleTrade(
                        new ItemCost(ModItems.Euro5.get(), 1),
                        Optional.of(stack),
                        new ItemStack(ModItems.RSD500.get(), 1),
                        7, 5, 0.2f
                ),
                new SimpleTrade(
                        new ItemCost(ModItems.ISkr1000.get(), 1),
                        Optional.of(stack),
                        new ItemStack(ModItems.Euro5.get(), 1),
                        7, 5, 0.2f
                ),
                new SimpleTrade(
                        new ItemCost(ModItems.Euro10.get(), 1),
                        Optional.of(stack),
                        new ItemStack(ModItems.ISkr500.get(), 3),
                        7, 5, 0.2f
                )
        };
        VillagerTrades.ItemListing[] exchangerLevel3 = new VillagerTrades.ItemListing[]{
                new SimpleTrade(
                        new ItemCost(ModItems.Yen50.get(), 3),
                        Optional.of(stack),
                        new ItemStack(ModItems.Dollar1.get(), 1),
                        5, 7, 0.2f
                ),
                new SimpleTrade(
                        new ItemCost(ModItems.Euro10.get(), 1),
                        Optional.of(stack),
                        new ItemStack(ModItems.Lei50.get(), 1),
                        5, 7, 0.2f
                ),
                new SimpleTrade(
                        new ItemCost(ModItems.DKkr50.get(), 1),
                        Optional.of(stack),
                        new ItemStack(ModItems.Euro2.get(), 3),
                        5, 7, 0.2f
                ),
                new SimpleTrade(
                        new ItemCost(ModItems.Euro5.get(), 1),
                        Optional.of(stack),
                        new ItemStack(ModItems.DKkr10.get(), 4),
                        5, 7, 0.2f
                ),
                new SimpleTrade(
                        new ItemCost(ModItems.Ft500.get(), 1),
                        Optional.of(stack),
                        new ItemStack(ModItems.Euro1.get(), 1),
                        5, 7, 0.2f
                ),
                new SimpleTrade(
                        new ItemCost(ModItems.Euro5.get(), 1),
                        Optional.of(stack),
                        new ItemStack(ModItems.Ft500.get(), 3),
                        5, 7, 0.2f
                ),
                new SimpleTrade(
                        new ItemCost(ModItems.SEkr20.get(), 1),
                        Optional.of(stack),
                        new ItemStack(ModItems.Euro1.get(), 1),
                        5, 7, 0.2f
                ),
                new SimpleTrade(
                        new ItemCost(ModItems.Euro5.get(), 1),
                        Optional.of(stack),
                        new ItemStack(ModItems.SEkr50.get(), 1),
                        5, 7, 0.2f
                ),
                new SimpleTrade(
                        new ItemCost(ModItems.CNYuan10.get(), 1),
                        Optional.of(stack),
                        new ItemStack(ModItems.Dollar1.get(), 1),
                        5, 7, 0.2f
                ),
                new SimpleTrade(
                        new ItemCost(ModItems.Dollar5.get(), 1),
                        Optional.of(stack),
                        new ItemStack(ModItems.CNYuan5.get(), 7),
                        5, 7, 0.2f
                )
        };
        VillagerTrades.ItemListing[] exchangerLevel4 = new VillagerTrades.ItemListing[]{
                new SimpleTrade(
                        new ItemCost(ModItems.Lei10.get(), 1),
                        Optional.of(stack),
                        new ItemStack(ModItems.LeiMD50.get(), 1),
                        5,10,0.2F
                ),
                new SimpleTrade(
                        new ItemCost(ModItems.Dollar5.get(), 1),
                        Optional.of(stack),
                        new ItemStack(ModItems.Yen50.get(), 15),
                        5,10,0.2F
                ),
                new SimpleTrade(
                        new ItemCost(ModItems.Won10000.get(), 2),
                        Optional.of(stack),
                        new ItemStack(ModItems.Dollar5.get(), 3),
                        5, 10, 0.2f
                ),
                new SimpleTrade(
                        new ItemCost(ModItems.Dollar10.get(), 1),
                        Optional.of(stack),
                        new ItemStack(ModItems.Won10000.get(), 1),
                        5, 10, 0.2f
                ),
                new SimpleTrade(
                        new ItemCost(ModItems.BRReal10.get(), 1),
                        Optional.of(stack),
                        new ItemStack(ModItems.Dollar1.get(), 2),
                        5, 10, 0.2f
                ),
                new SimpleTrade(
                        new ItemCost(ModItems.Dollar5.get(), 1),
                        Optional.of(stack),
                        new ItemStack(ModItems.BRReal20.get(), 1),
                        5, 10, 0.2f
                ),
                new SimpleTrade(
                        new ItemCost(ModItems.MXPeso100.get(), 1),
                        Optional.of(stack),
                        new ItemStack(ModItems.Dollar5.get(), 1),
                        5, 10, 0.2f
                ),
                new SimpleTrade(
                        new ItemCost(ModItems.Dollar1.get(), 2),
                        Optional.of(stack),
                        new ItemStack(ModItems.MXPeso10.get(), 3),
                        5, 10, 0.2f
                ),
                new SimpleTrade(
                        new ItemCost(ModItems.ZARand50.get(), 1),
                        Optional.of(stack),
                        new ItemStack(ModItems.Pound2.get(), 1),
                        5, 10, 0.2f
                ),
                new SimpleTrade(
                        new ItemCost(ModItems.Pound5.get(), 1),
                        Optional.of(stack),
                        new ItemStack(ModItems.ZARand100.get(),1),
                        5, 10, 0.2f
                )
        };
        VillagerTrades.ItemListing[] exchangerLevel5 = new VillagerTrades.ItemListing[]{
                new SimpleTrade(
                        new ItemCost(ModItems.Euro50.get(), 1),
                        Optional.of(stack),
                        new ItemStack(ModItems.L1.get(), 1),
                        3,10,0.9F
                ),
                new SimpleTrade(
                        new ItemCost(ModItems.L5.get(), 1),
                        Optional.of(stack),
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