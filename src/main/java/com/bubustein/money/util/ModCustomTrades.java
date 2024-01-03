package com.bubustein.money.util;
import com.bubustein.money.item.ModItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;

import static com.bubustein.money.villager.ModVillagers.BANKER;
import static com.bubustein.money.villager.ModVillagers.EXCHANGER;

public class ModCustomTrades {
    public static void registerTrades() {
        // BANKER TRADES
        TradeOfferHelper.registerVillagerOffers(BANKER,1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.Euro5, 10),
                            new ItemStack(Items.LAPIS_LAZULI, 1),
                            new ItemStack(Items.EMERALD, 1),
                            8, 2, 0.1f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.Dollar5, 10),
                            new ItemStack(Items.LAPIS_LAZULI, 1),
                            new ItemStack(Items.EMERALD, 1),
                            8, 2, 0.1f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(BANKER,2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.Pound5, 10),
                            new ItemStack(Items.EMERALD, 1),
                            10, 5, 0.1f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 10),
                            new ItemStack(Items.PAPER, 1),
                            new ItemStack(ModItems.Pound100, 1),
                            5, 5, 0.2f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(BANKER,3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.L5, 1),
                            new ItemStack(Items.GOLD_INGOT, 3),
                            new ItemStack(Items.EMERALD, 5),
                            5, 10, 0.9f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 10),
                            new ItemStack(Items.PAPER, 1),
                            new ItemStack(ModItems.Dollar100, 1),
                            5, 10, 0.2f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(BANKER,4,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 52),
                            new ItemStack(Items.PAPER, 1),
                            new ItemStack(ModItems.Euro500, 1),
                            4, 20, 0.2f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(BANKER,5,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 32),
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ModItems.L50, 1),
                            2, 30, 0.9f
                    )));
                });

        // EXCHANGER TRADES
        TradeOfferHelper.registerVillagerOffers(EXCHANGER, 1,
                factories -> {
                    factories.add((((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.Dollar10, 1),
                            new ItemStack(ModItems.Dollar1,1),
                            new ItemStack(ModItems.Euro10, 1),
                            10, 2, 0.1f
                    ))));
                    factories.add((((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.Pound10, 1),
                            new ItemStack(ModItems.Euro10, 1),
                            10, 2, 0.1f
                    ))));
                    factories.add((((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.Franc10, 1),
                            new ItemStack(ModItems.Euro10, 1),
                            10, 2, 0.1f
                    ))));
                    factories.add((((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.Lei50, 1),
                            new ItemStack(ModItems.Euro10, 1),
                            10, 2, 0.1f
                    ))));
                    factories.add((((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.Leva10, 1),
                            new ItemStack(ModItems.Euro5, 1),
                            10,2,0.1f
                    ))));
                    factories.add((((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.Euro5, 1),
                            new ItemStack(ModItems.Leva5, 2),
                            10, 2, 0.1f
                    ))));
                    factories.add((((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.Zloty10, 1),
                            new ItemStack(ModItems.Euro2, 1),
                            10, 2, 0.1f
                    ))));
                    factories.add((((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.Euro5, 1),
                            new ItemStack(ModItems.Zloty20, 1),
                            10, 2, 0.1f
                    ))));
                    factories.add((((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.INr100, 1),
                            new ItemStack(ModItems.Dollar1, 1),
                            10, 2, 0.1f
                    ))));
                    factories.add((((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.Dollar5, 1),
                            new ItemStack(ModItems.INr100, 4),
                            10, 2, 0.1f
                    ))));
                });

        TradeOfferHelper.registerVillagerOffers(EXCHANGER, 2,
                factories -> {
                    factories.add((((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DollarC10, 1),
                            new ItemStack(ModItems.Loonie,4),
                            new ItemStack(ModItems.Dollar10, 1),
                            7, 5, 0.2f
                    ))));
                    factories.add((((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DollarA10, 1),
                            new ItemStack(ModItems.Pound5, 1),
                            7, 5, 0.2f
                    ))));
                    factories.add((((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.CZkr100, 1),
                            new ItemStack(ModItems.Euro2, 2),
                            7, 5, 0.2f
                    ))));
                    factories.add((((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.Euro5, 1),
                            new ItemStack(ModItems.CZkr100, 1),
                            7, 5, 0.2f
                    ))));
                    factories.add((((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.NOkr50, 1),
                            new ItemStack(ModItems.Euro2, 2),
                            7, 5, 0.2f
                    ))));
                    factories.add((((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.Euro5, 1),
                            new ItemStack(ModItems.NOkr50, 1),
                            7, 5, 0.2f
                    ))));
                    factories.add((((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.RSD200, 1),
                            new ItemStack(ModItems.Euro1, 1),
                            7, 5, 0.2f
                    ))));
                    factories.add((((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.Euro5, 1),
                            new ItemStack(ModItems.RSD500, 1),
                            7, 5, 0.2f
                    ))));
                    factories.add((((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.ISkr1000, 1),
                            new ItemStack(ModItems.Euro5, 1),
                            7, 5, 0.2f
                    ))));
                    factories.add((((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.Euro10, 1),
                            new ItemStack(ModItems.ISkr500, 3),
                            7, 5, 0.2f
                    ))));
                });
        TradeOfferHelper.registerVillagerOffers(EXCHANGER, 3,
                factories -> {
                    factories.add((((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.Yen50, 3),
                            new ItemStack(ModItems.Dollar1, 1),
                            5, 7, 0.2f
                    ))));
                    factories.add((((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.Euro10, 1),
                            new ItemStack(ModItems.Lei50, 1),
                            5, 7, 0.2f
                    ))));
                    factories.add((((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DKkr50, 1),
                            new ItemStack(ModItems.Euro2, 3),
                            5, 7, 0.2f
                    ))));
                    factories.add((((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.Euro5, 1),
                            new ItemStack(ModItems.DKkr10, 4),
                            5, 7, 0.2f
                    ))));
                    factories.add((((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.Ft500, 1),
                            new ItemStack(ModItems.Euro1, 1),
                            5, 7, 0.2f
                    ))));
                    factories.add((((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.Euro5, 1),
                            new ItemStack(ModItems.Ft500, 3),
                            5, 7, 0.2f
                    ))));
                    factories.add((((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.SEkr20, 1),
                            new ItemStack(ModItems.Euro1, 1),
                            5, 7, 0.2f
                    ))));
                    factories.add((((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.Euro5, 1),
                            new ItemStack(ModItems.SEkr50, 1),
                            5, 7, 0.2f
                    ))));
                    factories.add((((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.CNYuan10, 1),
                            new ItemStack(ModItems.Dollar1, 1),
                            5, 7, 0.2f
                    ))));
                    factories.add((((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.Dollar5, 1),
                            new ItemStack(ModItems.CNYuan5, 7),
                            5, 7, 0.2f
                    ))));
                });
        TradeOfferHelper.registerVillagerOffers(EXCHANGER, 4,
                factories -> {
                    factories.add((((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.Dollar5, 1),
                            new ItemStack(ModItems.Yen50, 15),
                            5, 10, 0.2f
                    ))));
                    factories.add((((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.Lei10, 1),
                            new ItemStack(ModItems.LeiMD50, 1),
                            5, 10, 0.2f
                    ))));
                    factories.add((((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.Won10000, 2),
                            new ItemStack(ModItems.Dollar5, 3),
                            5, 10, 0.2f
                    ))));
                    factories.add((((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.Dollar10, 1),
                            new ItemStack(ModItems.Won10000, 1),
                            5, 10, 0.2f
                    ))));

                });
        TradeOfferHelper.registerVillagerOffers(EXCHANGER, 5,
                factories -> {
                    factories.add((((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.Euro50, 1),
                            new ItemStack(ModItems.L1, 1),
                            3, 10, 0.9f
                    ))));
                    factories.add((((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.L5, 1),
                            new ItemStack(ModItems.Euro50, 5),
                            3, 10, 0.9f
                    ))));

                });
    }
}
