package tk.bubustein.money.recipe;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.function.Consumer;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.CriterionTriggerInstance;
import net.minecraft.advancements.RequirementsStrategy;
import net.minecraft.advancements.Advancement.Builder;
import net.minecraft.advancements.critereon.RecipeUnlockedTrigger;
import net.minecraft.core.Registry;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BankMachineRecipeShapelessBuilder implements RecipeBuilder {
    private final Item result;
    private final int count;
    private final List<Ingredient> ingredients = Lists.newArrayList();
    private final Advancement.Builder advancement = Builder.advancement();
    @Nullable
    private String group;
    public BankMachineRecipeShapelessBuilder(ItemLike itemLike, int i) {
        this.result = itemLike.asItem();
        this.count = i;
    }
    public static BankMachineRecipeShapelessBuilder shapeless(ItemLike itemLike) {
        return new BankMachineRecipeShapelessBuilder(itemLike, 1);
    }
    public static BankMachineRecipeShapelessBuilder shapeless(ItemLike itemLike, int i) {
        return new BankMachineRecipeShapelessBuilder(itemLike, i);
    }
    public BankMachineRecipeShapelessBuilder requires(TagKey<Item> tagKey) {
        return this.requires(Ingredient.of(tagKey));
    }
    public BankMachineRecipeShapelessBuilder requires(ItemLike itemLike) {
        return this.requires(itemLike, 1);
    }
    public BankMachineRecipeShapelessBuilder requires(ItemLike itemLike, int i) {
        for(int j = 0; j < i; ++j) {
            this.requires(Ingredient.of(itemLike));
        }
        return this;
    }
    public BankMachineRecipeShapelessBuilder requires(Ingredient ingredient) {
        return this.requires(ingredient, 1);
    }
    public BankMachineRecipeShapelessBuilder requires(Ingredient ingredient, int i) {
        for(int j = 0; j < i; ++j) {
            this.ingredients.add(ingredient);
        }
        return this;
    }
    public BankMachineRecipeShapelessBuilder unlockedBy(String string, CriterionTriggerInstance criterionTriggerInstance) {
        this.advancement.addCriterion(string, criterionTriggerInstance);
        return this;
    }
    public BankMachineRecipeShapelessBuilder group(@Nullable String string) {
        this.group = string;
        return this;
    }
    public @NotNull Item getResult() {
        return this.result;
    }
    public void save(Consumer<FinishedRecipe> consumer, ResourceLocation resourceLocation) {
        this.ensureValid(resourceLocation);
        this.advancement.parent(ROOT_RECIPE_ADVANCEMENT).addCriterion("has_the_recipe", RecipeUnlockedTrigger.unlocked(resourceLocation)).rewards(net.minecraft.advancements.AdvancementRewards.Builder.recipe(resourceLocation)).requirements(RequirementsStrategy.OR);
        String var10006 = this.group == null ? "" : this.group;
        String var10011 = resourceLocation.getNamespace();
        assert this.result.getItemCategory() != null;
        String var10012 = this.result.getItemCategory().getRecipeFolderName();
        consumer.accept(new BankMachineRecipeShapelessBuilder.Result(resourceLocation, this.result, this.count, var10006, this.ingredients, this.advancement, new ResourceLocation(var10011, "recipes/" + var10012 + "/" + resourceLocation.getPath())));
    }
    private void ensureValid(ResourceLocation resourceLocation) {
        if (this.advancement.getCriteria().isEmpty()) {
            throw new IllegalStateException("No way of obtaining recipe " + resourceLocation);
        }
    }
    public static class Result implements FinishedRecipe {
        private final ResourceLocation id;
        private final Item result;
        private final int count;
        private final String group;
        private final List<Ingredient> ingredients;
        private final Advancement.Builder advancement;
        private final ResourceLocation advancementId;
        public Result(ResourceLocation resourceLocation, Item item, int i, String string, List<Ingredient> list, Advancement.Builder builder, ResourceLocation resourceLocation2) {
            this.id = resourceLocation;
            this.result = item;
            this.count = i;
            this.group = string;
            this.ingredients = list;
            this.advancement = builder;
            this.advancementId = resourceLocation2;
        }
        public void serializeRecipeData(JsonObject jsonObject) {
            if (!this.group.isEmpty()) {
                jsonObject.addProperty("group", this.group);
            }
            JsonArray jsonArray = new JsonArray();
            for (Ingredient ingredient : this.ingredients) {
                jsonArray.add(ingredient.toJson());
            }
            jsonObject.add("ingredients", jsonArray);
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.addProperty("item", Registry.ITEM.getKey(this.result).toString());
            if (this.count > 1) {
                jsonObject2.addProperty("count", this.count);
            }
            jsonObject.add("result", jsonObject2);
        }
        public @NotNull RecipeSerializer<?> getType() {
            return ModRecipes.BANK_MACHINE_SHAPELESS.get();
        }
        public @NotNull ResourceLocation getId() {
            return this.id;
        }
        @Nullable
        public JsonObject serializeAdvancement() {
            return this.advancement.serializeToJson();
        }
        @Nullable
        public ResourceLocation getAdvancementId() {
            return this.advancementId;
        }
    }
}