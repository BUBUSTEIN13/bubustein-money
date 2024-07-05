package tk.bubustein.money.villager;

import com.google.common.collect.ImmutableSet;
import dev.architectury.registry.level.entity.trade.SimpleTrade;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.level.block.Blocks;
import tk.bubustein.money.MoneyExpectPlatform;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import tk.bubustein.money.block.ModBlocks;
import tk.bubustein.money.item.ModItems;
import tk.bubustein.money.mixin.PoiTypesInvoker;
import java.util.function.Supplier;

public class ModVillagers {
    public static void init(){}
    public static final Supplier<PoiType> BANKER_POI = MoneyExpectPlatform.registerPoiType("banker_poi", () -> PoiTypesInvoker.invokeGetBlockStates(ModBlocks.BANK_MACHINE.get()));
    public static final Supplier<PoiType> EXCHANGER_POI = MoneyExpectPlatform.registerPoiType("exchanger_poi", () -> PoiTypesInvoker.invokeGetBlockStates(ModBlocks.ATM.get()));
    public static final Supplier<VillagerProfession> BANKER = MoneyExpectPlatform.registerProfession("banker",
            () -> new VillagerProfession("banker", holder -> holder.value().equals(BANKER_POI.get()), holder -> holder.value().equals(BANKER_POI.get()), ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_LIBRARIAN));
    public static final Supplier<VillagerProfession> EXCHANGER = MoneyExpectPlatform.registerProfession("exchanger",
            () -> new VillagerProfession("exchanger", holder -> holder.value().equals(EXCHANGER_POI.get()), holder -> holder.value().equals(EXCHANGER_POI.get()), ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_LIBRARIAN));

