package tk.bubustein.money.forge;

import com.google.gson.JsonObject;
import java.util.Map;
import net.minecraft.core.NonNullList;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.registries.ForgeRegistryEntry;
import org.jetbrains.annotations.NotNull;
import tk.bubustein.money.recipe.BankMachineRecipeShaped;

public class ForgeBankMachineRecipeShaped extends BankMachineRecipeShaped {
    final int width;
    final int height;
    final NonNullList<Ingredient> recipeItems;
    final ItemStack result;
    private final ResourceLocation id;
    final String group;
    public ForgeBankMachineRecipeShaped(ResourceLocation resourceLocation, String string, int i, int j, NonNullList<Ingredient> nonNullList, ItemStack itemStack) {
        super(resourceLocation, string, i, j, nonNullList, itemStack);
        this.id = resourceLocation;
        this.group = string;
        this.width = i;
        this.height = j;
        this.recipeItems = nonNullList;
        this.result = itemStack;
    }
    public static class Serializer extends ForgeRegistryEntry<RecipeSerializer<?>> implements RecipeSerializer<ForgeBankMachineRecipeShaped> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public @NotNull ForgeBankMachineRecipeShaped fromJson(@NotNull ResourceLocation resourceLocation, @NotNull JsonObject jsonObject) {
            String group = GsonHelper.getAsString(jsonObject, "group", "");
            Map<String, Ingredient> key = BankMachineRecipeShaped.keyFromJson(GsonHelper.getAsJsonObject(jsonObject, "key"));
            String[] pattern = BankMachineRecipeShaped.shrink(BankMachineRecipeShaped.patternFromJson(GsonHelper.getAsJsonArray(jsonObject, "pattern")));
            int width = pattern[0].length();
            int height = pattern.length;
            NonNullList<Ingredient> ingredients = BankMachineRecipeShaped.dissolvePattern(pattern, key, width, height);
            ItemStack result = BankMachineRecipeShaped.itemStackFromJson(GsonHelper.getAsJsonObject(jsonObject, "result"));
            return new ForgeBankMachineRecipeShaped(resourceLocation, group, width, height, ingredients, result);
        }
        @Override
        public ForgeBankMachineRecipeShaped fromNetwork(@NotNull ResourceLocation resourceLocation, FriendlyByteBuf buffer) {
            int width = buffer.readVarInt();
            int height = buffer.readVarInt();
            String group = buffer.readUtf();
            NonNullList<Ingredient> ingredients = NonNullList.withSize(width * height, Ingredient.EMPTY);
            ingredients.replaceAll(ignored -> Ingredient.fromNetwork(buffer));
            ItemStack result = buffer.readItem();
            return new ForgeBankMachineRecipeShaped(resourceLocation, group, width, height, ingredients, result);
        }
        @Override
        public void toNetwork(FriendlyByteBuf buffer, ForgeBankMachineRecipeShaped recipe) {
            buffer.writeVarInt(recipe.width);
            buffer.writeVarInt(recipe.height);
            buffer.writeUtf(recipe.group);
            for (Ingredient ingredient : recipe.recipeItems) {
                ingredient.toNetwork(buffer);
            }
            buffer.writeItem(recipe.result);
        }
    }
}