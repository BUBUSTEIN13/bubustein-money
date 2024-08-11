package tk.bubustein.money.recipe;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntList;
import net.minecraft.core.NonNullList;
import net.minecraft.core.RegistryAccess;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.util.ExtraCodecs;
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
    public @NotNull ItemStack getResultItem(RegistryAccess registryAccess) {
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
    public @NotNull ItemStack assemble(CraftingContainer craftingContainer, RegistryAccess registryAccess) {
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
        private static final Codec<BankMachineRecipeShapeless> CODEC = RecordCodecBuilder.create((instance) -> {
            return instance.group(ExtraCodecs.strictOptionalField(Codec.STRING, "group", "").forGetter((shapelessRecipe) -> {
                return shapelessRecipe.group;
            }), ItemStack.ITEM_WITH_COUNT_CODEC.fieldOf("result").forGetter((shapelessRecipe) -> {
                return shapelessRecipe.result;
            }), Ingredient.CODEC_NONEMPTY.listOf().fieldOf("ingredients").flatXmap((list) -> {
                Ingredient[] ingredients = list.stream().filter((ingredient) -> {
                    return !ingredient.isEmpty();
                }).toArray(Ingredient[]::new);
                if (ingredients.length == 0) {
                    return DataResult.error(() -> {
                        return "No ingredients for shapeless recipe";
                    });
                } else {
                    return ingredients.length > 9 ? DataResult.error(() -> {
                        return "Too many ingredients for shapeless recipe";
                    }) : DataResult.success(NonNullList.of(Ingredient.EMPTY, ingredients));
                }
            }, DataResult::success).forGetter((shapelessRecipe) -> {
                return shapelessRecipe.ingredients;
            })).apply(instance, BankMachineRecipeShapeless::new);
        });
        public Serializer() {
        }
        public @NotNull Codec<BankMachineRecipeShapeless> codec() {
            return CODEC;
        }
        public @NotNull BankMachineRecipeShapeless fromNetwork(FriendlyByteBuf friendlyByteBuf) {
            String string = friendlyByteBuf.readUtf();
            int i = friendlyByteBuf.readVarInt();
            NonNullList<Ingredient> nonNullList = NonNullList.withSize(i, Ingredient.EMPTY);
            nonNullList.replaceAll(ignored -> Ingredient.fromNetwork(friendlyByteBuf));
            ItemStack itemStack = friendlyByteBuf.readItem();
            return new BankMachineRecipeShapeless(string, itemStack, nonNullList);
        }
        public void toNetwork(FriendlyByteBuf friendlyByteBuf, BankMachineRecipeShapeless shapelessRecipe) {
            friendlyByteBuf.writeUtf(shapelessRecipe.group);
            friendlyByteBuf.writeVarInt(shapelessRecipe.ingredients.size());
            for (Ingredient ingredient : shapelessRecipe.ingredients) {
                ingredient.toNetwork(friendlyByteBuf);
            }
            friendlyByteBuf.writeItem(shapelessRecipe.result);
        }
    }
}