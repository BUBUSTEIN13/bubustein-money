package com.bubustein.money.item;

import com.bubustein.money.MoneyMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item Ecent1 = registerItem("one_ecent",
            new Item(new FabricItemSettings()));
    public static final Item Ecent2 = registerItem("two_ecents",
            new Item(new FabricItemSettings()));
    public static final Item Ecent5 = registerItem("five_ecents",
            new Item(new FabricItemSettings()));
    public static final Item Ecent10 = registerItem("ten_ecents",
            new Item(new FabricItemSettings()));
    public static final Item Ecent20 = registerItem("twenty_ecents",
            new Item(new FabricItemSettings()));
    public static final Item Ecent50 = registerItem("fifty_ecents",
            new Item(new FabricItemSettings()));
    public static final Item Euro1 = registerItem("one_euro",
            new Item(new FabricItemSettings()));
    public static final Item Euro2 = registerItem("two_euros",
            new Item(new FabricItemSettings()));

    public static final Item Euro5 = registerItem("five_euros",
            new Item(new FabricItemSettings()));
    public static final Item Euro10 = registerItem("ten_euros",
            new Item(new FabricItemSettings()));
    public static final Item Euro20 = registerItem("twenty_euros",
            new Item(new FabricItemSettings()));
    public static final Item Euro50 = registerItem("fifty_euros",
            new Item(new FabricItemSettings()));
    public static final Item Euro100 = registerItem("hundred_euros",
            new Item(new FabricItemSettings()));
    public static final Item Euro200 = registerItem("two_hundred_euros",
            new Item(new FabricItemSettings()));
    public static final Item Euro500 = registerItem("five_hundred_euros",
            new Item(new FabricItemSettings()));



    public static final Item Cent1 = registerItem("one_cent",
            new Item(new FabricItemSettings()));
    public static final Item Cent5 = registerItem("five_cents",
            new Item(new FabricItemSettings()));
    public static final Item Cent10 = registerItem("ten_cents",
            new Item(new FabricItemSettings()));
    public static final Item Cent25 = registerItem("twentyfive_cents",
            new Item(new FabricItemSettings()));
    public static final Item Cent50 = registerItem("fifty_cents",
            new Item(new FabricItemSettings()));
    public static final Item Dollar1 = registerItem("one_dollar",
            new Item(new FabricItemSettings()));
    public static final Item Dollar5 = registerItem("five_dollars",
            new Item(new FabricItemSettings()));
    public static final Item Dollar10 = registerItem("ten_dollars",
            new Item(new FabricItemSettings()));
    public static final Item Dollar20 = registerItem("twenty_dollars",
            new Item(new FabricItemSettings()));
    public static final Item Dollar50 = registerItem("fifty_dollars",
            new Item(new FabricItemSettings()));
    public static final Item Dollar100 = registerItem("hundred_dollars",
            new Item(new FabricItemSettings()));

    public static final Item VisaClassic = registerItem("card_classic",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item VisaGold = registerItem("card_gold",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item VisaSteel = registerItem("card_steel",
            new Item(new FabricItemSettings().maxCount(1)));


    public static final Item Pence1 = registerItem("one_pence",
            new Item(new FabricItemSettings()));
    public static final Item Pence2 = registerItem("two_pence",
            new Item(new FabricItemSettings()));
    public static final Item Pence5 = registerItem("five_pence",
            new Item(new FabricItemSettings()));
    public static final Item Pence10 = registerItem("ten_pence",
            new Item(new FabricItemSettings()));
    public static final Item Pence20 = registerItem("twenty_pence",
            new Item(new FabricItemSettings()));
    public static final Item Pence50 = registerItem("fifty_pence",
            new Item(new FabricItemSettings()));
    public static final Item Pound1 = registerItem("one_pound",
            new Item(new FabricItemSettings()));
    public static final Item Pound2 = registerItem("two_pounds",
            new Item(new FabricItemSettings()));

    public static final Item Pound5 = registerItem("five_pounds",
            new Item(new FabricItemSettings()));
    public static final Item Pound10 = registerItem("ten_pounds",
            new Item(new FabricItemSettings()));
    public static final Item Pound20 = registerItem("twenty_pounds",
            new Item(new FabricItemSettings()));
    public static final Item Pound50 = registerItem("fifty_pounds",
            new Item(new FabricItemSettings()));
    public static final Item Pound100 = registerItem("hundred_pounds",
            new Item(new FabricItemSettings()));

    public static final Item CCent5 = registerItem("five_ccents",
            new Item(new FabricItemSettings()));
    public static final Item CCent10 = registerItem("ten_ccents",
            new Item(new FabricItemSettings()));
    public static final Item CCent25 = registerItem("twentyfive_ccents",
            new Item(new FabricItemSettings()));
    public static final Item Loonie = registerItem("loonie",
            new Item(new FabricItemSettings()));
    public static final Item Toonie = registerItem("toonie",
            new Item(new FabricItemSettings()));

    public static final Item DollarC5 = registerItem("five_cdollars",
            new Item(new FabricItemSettings()));
    public static final Item DollarC10 = registerItem("ten_cdollars",
            new Item(new FabricItemSettings()));
    public static final Item DollarC20 = registerItem("twenty_cdollars",
            new Item(new FabricItemSettings()));
    public static final Item DollarC50 = registerItem("fifty_cdollars",
            new Item(new FabricItemSettings()));
    public static final Item DollarC100 = registerItem("hundred_cdollars",
            new Item(new FabricItemSettings()));

    public static final Item Ban1 = registerItem("un_ban",
            new Item(new FabricItemSettings()));
    public static final Item Bani5 = registerItem("cinci_bani",
            new Item(new FabricItemSettings()));
    public static final Item Bani10 = registerItem("zece_bani",
            new Item(new FabricItemSettings()));
    public static final Item Bani50 = registerItem("cincizeci_bani",
            new Item(new FabricItemSettings()));



    public static final Item Leu1 = registerItem("un_leu",
            new Item(new FabricItemSettings()));
    public static final Item Lei5 = registerItem("cinci_lei",
            new Item(new FabricItemSettings()));
    public static final Item Lei10 = registerItem("zece_lei",
            new Item(new FabricItemSettings()));
    public static final Item Lei20 = registerItem("douazeci_lei",
            new Item(new FabricItemSettings()));
    public static final Item Lei50 = registerItem("cincizeci_lei",
            new Item(new FabricItemSettings()));
    public static final Item Lei100 = registerItem("suta_lei",
            new Item(new FabricItemSettings()));
    public static final Item Lei200 = registerItem("doua_sute_lei",
            new Item(new FabricItemSettings()));
    public static final Item Lei500 = registerItem("cinci_sute_lei",
            new Item(new FabricItemSettings()));



    public static final Item BanMD5 = registerItem("cinci_bani_md",
            new Item(new FabricItemSettings()));
    public static final Item BaniMD10 = registerItem("zece_bani_md",
            new Item(new FabricItemSettings()));
    public static final Item BaniMD25 = registerItem("douazecicinci_bani_md",
            new Item(new FabricItemSettings()));
    public static final Item BaniMD50 = registerItem("cincizeci_bani_md",
            new Item(new FabricItemSettings()));
    public static final Item LeuMD1 = registerItem("un_leu_md",
            new Item(new FabricItemSettings()));
    public static final Item LeuMD2 = registerItem("doi_lei_md",
            new Item(new FabricItemSettings()));
    public static final Item LeiMD5 = registerItem("cinci_lei_md",
            new Item(new FabricItemSettings()));
    public static final Item LeiMD10 = registerItem("zece_lei_md",
            new Item(new FabricItemSettings()));



    public static final Item LeiMD20 = registerItem("douazeci_lei_md",
            new Item(new FabricItemSettings()));
    public static final Item LeiMD50 = registerItem("cincizeci_lei_md",
            new Item(new FabricItemSettings()));
    public static final Item LeiMD100 = registerItem("suta_lei_md",
            new Item(new FabricItemSettings()));
    public static final Item LeiMD200 = registerItem("doua_sute_lei_md",
            new Item(new FabricItemSettings()));
    public static final Item LeiMD500 = registerItem("cinci_sute_lei_md",
            new Item(new FabricItemSettings()));
    public static final Item LeiMD1000 = registerItem("mie_lei_md",
            new Item(new FabricItemSettings()));


    public static final Item B1 = registerItem("un_ban_1900",
            new Item(new FabricItemSettings()));
    public static final Item B2 = registerItem("doi_bani_1900",
            new Item(new FabricItemSettings()));
    public static final Item B5 = registerItem("cinci_bani_1900",
            new Item(new FabricItemSettings()));
    public static final Item B10 = registerItem("zece_bani_1900",
            new Item(new FabricItemSettings()));
    public static final Item B20 = registerItem("douazeci_bani_1900",
            new Item(new FabricItemSettings()));
    public static final Item B50 = registerItem("cincizeci_bani_1900",
            new Item(new FabricItemSettings()));
    public static final Item L1 = registerItem("un_leu_1900",
            new Item(new FabricItemSettings()));
    public static final Item L2 = registerItem("doi_lei_1900",
            new Item(new FabricItemSettings()));
    public static final Item L5 = registerItem("cinci_lei_1900",
            new Item(new FabricItemSettings()));
    public static final Item L12 = registerItem("douasprezece_lei_1900",
            new Item(new FabricItemSettings()));
    public static final Item L20 = registerItem("douazeci_lei_1900",
            new Item(new FabricItemSettings()));
    public static final Item L25 = registerItem("douazeci_cinci_lei_1900",
            new Item(new FabricItemSettings()));
    public static final Item L50 = registerItem("cincizeci_lei_1900",
            new Item(new FabricItemSettings()));
    public static final Item L100 = registerItem("suta_lei_1900",
            new Item(new FabricItemSettings()));


    public static final Item Centimes5 = registerItem("five_centimes",
            new Item(new FabricItemSettings()));
    public static final Item Centimes10 = registerItem("ten_centimes",
            new Item(new FabricItemSettings()));
    public static final Item Centimes20 = registerItem("twenty_centimes",
            new Item(new FabricItemSettings()));
    public static final Item HalfFranc = registerItem("half_franc",
            new Item(new FabricItemSettings()));
    public static final Item Franc1 = registerItem("one_franc",
            new Item(new FabricItemSettings()));
    public static final Item Franc2 = registerItem("two_francs",
            new Item(new FabricItemSettings()));
    public static final Item Franc5 = registerItem("five_francs",
            new Item(new FabricItemSettings()));

    public static final Item Franc10 = registerItem("ten_francs",
            new Item(new FabricItemSettings()));
    public static final Item Franc20 = registerItem("twenty_francs",
            new Item(new FabricItemSettings()));
    public static final Item Franc50 = registerItem("fifty_francs",
            new Item(new FabricItemSettings()));
    public static final Item Franc100 = registerItem("hundred_francs",
            new Item(new FabricItemSettings()));
    public static final Item Franc200 = registerItem("two_hundred_francs",
            new Item(new FabricItemSettings()));
    public static final Item Franc1000 = registerItem("thousand_francs",
            new Item(new FabricItemSettings()));

    public static final Item ACent5 = registerItem("five_acents",
            new Item(new FabricItemSettings()));
    public static final Item ACent10 = registerItem("ten_acents",
            new Item(new FabricItemSettings()));
    public static final Item ACent20 = registerItem("twenty_acents",
            new Item(new FabricItemSettings()));
    public static final Item ACent50 = registerItem("fifty_acents",
            new Item(new FabricItemSettings()));
    public static final Item DollarA1 = registerItem("one_adollar",
            new Item(new FabricItemSettings()));
    public static final Item DollarA2 = registerItem("two_adollars",
            new Item(new FabricItemSettings()));


    public static final Item DollarA5 = registerItem("five_adollars",
            new Item(new FabricItemSettings()));
    public static final Item DollarA10 = registerItem("ten_adollars",
            new Item(new FabricItemSettings()));
    public static final Item DollarA20 = registerItem("twenty_adollars",
            new Item(new FabricItemSettings()));
    public static final Item DollarA50 = registerItem("fifty_adollars",
            new Item(new FabricItemSettings()));
    public static final Item DollarA100 = registerItem("hundred_adollars",
            new Item(new FabricItemSettings()));

    public static final Item Yen1 = registerItem("one_yen",
            new Item(new FabricItemSettings()));
    public static final Item Yen5 = registerItem("five_yen",
            new Item(new FabricItemSettings()));
    public static final Item Yen10 = registerItem("ten_yen",
            new Item(new FabricItemSettings()));
    public static final Item Yen50 = registerItem("fifty_yen",
            new Item(new FabricItemSettings()));
    public static final Item Yen100 = registerItem("hundred_yen",
            new Item(new FabricItemSettings()));
    public static final Item Yen500 = registerItem("five_hundred_yen",
            new Item(new FabricItemSettings()));

    public static final Item Yen1000 = registerItem("thousand_yen",
            new Item(new FabricItemSettings()));
    public static final Item Yen5000 = registerItem("five_thousand_yen",
            new Item(new FabricItemSettings()));
    public static final Item Yen10000 = registerItem("ten_thousand_yen",
            new Item(new FabricItemSettings()));
    public static final Item Stotinka1 = registerItem("one_stotinka",
            new Item(new FabricItemSettings()));
    public static final Item Stotinka2 = registerItem("two_stotinki",
            new Item(new FabricItemSettings()));
    public static final Item Stotinka5 = registerItem("five_stotinki",
            new Item(new FabricItemSettings()));
    public static final Item Stotinka10 = registerItem("ten_stotinki",
            new Item(new FabricItemSettings()));
    public static final Item Stotinka20 = registerItem("twenty_stotinki",
            new Item(new FabricItemSettings()));
    public static final Item Stotinka50 = registerItem("fifty_stotinki",
            new Item(new FabricItemSettings()));
    public static final Item Leva1 = registerItem("one_lev",
            new Item(new FabricItemSettings()));
    public static final Item Leva2 = registerItem("two_leva",
            new Item(new FabricItemSettings()));
    public static final Item Leva5 = registerItem("five_leva",
            new Item(new FabricItemSettings()));
    public static final Item Leva10 = registerItem("ten_leva",
            new Item(new FabricItemSettings()));
    public static final Item Leva20 = registerItem("twenty_leva",
            new Item(new FabricItemSettings()));
    public static final Item Leva50 = registerItem("fifty_leva",
            new Item(new FabricItemSettings()));
    public static final Item Leva100 = registerItem("hundred_leva",
            new Item(new FabricItemSettings()));

    public static final Item CZkr1 = registerItem("one_cz_krone",
            new Item(new FabricItemSettings()));
    public static final Item CZkr2 = registerItem("two_cz_krone",
            new Item(new FabricItemSettings()));
    public static final Item CZkr5 = registerItem("five_cz_krone",
            new Item(new FabricItemSettings()));
    public static final Item CZkr10 = registerItem("ten_cz_krone",
            new Item(new FabricItemSettings()));
    public static final Item CZkr20 = registerItem("twenty_cz_krone",
            new Item(new FabricItemSettings()));
    public static final Item CZkr50 = registerItem("fifty_cz_krone",
            new Item(new FabricItemSettings()));
    public static final Item CZkr100 = registerItem("hundred_cz_krone",
            new Item(new FabricItemSettings()));
    public static final Item CZkr200 = registerItem("two_hundred_cz_krone",
            new Item(new FabricItemSettings()));
    public static final Item CZkr500 = registerItem("five_hundred_cz_krone",
            new Item(new FabricItemSettings()));
    public static final Item CZkr1000 = registerItem("thousand_cz_krone",
            new Item(new FabricItemSettings()));
    public static final Item CZkr2000 = registerItem("two_thousand_cz_krone",
            new Item(new FabricItemSettings()));
    public static final Item CZkr5000 = registerItem("five_thousand_cz_krone",
            new Item(new FabricItemSettings()));


    public static final Item DKAere50 = registerItem("fifty_aere_dk",
            new Item(new FabricItemSettings()));
    public static final Item DKkr1 = registerItem("one_dk_krone",
            new Item(new FabricItemSettings()));
    public static final Item DKkr2 = registerItem("two_dk_krone",
            new Item(new FabricItemSettings()));
    public static final Item DKkr5 = registerItem("five_dk_krone",
            new Item(new FabricItemSettings()));
    public static final Item DKkr10 = registerItem("ten_dk_krone",
            new Item(new FabricItemSettings()));
    public static final Item DKkr20 = registerItem("twenty_dk_krone",
            new Item(new FabricItemSettings()));
    public static final Item DKkr50 = registerItem("fifty_dk_krone",
            new Item(new FabricItemSettings()));
    public static final Item DKkr100 = registerItem("hundred_dk_krone",
            new Item(new FabricItemSettings()));
    public static final Item DKkr200 = registerItem("two_hundred_dk_krone",
            new Item(new FabricItemSettings()));
    public static final Item DKkr500 = registerItem("five_hundred_dk_krone",
            new Item(new FabricItemSettings()));

    public static final Item DKkr1000 = registerItem("thousand_dk_krone",
            new Item(new FabricItemSettings()));

    public static final Item Ft5 = registerItem("five_ft",
            new Item(new FabricItemSettings()));
    public static final Item Ft10 = registerItem("ten_ft",
            new Item(new FabricItemSettings()));
    public static final Item Ft20 = registerItem("twenty_ft",
            new Item(new FabricItemSettings()));
    public static final Item Ft50 = registerItem("fifty_ft",
            new Item(new FabricItemSettings()));
    public static final Item Ft100 = registerItem("hundred_ft",
            new Item(new FabricItemSettings()));
    public static final Item Ft200 = registerItem("two_hundred_ft",
            new Item(new FabricItemSettings()));


    public static final Item Ft500 = registerItem("five_hundred_ft",
            new Item(new FabricItemSettings()));
    public static final Item Ft1000 = registerItem("thousand_ft",
            new Item(new FabricItemSettings()));
    public static final Item Ft2000 = registerItem("two_thousand_ft",
            new Item(new FabricItemSettings()));
    public static final Item Ft5000 = registerItem("five_thousand_ft",
            new Item(new FabricItemSettings()));
    public static final Item Ft10000 = registerItem("ten_thousand_ft",
            new Item(new FabricItemSettings()));
    public static final Item Ft20000 = registerItem("twenty_thousand_ft",
            new Item(new FabricItemSettings()));

    public static final Item NOkr1 = registerItem("one_no_krone",
            new Item(new FabricItemSettings()));
    public static final Item NOkr5 = registerItem("five_no_krone",
            new Item(new FabricItemSettings()));
    public static final Item NOkr10 = registerItem("ten_no_krone",
            new Item(new FabricItemSettings()));
    public static final Item NOkr20 = registerItem("twenty_no_krone",
            new Item(new FabricItemSettings()));
    public static final Item NOkr50 = registerItem("fifty_no_krone",
            new Item(new FabricItemSettings()));
    public static final Item NOkr100 = registerItem("hundred_no_krone",
            new Item(new FabricItemSettings()));
    public static final Item NOkr200 = registerItem("two_hundred_no_krone",
            new Item(new FabricItemSettings()));
    public static final Item NOkr500 = registerItem("five_hundred_no_krone",
            new Item(new FabricItemSettings()));
    public static final Item NOkr1000 = registerItem("thousand_no_krone",
            new Item(new FabricItemSettings()));

    public static final Item Grosz1 = registerItem("one_grosz",
            new Item(new FabricItemSettings()));
    public static final Item Grosz2 = registerItem("two_grosze",
            new Item(new FabricItemSettings()));
    public static final Item Grosz5 = registerItem("five_groszy",
            new Item(new FabricItemSettings()));
    public static final Item Grosz10 = registerItem("ten_groszy",
            new Item(new FabricItemSettings()));
    public static final Item Grosz20 = registerItem("twenty_groszy",
            new Item(new FabricItemSettings()));
    public static final Item Grosz50 = registerItem("fifty_groszy",
            new Item(new FabricItemSettings()));
    public static final Item Zloty1 = registerItem("one_zloty",
            new Item(new FabricItemSettings()));
    public static final Item Zloty2 = registerItem("two_zloty",
            new Item(new FabricItemSettings()));
    public static final Item Zloty5 = registerItem("five_zloty",
            new Item(new FabricItemSettings()));


    public static final Item Zloty10 = registerItem("ten_zloty",
            new Item(new FabricItemSettings()));
    public static final Item Zloty20 = registerItem("twenty_zloty",
            new Item(new FabricItemSettings()));
    public static final Item Zloty50 = registerItem("fifty_zloty",
            new Item(new FabricItemSettings()));
    public static final Item Zloty100 = registerItem("hundred_zloty",
            new Item(new FabricItemSettings()));
    public static final Item Zloty200 = registerItem("two_hundred_zloty",
            new Item(new FabricItemSettings()));
    public static final Item Zloty500 = registerItem("five_hundred_zloty",
            new Item(new FabricItemSettings()));

    public static final Item RSD1 = registerItem("one_rs_dinar",
            new Item(new FabricItemSettings()));
    public static final Item RSD2 = registerItem("two_rs_dinar",
            new Item(new FabricItemSettings()));
    public static final Item RSD5 = registerItem("five_rs_dinar",
            new Item(new FabricItemSettings()));
    public static final Item RSD10 = registerItem("ten_rs_dinar",
            new Item(new FabricItemSettings()));
    public static final Item RSD20 = registerItem("twenty_rs_dinar",
            new Item(new FabricItemSettings()));
    public static final Item RSD50 = registerItem("fifty_rs_dinar",
            new Item(new FabricItemSettings()));
    public static final Item RSD100 = registerItem("hundred_rs_dinar",
            new Item(new FabricItemSettings()));
    public static final Item RSD200 = registerItem("two_hundred_rs_dinar",
            new Item(new FabricItemSettings()));
    public static final Item RSD500 = registerItem("five_hundred_rs_dinar",
            new Item(new FabricItemSettings()));
    public static final Item RSD1000 = registerItem("thousand_rs_dinar",
            new Item(new FabricItemSettings()));
    public static final Item RSD2000 = registerItem("two_thousand_rs_dinar",
            new Item(new FabricItemSettings()));
    public static final Item RSD5000 = registerItem("five_thousand_rs_dinar",
            new Item(new FabricItemSettings()));

    public static final Item SEkr1 = registerItem("one_se_krone",
            new Item(new FabricItemSettings()));
    public static final Item SEkr2 = registerItem("two_se_krone",
            new Item(new FabricItemSettings()));
    public static final Item SEkr5 = registerItem("five_se_krone",
            new Item(new FabricItemSettings()));
    public static final Item SEkr10 = registerItem("ten_se_krone",
            new Item(new FabricItemSettings()));
    public static final Item SEkr20 = registerItem("twenty_se_krone",
            new Item(new FabricItemSettings()));
    public static final Item SEkr50 = registerItem("fifty_se_krone",
            new Item(new FabricItemSettings()));
    public static final Item SEkr100 = registerItem("hundred_se_krone",
            new Item(new FabricItemSettings()));
    public static final Item SEkr200 = registerItem("two_hundred_se_krone",
            new Item(new FabricItemSettings()));
    public static final Item SEkr500 = registerItem("five_hundred_se_krone",
            new Item(new FabricItemSettings()));
    public static final Item SEkr1000 = registerItem("thousand_se_krone",
            new Item(new FabricItemSettings()));

    public static final Item ISkr1 = registerItem("one_is_krone",
            new Item(new FabricItemSettings()));
    public static final Item ISkr5 = registerItem("five_is_krone",
            new Item(new FabricItemSettings()));
    public static final Item ISkr10 = registerItem("ten_is_krone",
            new Item(new FabricItemSettings()));
    public static final Item ISkr50 = registerItem("fifty_is_krone",
            new Item(new FabricItemSettings()));
    public static final Item ISkr100 = registerItem("hundred_is_krone",
            new Item(new FabricItemSettings()));

    public static final Item ISkr500 = registerItem("five_hundred_is_krone",
            new Item(new FabricItemSettings()));
    public static final Item ISkr1000 = registerItem("thousand_is_krone",
            new Item(new FabricItemSettings()));
    public static final Item ISkr2000 = registerItem("two_thousand_is_krone",
            new Item(new FabricItemSettings()));
    public static final Item ISkr5000 = registerItem("five_thousand_is_krone",
            new Item(new FabricItemSettings()));
    public static final Item ISkr10000 = registerItem("ten_thousand_is_krone",
            new Item(new FabricItemSettings()));

    public static final Item INr1 = registerItem("one_in_rupee",
            new Item(new FabricItemSettings()));
    public static final Item INr2 = registerItem("two_in_rupees",
            new Item(new FabricItemSettings()));
    public static final Item INr5 = registerItem("five_in_rupees",
            new Item(new FabricItemSettings()));
    public static final Item INr10 = registerItem("ten_in_rupees",
            new Item(new FabricItemSettings()));
    public static final Item INr20 = registerItem("twenty_in_rupees",
            new Item(new FabricItemSettings()));
    public static final Item INr50 = registerItem("fifty_in_rupees",
            new Item(new FabricItemSettings()));
    public static final Item INr100 = registerItem("hundred_in_rupees",
            new Item(new FabricItemSettings()));
    public static final Item INr200 = registerItem("two_hundred_in_rupees",
            new Item(new FabricItemSettings()));
    public static final Item INr500 = registerItem("five_hundred_in_rupees",
            new Item(new FabricItemSettings()));

    public static final Item Won10 = registerItem("ten_kr_won",
            new Item(new FabricItemSettings()));
    public static final Item Won50 = registerItem("fifty_kr_won",
            new Item(new FabricItemSettings()));
    public static final Item Won100 = registerItem("hundred_kr_won",
            new Item(new FabricItemSettings()));
    public static final Item Won500 = registerItem("five_hundred_kr_won",
            new Item(new FabricItemSettings()));

    public static final Item Won1000 = registerItem("thousand_kr_won",
            new Item(new FabricItemSettings()));
    public static final Item Won5000 = registerItem("five_thousand_kr_won",
            new Item(new FabricItemSettings()));
    public static final Item Won10000 = registerItem("ten_thousand_kr_won",
            new Item(new FabricItemSettings()));
    public static final Item Won50000 = registerItem("fifty_thousand_kr_won",
            new Item(new FabricItemSettings()));


    public static final Item CNJiao1 = registerItem("one_cn_jiao",
            new Item(new FabricItemSettings()));
    public static final Item CNJiao5 = registerItem("five_cn_jiao",
            new Item(new FabricItemSettings()));
    public static final Item CNYuan1 = registerItem("one_cn_yuan",
            new Item(new FabricItemSettings()));
    public static final Item CNYuan5 = registerItem("five_cn_yuan",
            new Item(new FabricItemSettings()));
    public static final Item CNYuan10 = registerItem("ten_cn_yuan",
            new Item(new FabricItemSettings()));
    public static final Item CNYuan20 = registerItem("twenty_cn_yuan",
            new Item(new FabricItemSettings()));
    public static final Item CNYuan50 = registerItem("fifty_cn_yuan",
            new Item(new FabricItemSettings()));
    public static final Item CNYuan100 = registerItem("hundred_cn_yuan",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MoneyMod.MOD_ID, name), item);
    }

    public static void registerModItems() {

        MoneyMod.LOGGER.debug("Registering Mod Items for " + MoneyMod.MOD_ID);
    }
}