package tk.bubustein.money.recipe;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import it.unimi.dsi.fastutil.ints.IntList;
import net.minecraft.core.NonNullList;
import net.minecraft.core.RegistryAccess;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.entity.player.StackedContents;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class BankMachineRecipeShapeless implements BankMachineRecipe {
    private final ResourceLocation id;
    final String group;
    final ItemStack result;
    final NonNullList<Ingredient> ingredients;
    public BankMachineRecipeShapeless(ResourceLocation resourceLocation, String string, ItemStack itemStack, NonNullList<Ingredient> nonNullList) {
        this.id = resourceLocation;
        this.group = string;
        this.result = itemStack;
        this.ingredients = nonNullList;
    }
    public @NotNull ResourceLocation getId() {
        return this.id;
    }
    public RecipeSerializer<?> getSerializer() {
        return ModRecipes.BANK_MACHINE_SHAPELESS.get();
    }
    public String getGroup() {
        return this.group;
    }
    public ItemStack getResultItem(RegistryAccess registryAccess) {
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
    public ItemStack assemble(CraftingContainer craftingContainer, RegistryAccess registryAccess) {
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
        public Serializer() {
        }
        public BankMachineRecipeShapeless fromJson(ResourceLocation resourceLocation, JsonObject jsonObject) {
            String string = GsonHelper.getAsString(jsonObject, "group", "");
            NonNullList<Ingredient> nonNullList = itemsFromJson(GsonHelper.getAsJsonArray(jsonObject, "ingredients"));
            if (nonNullList.isEmpty()) {
                throw new JsonParseException("No ingredients for shapeless recipe");
            } else if (nonNullList.size() > 9) {
                throw new JsonParseException("Too many ingredients for shapeless recipe");
            } else {
                ItemStack itemStack = BankMachineRecipeShaped.itemStackFromJson(GsonHelper.getAsJsonObject(jsonObject, "result"));
                return new BankMachineRecipeShapeless(resourceLocation, string, itemStack, nonNullList);
            }
        }
        private static NonNullList<Ingredient> itemsFromJson(JsonArray jsonArray) {
            NonNullList<Ingredient> nonNullList = NonNullList.create();

            for(int i = 0; i < jsonArray.size(); ++i) {
                Ingredient ingredient = Ingredient.fromJson(jsonArray.get(i), false);
                if (!ingredient.isEmpty()) {
                    nonNullList.add(ingredient);
                }
            }
            return nonNullList;
        }
        public BankMachineRecipeShapeless fromNetwork(ResourceLocation resourceLocation, FriendlyByteBuf friendlyByteBuf) {
            String string = friendlyByteBuf.readUtf();
            int i = friendlyByteBuf.readVarInt();
            NonNullList<Ingredient> nonNullList = NonNullList.withSize(i, Ingredient.EMPTY);
            nonNullList.replaceAll(ignored -> Ingredient.fromNetwork(friendlyByteBuf));
            ItemStack itemStack = friendlyByteBuf.readItem();
            return new BankMachineRecipeShapeless(resourceLocation, string, itemStack, nonNullList);
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