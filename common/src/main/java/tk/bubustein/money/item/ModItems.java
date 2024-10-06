package tk.bubustein.money.item;

import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import tk.bubustein.money.MoneyExpectPlatform;
import tk.bubustein.money.MoneyMod;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Supplier;
@SuppressWarnings("UnstableApiUsage")
public class ModItems {
    public static void init(){}
    /*
     * ////////////////////////////////////////////////////
     * //////////////// COINS TAB ///////////////////////
     * /////////////// BUBUSTEIN's MONEY MOD //////////////
     * ////////////////////////////////////////////////////
     * ////////////////////////////////////////////////////
     * */
    public static final Supplier<Item> Ecent1 = MoneyExpectPlatform.registerItem("one_ecent",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Ecent2 = MoneyExpectPlatform.registerItem("two_ecents",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Ecent5 = MoneyExpectPlatform.registerItem("five_ecents",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Ecent10 = MoneyExpectPlatform.registerItem("ten_ecents",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Ecent20 = MoneyExpectPlatform.registerItem("twenty_ecents",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Ecent50 = MoneyExpectPlatform.registerItem("fifty_ecents",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Euro1 = MoneyExpectPlatform.registerItem("one_euro",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Euro2 = MoneyExpectPlatform.registerItem("two_euros",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));

    public static final Supplier<Item> Pence1 = MoneyExpectPlatform.registerItem("one_pence",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Pence2 = MoneyExpectPlatform.registerItem("two_pence",
            ()-> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Pence5 = MoneyExpectPlatform.registerItem("five_pence",
            ()-> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Pence10 = MoneyExpectPlatform.registerItem("ten_pence",
            () ->new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Pence20 = MoneyExpectPlatform.registerItem("twenty_pence",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Pence50 = MoneyExpectPlatform.registerItem("fifty_pence",
            ()->  new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Pound1 = MoneyExpectPlatform.registerItem("one_pound",
            ()-> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Pound2 = MoneyExpectPlatform.registerItem("two_pounds",
            ()-> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));

    public static final Supplier<Item> Cent1 = MoneyExpectPlatform.registerItem("one_cent",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Cent5 = MoneyExpectPlatform.registerItem("five_cents",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Cent10 = MoneyExpectPlatform.registerItem("ten_cents",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Cent25 = MoneyExpectPlatform.registerItem("twentyfive_cents",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Cent50 = MoneyExpectPlatform.registerItem("fifty_cents",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));

    public static final Supplier<Item> CCent5 = MoneyExpectPlatform.registerItem("five_ccents",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> CCent10 = MoneyExpectPlatform.registerItem("ten_ccents",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> CCent25 = MoneyExpectPlatform.registerItem("twentyfive_ccents",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Loonie = MoneyExpectPlatform.registerItem("loonie",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Toonie = MoneyExpectPlatform.registerItem("toonie",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));

    public static final Supplier<Item> Ban1 = MoneyExpectPlatform.registerItem("un_ban",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Bani5 = MoneyExpectPlatform.registerItem("cinci_bani",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Bani10 = MoneyExpectPlatform.registerItem("zece_bani",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Bani50 = MoneyExpectPlatform.registerItem("cincizeci_bani",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));

    public static final Supplier<Item> BanMD5 = MoneyExpectPlatform.registerItem("cinci_bani_md",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> BaniMD10 = MoneyExpectPlatform.registerItem("zece_bani_md",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> BaniMD25 = MoneyExpectPlatform.registerItem("douazecicinci_bani_md",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> BaniMD50 = MoneyExpectPlatform.registerItem("cincizeci_bani_md",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> LeuMD1 = MoneyExpectPlatform.registerItem("un_leu_md",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> LeuMD2 = MoneyExpectPlatform.registerItem("doi_lei_md",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> LeiMD5 = MoneyExpectPlatform.registerItem("cinci_lei_md",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> LeiMD10 = MoneyExpectPlatform.registerItem("zece_lei_md",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));

    public static final Supplier<Item> Centimes5 = MoneyExpectPlatform.registerItem("five_centimes",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Centimes10 = MoneyExpectPlatform.registerItem("ten_centimes",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Centimes20 = MoneyExpectPlatform.registerItem("twenty_centimes",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> HalfFranc = MoneyExpectPlatform.registerItem("half_franc",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Franc1 = MoneyExpectPlatform.registerItem("one_franc",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Franc2 = MoneyExpectPlatform.registerItem("two_francs",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Franc5 = MoneyExpectPlatform.registerItem("five_francs",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));

    public static final Supplier<Item> ACent5 = MoneyExpectPlatform.registerItem("five_acents",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> ACent10 = MoneyExpectPlatform.registerItem("ten_acents",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> ACent20 = MoneyExpectPlatform.registerItem("twenty_acents",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> ACent50 = MoneyExpectPlatform.registerItem("fifty_acents",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> DollarA1 = MoneyExpectPlatform.registerItem("one_adollar",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> DollarA2 = MoneyExpectPlatform.registerItem("two_adollars",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));

    public static final Supplier<Item> Yen1 = MoneyExpectPlatform.registerItem("one_yen",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Yen5 = MoneyExpectPlatform.registerItem("five_yen",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Yen10 = MoneyExpectPlatform.registerItem("ten_yen",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Yen50 = MoneyExpectPlatform.registerItem("fifty_yen",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Yen100 = MoneyExpectPlatform.registerItem("hundred_yen",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Yen500 = MoneyExpectPlatform.registerItem("five_hundred_yen",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));

    public static final Supplier<Item> Stotinka1 = MoneyExpectPlatform.registerItem("one_stotinka",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Stotinka2 = MoneyExpectPlatform.registerItem("two_stotinki",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Stotinka5 = MoneyExpectPlatform.registerItem("five_stotinki",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Stotinka10 = MoneyExpectPlatform.registerItem("ten_stotinki",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Stotinka20 = MoneyExpectPlatform.registerItem("twenty_stotinki",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Stotinka50 = MoneyExpectPlatform.registerItem("fifty_stotinki",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Leva1 = MoneyExpectPlatform.registerItem("one_lev",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Leva2 = MoneyExpectPlatform.registerItem("two_leva",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));

    public static final Supplier<Item> CZkr1 = MoneyExpectPlatform.registerItem("one_cz_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> CZkr2 = MoneyExpectPlatform.registerItem("two_cz_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> CZkr5 = MoneyExpectPlatform.registerItem("five_cz_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> CZkr10 = MoneyExpectPlatform.registerItem("ten_cz_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> CZkr20 = MoneyExpectPlatform.registerItem("twenty_cz_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> CZkr50 = MoneyExpectPlatform.registerItem("fifty_cz_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));

    public static final Supplier<Item> DKAere50 = MoneyExpectPlatform.registerItem("fifty_aere_dk",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> DKkr1 = MoneyExpectPlatform.registerItem("one_dk_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> DKkr2 = MoneyExpectPlatform.registerItem("two_dk_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> DKkr5 = MoneyExpectPlatform.registerItem("five_dk_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> DKkr10 = MoneyExpectPlatform.registerItem("ten_dk_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> DKkr20 = MoneyExpectPlatform.registerItem("twenty_dk_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));

    public static final Supplier<Item> Ft5 = MoneyExpectPlatform.registerItem("five_ft",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Ft10 = MoneyExpectPlatform.registerItem("ten_ft",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Ft20 = MoneyExpectPlatform.registerItem("twenty_ft",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Ft50 = MoneyExpectPlatform.registerItem("fifty_ft",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Ft100 = MoneyExpectPlatform.registerItem("hundred_ft",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Ft200 = MoneyExpectPlatform.registerItem("two_hundred_ft",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));

    public static final Supplier<Item> NOkr1 = MoneyExpectPlatform.registerItem("one_no_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> NOkr5 = MoneyExpectPlatform.registerItem("five_no_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> NOkr10 = MoneyExpectPlatform.registerItem("ten_no_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> NOkr20 = MoneyExpectPlatform.registerItem("twenty_no_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));

    public static final Supplier<Item> Grosz1 = MoneyExpectPlatform.registerItem("one_grosz",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Grosz2 = MoneyExpectPlatform.registerItem("two_grosze",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Grosz5 = MoneyExpectPlatform.registerItem("five_groszy",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Grosz10 = MoneyExpectPlatform.registerItem("ten_groszy",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Grosz20 = MoneyExpectPlatform.registerItem("twenty_groszy",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Grosz50 = MoneyExpectPlatform.registerItem("fifty_groszy",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Zloty1 = MoneyExpectPlatform.registerItem("one_zloty",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Zloty2 = MoneyExpectPlatform.registerItem("two_zloty",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Zloty5 = MoneyExpectPlatform.registerItem("five_zloty",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));

    public static final Supplier<Item> RSD1 = MoneyExpectPlatform.registerItem("one_rs_dinar",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> RSD2 = MoneyExpectPlatform.registerItem("two_rs_dinar",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> RSD5 = MoneyExpectPlatform.registerItem("five_rs_dinar",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));

    public static final Supplier<Item> SEkr1 = MoneyExpectPlatform.registerItem("one_se_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> SEkr2 = MoneyExpectPlatform.registerItem("two_se_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> SEkr5 = MoneyExpectPlatform.registerItem("five_se_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> SEkr10 = MoneyExpectPlatform.registerItem("ten_se_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));

    public static final Supplier<Item> ISkr1 = MoneyExpectPlatform.registerItem("one_is_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> ISkr5 = MoneyExpectPlatform.registerItem("five_is_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> ISkr10 = MoneyExpectPlatform.registerItem("ten_is_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> ISkr50 = MoneyExpectPlatform.registerItem("fifty_is_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> ISkr100 = MoneyExpectPlatform.registerItem("hundred_is_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));

    public static final Supplier<Item> INr1 = MoneyExpectPlatform.registerItem("one_in_rupee",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> INr2 = MoneyExpectPlatform.registerItem("two_in_rupees",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> INr5 = MoneyExpectPlatform.registerItem("five_in_rupees",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> INr10 = MoneyExpectPlatform.registerItem("ten_in_rupees",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> INr20 = MoneyExpectPlatform.registerItem("twenty_in_rupees",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));

    public static final Supplier<Item> Won10 = MoneyExpectPlatform.registerItem("ten_kr_won",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Won50 = MoneyExpectPlatform.registerItem("fifty_kr_won",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Won100 = MoneyExpectPlatform.registerItem("hundred_kr_won",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> Won500 = MoneyExpectPlatform.registerItem("five_hundred_kr_won",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));

    public static final Supplier<Item> CNJiao1 = MoneyExpectPlatform.registerItem("one_cn_jiao",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> CNJiao5 = MoneyExpectPlatform.registerItem("five_cn_jiao",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));

    public static final Supplier<Item> BRCentavo5 = MoneyExpectPlatform.registerItem("five_br_centavos",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> BRCentavo10 = MoneyExpectPlatform.registerItem("ten_br_centavos",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> BRCentavo25 = MoneyExpectPlatform.registerItem("twentyfive_br_centavos",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> BRCentavo50 = MoneyExpectPlatform.registerItem("fifty_br_centavos",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> BRReal1 = MoneyExpectPlatform.registerItem("one_br_real",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));

    public static final Supplier<Item> MXCentavo5 = MoneyExpectPlatform.registerItem("five_mx_centavos",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> MXCentavo10 = MoneyExpectPlatform.registerItem("ten_mx_centavos",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> MXCentavo20 = MoneyExpectPlatform.registerItem("twenty_mx_centavos",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> MXCentavo50 = MoneyExpectPlatform.registerItem("fifty_mx_centavos",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> MXPeso1 = MoneyExpectPlatform.registerItem("one_mx_peso",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> MXPeso2 = MoneyExpectPlatform.registerItem("two_mx_pesos",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> MXPeso5 = MoneyExpectPlatform.registerItem("five_mx_pesos",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> MXPeso10 = MoneyExpectPlatform.registerItem("ten_mx_pesos",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));

    public static final Supplier<Item> ZACent10 = MoneyExpectPlatform.registerItem("ten_za_cents",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> ZACent20 = MoneyExpectPlatform.registerItem("twenty_za_cents",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> ZACent50 = MoneyExpectPlatform.registerItem("fifty_za_cents",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> ZARand1 = MoneyExpectPlatform.registerItem("one_za_rand",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> ZARand2 = MoneyExpectPlatform.registerItem("two_za_rand",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> ZARand5 = MoneyExpectPlatform.registerItem("five_za_rand",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));

    public static final Supplier<Item> TRk1 = MoneyExpectPlatform.registerItem("one_kurus",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> TRk5 = MoneyExpectPlatform.registerItem("five_kurus",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> TRk10 = MoneyExpectPlatform.registerItem("ten_kurus",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> TRk25 = MoneyExpectPlatform.registerItem("twenty_five_kurus",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> TRk50 = MoneyExpectPlatform.registerItem("fifty_kurus",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> TRl1 = MoneyExpectPlatform.registerItem("one_tr_lira",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));

    public static final Supplier<Item> NZCent10 = MoneyExpectPlatform.registerItem("ten_nz_cents",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> NZCent20 = MoneyExpectPlatform.registerItem("twenty_nz_cents",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> NZCent50 = MoneyExpectPlatform.registerItem("fifty_nz_cents",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> NZD1 = MoneyExpectPlatform.registerItem("one_nz_dollar",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> NZD2 = MoneyExpectPlatform.registerItem("two_nz_dollars",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));

    public static final Supplier<Item> PHS1 = MoneyExpectPlatform.registerItem("one_ph_sentimo",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> PHS5 = MoneyExpectPlatform.registerItem("five_ph_sentimo",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> PHS25 = MoneyExpectPlatform.registerItem("twenty_five_ph_sentimo",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> PHP1 = MoneyExpectPlatform.registerItem("one_ph_piso",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> PHP5 = MoneyExpectPlatform.registerItem("five_ph_piso",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    public static final Supplier<Item> PHP10 = MoneyExpectPlatform.registerItem("ten_ph_piso",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.COINS)));
    /*
     * ////////////////////////////////////////////////////
     * //////////////// BANKNOTES TAB ///////////////////////
     * /////////////// BUBUSTEIN's MONEY MOD //////////////
     * ////////////////////////////////////////////////////
     * ////////////////////////////////////////////////////
     * */
    public static final Supplier<Item> Euro5 = MoneyExpectPlatform.registerItem("five_euros",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> Euro10 = MoneyExpectPlatform.registerItem("ten_euros",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> Euro20 = MoneyExpectPlatform.registerItem("twenty_euros",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> Euro50 = MoneyExpectPlatform.registerItem("fifty_euros",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> Euro100 = MoneyExpectPlatform.registerItem("hundred_euros",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> Euro200 = MoneyExpectPlatform.registerItem("two_hundred_euros",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> Euro500 = MoneyExpectPlatform.registerItem("five_hundred_euros",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));

    public static final Supplier<Item> Pound5 = MoneyExpectPlatform.registerItem("five_pounds",
            ()->  new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> Pound10 = MoneyExpectPlatform.registerItem("ten_pounds",
            ()->  new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> Pound20 = MoneyExpectPlatform.registerItem("twenty_pounds",
            ()->  new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> Pound50 = MoneyExpectPlatform.registerItem("fifty_pounds",
            ()->   new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));

    public static final Supplier<Item> Dollar1 = MoneyExpectPlatform.registerItem("one_dollar",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> Dollar5 = MoneyExpectPlatform.registerItem("five_dollars",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> Dollar10 = MoneyExpectPlatform.registerItem("ten_dollars",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> Dollar20 = MoneyExpectPlatform.registerItem("twenty_dollars",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> Dollar50 = MoneyExpectPlatform.registerItem("fifty_dollars",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> Dollar100 = MoneyExpectPlatform.registerItem("hundred_dollars",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));

    public static final Supplier<Item> DollarC5 = MoneyExpectPlatform.registerItem("five_cdollars",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> DollarC10 = MoneyExpectPlatform.registerItem("ten_cdollars",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> DollarC20 = MoneyExpectPlatform.registerItem("twenty_cdollars",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> DollarC50 = MoneyExpectPlatform.registerItem("fifty_cdollars",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> DollarC100 = MoneyExpectPlatform.registerItem("hundred_cdollars",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));

    public static final Supplier<Item> Leu1 = MoneyExpectPlatform.registerItem("un_leu",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> Lei5 = MoneyExpectPlatform.registerItem("cinci_lei",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> Lei10 = MoneyExpectPlatform.registerItem("zece_lei",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> Lei20 = MoneyExpectPlatform.registerItem("douazeci_lei",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> Lei50 = MoneyExpectPlatform.registerItem("cincizeci_lei",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> Lei100 = MoneyExpectPlatform.registerItem("suta_lei",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> Lei200 = MoneyExpectPlatform.registerItem("doua_sute_lei",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> Lei500 = MoneyExpectPlatform.registerItem("cinci_sute_lei",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));

    public static final Supplier<Item> LeiMD20 = MoneyExpectPlatform.registerItem("douazeci_lei_md",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> LeiMD50 = MoneyExpectPlatform.registerItem("cincizeci_lei_md",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> LeiMD100 = MoneyExpectPlatform.registerItem("suta_lei_md",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> LeiMD200 = MoneyExpectPlatform.registerItem("doua_sute_lei_md",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> LeiMD500 = MoneyExpectPlatform.registerItem("cinci_sute_lei_md",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> LeiMD1000 = MoneyExpectPlatform.registerItem("mie_lei_md",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));

    public static final Supplier<Item> Franc10 = MoneyExpectPlatform.registerItem("ten_francs",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> Franc20 = MoneyExpectPlatform.registerItem("twenty_francs",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> Franc50 = MoneyExpectPlatform.registerItem("fifty_francs",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> Franc100 = MoneyExpectPlatform.registerItem("hundred_francs",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> Franc200 = MoneyExpectPlatform.registerItem("two_hundred_francs",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> Franc1000 = MoneyExpectPlatform.registerItem("thousand_francs",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));

    public static final Supplier<Item> DollarA5 = MoneyExpectPlatform.registerItem("five_adollars",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> DollarA10 = MoneyExpectPlatform.registerItem("ten_adollars",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> DollarA20 = MoneyExpectPlatform.registerItem("twenty_adollars",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> DollarA50 = MoneyExpectPlatform.registerItem("fifty_adollars",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> DollarA100 = MoneyExpectPlatform.registerItem("hundred_adollars",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));

    public static final Supplier<Item> Yen1000 = MoneyExpectPlatform.registerItem("thousand_yen",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> Yen5000 = MoneyExpectPlatform.registerItem("five_thousand_yen",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> Yen10000 = MoneyExpectPlatform.registerItem("ten_thousand_yen",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));

    public static final Supplier<Item> Leva5 = MoneyExpectPlatform.registerItem("five_leva",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> Leva10 = MoneyExpectPlatform.registerItem("ten_leva",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> Leva20 = MoneyExpectPlatform.registerItem("twenty_leva",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> Leva50 = MoneyExpectPlatform.registerItem("fifty_leva",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> Leva100 = MoneyExpectPlatform.registerItem("hundred_leva",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));

    public static final Supplier<Item> CZkr100 = MoneyExpectPlatform.registerItem("hundred_cz_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> CZkr200 = MoneyExpectPlatform.registerItem("two_hundred_cz_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> CZkr500 = MoneyExpectPlatform.registerItem("five_hundred_cz_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> CZkr1000 = MoneyExpectPlatform.registerItem("thousand_cz_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> CZkr2000 = MoneyExpectPlatform.registerItem("two_thousand_cz_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> CZkr5000 = MoneyExpectPlatform.registerItem("five_thousand_cz_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));

    public static final Supplier<Item> DKkr50 = MoneyExpectPlatform.registerItem("fifty_dk_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> DKkr100 = MoneyExpectPlatform.registerItem("hundred_dk_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> DKkr200 = MoneyExpectPlatform.registerItem("two_hundred_dk_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> DKkr500 = MoneyExpectPlatform.registerItem("five_hundred_dk_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> DKkr1000 = MoneyExpectPlatform.registerItem("thousand_dk_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));

    public static final Supplier<Item> Ft500 = MoneyExpectPlatform.registerItem("five_hundred_ft",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> Ft1000 = MoneyExpectPlatform.registerItem("thousand_ft",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> Ft2000 = MoneyExpectPlatform.registerItem("two_thousand_ft",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> Ft5000 = MoneyExpectPlatform.registerItem("five_thousand_ft",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> Ft10000 = MoneyExpectPlatform.registerItem("ten_thousand_ft",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> Ft20000 = MoneyExpectPlatform.registerItem("twenty_thousand_ft",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));

    public static final Supplier<Item> NOkr50 = MoneyExpectPlatform.registerItem("fifty_no_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> NOkr100 = MoneyExpectPlatform.registerItem("hundred_no_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> NOkr200 = MoneyExpectPlatform.registerItem("two_hundred_no_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> NOkr500 = MoneyExpectPlatform.registerItem("five_hundred_no_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> NOkr1000 = MoneyExpectPlatform.registerItem("thousand_no_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));

    public static final Supplier<Item> Zloty10 = MoneyExpectPlatform.registerItem("ten_zloty",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> Zloty20 = MoneyExpectPlatform.registerItem("twenty_zloty",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> Zloty50 = MoneyExpectPlatform.registerItem("fifty_zloty",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> Zloty100 = MoneyExpectPlatform.registerItem("hundred_zloty",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> Zloty200 = MoneyExpectPlatform.registerItem("two_hundred_zloty",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> Zloty500 = MoneyExpectPlatform.registerItem("five_hundred_zloty",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));

    public static final Supplier<Item> RSD10 = MoneyExpectPlatform.registerItem("ten_rs_dinar",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> RSD20 = MoneyExpectPlatform.registerItem("twenty_rs_dinar",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> RSD50 = MoneyExpectPlatform.registerItem("fifty_rs_dinar",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> RSD100 = MoneyExpectPlatform.registerItem("hundred_rs_dinar",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> RSD200 = MoneyExpectPlatform.registerItem("two_hundred_rs_dinar",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> RSD500 = MoneyExpectPlatform.registerItem("five_hundred_rs_dinar",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> RSD1000 = MoneyExpectPlatform.registerItem("thousand_rs_dinar",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> RSD2000 = MoneyExpectPlatform.registerItem("two_thousand_rs_dinar",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> RSD5000 = MoneyExpectPlatform.registerItem("five_thousand_rs_dinar",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));

    public static final Supplier<Item> SEkr20 = MoneyExpectPlatform.registerItem("twenty_se_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> SEkr50 = MoneyExpectPlatform.registerItem("fifty_se_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> SEkr100 = MoneyExpectPlatform.registerItem("hundred_se_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> SEkr200 = MoneyExpectPlatform.registerItem("two_hundred_se_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> SEkr500 = MoneyExpectPlatform.registerItem("five_hundred_se_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> SEkr1000 = MoneyExpectPlatform.registerItem("thousand_se_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));

    public static final Supplier<Item> ISkr500 = MoneyExpectPlatform.registerItem("five_hundred_is_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> ISkr1000 = MoneyExpectPlatform.registerItem("thousand_is_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> ISkr2000 = MoneyExpectPlatform.registerItem("two_thousand_is_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> ISkr5000 = MoneyExpectPlatform.registerItem("five_thousand_is_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> ISkr10000 = MoneyExpectPlatform.registerItem("ten_thousand_is_krone",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));

    public static final Supplier<Item> INr50 = MoneyExpectPlatform.registerItem("fifty_in_rupees",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> INr100 = MoneyExpectPlatform.registerItem("hundred_in_rupees",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> INr200 = MoneyExpectPlatform.registerItem("two_hundred_in_rupees",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> INr500 = MoneyExpectPlatform.registerItem("five_hundred_in_rupees",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));

    public static final Supplier<Item> Won1000 = MoneyExpectPlatform.registerItem("thousand_kr_won",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> Won5000 = MoneyExpectPlatform.registerItem("five_thousand_kr_won",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> Won10000 = MoneyExpectPlatform.registerItem("ten_thousand_kr_won",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> Won50000 = MoneyExpectPlatform.registerItem("fifty_thousand_kr_won",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));

    public static final Supplier<Item> CNYuan1 = MoneyExpectPlatform.registerItem("one_cn_yuan",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> CNYuan5 = MoneyExpectPlatform.registerItem("five_cn_yuan",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> CNYuan10 = MoneyExpectPlatform.registerItem("ten_cn_yuan",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> CNYuan20 = MoneyExpectPlatform.registerItem("twenty_cn_yuan",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> CNYuan50 = MoneyExpectPlatform.registerItem("fifty_cn_yuan",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> CNYuan100 = MoneyExpectPlatform.registerItem("hundred_cn_yuan",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));

    public static final Supplier<Item> BRReal2 = MoneyExpectPlatform.registerItem("two_br_reais",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> BRReal5 = MoneyExpectPlatform.registerItem("five_br_reais",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> BRReal10 = MoneyExpectPlatform.registerItem("ten_br_reais",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> BRReal20 = MoneyExpectPlatform.registerItem("twenty_br_reais",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> BRReal50 = MoneyExpectPlatform.registerItem("fifty_br_reais",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> BRReal100 = MoneyExpectPlatform.registerItem("hundred_br_reais",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> BRReal200 = MoneyExpectPlatform.registerItem("two_hundred_br_reais",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));

    public static final Supplier<Item> MXPeso20 = MoneyExpectPlatform.registerItem("twenty_mx_pesos",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> MXPeso50 = MoneyExpectPlatform.registerItem("fifty_mx_pesos",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> MXPeso100 = MoneyExpectPlatform.registerItem("hundred_mx_pesos",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> MXPeso200 = MoneyExpectPlatform.registerItem("two_hundred_mx_pesos",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> MXPeso500 = MoneyExpectPlatform.registerItem("five_hundred_mx_pesos",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> MXPeso1000 = MoneyExpectPlatform.registerItem("thousand_mx_pesos",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));

    public static final Supplier<Item> ZARand10 = MoneyExpectPlatform.registerItem("ten_za_rand",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> ZARand20 = MoneyExpectPlatform.registerItem("twenty_za_rand",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> ZARand50 = MoneyExpectPlatform.registerItem("fifty_za_rand",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> ZARand100 = MoneyExpectPlatform.registerItem("hundred_za_rand",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> ZARand200 = MoneyExpectPlatform.registerItem("two_hundred_za_rand",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));

    public static final Supplier<Item> TRl5 = MoneyExpectPlatform.registerItem("five_tr_lira",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> TRl10 = MoneyExpectPlatform.registerItem("ten_tr_lira",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> TRl20 = MoneyExpectPlatform.registerItem("twenty_tr_lira",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> TRl50 = MoneyExpectPlatform.registerItem("fifty_tr_lira",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> TRl100 = MoneyExpectPlatform.registerItem("hundred_tr_lira",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> TRl200 = MoneyExpectPlatform.registerItem("two_hundred_tr_lira",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));

    public static final Supplier<Item> NZD5 = MoneyExpectPlatform.registerItem("five_nz_dollars",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> NZD10 = MoneyExpectPlatform.registerItem("ten_nz_dollars",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> NZD20 = MoneyExpectPlatform.registerItem("twenty_nz_dollars",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> NZD50 = MoneyExpectPlatform.registerItem("fifty_nz_dollars",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> NZD100 = MoneyExpectPlatform.registerItem("hundred_nz_dollars",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));

    public static final Supplier<Item> PHP20 = MoneyExpectPlatform.registerItem("twenty_ph_piso",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> PHP50 = MoneyExpectPlatform.registerItem("fifty_ph_piso",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> PHP100 = MoneyExpectPlatform.registerItem("hundred_ph_piso",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> PHP200 = MoneyExpectPlatform.registerItem("two_hundred_ph_piso",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> PHP500 = MoneyExpectPlatform.registerItem("five_hundred_ph_piso",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    public static final Supplier<Item> PHP1000 = MoneyExpectPlatform.registerItem("thousand_ph_piso",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.BANKNOTES)));
    /*
    * ////////////////////////////////////////////////////
    * //////////////// SPECIAL TAB ///////////////////////
    * /////////////// BUBUSTEIN's MONEY MOD //////////////
    * ////////////////////////////////////////////////////
    * ////////////////////////////////////////////////////
    * */
    public static final Supplier<Item> B1 = MoneyExpectPlatform.registerItem("un_ban_1900",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.SPECIAL).rarity(Rarity.UNCOMMON)));
    public static final Supplier<Item> B2 = MoneyExpectPlatform.registerItem("doi_bani_1900",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.SPECIAL).rarity(Rarity.UNCOMMON)));
    public static final Supplier<Item> B5 = MoneyExpectPlatform.registerItem("cinci_bani_1900",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.SPECIAL).rarity(Rarity.UNCOMMON)));
    public static final Supplier<Item> B10 = MoneyExpectPlatform.registerItem("zece_bani_1900",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.SPECIAL).rarity(Rarity.UNCOMMON)));
    public static final Supplier<Item> B20 = MoneyExpectPlatform.registerItem("douazeci_bani_1900",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.SPECIAL).rarity(Rarity.UNCOMMON)));
    public static final Supplier<Item> B50 = MoneyExpectPlatform.registerItem("cincizeci_bani_1900",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.SPECIAL).rarity(Rarity.UNCOMMON)));
    public static final Supplier<Item> L1 = MoneyExpectPlatform.registerItem("un_leu_1900",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.SPECIAL).rarity(Rarity.UNCOMMON)));
    public static final Supplier<Item> L2 = MoneyExpectPlatform.registerItem("doi_lei_1900",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.SPECIAL).rarity(Rarity.UNCOMMON)));
    public static final Supplier<Item> L5 = MoneyExpectPlatform.registerItem("cinci_lei_1900",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.SPECIAL).rarity(Rarity.RARE)));
    public static final Supplier<Item> L12 = MoneyExpectPlatform.registerItem("douasprezece_lei_1900",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.SPECIAL).rarity(Rarity.RARE)));
    public static final Supplier<Item> L20 = MoneyExpectPlatform.registerItem("douazeci_lei_1900",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.SPECIAL).rarity(Rarity.RARE)));
    public static final Supplier<Item> L25 = MoneyExpectPlatform.registerItem("douazeci_cinci_lei_1900",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.SPECIAL).rarity(Rarity.RARE).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE,true)));
    public static final Supplier<Item> L50 = MoneyExpectPlatform.registerItem("cincizeci_lei_1900",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.SPECIAL).rarity(Rarity.EPIC).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)));
    public static final Supplier<Item> L100 = MoneyExpectPlatform.registerItem("suta_lei_1900",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.SPECIAL).rarity(Rarity.EPIC).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)));

    public static final Supplier<Item> VisaClassic = MoneyExpectPlatform.registerItem("card_classic",
            () -> new CardItem(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON).arch$tab(MoneyMod.SPECIAL)));
    public static final Supplier<Item> VisaGold = MoneyExpectPlatform.registerItem("card_gold",
            () -> new CardItem(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).arch$tab(MoneyMod.SPECIAL)));
    public static final Supplier<Item> VisaSteel = MoneyExpectPlatform.registerItem("card_steel",
            () -> new CardItem(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC).arch$tab(MoneyMod.SPECIAL)));
    public static final Supplier<Item> SpecialPaper = MoneyExpectPlatform.registerItem("special_paper",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.SPECIAL)));

    public static final Map<String, Double> EXCHANGE_RATES = new HashMap<>();
    static {
        // EXCHANGE RATES FROM EUR TO OTHER - LAST UPDATED ON 5th OCTOBER
        EXCHANGE_RATES.put("EUR", 1.0);
        EXCHANGE_RATES.put("USD", 1.1);
        EXCHANGE_RATES.put("GBP", 0.84);
        EXCHANGE_RATES.put("CAD", 1.49);
        EXCHANGE_RATES.put("RON", 4.97);
        EXCHANGE_RATES.put("MDL", 19.17);
        EXCHANGE_RATES.put("CHF", 0.94);
        EXCHANGE_RATES.put("AUD", 1.61);
        EXCHANGE_RATES.put("JPY", 163.26);
        EXCHANGE_RATES.put("BGN", 1.96);
        EXCHANGE_RATES.put("CZK", 25.35);
        EXCHANGE_RATES.put("NOK", 11.7);
        EXCHANGE_RATES.put("DKK", 7.46);
        EXCHANGE_RATES.put("SEK", 11.38);
        EXCHANGE_RATES.put("HUF", 401.51);
        EXCHANGE_RATES.put("PLN", 4.32);
        EXCHANGE_RATES.put("RSD", 117.04);
        EXCHANGE_RATES.put("ISK", 148.93);
        EXCHANGE_RATES.put("CNY", 7.74);
        EXCHANGE_RATES.put("INR",92.25);
        EXCHANGE_RATES.put("KRW", 1478.6);
        EXCHANGE_RATES.put("BRL", 5.99);
        EXCHANGE_RATES.put("MXN", 21.17);
        EXCHANGE_RATES.put("ZAR", 19.19);
        EXCHANGE_RATES.put("TRY", 37.61);
        EXCHANGE_RATES.put("NZD", 1.78);
        EXCHANGE_RATES.put("PHP", 62.06);
    }
    public static final Map<String, TreeMap<Double, Item>> CURRENCY_ITEMS = new HashMap<>();
    static {
        // Euro
        TreeMap<Double, Item> euroItems = new TreeMap<>(Comparator.reverseOrder());
        euroItems.put(500.0, Euro500.get());
        euroItems.put(200.0, Euro200.get());
        euroItems.put(100.0, Euro100.get());
        euroItems.put(50.0, Euro50.get());
        euroItems.put(20.0, Euro20.get());
        euroItems.put(10.0, Euro10.get());
        euroItems.put(5.0, Euro5.get());
        euroItems.put(2.0, Euro2.get());
        euroItems.put(1.0, Euro1.get());
        euroItems.put(0.5, Ecent50.get());
        euroItems.put(0.2, Ecent20.get());
        euroItems.put(0.1, Ecent10.get());
        euroItems.put(0.05, Ecent5.get());
        euroItems.put(0.02, Ecent2.get());
        euroItems.put(0.01, Ecent1.get());
        CURRENCY_ITEMS.put("EUR", euroItems);
        // USD
        TreeMap<Double, Item> usdItems = new TreeMap<>(Comparator.reverseOrder());
        usdItems.put(100.0, Dollar100.get());
        usdItems.put(50.0, Dollar50.get());
        usdItems.put(20.0, Dollar20.get());
        usdItems.put(10.0, Dollar10.get());
        usdItems.put(5.0, Dollar5.get());
        usdItems.put(1.0, Dollar1.get());
        usdItems.put(0.5, Cent50.get());
        usdItems.put(0.25, Cent25.get());
        usdItems.put(0.1, Cent10.get());
        usdItems.put(0.05, Cent5.get());
        usdItems.put(0.01, Cent1.get());
        CURRENCY_ITEMS.put("USD", usdItems);
        // RON
        TreeMap<Double, Item> ronItems = new TreeMap<>(Comparator.reverseOrder());
        ronItems.put(500.0, Lei500.get());
        ronItems.put(200.0, Lei200.get());
        ronItems.put(100.0, Lei100.get());
        ronItems.put(50.0, Lei50.get());
        ronItems.put(20.0, Lei20.get());
        ronItems.put(10.0, Lei10.get());
        ronItems.put(5.0, Lei5.get());
        ronItems.put(1.0, Leu1.get());
        ronItems.put(0.5, Bani50.get());
        ronItems.put(0.1, Bani10.get());
        ronItems.put(0.05, Bani5.get());
        ronItems.put(0.01, Ban1.get());
        CURRENCY_ITEMS.put("RON", ronItems);
        // GBP
        TreeMap<Double, Item> gbpItems = new TreeMap<>(Comparator.reverseOrder());
        gbpItems.put(50.0, Pound50.get());
        gbpItems.put(20.0, Pound20.get());
        gbpItems.put(10.0, Pound10.get());
        gbpItems.put(5.0, Pound5.get());
        gbpItems.put(2.0, Pound2.get());
        gbpItems.put(1.0, Pound1.get());
        gbpItems.put(0.5, Pence50.get());
        gbpItems.put(0.2, Pence20.get());
        gbpItems.put(0.1, Pence10.get());
        gbpItems.put(0.05, Pence5.get());
        gbpItems.put(0.02, Pence2.get());
        gbpItems.put(0.01, Pence1.get());
        CURRENCY_ITEMS.put("GBP", gbpItems);
        // CAD
        TreeMap<Double, Item> cadItems = new TreeMap<>(Comparator.reverseOrder());
        cadItems.put(100.0, DollarC100.get());
        cadItems.put(50.0, DollarC50.get());
        cadItems.put(20.0, DollarC20.get());
        cadItems.put(10.0, DollarC10.get());
        cadItems.put(5.0, DollarC5.get());
        cadItems.put(2.0, Toonie.get());
        cadItems.put(1.0, Loonie.get());
        cadItems.put(0.25, CCent25.get());
        cadItems.put(0.1, CCent10.get());
        cadItems.put(0.05, CCent5.get());
        CURRENCY_ITEMS.put("CAD", cadItems);
        // MDL
        TreeMap<Double, Item> mdlItems = new TreeMap<>(Comparator.reverseOrder());
        mdlItems.put(1000.0, LeiMD1000.get());
        mdlItems.put(500.0, LeiMD500.get());
        mdlItems.put(200.0, LeiMD200.get());
        mdlItems.put(100.0, LeiMD100.get());
        mdlItems.put(50.0, LeiMD50.get());
        mdlItems.put(20.0, LeiMD20.get());
        mdlItems.put(10.0, LeiMD10.get());
        mdlItems.put(5.0, LeiMD5.get());
        mdlItems.put(2.0, LeuMD2.get());
        mdlItems.put(1.0, LeuMD1.get());
        mdlItems.put(0.5, BaniMD50.get());
        mdlItems.put(0.25, BaniMD25.get());
        mdlItems.put(0.1, BaniMD10.get());
        mdlItems.put(0.05, BanMD5.get());
        CURRENCY_ITEMS.put("MDL", mdlItems);
        // CHF
        TreeMap<Double, Item> chfItems = new TreeMap<>(Comparator.reverseOrder());
        chfItems.put(1000.0, Franc1000.get());
        chfItems.put(200.0, Franc200.get());
        chfItems.put(100.0, Franc100.get());
        chfItems.put(50.0, Franc50.get());
        chfItems.put(20.0, Franc20.get());
        chfItems.put(10.0, Franc10.get());
        chfItems.put(5.0, Franc5.get());
        chfItems.put(2.0, Franc2.get());
        chfItems.put(1.0, Franc1.get());
        chfItems.put(0.5, HalfFranc.get());
        chfItems.put(0.2, Centimes20.get());
        chfItems.put(0.1, Centimes10.get());
        chfItems.put(0.05, Centimes5.get());
        CURRENCY_ITEMS.put("CHF", chfItems);
        // AUD
        TreeMap<Double, Item> audItems = new TreeMap<>(Comparator.reverseOrder());
        audItems.put(100.0, DollarA100.get());
        audItems.put(50.0, DollarA50.get());
        audItems.put(20.0, DollarA20.get());
        audItems.put(10.0, Dollar10.get());
        audItems.put(5.0, DollarA5.get());
        audItems.put(2.0, DollarA2.get());
        audItems.put(1.0, DollarA1.get());
        audItems.put(0.5, ACent50.get());
        audItems.put(0.2, ACent20.get());
        audItems.put(0.1, ACent10.get());
        audItems.put(0.05, ACent5.get());
        CURRENCY_ITEMS.put("AUD", audItems);
        // JPY
        TreeMap<Double, Item> jpyItems = new TreeMap<>(Comparator.reverseOrder());
        jpyItems.put(10000.0, Yen10000.get());
        jpyItems.put(5000.0, Yen5000.get());
        jpyItems.put(1000.0, Yen1000.get());
        jpyItems.put(500.0, Yen500.get());
        jpyItems.put(100.0, Yen100.get());
        jpyItems.put(50.0, Yen50.get());
        jpyItems.put(10.0, Yen10.get());
        jpyItems.put(5.0, Yen5.get());
        jpyItems.put(1.0, Yen1.get());
        CURRENCY_ITEMS.put("JPY", jpyItems);
        // BGN
        TreeMap<Double, Item> bgnItems = new TreeMap<>(Comparator.reverseOrder());
        bgnItems.put(100.0, Leva100.get());
        bgnItems.put(50.0, Leva50.get());
        bgnItems.put(20.0, Leva20.get());
        bgnItems.put(10.0, Leva10.get());
        bgnItems.put(5.0, Leva5.get());
        bgnItems.put(2.0, Leva2.get());
        bgnItems.put(1.0, Leva1.get());
        bgnItems.put(0.5, Stotinka50.get());
        bgnItems.put(0.2, Stotinka20.get());
        bgnItems.put(0.1, Stotinka10.get());
        bgnItems.put(0.05, Stotinka5.get());
        bgnItems.put(0.02, Stotinka2.get());
        bgnItems.put(0.01, Stotinka1.get());
        CURRENCY_ITEMS.put("BGN", bgnItems);
        // CZK
        TreeMap<Double, Item> czkItems = new TreeMap<>(Comparator.reverseOrder());
        czkItems.put(5000.0, CZkr5000.get());
        czkItems.put(2000.0, CZkr2000.get());
        czkItems.put(1000.0, CZkr1000.get());
        czkItems.put(500.0, CZkr500.get());
        czkItems.put(200.0, CZkr200.get());
        czkItems.put(100.0, CZkr100.get());
        czkItems.put(50.0, CZkr50.get());
        czkItems.put(20.0, CZkr20.get());
        czkItems.put(10.0, CZkr10.get());
        czkItems.put(5.0, CZkr5.get());
        czkItems.put(2.0, CZkr2.get());
        czkItems.put(1.0, CZkr1.get());
        CURRENCY_ITEMS.put("CZK", czkItems);
        // NOK
        TreeMap<Double, Item> nokItems = new TreeMap<>(Comparator.reverseOrder());
        nokItems.put(1000.0, NOkr1000.get());
        nokItems.put(500.0, NOkr500.get());
        nokItems.put(200.0, NOkr200.get());
        nokItems.put(100.0, NOkr100.get());
        nokItems.put(50.0, NOkr50.get());
        nokItems.put(20.0, NOkr20.get());
        nokItems.put(10.0, NOkr10.get());
        nokItems.put(5.0, NOkr5.get());
        nokItems.put(1.0, NOkr1.get());
        CURRENCY_ITEMS.put("NOK", nokItems);
        // DKK
        TreeMap<Double, Item> dkkItems = new TreeMap<>(Comparator.reverseOrder());
        dkkItems.put(1000.0, DKkr1000.get());
        dkkItems.put(500.0, DKkr500.get());
        dkkItems.put(200.0, DKkr200.get());
        dkkItems.put(100.0, DKkr100.get());
        dkkItems.put(50.0, DKkr50.get());
        dkkItems.put(20.0, DKkr20.get());
        dkkItems.put(10.0, DKkr10.get());
        dkkItems.put(5.0, DKkr5.get());
        dkkItems.put(2.0, DKkr2.get());
        dkkItems.put(1.0, DKkr1.get());
        dkkItems.put(0.5, DKAere50.get());
        CURRENCY_ITEMS.put("DKK", dkkItems);
        // HUF
        TreeMap<Double, Item> hufItems = new TreeMap<>(Comparator.reverseOrder());
        hufItems.put(20000.0, Ft20000.get());
        hufItems.put(10000.0, Ft10000.get());
        hufItems.put(5000.0, Ft5000.get());
        hufItems.put(2000.0, Ft2000.get());
        hufItems.put(1000.0, Ft1000.get());
        hufItems.put(500.0, Ft500.get());
        hufItems.put(200.0, Ft200.get());
        hufItems.put(100.0, Ft100.get());
        hufItems.put(50.0, Ft50.get());
        hufItems.put(20.0, Ft20.get());
        hufItems.put(10.0, Ft10.get());
        hufItems.put(5.0, Ft5.get());
        CURRENCY_ITEMS.put("HUF", hufItems);
        // PLN
        TreeMap<Double, Item> plnItems = new TreeMap<>(Comparator.reverseOrder());
        plnItems.put(500.0, Zloty500.get());
        plnItems.put(200.0, Zloty200.get());
        plnItems.put(100.0, Zloty100.get());
        plnItems.put(50.0, Zloty50.get());
        plnItems.put(20.0, Zloty20.get());
        plnItems.put(10.0, Zloty10.get());
        plnItems.put(5.0, Zloty5.get());
        plnItems.put(2.0, Zloty2.get());
        plnItems.put(1.0, Zloty1.get());
        plnItems.put(0.5, Grosz50.get());
        plnItems.put(0.2, Grosz20.get());
        plnItems.put(0.1, Grosz10.get());
        plnItems.put(0.05, Grosz5.get());
        plnItems.put(0.02, Grosz2.get());
        plnItems.put(0.01, Grosz1.get());
        CURRENCY_ITEMS.put("PLN", plnItems);
        // RSD
        TreeMap<Double, Item> rsdItems = new TreeMap<>(Comparator.reverseOrder());
        rsdItems.put(5000.0, RSD5000.get());
        rsdItems.put(2000.0, RSD2000.get());
        rsdItems.put(1000.0, RSD1000.get());
        rsdItems.put(500.0, RSD500.get());
        rsdItems.put(200.0, RSD200.get());
        rsdItems.put(100.0, RSD100.get());
        rsdItems.put(50.0, RSD50.get());
        rsdItems.put(20.0, RSD20.get());
        rsdItems.put(10.0, RSD10.get());
        rsdItems.put(5.0, RSD5.get());
        rsdItems.put(2.0, RSD2.get());
        rsdItems.put(1.0, RSD1.get());
        CURRENCY_ITEMS.put("RSD", rsdItems);
        // SEK
        TreeMap<Double, Item> sekItems = new TreeMap<>(Comparator.reverseOrder());
        sekItems.put(1000.0, SEkr1000.get());
        sekItems.put(500.0, SEkr500.get());
        sekItems.put(200.0, SEkr200.get());
        sekItems.put(100.0, SEkr100.get());
        sekItems.put(50.0, SEkr50.get());
        sekItems.put(20.0, SEkr20.get());
        sekItems.put(10.0, SEkr10.get());
        sekItems.put(5.0, SEkr5.get());
        sekItems.put(2.0, SEkr2.get());
        sekItems.put(1.0, SEkr1.get());
        CURRENCY_ITEMS.put("SEK", sekItems);
        // ISK
        TreeMap<Double, Item> iskItems = new TreeMap<>(Comparator.reverseOrder());
        iskItems.put(10000.0, ISkr10000.get());
        iskItems.put(5000.0, ISkr5000.get());
        iskItems.put(2000.0, ISkr2000.get());
        iskItems.put(1000.0, ISkr1000.get());
        iskItems.put(500.0, ISkr500.get());
        iskItems.put(100.0, ISkr100.get());
        iskItems.put(50.0, ISkr50.get());
        iskItems.put(10.0, ISkr10.get());
        iskItems.put(5.0, ISkr5.get());
        iskItems.put(1.0, ISkr1.get());
        CURRENCY_ITEMS.put("ISK", iskItems);
        // INR
        TreeMap<Double, Item> inrItems = new TreeMap<>(Comparator.reverseOrder());
        inrItems.put(500.0, INr500.get());
        inrItems.put(200.0, INr200.get());
        inrItems.put(100.0, INr100.get());
        inrItems.put(50.0, INr50.get());
        inrItems.put(20.0, INr20.get());
        inrItems.put(10.0, INr10.get());
        inrItems.put(5.0, INr5.get());
        inrItems.put(2.0, INr2.get());
        inrItems.put(1.0, INr1.get());
        CURRENCY_ITEMS.put("INR", inrItems);
        // KRW
        TreeMap<Double, Item> krwItems = new TreeMap<>(Comparator.reverseOrder());
        krwItems.put(50000.0, Won50000.get());
        krwItems.put(10000.0, Won10000.get());
        krwItems.put(5000.0, Won5000.get());
        krwItems.put(1000.0, Won1000.get());
        krwItems.put(500.0, Won500.get());
        krwItems.put(100.0, Won100.get());
        krwItems.put(50.0, Won50.get());
        krwItems.put(10.0, Won10.get());
        CURRENCY_ITEMS.put("KRW", krwItems);
        // CNY
        TreeMap<Double, Item> cnyItems = new TreeMap<>(Comparator.reverseOrder());
        cnyItems.put(100.0, CNYuan100.get());
        cnyItems.put(50.0, CNYuan50.get());
        cnyItems.put(20.0, CNYuan20.get());
        cnyItems.put(10.0, CNYuan10.get());
        cnyItems.put(5.0, CNYuan5.get());
        cnyItems.put(1.0, CNYuan1.get());
        cnyItems.put(0.5, CNJiao5.get());
        cnyItems.put(0.1, CNJiao1.get());
        CURRENCY_ITEMS.put("CNY", cnyItems);
        // BRL
        TreeMap<Double, Item> brlItems = new TreeMap<>(Comparator.reverseOrder());
        brlItems.put(200.0, BRReal200.get());
        brlItems.put(100.0, BRReal100.get());
        brlItems.put(50.0, BRReal50.get());
        brlItems.put(20.0, BRReal20.get());
        brlItems.put(10.0, BRReal10.get());
        brlItems.put(5.0, BRReal5.get());
        brlItems.put(2.0, BRReal2.get());
        brlItems.put(1.0, BRReal1.get());
        brlItems.put(0.5, BRCentavo50.get());
        brlItems.put(0.25, BRCentavo25.get());
        brlItems.put(0.1, BRCentavo10.get());
        brlItems.put(0.05, BRCentavo5.get());
        CURRENCY_ITEMS.put("BRL", brlItems);
        // MXN
        TreeMap<Double, Item> mxnItems = new TreeMap<>(Comparator.reverseOrder());
        mxnItems.put(1000.0, MXPeso1000.get());
        mxnItems.put(500.0, MXPeso500.get());
        mxnItems.put(200.0, MXPeso200.get());
        mxnItems.put(100.0, MXPeso100.get());
        mxnItems.put(50.0, MXPeso50.get());
        mxnItems.put(20.0, MXPeso20.get());
        mxnItems.put(10.0, MXPeso10.get());
        mxnItems.put(5.0, MXPeso5.get());
        mxnItems.put(2.0, MXPeso2.get());
        mxnItems.put(1.0, MXPeso1.get());
        mxnItems.put(0.5, MXCentavo50.get());
        mxnItems.put(0.2, MXCentavo20.get());
        mxnItems.put(0.1, MXCentavo10.get());
        mxnItems.put(0.05, MXCentavo5.get());
        CURRENCY_ITEMS.put("MXN", mxnItems);
        // ZAR
        TreeMap<Double, Item> zarItems = new TreeMap<>(Comparator.reverseOrder());
        zarItems.put(200.0, ZARand200.get());
        zarItems.put(100.0, ZARand100.get());
        zarItems.put(50.0, ZARand50.get());
        zarItems.put(20.0, ZARand20.get());
        zarItems.put(10.0, ZARand10.get());
        zarItems.put(5.0, ZARand5.get());
        zarItems.put(2.0, ZARand2.get());
        zarItems.put(1.0, ZARand1.get());
        zarItems.put(0.5, ZACent50.get());
        zarItems.put(0.2, ZACent20.get());
        zarItems.put(0.1, ZACent10.get());
        CURRENCY_ITEMS.put("ZAR", zarItems);
        // TRY
        TreeMap<Double, Item> tryItems = new TreeMap<>(Comparator.reverseOrder());
        tryItems.put(200.0, TRl200.get());
        tryItems.put(100.0, TRl100.get());
        tryItems.put(50.0, TRl50.get());
        tryItems.put(20.0, TRl20.get());
        tryItems.put(10.0, TRl10.get());
        tryItems.put(5.0, TRl5.get());
        tryItems.put(1.0, TRl1.get());
        tryItems.put(0.5, TRk50.get());
        tryItems.put(0.25, TRk25.get());
        tryItems.put(0.1, TRk10.get());
        tryItems.put(0.05, TRk5.get());
        tryItems.put(0.01, TRk1.get());
        CURRENCY_ITEMS.put("TRY", tryItems);
        // NZD
        TreeMap<Double, Item> nzdItems = new TreeMap<>(Comparator.reverseOrder());
        nzdItems.put(100.0, NZD100.get());
        nzdItems.put(50.0, NZD50.get());
        nzdItems.put(20.0, NZD20.get());
        nzdItems.put(10.0, NZD10.get());
        nzdItems.put(5.0, NZD5.get());
        nzdItems.put(2.0, NZD2.get());
        nzdItems.put(1.0, NZD1.get());
        nzdItems.put(0.5, NZCent50.get());
        nzdItems.put(0.2, NZCent20.get());
        nzdItems.put(0.1, NZCent10.get());
        CURRENCY_ITEMS.put("NZD", nzdItems);
        // PHP
        TreeMap<Double, Item> phpItems = new TreeMap<>(Comparator.reverseOrder());
        phpItems.put(1000.0, PHP1000.get());
        phpItems.put(500.0, PHP500.get());
        phpItems.put(200.0, PHP200.get());
        phpItems.put(100.0, PHP100.get());
        phpItems.put(50.0, PHP50.get());
        phpItems.put(20.0, PHP20.get());
        phpItems.put(10.0, PHP10.get());
        phpItems.put(5.0, PHP5.get());
        phpItems.put(1.0, PHP1.get());
        phpItems.put(0.25, PHS25.get());
        phpItems.put(0.05, PHS5.get());
        phpItems.put(0.01, PHS1.get());
        CURRENCY_ITEMS.put("PHP", phpItems);
    }
}