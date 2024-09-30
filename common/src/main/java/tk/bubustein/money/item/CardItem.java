package tk.bubustein.money.item;

import com.mojang.serialization.Codec;
import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextColor;
import net.minecraft.world.item.TooltipFlag;
import tk.bubustein.money.MoneyMod;
import java.text.DecimalFormat;
import java.util.List;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class CardItem extends Item {
    public static final DeferredRegister<DataComponentType<?>> COMPONENTS = DeferredRegister.create(MoneyMod.MOD_ID, Registries.DATA_COMPONENT_TYPE);
    public static final Supplier<DataComponentType<Double>> MONEY_COMPONENT = COMPONENTS.register("money", () -> DataComponentType.<Double>builder()
            .persistent(Codec.DOUBLE)
            .networkSynchronized(ByteBufCodecs.DOUBLE)
            .build());
    private static final double GLOW_THRESHOLD = 20000.0;
    public CardItem(Properties properties) {
        super(properties);
    }
    @Override
    public void onCraftedBy(ItemStack stack, Level level, Player player) {
        stack.set(MONEY_COMPONENT.get(), 0.0);
    }
    @Override
    public boolean isFoil(ItemStack stack) {
        return getMoney(stack) > GLOW_THRESHOLD;
    }
    public void addMoney(ItemStack stack, double amount) {
        UnaryOperator<Double> addMoney = existingMoney -> existingMoney + amount;
        stack.update(MONEY_COMPONENT.get(), 0.0, addMoney);
    }
    public double getMoney(ItemStack stack) {
        return Math.round(stack.getOrDefault(MONEY_COMPONENT.get(), 0.0) * 100.0) / 100.0;
    }

    public void setMoney(ItemStack stack, double amount) {
        if (amount < 0) amount = 0;
        double finalAmount = amount;
        stack.update(MONEY_COMPONENT.get(), 0.0, existingMoney -> finalAmount);
    }
    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltip, TooltipFlag flag) {
        double money = getMoney(stack);
        DecimalFormat df = new DecimalFormat("#.##");
        String formattedMoney = df.format(money);
        tooltip.add(Component.literal("Money: " + formattedMoney).withStyle(style -> style.withColor(TextColor.fromRgb(0xFFD700))));
        if (stack.getItem() == ModItems.VisaClassic.get())
            tooltip.add(Component.literal("Withdraw Fee: 3%").withStyle(style -> style.withColor(TextColor.fromRgb(0xFF0000))));
        else if (stack.getItem() == ModItems.VisaGold.get())
            tooltip.add(Component.literal("Withdraw Fee: 2%").withStyle(style -> style.withColor(TextColor.fromRgb(0xFF0000))));
        else if (stack.getItem() == ModItems.VisaSteel.get())
            tooltip.add(Component.literal("Withdraw Fee: 0.5%").withStyle(style -> style.withColor(TextColor.fromRgb(0xFF0000))));
    }
}