package tk.bubustein.money.compat.rei;

import com.google.common.collect.Lists;
import me.shedaniel.math.Point;
import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.gui.widgets.Slot;
import me.shedaniel.rei.api.client.gui.widgets.Widget;
import me.shedaniel.rei.api.client.gui.widgets.Widgets;
import me.shedaniel.rei.api.client.registry.display.DisplayCategory;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.display.DisplayMerger;
import me.shedaniel.rei.api.common.entry.EntryIngredient;
import me.shedaniel.rei.api.common.entry.EntryStack;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NonBlocking;
import org.jetbrains.annotations.Nullable;
import tk.bubustein.money.MoneyMod;
import tk.bubustein.money.block.ModBlocks;
import tk.bubustein.money.block.custom.BankMachine;
import java.util.Iterator;
import java.util.List;

@Environment(EnvType.CLIENT)
public class BankMachineCategory implements DisplayCategory<BankMachineDisplay> {
    public static final CategoryIdentifier<BankMachineDisplay> BANK_MACHINE_CATEGORY = CategoryIdentifier.of(MoneyMod.MOD_ID, "bank_machine");
    @Override
    public CategoryIdentifier<? extends BankMachineDisplay> getCategoryIdentifier() {
        return BANK_MACHINE_CATEGORY;
    }
    @Override
    public Component getTitle() {
        return BankMachine.TITLE;
    }
    @Override
    @NonBlocking
    public EntryStack<ItemStack> getIcon() {
        return EntryStacks.of(ModBlocks.BANK_MACHINE.get());
    }
    @Override
    public List<Widget> setupDisplay(BankMachineDisplay display, Rectangle bounds) {
        Point startPoint = new Point(bounds.getCenterX() - 58, bounds.getCenterY() - 27);
        List<Widget> widgets = Lists.newArrayList();
        widgets.add(Widgets.createRecipeBase(bounds));
        widgets.add(Widgets.createArrow(new Point(startPoint.x + 60, startPoint.y + 18)));
        widgets.add(Widgets.createResultSlotBackground(new Point(startPoint.x + 95, startPoint.y + 19)));
        List<EntryIngredient> input = display.getInputEntries();
        List<Slot> slots = Lists.newArrayList();
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                Slot slot = Widgets.createSlot(new Point(startPoint.x + 1 + x * 18, startPoint.y + 1 + y * 18)).markInput();
                slots.add(slot);
                widgets.add(slot);
            }
        }
        if (display.isShapeless()) {
            slots.get(4).entries(input.get(0));
        } else {
            for (int i = 0; i < input.size(); i++) {
                slots.get(i).entries(input.get(i));
            }
        }
        widgets.add(Widgets.createSlot(new Point(startPoint.x + 95, startPoint.y + 19)).entries(display.getOutputEntries().get(0)).disableBackground().markOutput());
        if (display.isShapeless()) {
            widgets.add(Widgets.createShapelessIcon(bounds));
        }
        return widgets;
    }
    @Override
    @Nullable
    public DisplayMerger<BankMachineDisplay> getDisplayMerger() {
        return new DisplayMerger<>() {
            @Override
            public boolean canMerge(BankMachineDisplay first, BankMachineDisplay second) {
                if (!first.getCategoryIdentifier().equals(second.getCategoryIdentifier())) return false;
                if (equals(first.getOrganisedInputEntries(3, 3), second.getOrganisedInputEntries(3, 3))) return false;
                if (equals(first.getOutputEntries(), second.getOutputEntries())) return false;
                if (first.isShapeless() != second.isShapeless()) return false;
                if (first.getWidth() != second.getWidth()) return false;
                return first.getHeight() == second.getHeight();
            }
            @Override
            public int hashOf(BankMachineDisplay display) {
                return display.getCategoryIdentifier().hashCode() * 31 * 31 * 31 + display.getOrganisedInputEntries(3, 3).hashCode() * 31 * 31 + display.getOutputEntries().hashCode();
            }
            private boolean equals(List<EntryIngredient> l1, List<EntryIngredient> l2) {
                if (l1.size() != l2.size()) return true;
                Iterator<EntryIngredient> it1 = l1.iterator();
                Iterator<EntryIngredient> it2 = l2.iterator();
                while (it1.hasNext() && it2.hasNext()) {
                    if (!it1.next().equals(it2.next())) return true;
                }
                return false;
            }
        };
    }
    @Override
    public int getDisplayHeight() {
        return 90;
    }
}