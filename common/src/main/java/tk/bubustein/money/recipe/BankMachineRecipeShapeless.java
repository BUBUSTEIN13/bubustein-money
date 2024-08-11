package tk.bubustein.money.recipe;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntList;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.entity.player.StackedContents;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class BankMachineRecipeShapeless implements BankMachineRecipe {
    final String group;
    final ItemStack result;
    final NonNullList<Ingredient> ingredients;
    public BankMachineRecipeShapeless(String string, ItemStack itemStack, NonNullList<Ingredient> nonNullList) {
        this.group = string;
        this.result = itemStack;
        this.ingredients = nonNullList;
    }
    public @NotNull RecipeSerializer<?> getSerializer() {
        return ModRecipes.BANK_MACHINE_SHAPELESS.get();
    }
    public String getGroup() {
        return this.group;
    }
    public @NotNull ItemStack getResultItem(HolderLookup.Provider provider) {
        return this.result;
    }
    public @NotNull NonNullList<Ingredient> getIngredients() {
        return this.ingredients;
    }

    public boolean matches(CraftingContainer craftingContainer, Level level) {
        StackedContents stackedContents = new StackedContents();
        int i = 0;
        for(int j = 0; j < craftingContainer.getContainerSize(); ++j) {
            ItemStack itemStack = craftingContainer.getItem(j);
            if (!itemStack.isEmpty()) {
                ++i;
                stackedContents.accountStack(itemStack, 1);
            }
        }
        return i == this.ingredients.size() && stackedContents.canCraft(this, (IntList)null);
    }
    public @NotNull ItemStack assemble(CraftingContainer craftingContainer, HolderLookup.Provider provider) {
        return this.result.copy();
    }
    public boolean canCraftInDimensions(int i, int j) {
        return i * j >= this.ingredients.size();
    }
    @Override
    public boolean isShapeless() {
        return true;
    }
    public static class Serializer implements RecipeSerializer<BankMachineRecipeShapeless> {
        public static final Serializer INSTANCE = new Serializer();
        private static final MapCodec<BankMachineRecipeShapeless> CODEC = RecordCodecBuilder.mapCodec((instance) ->
                instance.group(Codec.STRING.optionalFieldOf("group", "").forGetter((shapelessRecipe) ->
                        shapelessRecipe.group),
                        ItemStack.STRICT_CODEC.fieldOf("result").forGetter((shapelessRecipe) -> shapelessRecipe.result),
                        Ingredient.CODEC_NONEMPTY.listOf().fieldOf("ingredients").flatXmap((list) -> {
            Ingredient[] ingredients = list.stream().filter((ingredient) -> !ingredient.isEmpty()).toArray(Ingredient[]::new);
            if (ingredients.length == 0) {
                return DataResult.error(() -> "No ingredients for shapeless recipe");
            } else {
                return ingredients.length > 9 ? DataResult.error(() -> "Too many ingredients for shapeless recipe") : DataResult.success(NonNullList.of(Ingredient.EMPTY, ingredients));
            }
        }, DataResult::success).forGetter((shapelessRecipe) -> shapelessRecipe.ingredients)).apply(instance, BankMachineRecipeShapeless::new));
        public static final StreamCodec<RegistryFriendlyByteBuf, BankMachineRecipeShapeless> STREAM_CODEC = StreamCodec.of(BankMachineRecipeShapeless.Serializer::toNetwork, BankMachineRecipeShapeless.Serializer::fromNetwork);
        public Serializer() {
        }
        public @NotNull MapCodec<BankMachineRecipeShapeless> codec() {
            return CODEC;
        }
        public @NotNull StreamCodec<RegistryFriendlyByteBuf, BankMachineRecipeShapeless> streamCodec() {
            return STREAM_CODEC;
        }
        private static BankMachineRecipeShapeless fromNetwork(RegistryFriendlyByteBuf registryFriendlyByteBuf) {
            String string = registryFriendlyByteBuf.readUtf();
            int i = registryFriendlyByteBuf.readVarInt();
            NonNullList<Ingredient> nonNullList = NonNullList.withSize(i, Ingredient.EMPTY);
            nonNullList.replaceAll((ingredient) -> Ingredient.CONTENTS_STREAM_CODEC.decode(registryFriendlyByteBuf));
            ItemStack itemStack = ItemStack.STREAM_CODEC.decode(registryFriendlyByteBuf);
            return new BankMachineRecipeShapeless(string, itemStack, nonNullList);
        }
        private static void toNetwork(RegistryFriendlyByteBuf registryFriendlyByteBuf, BankMachineRecipeShapeless shapelessRecipe) {
            registryFriendlyByteBuf.writeUtf(shapelessRecipe.group);
            registryFriendlyByteBuf.writeVarInt(shapelessRecipe.ingredients.size());
            for (Ingredient ingredient : shapelessRecipe.ingredients) {
                Ingredient.CONTENTS_STREAM_CODEC.encode(registryFriendlyByteBuf, ingredient);
            }
            ItemStack.STREAM_CODEC.encode(registryFriendlyByteBuf, shapelessRecipe.result);
        }
    }
}