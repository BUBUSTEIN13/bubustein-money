package tk.bubustein.money.recipe;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class BankMachineRecipeShaped implements BankMachineRecipe {
    final ShapedRecipePattern pattern;
    final ItemStack result;
    final String group;
    final boolean showNotification;

    public BankMachineRecipeShaped(String string, ShapedRecipePattern shapedRecipePattern, ItemStack itemStack, boolean bl) {
        this.group = string;
        this.pattern = shapedRecipePattern;
        this.result = itemStack;
        this.showNotification = bl;
    }

    public BankMachineRecipeShaped(String string, ShapedRecipePattern shapedRecipePattern, ItemStack itemStack) {
        this(string, shapedRecipePattern, itemStack, true);
    }

    public @NotNull RecipeSerializer<?> getSerializer() {
        return ModRecipes.BANK_MACHINE_SHAPED.get();
    }

    public @NotNull String getGroup() {
        return this.group;
    }

    public @NotNull ItemStack getResultItem(HolderLookup.Provider provider) {
        return this.result;
    }

    public @NotNull NonNullList<Ingredient> getIngredients() {
        return this.pattern.ingredients();
    }

    public boolean showNotification() {
        return this.showNotification;
    }

    public boolean canCraftInDimensions(int i, int j) {
        return i >= this.pattern.width() && j >= this.pattern.height();
    }

    public boolean matches(CraftingContainer craftingContainer, Level level) {
        return this.pattern.matches(craftingContainer);
    }

    public @NotNull ItemStack assemble(CraftingContainer craftingContainer, HolderLookup.Provider provider) {
        return this.getResultItem(provider).copy();
    }
    @Override
    public boolean isShapeless() {
        return false;
    }
    public int getWidth() {
        return this.pattern.width();
    }

    public int getHeight() {
        return this.pattern.height();
    }

    public boolean isIncomplete() {
        NonNullList<Ingredient> nonNullList = this.getIngredients();
        return nonNullList.isEmpty() || nonNullList.stream().filter((ingredient) -> !ingredient.isEmpty()).anyMatch((ingredient) -> ingredient.getItems().length == 0);
    }

    public static class Serializer implements RecipeSerializer<BankMachineRecipeShaped> {
        public static final Serializer INSTANCE = new Serializer();
        public static final MapCodec<BankMachineRecipeShaped> CODEC = RecordCodecBuilder.mapCodec((instance) ->
                instance.group(Codec.STRING.optionalFieldOf("group", "")
                        .forGetter((shapedRecipe) -> shapedRecipe.group),
                        ShapedRecipePattern.MAP_CODEC.forGetter((shapedRecipe) -> shapedRecipe.pattern),
                        ItemStack.STRICT_CODEC.fieldOf("result").forGetter((shapedRecipe) -> shapedRecipe.result),
                        Codec.BOOL.optionalFieldOf("show_notification", true)
                                .forGetter((shapedRecipe) -> shapedRecipe.showNotification)).apply(instance, BankMachineRecipeShaped::new));
        public static final StreamCodec<RegistryFriendlyByteBuf, BankMachineRecipeShaped> STREAM_CODEC = StreamCodec.of(BankMachineRecipeShaped.Serializer::toNetwork, BankMachineRecipeShaped.Serializer::fromNetwork);

        public Serializer() {
        }

        public MapCodec<BankMachineRecipeShaped> codec() {
            return CODEC;
        }

        public StreamCodec<RegistryFriendlyByteBuf, BankMachineRecipeShaped> streamCodec() {
            return STREAM_CODEC;
        }

        private static BankMachineRecipeShaped fromNetwork(RegistryFriendlyByteBuf registryFriendlyByteBuf) {
            String string = registryFriendlyByteBuf.readUtf();
            ShapedRecipePattern shapedRecipePattern = ShapedRecipePattern.STREAM_CODEC.decode(registryFriendlyByteBuf);
            ItemStack itemStack = ItemStack.STREAM_CODEC.decode(registryFriendlyByteBuf);
            boolean bl = registryFriendlyByteBuf.readBoolean();
            return new BankMachineRecipeShaped(string, shapedRecipePattern, itemStack, bl);
        }

        private static void toNetwork(RegistryFriendlyByteBuf registryFriendlyByteBuf, BankMachineRecipeShaped shapedRecipe) {
            registryFriendlyByteBuf.writeUtf(shapedRecipe.group);
            ShapedRecipePattern.STREAM_CODEC.encode(registryFriendlyByteBuf, shapedRecipe.pattern);
            ItemStack.STREAM_CODEC.encode(registryFriendlyByteBuf, shapedRecipe.result);
            registryFriendlyByteBuf.writeBoolean(shapedRecipe.showNotification);
        }
    }
}