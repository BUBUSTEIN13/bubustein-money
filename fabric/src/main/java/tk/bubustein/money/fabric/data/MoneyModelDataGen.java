package tk.bubustein.money.fabric.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.ModelTemplates;
import tk.bubustein.money.item.ModItems;

public class MoneyModelDataGen extends FabricModelProvider {
    MoneyModelDataGen(FabricDataOutput generator) {
        super(generator);
    }
    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModel) {
        //pass
    }
    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator){
        /*
        itemModelGenerator.generateFlatItem(ModItems.NZCent10.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.NZCent20.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.NZCent50.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.NZD1.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.NZD2.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.NZD5.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.NZD10.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.NZD20.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.NZD50.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.NZD100.get(), ModelTemplates.FLAT_ITEM);


        itemModelGenerator.generateFlatItem(ModItems.TRk1.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.TRk5.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.TRk10.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.TRk25.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.TRk50.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.TRl1.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.TRl5.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.TRl10.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.TRl20.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.TRl50.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.TRl100.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.TRl200.get(), ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(ModItems.ZACent10.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.ZACent20.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.ZACent50.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.ZARand1.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.ZARand2.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.ZARand5.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.ZARand10.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.ZARand20.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.ZARand50.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.ZARand100.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.ZARand200.get(), ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(ModItems.CZkr1.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.CZkr2.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.CZkr5.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.CZkr10.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.CZkr20.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.CZkr50.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.CZkr100.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.CZkr200.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.CZkr500.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.CZkr1000.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.CZkr2000.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.CZkr5000.get(), ModelTemplates.FLAT_ITEM);


        itemModelGenerator.generateFlatItem(ModItems.DKAere50.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.DKkr1.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.DKkr2.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.DKkr5.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.DKkr10.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.DKkr20.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.DKkr50.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.DKkr100.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.DKkr200.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.DKkr500.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.DKkr1000.get(), ModelTemplates.FLAT_ITEM);


        itemModelGenerator.generateFlatItem(ModItems.Ft5.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.Ft10.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.Ft20.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.Ft50.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.Ft100.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.Ft200.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.Ft500.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.Ft1000.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.Ft2000.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.Ft5000.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.Ft10000.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.Ft20000.get(), ModelTemplates.FLAT_ITEM);


        itemModelGenerator.generateFlatItem(ModItems.NOkr1.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.NOkr5.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.NOkr10.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.NOkr20.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.NOkr50.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.NOkr100.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.NOkr200.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.NOkr500.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.NOkr1000.get(), ModelTemplates.FLAT_ITEM);


        itemModelGenerator.generateFlatItem(ModItems.Grosz1.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.Grosz2.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.Grosz5.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.Grosz10.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.Grosz20.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.Grosz50.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.Zloty1.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.Zloty2.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.Zloty5.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.Zloty10.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.Zloty20.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.Zloty50.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.Zloty100.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.Zloty200.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.Zloty500.get(), ModelTemplates.FLAT_ITEM);


        itemModelGenerator.generateFlatItem(ModItems.RSD1.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.RSD2.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.RSD5.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.RSD10.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.RSD20.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.RSD50.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.RSD100.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.RSD200.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.RSD500.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.RSD1000.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.RSD2000.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.RSD5000.get(), ModelTemplates.FLAT_ITEM);


        itemModelGenerator.generateFlatItem(ModItems.SEkr1.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.SEkr2.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.SEkr5.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.SEkr10.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.SEkr20.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.SEkr50.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.SEkr100.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.SEkr200.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.SEkr500.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.SEkr1000.get(), ModelTemplates.FLAT_ITEM);


        itemModelGenerator.generateFlatItem(ModItems.ISkr1.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.ISkr5.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.ISkr10.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.ISkr50.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.ISkr100.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.ISkr500.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.ISkr1000.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.ISkr2000.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.ISkr5000.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.ISkr10000.get(), ModelTemplates.FLAT_ITEM);


        itemModelGenerator.generateFlatItem(ModItems.INr1.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.INr2.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.INr5.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.INr10.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.INr20.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.INr50.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.INr100.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.INr200.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.INr500.get(), ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(ModItems.Won10.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.Won50.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.Won100.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.Won500.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.Won1000.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.Won5000.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.Won10000.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.Won50000.get(), ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(ModItems.CNJiao1.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.CNJiao5.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.CNYuan1.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.CNYuan5.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.CNYuan10.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.CNYuan20.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.CNYuan50.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.CNYuan100.get(), ModelTemplates.FLAT_ITEM);*/
    }
}
