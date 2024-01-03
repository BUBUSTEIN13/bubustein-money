package com.bubustein.money.item;


import com.bubustein.money.MoneyMod;
import com.bubustein.money.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup Banknotes = Registry.register(Registries.ITEM_GROUP, new Identifier(MoneyMod.MOD_ID, "banknotes"),
            FabricItemGroup.builder().displayName(Text.translatable("Bubustein's Banknotes")).icon(() -> new ItemStack(ModItems.Euro500)).entries((displayContext, entries) -> {
                entries.add(ModItems.Euro5);
                entries.add(ModItems.Euro10);
                entries.add(ModItems.Euro20);
                entries.add(ModItems.Euro50);
                entries.add(ModItems.Euro100);
                entries.add(ModItems.Euro200);
                entries.add(ModItems.Euro500);

                entries.add(ModItems.Pound5);
                entries.add(ModItems.Pound10);
                entries.add(ModItems.Pound20);
                entries.add(ModItems.Pound50);
                entries.add(ModItems.Pound100);

                entries.add(ModItems.Dollar1);
                entries.add(ModItems.Dollar5);
                entries.add(ModItems.Dollar10);
                entries.add(ModItems.Dollar20);
                entries.add(ModItems.Dollar50);
                entries.add(ModItems.Dollar100);

                entries.add(ModItems.DollarC5);
                entries.add(ModItems.DollarC10);
                entries.add(ModItems.DollarC20);
                entries.add(ModItems.DollarC50);
                entries.add(ModItems.DollarC100);

                entries.add(ModItems.Leu1);
                entries.add(ModItems.Lei5);
                entries.add(ModItems.Lei10);
                entries.add(ModItems.Lei20);
                entries.add(ModItems.Lei50);
                entries.add(ModItems.Lei100);
                entries.add(ModItems.Lei200);
                entries.add(ModItems.Lei500);

                entries.add(ModItems.LeiMD20);
                entries.add(ModItems.LeiMD50);
                entries.add(ModItems.LeiMD100);
                entries.add(ModItems.LeiMD200);
                entries.add(ModItems.LeiMD500);
                entries.add(ModItems.LeiMD1000);

                entries.add(ModItems.Franc10);
                entries.add(ModItems.Franc20);
                entries.add(ModItems.Franc50);
                entries.add(ModItems.Franc100);
                entries.add(ModItems.Franc200);
                entries.add(ModItems.Franc1000);

                entries.add(ModItems.DollarA5);
                entries.add(ModItems.DollarA10);
                entries.add(ModItems.DollarA20);
                entries.add(ModItems.DollarA50);
                entries.add(ModItems.DollarA100);

                entries.add(ModItems.Yen1000);
                entries.add(ModItems.Yen5000);
                entries.add(ModItems.Yen10000);

                entries.add(ModItems.Leva5);
                entries.add(ModItems.Leva10);
                entries.add(ModItems.Leva20);
                entries.add(ModItems.Leva50);
                entries.add(ModItems.Leva100);

                entries.add(ModItems.CZkr100);
                entries.add(ModItems.CZkr200);
                entries.add(ModItems.CZkr500);
                entries.add(ModItems.CZkr1000);
                entries.add(ModItems.CZkr2000);
                entries.add(ModItems.CZkr5000);

                entries.add(ModItems.DKkr50);
                entries.add(ModItems.DKkr100);
                entries.add(ModItems.DKkr200);
                entries.add(ModItems.DKkr500);
                entries.add(ModItems.DKkr1000);

                entries.add(ModItems.Ft500);
                entries.add(ModItems.Ft1000);
                entries.add(ModItems.Ft2000);
                entries.add(ModItems.Ft5000);
                entries.add(ModItems.Ft10000);
                entries.add(ModItems.Ft20000);

                entries.add(ModItems.NOkr50);
                entries.add(ModItems.NOkr100);
                entries.add(ModItems.NOkr200);
                entries.add(ModItems.NOkr500);
                entries.add(ModItems.NOkr1000);

                entries.add(ModItems.Zloty10);
                entries.add(ModItems.Zloty20);
                entries.add(ModItems.Zloty50);
                entries.add(ModItems.Zloty100);
                entries.add(ModItems.Zloty200);
                entries.add(ModItems.Zloty500);

                entries.add(ModItems.RSD10);
                entries.add(ModItems.RSD20);
                entries.add(ModItems.RSD50);
                entries.add(ModItems.RSD100);
                entries.add(ModItems.RSD200);
                entries.add(ModItems.RSD500);
                entries.add(ModItems.RSD1000);
                entries.add(ModItems.RSD2000);
                entries.add(ModItems.RSD5000);

                entries.add(ModItems.SEkr20);
                entries.add(ModItems.SEkr50);
                entries.add(ModItems.SEkr100);
                entries.add(ModItems.SEkr200);
                entries.add(ModItems.SEkr500);
                entries.add(ModItems.SEkr1000);

                entries.add(ModItems.ISkr500);
                entries.add(ModItems.ISkr1000);
                entries.add(ModItems.ISkr2000);
                entries.add(ModItems.ISkr5000);
                entries.add(ModItems.ISkr10000);

                entries.add(ModItems.INr50);
                entries.add(ModItems.INr100);
                entries.add(ModItems.INr200);
                entries.add(ModItems.INr500);

                entries.add(ModItems.Won1000);
                entries.add(ModItems.Won5000);
                entries.add(ModItems.Won10000);
                entries.add(ModItems.Won50000);

                entries.add(ModItems.CNYuan1);
                entries.add(ModItems.CNYuan5);
                entries.add(ModItems.CNYuan10);
                entries.add(ModItems.CNYuan20);
                entries.add(ModItems.CNYuan50);
                entries.add(ModItems.CNYuan100);




            }).build());
    public static ItemGroup Coins = Registry.register(Registries.ITEM_GROUP, new Identifier(MoneyMod.MOD_ID, "coins"),
            FabricItemGroup.builder().displayName(Text.translatable("Bubustein's Coins")).icon(() -> new ItemStack(ModItems.Euro2)).entries((displayContext, entries) -> {
                entries.add(ModItems.Ecent1);
                entries.add(ModItems.Ecent2);
                entries.add(ModItems.Ecent5);
                entries.add(ModItems.Ecent10);
                entries.add(ModItems.Ecent20);
                entries.add(ModItems.Ecent50);
                entries.add(ModItems.Euro1);
                entries.add(ModItems.Euro2);

                entries.add(ModItems.Pence1);
                entries.add(ModItems.Pence2);
                entries.add(ModItems.Pence5);
                entries.add(ModItems.Pence10);
                entries.add(ModItems.Pence20);
                entries.add(ModItems.Pence50);
                entries.add(ModItems.Pound1);
                entries.add(ModItems.Pound2);

                entries.add(ModItems.Cent1);
                entries.add(ModItems.Cent5);
                entries.add(ModItems.Cent10);
                entries.add(ModItems.Cent25);
                entries.add(ModItems.Cent50);

                entries.add(ModItems.CCent5);
                entries.add(ModItems.CCent10);
                entries.add(ModItems.CCent25);
                entries.add(ModItems.Loonie);
                entries.add(ModItems.Toonie);

                entries.add(ModItems.Ban1);
                entries.add(ModItems.Bani5);
                entries.add(ModItems.Bani10);
                entries.add(ModItems.Bani50);

                entries.add(ModItems.BanMD5);
                entries.add(ModItems.BaniMD10);
                entries.add(ModItems.BaniMD25);
                entries.add(ModItems.BaniMD50);
                entries.add(ModItems.LeuMD1);
                entries.add(ModItems.LeuMD2);
                entries.add(ModItems.LeiMD5);
                entries.add(ModItems.LeiMD10);

                entries.add(ModItems.Centimes5);
                entries.add(ModItems.Centimes10);
                entries.add(ModItems.Centimes20);
                entries.add(ModItems.HalfFranc);
                entries.add(ModItems.Franc1);
                entries.add(ModItems.Franc2);
                entries.add(ModItems.Franc5);

                

                entries.add(ModItems.ACent5);
                entries.add(ModItems.ACent10);
                entries.add(ModItems.ACent20);
                entries.add(ModItems.ACent50);
                entries.add(ModItems.DollarA1);
                entries.add(ModItems.DollarA2);

                

                entries.add(ModItems.Yen1);
                entries.add(ModItems.Yen5);
                entries.add(ModItems.Yen10);
                entries.add(ModItems.Yen50);
                entries.add(ModItems.Yen100);
                entries.add(ModItems.Yen500);

                entries.add(ModItems.Stotinka1);
                entries.add(ModItems.Stotinka2);
                entries.add(ModItems.Stotinka5);
                entries.add(ModItems.Stotinka10);
                entries.add(ModItems.Stotinka20);
                entries.add(ModItems.Stotinka50);
                entries.add(ModItems.Leva1);
                entries.add(ModItems.Leva2);

                entries.add(ModItems.CZkr1);
                entries.add(ModItems.CZkr2);
                entries.add(ModItems.CZkr5);
                entries.add(ModItems.CZkr10);
                entries.add(ModItems.CZkr20);
                entries.add(ModItems.CZkr50);

                entries.add(ModItems.DKAere50);
                entries.add(ModItems.DKkr1);
                entries.add(ModItems.DKkr2);
                entries.add(ModItems.DKkr5);
                entries.add(ModItems.DKkr10);
                entries.add(ModItems.DKkr20);

                entries.add(ModItems.Ft5);
                entries.add(ModItems.Ft10);
                entries.add(ModItems.Ft20);
                entries.add(ModItems.Ft50);
                entries.add(ModItems.Ft100);
                entries.add(ModItems.Ft200);

                entries.add(ModItems.NOkr1);
                entries.add(ModItems.NOkr5);
                entries.add(ModItems.NOkr10);
                entries.add(ModItems.NOkr20);

                entries.add(ModItems.Grosz1);
                entries.add(ModItems.Grosz2);
                entries.add(ModItems.Grosz5);
                entries.add(ModItems.Grosz10);
                entries.add(ModItems.Grosz20);
                entries.add(ModItems.Grosz50);
                entries.add(ModItems.Zloty1);
                entries.add(ModItems.Zloty2);
                entries.add(ModItems.Zloty5);

                entries.add(ModItems.RSD1);
                entries.add(ModItems.RSD2);
                entries.add(ModItems.RSD5);

                entries.add(ModItems.SEkr1);
                entries.add(ModItems.SEkr2);
                entries.add(ModItems.SEkr5);
                entries.add(ModItems.SEkr10);

                entries.add(ModItems.ISkr1);
                entries.add(ModItems.ISkr5);
                entries.add(ModItems.ISkr10);
                entries.add(ModItems.ISkr50);
                entries.add(ModItems.ISkr100);


                entries.add(ModItems.INr1);
                entries.add(ModItems.INr2);
                entries.add(ModItems.INr5);
                entries.add(ModItems.INr10);
                entries.add(ModItems.INr20);

                entries.add(ModItems.Won10);
                entries.add(ModItems.Won50);
                entries.add(ModItems.Won100);
                entries.add(ModItems.Won500);

                entries.add(ModItems.CNJiao1);
                entries.add(ModItems.CNJiao5);


            }).build());
    public static ItemGroup Special = Registry.register(Registries.ITEM_GROUP, new Identifier(MoneyMod.MOD_ID, "special"),
            FabricItemGroup.builder().displayName(Text.translatable("Bubustein's Special")).icon(() -> new ItemStack(ModBlocks.ATM)).entries((displayContext, entries) -> {
                entries.add(ModItems.B1);
                entries.add(ModItems.B2);
                entries.add(ModItems.B5);
                entries.add(ModItems.B10);
                entries.add(ModItems.B20);
                entries.add(ModItems.B50);
                entries.add(ModItems.L1);
                entries.add(ModItems.L2);
                entries.add(ModItems.L5);
                entries.add(ModItems.L12);
                entries.add(ModItems.L20);
                entries.add(ModItems.L25);
                entries.add(ModItems.L50);
                entries.add(ModItems.L100);

                entries.add(ModItems.VisaClassic);
                entries.add(ModItems.VisaGold);
                entries.add(ModItems.VisaSteel);
                entries.add(ModBlocks.ATM);
                entries.add(ModBlocks.BANK_MACHINE);


            }).build());

    public static void registerItemGroup() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {

        });
    }
}