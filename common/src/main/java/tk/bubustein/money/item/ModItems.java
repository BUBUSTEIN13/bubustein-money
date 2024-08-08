package tk.bubustein.money.item;

import net.minecraft.world.item.Item;
import tk.bubustein.money.MoneyExpectPlatform;
import tk.bubustein.money.MoneyMod;
import java.util.function.Supplier;
public class ModItems {
    public static void init(){};
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

    public static final Supplier<Item> B1 = MoneyExpectPlatform.registerItem("un_ban_1900",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.SPECIAL)));
    public static final Supplier<Item> B2 = MoneyExpectPlatform.registerItem("doi_bani_1900",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.SPECIAL)));
    public static final Supplier<Item> B5 = MoneyExpectPlatform.registerItem("cinci_bani_1900",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.SPECIAL)));
    public static final Supplier<Item> B10 = MoneyExpectPlatform.registerItem("zece_bani_1900",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.SPECIAL)));
    public static final Supplier<Item> B20 = MoneyExpectPlatform.registerItem("douazeci_bani_1900",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.SPECIAL)));
    public static final Supplier<Item> B50 = MoneyExpectPlatform.registerItem("cincizeci_bani_1900",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.SPECIAL)));
    public static final Supplier<Item> L1 = MoneyExpectPlatform.registerItem("un_leu_1900",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.SPECIAL)));
    public static final Supplier<Item> L2 = MoneyExpectPlatform.registerItem("doi_lei_1900",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.SPECIAL)));
    public static final Supplier<Item> L5 = MoneyExpectPlatform.registerItem("cinci_lei_1900",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.SPECIAL)));
    public static final Supplier<Item> L12 = MoneyExpectPlatform.registerItem("douasprezece_lei_1900",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.SPECIAL)));
    public static final Supplier<Item> L20 = MoneyExpectPlatform.registerItem("douazeci_lei_1900",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.SPECIAL)));
    public static final Supplier<Item> L25 = MoneyExpectPlatform.registerItem("douazeci_cinci_lei_1900",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.SPECIAL)));
    public static final Supplier<Item> L50 = MoneyExpectPlatform.registerItem("cincizeci_lei_1900",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.SPECIAL)));
    public static final Supplier<Item> L100 = MoneyExpectPlatform.registerItem("suta_lei_1900",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.SPECIAL)));

    public static final Supplier<Item> VisaClassic = MoneyExpectPlatform.registerItem("card_classic",
            () -> new Item(new Item.Properties().stacksTo(1).arch$tab(MoneyMod.SPECIAL)));
    public static final Supplier<Item> VisaGold = MoneyExpectPlatform.registerItem("card_gold",
            () -> new Item(new Item.Properties().stacksTo(1).arch$tab(MoneyMod.SPECIAL)));
    public static final Supplier<Item> VisaSteel = MoneyExpectPlatform.registerItem("card_steel",
            () -> new Item(new Item.Properties().stacksTo(1).arch$tab(MoneyMod.SPECIAL)));
    public static final Supplier<Item> SpecialPaper = MoneyExpectPlatform.registerItem("special_paper",
            () -> new Item(new Item.Properties().arch$tab(MoneyMod.SPECIAL)));

}