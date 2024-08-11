package tk.bubustein.money.villager;

import com.google.common.collect.ImmutableSet;
import dev.architectury.registry.level.entity.trade.SimpleTrade;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.registries.Registries;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.trading.ItemCost;
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

    public static void fillTradeData(MinecraftServer server) {
        RegistryAccess registryAccess = server.registryAccess();
        Registry<Enchantment> enchantmentRegistry = registryAccess.registryOrThrow(Registries.ENCHANTMENT);
        Holder<Enchantment> PROTECTION = enchantmentRegistry.getHolderOrThrow(Enchantments.PROTECTION);
        Holder<Enchantment> FEATHER_FALLING = enchantmentRegistry.getHolderOrThrow(Enchantments.FEATHER_FALLING);
        Holder<Enchantment> RESPIRATION = enchantmentRegistry.getHolderOrThrow(Enchantments.RESPIRATION);
        Holder<Enchantment> AQUA_AFFINITY = enchantmentRegistry.getHolderOrThrow(Enchantments.AQUA_AFFINITY);
        Holder<Enchantment> DEPTH_STRIDER = enchantmentRegistry.getHolderOrThrow(Enchantments.DEPTH_STRIDER);
        Holder<Enchantment> SHARPNESS = enchantmentRegistry.getHolderOrThrow(Enchantments.SHARPNESS);
        Holder<Enchantment> KNOCKBACK = enchantmentRegistry.getHolderOrThrow(Enchantments.KNOCKBACK);
        Holder<Enchantment> FIRE_ASPECT = enchantmentRegistry.getHolderOrThrow(Enchantments.FIRE_ASPECT);
        Holder<Enchantment> LOOTING = enchantmentRegistry.getHolderOrThrow(Enchantments.LOOTING);
        Holder<Enchantment> SWEEPING_EDGE = enchantmentRegistry.getHolderOrThrow(Enchantments.SWEEPING_EDGE);
        Holder<Enchantment> EFFICIENCY = enchantmentRegistry.getHolderOrThrow(Enchantments.EFFICIENCY);
        Holder<Enchantment> UNBREAKING = enchantmentRegistry.getHolderOrThrow(Enchantments.UNBREAKING);
        Holder<Enchantment> FORTUNE = enchantmentRegistry.getHolderOrThrow(Enchantments.FORTUNE);
        Holder<Enchantment> LUCK_OF_THE_SEA = enchantmentRegistry.getHolderOrThrow(Enchantments.LUCK_OF_THE_SEA);
        Holder<Enchantment> LURE = enchantmentRegistry.getHolderOrThrow(Enchantments.LURE);
        Holder<Enchantment> LOYALTY = enchantmentRegistry.getHolderOrThrow(Enchantments.LOYALTY);
        Holder<Enchantment> IMPALING = enchantmentRegistry.getHolderOrThrow(Enchantments.IMPALING);
        Holder<Enchantment> CHANNELING = enchantmentRegistry.getHolderOrThrow(Enchantments.CHANNELING);
        Holder<Enchantment> QUICK_CHARGE = enchantmentRegistry.getHolderOrThrow(Enchantments.QUICK_CHARGE);
        Holder<Enchantment> PIERCING = enchantmentRegistry.getHolderOrThrow(Enchantments.PIERCING);
        Holder<Enchantment> MENDING = enchantmentRegistry.getHolderOrThrow(Enchantments.MENDING);

        ItemStack BOOTS = new ItemStack(Items.DIAMOND_BOOTS);
        BOOTS.enchant(PROTECTION,4);
        BOOTS.enchant(FEATHER_FALLING,4);
        BOOTS.enchant(DEPTH_STRIDER,3);
        BOOTS.enchant(UNBREAKING,3);

        ItemStack HELMET = new ItemStack(Items.DIAMOND_HELMET);
        HELMET.enchant(PROTECTION,4);
        HELMET.enchant(RESPIRATION,3);
        HELMET.enchant(AQUA_AFFINITY,1);
        HELMET.enchant(UNBREAKING,3);

        ItemStack FISHING_ROD = new ItemStack(Items.FISHING_ROD);
        FISHING_ROD.enchant(UNBREAKING,3);
        FISHING_ROD.enchant(LURE,3);
        FISHING_ROD.enchant(LUCK_OF_THE_SEA,3);

        ItemStack SWORD = new ItemStack(Items.DIAMOND_SWORD);
        SWORD.enchant(UNBREAKING,3);
        SWORD.enchant(FIRE_ASPECT,2);
        SWORD.enchant(LOOTING,3);
        SWORD.enchant(KNOCKBACK,2);
        SWORD.enchant(SWEEPING_EDGE,3);
        SWORD.enchant(SHARPNESS,5);

        ItemStack TRIDENT = new ItemStack(Items.TRIDENT);
        TRIDENT.enchant(UNBREAKING,3);
        TRIDENT.enchant(IMPALING,5);
        TRIDENT.enchant(CHANNELING,1);
        TRIDENT.enchant(LOYALTY,3);

        ItemStack CROSSBOW = new ItemStack(Items.CROSSBOW);
        CROSSBOW.enchant(UNBREAKING,3);
        CROSSBOW.enchant(QUICK_CHARGE,3);
        CROSSBOW.enchant(PIERCING,4);

        ItemStack PICKAXE = new ItemStack(Items.DIAMOND_PICKAXE);
        PICKAXE.enchant(UNBREAKING, 3);
        PICKAXE.enchant(EFFICIENCY,5);
        PICKAXE.enchant(FORTUNE,3);

        ItemStack SHIELD = new ItemStack(Items.SHIELD);
        SHIELD.enchant(MENDING,1);
        SHIELD.enchant(UNBREAKING,3);

        VillagerTrades.ItemListing[][] bankerTrades = {
                // Level 1
                {
                    new SimpleTrade(new ItemCost(ModItems.Euro5.get(), 10), Optional.of(new ItemCost(Items.LAPIS_LAZULI, 1)), new ItemStack(Items.EMERALD, 1), 12, 2, 0.1f),
                    new SimpleTrade(new ItemCost(ModItems.Pound5.get(), 10), Optional.empty(), new ItemStack(Items.EMERALD, 1), 12, 2, 0.1f),
                    new SimpleTrade(new ItemCost(ModItems.Dollar5.get(), 10), Optional.of(new ItemCost(Items.LAPIS_LAZULI, 1)), new ItemStack(Items.EMERALD, 1), 12, 2, 0.1f)
                },
                // Level 2
                {
                    new SimpleTrade(new ItemCost(Items.EMERALD, 10), Optional.of(new ItemCost(Items.PAPER, 1)), new ItemStack(ModItems.Pound50.get(), 2), 8, 4, 0.2f),
                    new SimpleTrade(new ItemCost(Items.EMERALD, 10), Optional.of(new ItemCost(Items.PAPER, 1)), new ItemStack(ModItems.Dollar100.get(), 1), 8, 4, 0.2f),
                    new SimpleTrade(new ItemCost(Items.EMERALD, 26), Optional.of(new ItemCost(Items.PAPER, 1)), new ItemStack(ModItems.Euro50.get(), 5), 8, 4, 0.2f)
                },
                // Level 3
                {
                    new SimpleTrade(new ItemCost(ModItems.Dollar50.get(),1), Optional.of(new ItemCost(ModItems.Dollar100.get(),3)), new ItemStack(Items.NETHERITE_INGOT,1),6,8,0.2f),
                    new SimpleTrade(new ItemCost(ModItems.Dollar50.get(), 1), Optional.of(new ItemCost(ModItems.Dollar100.get(),2)), new ItemStack(Items.DIAMOND,1),6,8,0.2f),
                },
                // Level 4
                {
                    new SimpleTrade(new ItemCost(Items.EMERALD, 40), Optional.of(new ItemCost(Blocks.EMERALD_BLOCK, 8)), new ItemStack(ModItems.L50.get(), 1), 3, 20, 0.9f),
                    new SimpleTrade(new ItemCost(ModItems.L12.get(), 1), Optional.of(new ItemCost(Items.GOLD_INGOT, 3)), new ItemStack(Items.EMERALD, 5), 3, 20, 0.9f),
                },
                // Level 5
                {
                    new SimpleTrade(new ItemCost(ModItems.L25.get(),1), Optional.empty(), SHIELD,2,23,0.92f),
                    new SimpleTrade(new ItemCost(ModItems.L25.get(),1), Optional.empty(), CROSSBOW,2,23,0.92f),
                    new SimpleTrade(new ItemCost(ModItems.L25.get(),1), Optional.empty(), FISHING_ROD,2,23,0.92f),
                    new SimpleTrade(new ItemCost(ModItems.L50.get(),1), Optional.empty(), BOOTS, 2, 23, 0.92f),
                    new SimpleTrade(new ItemCost(ModItems.L50.get(),1), Optional.empty(), HELMET, 2, 23, 0.92f),
                    new SimpleTrade(new ItemCost(ModItems.L50.get(), 1), Optional.empty(), PICKAXE,2,23,0.92f),
                    new SimpleTrade(new ItemCost(ModItems.L100.get(),1), Optional.of(new ItemCost(ModItems.L50.get(),1)), TRIDENT,2,23,0.92f),
                    new SimpleTrade(new ItemCost(ModItems.L100.get(),1), Optional.of(new ItemCost(ModItems.L100.get(),1)), SWORD, 2,23,0.92f)
                }
        };
        VillagerTrades.ItemListing[][] exchangerTrades = {
                // Level 1
                {
                    new SimpleTrade(new ItemCost(ModItems.Dollar10.get(), 1), Optional.of(new ItemCost(ModItems.Dollar1.get(), 1)), new ItemStack(ModItems.Euro10.get(), 1), 10, 2, 0.1f),
                    new SimpleTrade(new ItemCost(ModItems.Pound10.get(), 1), Optional.empty(), new ItemStack(ModItems.Euro10.get(), 1), 10, 2, 0.1f),
                    new SimpleTrade(new ItemCost(ModItems.Franc10.get(), 1), Optional.empty(), new ItemStack(ModItems.Euro10.get(), 1), 10, 2, 0.1f),
                    new SimpleTrade(new ItemCost(ModItems.Lei50.get(), 1), Optional.empty(), new ItemStack(ModItems.Euro10.get(), 1), 10, 2, 0.1f),
                    new SimpleTrade(new ItemCost(ModItems.Leva10.get(), 1), Optional.empty(), new ItemStack(ModItems.Euro5.get(), 1), 10, 2, 0.1f),
                    new SimpleTrade(new ItemCost(ModItems.CZkr100.get(), 1), Optional.empty(), new ItemStack(ModItems.Euro2.get(), 2), 10, 2, 0.1f),
                    new SimpleTrade(new ItemCost(ModItems.Zloty10.get(), 1), Optional.empty(), new ItemStack(ModItems.Euro2.get(), 1), 10, 2, 0.1f),
                    new SimpleTrade(new ItemCost(ModItems.NOkr50.get(), 1), Optional.empty(), new ItemStack(ModItems.Euro2.get(), 2), 10, 2, 0.1f),
                    new SimpleTrade(new ItemCost(ModItems.RSD200.get(), 1), Optional.empty(), new ItemStack(ModItems.Euro1.get(), 1), 10, 2, 0.1f),
                    new SimpleTrade(new ItemCost(ModItems.ISkr1000.get(), 1), Optional.empty(), new ItemStack(ModItems.Euro5.get(), 1), 10, 2, 0.1f),
                    new SimpleTrade(new ItemCost(ModItems.Ft500.get(), 1), Optional.empty(), new ItemStack(ModItems.Euro1.get(), 1), 10, 2, 0.1f),
                    new SimpleTrade(new ItemCost(ModItems.SEkr20.get(), 1), Optional.empty(), new ItemStack(ModItems.Euro1.get(), 1), 10, 2, 0.1f),
                    new SimpleTrade(new ItemCost(ModItems.DKkr50.get(), 1), Optional.empty(), new ItemStack(ModItems.Euro2.get(), 3), 10, 2, 0.1f),
                    new SimpleTrade(new ItemCost(ModItems.LeiMD100.get(),1), Optional.empty(), new ItemStack(ModItems.Euro5.get(), 1), 10,2,0.1f),
                    new SimpleTrade(new ItemCost(ModItems.TRl50.get(), 1), Optional.of(new ItemCost(ModItems.TRl100.get(), 3)), new ItemStack(ModItems.Euro10.get(), 1), 10, 2, 0.1f)
                },
                // Level 2
                {
                    new SimpleTrade(new ItemCost(ModItems.Euro5.get(),1), Optional.empty(), new ItemStack(ModItems.Dollar1.get(), 6), 7,5,0.2f),
                    new SimpleTrade(new ItemCost(ModItems.Euro5.get(), 1), Optional.empty(), new ItemStack(ModItems.Pound5.get(),1),7,5,0.2f),
                    new SimpleTrade(new ItemCost(ModItems.Euro5.get(),1), Optional.empty(), new ItemStack(ModItems.Franc5.get(), 1),5,7,0.2f),
                    new SimpleTrade(new ItemCost(ModItems.Euro5.get(), 1), Optional.empty(), new ItemStack(ModItems.Leva5.get(), 2), 7, 5, 0.2f),
                    new SimpleTrade(new ItemCost(ModItems.Euro1.get(), 1), Optional.empty(), new ItemStack(ModItems.TRl5.get(), 7), 7, 5, 0.2f),
                    new SimpleTrade(new ItemCost(ModItems.Euro5.get(), 1), Optional.empty(), new ItemStack(ModItems.CZkr100.get(), 1), 7, 5, 0.2f),
                    new SimpleTrade(new ItemCost(ModItems.Euro5.get(), 1), Optional.empty(), new ItemStack(ModItems.NOkr50.get(), 1), 7, 5, 0.2f),
                    new SimpleTrade(new ItemCost(ModItems.Euro5.get(), 1), Optional.empty(), new ItemStack(ModItems.RSD500.get(), 1), 7, 5, 0.2f),
                    new SimpleTrade(new ItemCost(ModItems.Euro10.get(), 1), Optional.empty(), new ItemStack(ModItems.ISkr500.get(), 3), 7, 5, 0.2f),
                    new SimpleTrade(new ItemCost(ModItems.Euro2.get(),1), Optional.empty(), new ItemStack(ModItems.LeiMD5.get(),7),7,5,0.2f),
                    new SimpleTrade(new ItemCost(ModItems.Euro10.get(), 1), Optional.empty(), new ItemStack(ModItems.Lei50.get(), 1), 7, 5, 0.2f),
                    new SimpleTrade(new ItemCost(ModItems.Euro5.get(), 1), Optional.empty(), new ItemStack(ModItems.DKkr10.get(), 4), 7, 5, 0.2f),
                    new SimpleTrade(new ItemCost(ModItems.Euro5.get(), 1), Optional.empty(), new ItemStack(ModItems.Ft500.get(), 3), 7, 5, 0.2f),
                    new SimpleTrade(new ItemCost(ModItems.Euro5.get(), 1), Optional.empty(), new ItemStack(ModItems.SEkr50.get(), 1), 7, 5, 0.2f),
                    new SimpleTrade(new ItemCost(ModItems.Euro5.get(), 1), Optional.empty(), new ItemStack(ModItems.Zloty20.get(), 1), 7, 5, 0.2f),
                },
                // Level 3
                {
                    new SimpleTrade(new ItemCost(ModItems.NZD2.get(), 1), Optional.empty(), new ItemStack(ModItems.Dollar1.get(), 1), 5, 7, 0.2f),
                    new SimpleTrade(new ItemCost(ModItems.DollarC10.get(), 1), Optional.of(new ItemCost(ModItems.Loonie.get(), 4)), new ItemStack(ModItems.Dollar10.get(), 1), 5, 8, 0.2f),
                    new SimpleTrade(new ItemCost(ModItems.Yen50.get(), 3), Optional.empty(), new ItemStack(ModItems.Dollar1.get(), 1), 5, 7, 0.2f),
                    new SimpleTrade(new ItemCost(ModItems.CNYuan10.get(), 1), Optional.empty(), new ItemStack(ModItems.Dollar1.get(), 1), 5, 7, 0.2f),
                    new SimpleTrade(new ItemCost(ModItems.Won10000.get(), 2), Optional.empty(), new ItemStack(ModItems.Dollar5.get(), 3), 5, 7, 0.2f),
                    new SimpleTrade(new ItemCost(ModItems.BRReal10.get(), 1), Optional.empty(), new ItemStack(ModItems.Dollar1.get(), 2), 5, 7, 0.2f),
                    new SimpleTrade(new ItemCost(ModItems.MXPeso100.get(), 1), Optional.empty(), new ItemStack(ModItems.Dollar5.get(), 1), 5, 7, 0.2f),
                    new SimpleTrade(new ItemCost(ModItems.ZARand50.get(), 1), Optional.empty(), new ItemStack(ModItems.Pound2.get(), 1), 5, 7, 0.2f),
                    new SimpleTrade(new ItemCost(ModItems.DollarA10.get(), 1), Optional.empty(), new ItemStack(ModItems.Pound5.get(), 1), 5, 7, 0.2f),
                    new SimpleTrade(new ItemCost(ModItems.PHP100.get(), 1), Optional.of(new ItemCost(ModItems.PHP5.get(), 3)), new ItemStack(ModItems.Dollar1.get(), 2), 5, 7, 0.2f),
                    new SimpleTrade(new ItemCost(ModItems.INr100.get(), 1), Optional.empty(), new ItemStack(ModItems.Dollar1.get(), 1), 5, 7, 0.2f),
                },
                // Level 4
                {
                    new SimpleTrade(new ItemCost(ModItems.Dollar5.get(), 1), Optional.empty(), new ItemStack(ModItems.PHP50.get(), 5), 5, 8, 0.2f),
                    new SimpleTrade(new ItemCost(ModItems.Dollar10.get(), 1), Optional.empty(), new ItemStack(ModItems.DollarC10.get(),1),5,8,0.2f),
                    new SimpleTrade(new ItemCost(ModItems.Dollar10.get(), 1), Optional.empty(), new ItemStack(ModItems.NZD5.get(), 3), 5, 8, 0.2f),
                    new SimpleTrade(new ItemCost(ModItems.Dollar5.get(), 1), Optional.empty(), new ItemStack(ModItems.CNYuan5.get(), 7), 5, 8, 0.2f),
                    new SimpleTrade(new ItemCost(ModItems.Dollar5.get(), 1), Optional.empty(), new ItemStack(ModItems.Yen50.get(), 15), 5, 8, 0.2f),
                    new SimpleTrade(new ItemCost(ModItems.Dollar10.get(), 1), Optional.empty(), new ItemStack(ModItems.Won10000.get(), 1), 5, 8, 0.2f),
                    new SimpleTrade(new ItemCost(ModItems.Dollar5.get(), 1), Optional.empty(), new ItemStack(ModItems.BRReal20.get(), 1), 5, 8, 0.2f),
                    new SimpleTrade(new ItemCost(ModItems.Dollar1.get(), 2), Optional.empty(), new ItemStack(ModItems.MXPeso10.get(), 3), 5, 8, 0.2f),
                    new SimpleTrade(new ItemCost(ModItems.Pound5.get(), 1), Optional.empty(), new ItemStack(ModItems.ZARand100.get(), 1), 5, 8, 0.2f),
                    new SimpleTrade(new ItemCost(ModItems.Pound5.get(),1), Optional.empty(), new ItemStack(ModItems.DollarA5.get(),1),5,8,0.2f),
                    new SimpleTrade(new ItemCost(ModItems.Dollar5.get(), 1), Optional.empty(), new ItemStack(ModItems.INr100.get(), 4), 5, 8, 0.2f),
                },
                // Level 5
                {
                    new SimpleTrade(new ItemCost(ModItems.Euro50.get(), 1), Optional.empty(), new ItemStack(ModItems.L1.get(), 1), 3, 10, 0.9f),
                    new SimpleTrade(new ItemCost(ModItems.L5.get(), 1), Optional.empty(), new ItemStack(ModItems.Euro50.get(), 5), 3, 10, 0.9f)
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