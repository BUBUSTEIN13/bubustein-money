package tk.bubustein.money.forge;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import net.minecraft.core.NonNullList;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.registries.ForgeRegistryEntry;
import tk.bubustein.money.recipe.BankMachineRecipeShaped;
import tk.bubustein.money.recipe.BankMachineRecipeShapeless;

public class ForgeBankMachineRecipeShapeless extends BankMachineRecipeShapeless {
    private final ResourceLocation id;
    final String group;
    final ItemStack result;
    final NonNullList<Ingredient> ingredients;
    public ForgeBankMachineRecipeShapeless(ResourceLocation resourceLocation, String string, ItemStack itemStack, NonNullList<Ingredient> nonNullList) {
        super(resourceLocation, string, itemStack, nonNullList);
        this.id = resourceLocation;
        this.group = string;
        this.result = itemStack;
        this.ingredients = nonNullList;
    }

    public static class Serializer extends ForgeRegistryEntry<RecipeSerializer<?>> implements RecipeSerializer<ForgeBankMachineRecipeShapeless> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public ForgeBankMachineRecipeShapeless fromJson(ResourceLocation resourceLocation, JsonObject jsonObject) {
            String group = GsonHelper.getAsString(jsonObject, "group", "");
            NonNullList<Ingredient> ingredients = NonNullList.create();
            for (JsonElement element : GsonHelper.getAsJsonArray(jsonObject, "ingredients")) {
                ingredients.add(Ingredient.fromJson(element));
            }
            if (ingredients.isEmpty()) {
                throw new JsonParseException("No ingredients for shapeless recipe");
            }
            ItemStack result = BankMachineRecipeShaped.itemStackFromJson(GsonHelper.getAsJsonObject(jsonObject, "result"));
            return new ForgeBankMachineRecipeShapeless(resourceLocation, group, result, ingredients);
        }

        @Override
        public ForgeBankMachineRecipeShapeless fromNetwork(ResourceLocation resourceLocation, FriendlyByteBuf buffer) {
            String group = buffer.readUtf();
            int ingredientCount = buffer.readVarInt();
            NonNullList<Ingredient> ingredients = NonNullList.withSize(ingredientCount, Ingredient.EMPTY);
            for (int i = 0; i < ingredientCount; i++) {
                ingredients.set(i, Ingredient.fromNetwork(buffer));
            }
            ItemStack result = buffer.readItem();
            return new ForgeBankMachineRecipeShapeless(resourceLocation, group, result, ingredients);
        }

        @Override
        public void toNetwork(FriendlyByteBuf buffer, ForgeBankMachineRecipeShapeless recipe) {
            buffer.writeUtf(recipe.group);
            buffer.writeVarInt(recipe.ingredients.size());
            for (Ingredient ingredient : recipe.ingredients) {
                ingredient.toNetwork(buffer);
            }
            buffer.writeItem(recipe.result);
        }
    }
}