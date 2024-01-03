package com.bubustein.money.data;

import com.bubustein.money.block.ModBlocks;
import com.bubustein.money.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.Stotinka1, Models.GENERATED);
        itemModelGenerator.register(ModItems.Stotinka2, Models.GENERATED);
        itemModelGenerator.register(ModItems.Stotinka5, Models.GENERATED);
        itemModelGenerator.register(ModItems.Stotinka10, Models.GENERATED);
        itemModelGenerator.register(ModItems.Stotinka20, Models.GENERATED);
        itemModelGenerator.register(ModItems.Stotinka50, Models.GENERATED);
        itemModelGenerator.register(ModItems.Leva1, Models.GENERATED);
        itemModelGenerator.register(ModItems.Leva2, Models.GENERATED);
        itemModelGenerator.register(ModItems.Leva5, Models.GENERATED);
        itemModelGenerator.register(ModItems.Leva10, Models.GENERATED);
        itemModelGenerator.register(ModItems.Leva20, Models.GENERATED);
        itemModelGenerator.register(ModItems.Leva50, Models.GENERATED);
        itemModelGenerator.register(ModItems.Leva100, Models.GENERATED);

        itemModelGenerator.register(ModItems.CZkr1, Models.GENERATED);
        itemModelGenerator.register(ModItems.CZkr2, Models.GENERATED);
        itemModelGenerator.register(ModItems.CZkr5, Models.GENERATED);
        itemModelGenerator.register(ModItems.CZkr10, Models.GENERATED);
        itemModelGenerator.register(ModItems.CZkr20, Models.GENERATED);
        itemModelGenerator.register(ModItems.CZkr50, Models.GENERATED);
        itemModelGenerator.register(ModItems.CZkr100, Models.GENERATED);
        itemModelGenerator.register(ModItems.CZkr200, Models.GENERATED);
        itemModelGenerator.register(ModItems.CZkr500, Models.GENERATED);
        itemModelGenerator.register(ModItems.CZkr1000, Models.GENERATED);
        itemModelGenerator.register(ModItems.CZkr2000, Models.GENERATED);
        itemModelGenerator.register(ModItems.CZkr5000, Models.GENERATED);


        itemModelGenerator.register(ModItems.DKAere50, Models.GENERATED);
        itemModelGenerator.register(ModItems.DKkr1, Models.GENERATED);
        itemModelGenerator.register(ModItems.DKkr2, Models.GENERATED);
        itemModelGenerator.register(ModItems.DKkr5, Models.GENERATED);
        itemModelGenerator.register(ModItems.DKkr10, Models.GENERATED);
        itemModelGenerator.register(ModItems.DKkr20, Models.GENERATED);
        itemModelGenerator.register(ModItems.DKkr50, Models.GENERATED);
        itemModelGenerator.register(ModItems.DKkr100, Models.GENERATED);
        itemModelGenerator.register(ModItems.DKkr200, Models.GENERATED);
        itemModelGenerator.register(ModItems.DKkr500, Models.GENERATED);
        itemModelGenerator.register(ModItems.DKkr1000, Models.GENERATED);


        itemModelGenerator.register(ModItems.Ft5, Models.GENERATED);
        itemModelGenerator.register(ModItems.Ft10, Models.GENERATED);
        itemModelGenerator.register(ModItems.Ft20, Models.GENERATED);
        itemModelGenerator.register(ModItems.Ft50, Models.GENERATED);
        itemModelGenerator.register(ModItems.Ft100, Models.GENERATED);
        itemModelGenerator.register(ModItems.Ft200, Models.GENERATED);
        itemModelGenerator.register(ModItems.Ft500, Models.GENERATED);
        itemModelGenerator.register(ModItems.Ft1000, Models.GENERATED);
        itemModelGenerator.register(ModItems.Ft2000, Models.GENERATED);
        itemModelGenerator.register(ModItems.Ft5000, Models.GENERATED);
        itemModelGenerator.register(ModItems.Ft10000, Models.GENERATED);
        itemModelGenerator.register(ModItems.Ft20000, Models.GENERATED);


        itemModelGenerator.register(ModItems.NOkr1, Models.GENERATED);
        itemModelGenerator.register(ModItems.NOkr5, Models.GENERATED);
        itemModelGenerator.register(ModItems.NOkr10, Models.GENERATED);
        itemModelGenerator.register(ModItems.NOkr20, Models.GENERATED);
        itemModelGenerator.register(ModItems.NOkr50, Models.GENERATED);
        itemModelGenerator.register(ModItems.NOkr100, Models.GENERATED);
        itemModelGenerator.register(ModItems.NOkr200, Models.GENERATED);
        itemModelGenerator.register(ModItems.NOkr500, Models.GENERATED);
        itemModelGenerator.register(ModItems.NOkr1000, Models.GENERATED);


        itemModelGenerator.register(ModItems.Grosz1, Models.GENERATED);
        itemModelGenerator.register(ModItems.Grosz2, Models.GENERATED);
        itemModelGenerator.register(ModItems.Grosz5, Models.GENERATED);
        itemModelGenerator.register(ModItems.Grosz10, Models.GENERATED);
        itemModelGenerator.register(ModItems.Grosz20, Models.GENERATED);
        itemModelGenerator.register(ModItems.Grosz50, Models.GENERATED);
        itemModelGenerator.register(ModItems.Zloty1, Models.GENERATED);
        itemModelGenerator.register(ModItems.Zloty2, Models.GENERATED);
        itemModelGenerator.register(ModItems.Zloty5, Models.GENERATED);
        itemModelGenerator.register(ModItems.Zloty10, Models.GENERATED);
        itemModelGenerator.register(ModItems.Zloty20, Models.GENERATED);
        itemModelGenerator.register(ModItems.Zloty50, Models.GENERATED);
        itemModelGenerator.register(ModItems.Zloty100, Models.GENERATED);
        itemModelGenerator.register(ModItems.Zloty200, Models.GENERATED);
        itemModelGenerator.register(ModItems.Zloty500, Models.GENERATED);


        itemModelGenerator.register(ModItems.RSD1, Models.GENERATED);
        itemModelGenerator.register(ModItems.RSD2, Models.GENERATED);
        itemModelGenerator.register(ModItems.RSD5, Models.GENERATED);
        itemModelGenerator.register(ModItems.RSD10, Models.GENERATED);
        itemModelGenerator.register(ModItems.RSD20, Models.GENERATED);
        itemModelGenerator.register(ModItems.RSD50, Models.GENERATED);
        itemModelGenerator.register(ModItems.RSD100, Models.GENERATED);
        itemModelGenerator.register(ModItems.RSD200, Models.GENERATED);
        itemModelGenerator.register(ModItems.RSD500, Models.GENERATED);
        itemModelGenerator.register(ModItems.RSD1000, Models.GENERATED);
        itemModelGenerator.register(ModItems.RSD2000, Models.GENERATED);
        itemModelGenerator.register(ModItems.RSD5000, Models.GENERATED);


        itemModelGenerator.register(ModItems.SEkr1, Models.GENERATED);
        itemModelGenerator.register(ModItems.SEkr2, Models.GENERATED);
        itemModelGenerator.register(ModItems.SEkr5, Models.GENERATED);
        itemModelGenerator.register(ModItems.SEkr10, Models.GENERATED);
        itemModelGenerator.register(ModItems.SEkr20, Models.GENERATED);
        itemModelGenerator.register(ModItems.SEkr50, Models.GENERATED);
        itemModelGenerator.register(ModItems.SEkr100, Models.GENERATED);
        itemModelGenerator.register(ModItems.SEkr200, Models.GENERATED);
        itemModelGenerator.register(ModItems.SEkr500, Models.GENERATED);
        itemModelGenerator.register(ModItems.SEkr1000, Models.GENERATED);


        itemModelGenerator.register(ModItems.ISkr1, Models.GENERATED);
        itemModelGenerator.register(ModItems.ISkr5, Models.GENERATED);
        itemModelGenerator.register(ModItems.ISkr10, Models.GENERATED);
        itemModelGenerator.register(ModItems.ISkr50, Models.GENERATED);
        itemModelGenerator.register(ModItems.ISkr100, Models.GENERATED);
        itemModelGenerator.register(ModItems.ISkr500, Models.GENERATED);
        itemModelGenerator.register(ModItems.ISkr1000, Models.GENERATED);
        itemModelGenerator.register(ModItems.ISkr2000, Models.GENERATED);
        itemModelGenerator.register(ModItems.ISkr5000, Models.GENERATED);
        itemModelGenerator.register(ModItems.ISkr10000, Models.GENERATED);


        itemModelGenerator.register(ModItems.INr1, Models.GENERATED);
        itemModelGenerator.register(ModItems.INr2, Models.GENERATED);
        itemModelGenerator.register(ModItems.INr5, Models.GENERATED);
        itemModelGenerator.register(ModItems.INr10, Models.GENERATED);
        itemModelGenerator.register(ModItems.INr20, Models.GENERATED);
        itemModelGenerator.register(ModItems.INr50, Models.GENERATED);
        itemModelGenerator.register(ModItems.INr100, Models.GENERATED);
        itemModelGenerator.register(ModItems.INr200, Models.GENERATED);
        itemModelGenerator.register(ModItems.INr500, Models.GENERATED);

        itemModelGenerator.register(ModItems.Won10, Models.GENERATED);
        itemModelGenerator.register(ModItems.Won50, Models.GENERATED);
        itemModelGenerator.register(ModItems.Won100, Models.GENERATED);
        itemModelGenerator.register(ModItems.Won500, Models.GENERATED);
        itemModelGenerator.register(ModItems.Won1000, Models.GENERATED);
        itemModelGenerator.register(ModItems.Won5000, Models.GENERATED);
        itemModelGenerator.register(ModItems.Won10000, Models.GENERATED);
        itemModelGenerator.register(ModItems.Won50000, Models.GENERATED);

        itemModelGenerator.register(ModItems.CNJiao1, Models.GENERATED);
        itemModelGenerator.register(ModItems.CNJiao5, Models.GENERATED);
        itemModelGenerator.register(ModItems.CNYuan1, Models.GENERATED);
        itemModelGenerator.register(ModItems.CNYuan5, Models.GENERATED);
        itemModelGenerator.register(ModItems.CNYuan10, Models.GENERATED);
        itemModelGenerator.register(ModItems.CNYuan20, Models.GENERATED);
        itemModelGenerator.register(ModItems.CNYuan50, Models.GENERATED);
        itemModelGenerator.register(ModItems.CNYuan100, Models.GENERATED);
    }

}