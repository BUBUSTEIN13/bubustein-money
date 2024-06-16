package tk.bubustein.money.recipe;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementHolder;
import net.minecraft.advancements.Criterion;
import net.minecraft.advancements.AdvancementRequirements.Strategy;
import net.minecraft.advancements.AdvancementRewards.Builder;
import net.minecraft.advancements.critereon.RecipeUnlockedTrigger;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BankMachineRecipeShapelessBuilder extends BankMachineRecipeBuilder implements RecipeBuilder {
    private final RecipeCategory category;
    private final Item result;
    private final int count;
    private final List<Ingredient> ingredients = Lists.newArrayList();
    private final Map<String, Criterion<?>> criteria = new LinkedHashMap<>();
    @Nullable
    private String group;

    public BankMachineRecipeShapelessBuilder(RecipeCategory recipeCategory, ItemLike itemLike, int i) {
        this.category = recipeCategory;
        this.result = itemLike.asItem();
        this.count = i;
    }

    public static BankMachineRecipeShapelessBuilder shapeless(RecipeCategory recipeCategory, ItemLike itemLike) {
        return new BankMachineRecipeShapelessBuilder(recipeCategory, itemLike, 1);
    }

    public static BankMachineRecipeShapelessBuilder shapeless(RecipeCategory recipeCategory, ItemLike itemLike, int i) {
        return new BankMachineRecipeShapelessBuilder(recipeCategory, itemLike, i);
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

    public BankMachineRecipeShapelessBuilder unlockedBy(String string, Criterion<?> criterion) {
        this.criteria.put(string, criterion);
        return this;
    }

    public BankMachineRecipeShapelessBuilder group(@Nullable String string) {
        this.group = string;
        return this;
    }

    public @NotNull Item getResult() {
        return this.result;
    }

    public void save(RecipeOutput recipeOutput, ResourceLocation resourceLocation) {
        this.ensureValid(resourceLocation);
        Advancement.Builder builder = recipeOutput.advancement().addCriterion("has_the_recipe", RecipeUnlockedTrigger.unlocked(resourceLocation)).rewards(Builder.recipe(resourceLocation)).requirements(Strategy.OR);
        Objects.requireNonNull(builder);
        this.criteria.forEach(builder::addCriterion);
        recipeOutput.accept(new BankMachineRecipeShapelessBuilder.Result(resourceLocation, this.result, this.count, this.group == null ? "" : this.group, this.ingredients, builder.build(resourceLocation.withPrefix("recipes/" + this.category.getFolderName() + "/"))));
    }

    private void ensureValid(ResourceLocation resourceLocation) {
        if (this.criteria.isEmpty()) {
            throw new IllegalStateException("No way of obtaining recipe " + resourceLocation);
        }
    }

    public static class Result extends BankMachineRecipeBuilder.BankMachineResult{
        private final ResourceLocation id;
        private final Item result;
        private final int count;
        private final String group;
        private final List<Ingredient> ingredients;
        private final AdvancementHolder advancement;

        public Result(ResourceLocation resourceLocation, Item item, int i, String string, List<Ingredient> list, AdvancementHolder advancementHolder) {
            super();
            this.id = resourceLocation;
            this.result = item;
            this.count = i;
            this.group = string;
            this.ingredients = list;
            this.advancement = advancementHolder;
        }

        public void serializeRecipeData(JsonObject jsonObject) {
            super.serializeRecipeData(jsonObject);
            if (!this.group.isEmpty()) {
                jsonObject.addProperty("group", this.group);
            }

            JsonArray jsonArray = new JsonArray();

            for (Ingredient ingredient : this.ingredients) {
                jsonArray.add(ingredient.toJson(false));
            }

            jsonObject.add("ingredients", jsonArray);
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.addProperty("item", BuiltInRegistries.ITEM.getKey(this.result).toString());
            if (this.count > 1) {
                jsonObject2.addProperty("count", this.count);
            }

            jsonObject.add("result", jsonObject2);
        }

        public @NotNull RecipeSerializer<?> type() {
            return BankMachineRecipeShapeless.Serializer.INSTANCE;
        }

        public ResourceLocation id() {
            return this.id;
        }

        public AdvancementHolder advancement() {
            return this.advancement;
        }
    }
}