    public static void fillTradeData() {
        ItemStack stack = new ItemStack(Items.LAPIS_LAZULI, 0);

        VillagerTrades.ItemListing[][] bankerTrades = {
                // Level 1
                {
                        new SimpleTrade(new ItemStack(ModItems.Euro5.get(), 10), new ItemStack(Items.LAPIS_LAZULI, 1), new ItemStack(Items.EMERALD, 1), 8, 2, 0.1f),
                        new SimpleTrade(new ItemStack(ModItems.Dollar5.get(), 10), new ItemStack(Items.LAPIS_LAZULI, 1), new ItemStack(Items.EMERALD, 1), 8, 2, 0.1f)
                },
                // Level 2
                {
                        new SimpleTrade(new ItemStack(ModItems.Pound5.get(), 10), stack, new ItemStack(Items.EMERALD, 1), 10, 5, 0.1f),
                        new SimpleTrade(new ItemStack(Items.EMERALD, 10), new ItemStack(Items.PAPER, 1), new ItemStack(ModItems.Pound50.get(), 2), 5, 5, 0.2f)
                },
                // Level 3
                {
                        new SimpleTrade(new ItemStack(ModItems.L5.get(), 1), new ItemStack(Items.GOLD_INGOT, 3), new ItemStack(Items.EMERALD, 5), 5, 10, 0.9f),
                        new SimpleTrade(new ItemStack(Items.EMERALD, 10), new ItemStack(Items.PAPER, 1), new ItemStack(ModItems.Dollar100.get(), 1), 5, 10, 0.2f)
                },
                // Level 4
                {
                        new SimpleTrade(new ItemStack(Items.EMERALD, 52), new ItemStack(Items.PAPER, 1), new ItemStack(ModItems.Euro500.get(), 1), 4, 20, 0.2f)
                },
                // Level 5
                {
                        new SimpleTrade(new ItemStack(Items.EMERALD, 26), new ItemStack(Blocks.EMERALD_BLOCK, 7), new ItemStack(ModItems.L50.get(), 1), 2, 30, 0.9f)
                }
        };
        VillagerTrades.ItemListing[][] exchangerTrades = {
                // Level 1
                {
                        new SimpleTrade(new ItemStack(ModItems.Dollar10.get(), 1), new ItemStack(ModItems.Dollar1.get(), 1), new ItemStack(ModItems.Euro10.get(), 1), 10, 2, 0.1f),
                        new SimpleTrade(new ItemStack(ModItems.Pound10.get(), 1), stack, new ItemStack(ModItems.Euro10.get(), 1), 10, 2, 0.1f),
                        new SimpleTrade(new ItemStack(ModItems.Franc10.get(), 1), stack, new ItemStack(ModItems.Euro10.get(), 1), 10, 2, 0.1f),
                        new SimpleTrade(new ItemStack(ModItems.Lei50.get(), 1), stack, new ItemStack(ModItems.Euro10.get(), 1), 10, 2, 0.1f),
                        new SimpleTrade(new ItemStack(ModItems.Leva10.get(), 1), stack, new ItemStack(ModItems.Euro5.get(), 1), 10, 2, 0.1f),
                        new SimpleTrade(new ItemStack(ModItems.Euro5.get(), 1), stack, new ItemStack(ModItems.Leva5.get(), 2), 10, 2, 0.1f),
                        new SimpleTrade(new ItemStack(ModItems.Zloty10.get(), 1), stack, new ItemStack(ModItems.Euro2.get(), 1), 10, 2, 0.1f),
                        new SimpleTrade(new ItemStack(ModItems.Euro5.get(), 1), stack, new ItemStack(ModItems.Zloty20.get(), 1), 10, 2, 0.1f),
                        new SimpleTrade(new ItemStack(ModItems.INr100.get(), 1), stack, new ItemStack(ModItems.Dollar1.get(), 1), 10, 2, 0.1f),
                        new SimpleTrade(new ItemStack(ModItems.Dollar5.get(), 1), stack, new ItemStack(ModItems.INr100.get(), 4), 10, 2, 0.1f),
                        new SimpleTrade(new ItemStack(ModItems.Euro1.get(), 1), stack, new ItemStack(ModItems.TRl5.get(), 7), 10, 2, 0.1f),
                        new SimpleTrade(new ItemStack(ModItems.TRl50.get(), 1), new ItemStack(ModItems.TRl100.get(), 3), new ItemStack(ModItems.Euro10.get(), 1), 10, 2, 0.1f)
                },
                // Level 2
                {
                        new SimpleTrade(new ItemStack(ModItems.DollarC10.get(), 1), new ItemStack(ModItems.Loonie.get(), 4), new ItemStack(ModItems.Dollar10.get(), 1), 7, 5, 0.2f),
                        new SimpleTrade(new ItemStack(ModItems.DollarA10.get(), 1), stack, new ItemStack(ModItems.Pound5.get(), 1), 7, 5, 0.2f),
                        new SimpleTrade(new ItemStack(ModItems.CZkr100.get(), 1), stack, new ItemStack(ModItems.Euro2.get(), 2), 7, 5, 0.2f),
                        new SimpleTrade(new ItemStack(ModItems.Euro5.get(), 1), stack, new ItemStack(ModItems.CZkr100.get(), 1), 7, 5, 0.2f),
                        new SimpleTrade(new ItemStack(ModItems.NOkr50.get(), 1), stack, new ItemStack(ModItems.Euro2.get(), 2), 7, 5, 0.2f),
                        new SimpleTrade(new ItemStack(ModItems.Euro5.get(), 1), stack, new ItemStack(ModItems.NOkr50.get(), 1), 7, 5, 0.2f),
                        new SimpleTrade(new ItemStack(ModItems.RSD200.get(), 1), stack, new ItemStack(ModItems.Euro1.get(), 1), 7, 5, 0.2f),
                        new SimpleTrade(new ItemStack(ModItems.Euro5.get(), 1), stack, new ItemStack(ModItems.RSD500.get(), 1), 7, 5, 0.2f),
                        new SimpleTrade(new ItemStack(ModItems.ISkr1000.get(), 1), stack, new ItemStack(ModItems.Euro5.get(), 1), 7, 5, 0.2f),
                        new SimpleTrade(new ItemStack(ModItems.Euro10.get(), 1), stack, new ItemStack(ModItems.ISkr500.get(), 3), 7, 5, 0.2f),
                        new SimpleTrade(new ItemStack(ModItems.NZD2.get(), 1), stack, new ItemStack(ModItems.Dollar1.get(), 1), 7, 5, 0.2f),
                        new SimpleTrade(new ItemStack(ModItems.Dollar10.get(), 1), stack, new ItemStack(ModItems.NZD5.get(), 3), 7, 5, 0.2f)
                },
                // Level 3
                {
                        new SimpleTrade(new ItemStack(ModItems.Yen50.get(), 3), stack, new ItemStack(ModItems.Dollar1.get(), 1), 5, 7, 0.2f),
                        new SimpleTrade(new ItemStack(ModItems.Euro10.get(), 1), stack, new ItemStack(ModItems.Lei50.get(), 1), 5, 7, 0.2f),
                        new SimpleTrade(new ItemStack(ModItems.DKkr50.get(), 1), stack, new ItemStack(ModItems.Euro2.get(), 3), 5, 7, 0.2f),
                        new SimpleTrade(new ItemStack(ModItems.Euro5.get(), 1), stack, new ItemStack(ModItems.DKkr10.get(), 4), 5, 7, 0.2f),
                        new SimpleTrade(new ItemStack(ModItems.Ft500.get(), 1), stack, new ItemStack(ModItems.Euro1.get(), 1), 5, 7, 0.2f),
                        new SimpleTrade(new ItemStack(ModItems.Euro5.get(), 1), stack, new ItemStack(ModItems.Ft500.get(), 3), 5, 7, 0.2f),
                        new SimpleTrade(new ItemStack(ModItems.SEkr20.get(), 1), stack, new ItemStack(ModItems.Euro1.get(), 1), 5, 7, 0.2f),
                        new SimpleTrade(new ItemStack(ModItems.Euro5.get(), 1), stack, new ItemStack(ModItems.SEkr50.get(), 1), 5, 7, 0.2f),
                        new SimpleTrade(new ItemStack(ModItems.CNYuan10.get(), 1), stack, new ItemStack(ModItems.Dollar1.get(), 1), 5, 7, 0.2f),
                        new SimpleTrade(new ItemStack(ModItems.Dollar5.get(), 1), stack, new ItemStack(ModItems.CNYuan5.get(), 7), 5, 7, 0.2f)
                },
                // Level 4
                {
                        new SimpleTrade(new ItemStack(ModItems.Lei10.get(), 1), stack, new ItemStack(ModItems.LeiMD50.get(), 1), 5, 10, 0.2f),
                        new SimpleTrade(new ItemStack(ModItems.Dollar5.get(), 1), stack, new ItemStack(ModItems.Yen50.get(), 15), 5, 10, 0.2f),
                        new SimpleTrade(new ItemStack(ModItems.Won10000.get(), 2), stack, new ItemStack(ModItems.Dollar5.get(), 3), 5, 10, 0.2f),
                        new SimpleTrade(new ItemStack(ModItems.Dollar10.get(), 1), stack, new ItemStack(ModItems.Won10000.get(), 1), 5, 10, 0.2f),
                        new SimpleTrade(new ItemStack(ModItems.BRReal10.get(), 1), stack, new ItemStack(ModItems.Dollar1.get(), 2), 5, 10, 0.2f),
                        new SimpleTrade(new ItemStack(ModItems.Dollar5.get(), 1), stack, new ItemStack(ModItems.BRReal20.get(), 1), 5, 10, 0.2f),
                        new SimpleTrade(new ItemStack(ModItems.MXPeso100.get(), 1), stack, new ItemStack(ModItems.Dollar5.get(), 1), 5, 10, 0.2f),
                        new SimpleTrade(new ItemStack(ModItems.Dollar1.get(), 2), stack, new ItemStack(ModItems.MXPeso10.get(), 3), 5, 10, 0.2f),
                        new SimpleTrade(new ItemStack(ModItems.ZARand50.get(), 1), stack, new ItemStack(ModItems.Pound2.get(), 1), 5, 10, 0.2f),
                        new SimpleTrade(new ItemStack(ModItems.Pound5.get(), 1), stack, new ItemStack(ModItems.ZARand100.get(), 1), 5, 10, 0.2f)
                },
                // Level 5
                {
                        new SimpleTrade(new ItemStack(ModItems.Euro50.get(), 1), stack, new ItemStack(ModItems.L1.get(), 1), 3, 10, 0.9f),
                        new SimpleTrade(new ItemStack(ModItems.L5.get(), 1), stack, new ItemStack(ModItems.Euro50.get(), 5), 3, 10, 0.9f)
                }
        };
        VillagerTrades.TRADES.put(BANKER.get(), toIntMap(bankerTrades));
        VillagerTrades.TRADES.put(EXCHANGER.get(), toIntMap(exchangerTrades));
    }
    private static Int2ObjectMap<VillagerTrades.ItemListing[]> toIntMap(VillagerTrades.ItemListing[][] trades) {
        Int2ObjectMap<VillagerTrades.ItemListing[]> map = new Int2ObjectOpenHashMap<>();
        for (int i = 0; i < trades.length; i++) {
            map.put(i + 1, trades[i]);
        }
        return map;
    }
}