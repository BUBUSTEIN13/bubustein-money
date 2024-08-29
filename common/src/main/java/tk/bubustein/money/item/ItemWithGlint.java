package tk.bubustein.money.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ItemWithGlint extends Item {
    public ItemWithGlint(Properties properties) {
        super(properties);
    }
    @Override
    public boolean isFoil(ItemStack stack){
        return true;
    }
}