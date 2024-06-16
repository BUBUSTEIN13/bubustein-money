package tk.bubustein.money.recipe;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementHolder;
import net.minecraft.advancements.Criterion;
import net.minecraft.advancements.AdvancementRequirements.Strategy;
import net.minecraft.advancements.AdvancementRewards.Builder;
import net.minecraft.advancements.critereon.RecipeUnlockedTrigger;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.recipes.CraftingRecipeBuilder;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.CraftingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BankMachineRecipeShapedBuilder extends BankMachineRecipeBuilder implements RecipeBuilder {
    private final RecipeCategory category;
    private final Item result;
    private final int count;
    private final List<String> rows = Lists.newArrayList();
    private final Map<Character, Ingredient> key = Maps.newLinkedHashMap();
    private final Map<String, Criterion<?>> criteria = new LinkedHashMap<>();
    @Nullable
    private String group;
    private boolean showNotification = true;

    public BankMachineRecipeShapedBuilder(RecipeCategory recipeCategory, ItemLike itemLike, int i) {
        this.category = recipeCategory;
        this.result = itemLike.asItem();
        this.count = i;
    }

    public static BankMachineRecipeShapedBuilder shaped(RecipeCategory recipeCategory, ItemLike itemLike) {
        return shaped(recipeCategory, itemLike, 1);
    }

    public static BankMachineRecipeShapedBuilder shaped(RecipeCategory recipeCategory, ItemLike itemLike, int i) {
        return new BankMachineRecipeShapedBuilder(recipeCategory, itemLike, i);
    }

    public BankMachineRecipeShapedBuilder define(Character character, TagKey<Item> tagKey) {
        return this.define(character, Ingredient.of(tagKey));
    }

    public BankMachineRecipeShapedBuilder define(Character character, ItemLike itemLike) {
        return this.define(character, Ingredient.of(itemLike));
    }

    public BankMachineRecipeShapedBuilder define(Character character, Ingredient ingredient) {
        if (this.key.containsKey(character)) {
            throw new IllegalArgumentException("Symbol '" + character + "' is already defined!");
        } else if (character == ' ') {
            throw new IllegalArgumentException("Symbol ' ' (whitespace) is reserved and cannot be defined");
        } else {
            this.key.put(character, ingredient);
            return this;
        }
    }

    public BankMachineRecipeShapedBuilder pattern(String string) {
        if (!this.rows.isEmpty() && string.length() != this.rows.get(0).length()) {
            throw new IllegalArgumentException("Pattern must be the same width on every line!");
        } else {
            this.rows.add(string);
            return this;
        }
    }

    public @NotNull BankMachineRecipeShapedBuilder unlockedBy(String string, Criterion<?> criterion) {
        this.criteria.put(string, criterion);
        return this;
    }

    public @NotNull BankMachineRecipeShapedBuilder group(@Nullable String string) {
        this.group = string;
        return this;
    }

    public BankMachineRecipeShapedBuilder showNotification(boolean bl) {
        this.showNotification = bl;
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
        recipeOutput.accept(new BankMachineRecipeShapedBuilder.Result(resourceLocation, this.result, this.count, this.group == null ? "" : this.group, this.rows, this.key, builder.build(resourceLocation.withPrefix("recipes/" + this.category.getFolderName() + "/")), this.showNotification));
    }

    private void ensureValid(ResourceLocation resourceLocation) {
        if (this.rows.isEmpty()) {
            throw new IllegalStateException("No pattern is defined for shaped recipe " + resourceLocation + "!");
        } else {
            Set<Character> set = Sets.newHashSet(this.key.keySet());
            set.remove(' ');

            for (String string : this.rows) {
                for (int i = 0; i < string.length(); ++i) {
                    char c = string.charAt(i);
                    if (!this.key.containsKey(c) && c != ' ') {
                        throw new IllegalStateException("Pattern in recipe " + resourceLocation + " uses undefined symbol '" + c + "'");
                    }

                    set.remove(c);
                }
            }

            if (!set.isEmpty()) {
                throw new IllegalStateException("Ingredients are defined but not used in pattern for recipe " + resourceLocation);
            } else if (this.rows.size() == 1 && this.rows.get(0).length() == 1) {
                throw new IllegalStateException("Shaped recipe " + resourceLocation + " only takes in a single item - should it be a shapeless recipe instead?");
            } else if (this.criteria.isEmpty()) {
                throw new IllegalStateException("No way of obtaining recipe " + resourceLocation);
            }
        }
    }

    private static class Result extends BankMachineResult {
        private final ResourceLocation id;
        private final Item result;
        private final int count;
        private final String group;
        private final List<String> pattern;
        private final Map<Character, Ingredient> key;
        private final AdvancementHolder advancement;
        private final boolean showNotification;

        public Result(ResourceLocation resourceLocation, Item item, int i, String string, List<String> list, Map<Character, Ingredient> map, AdvancementHolder advancementHolder, boolean bl) {
            super();
            this.id = resourceLocation;
            this.result = item;
            this.count = i;
            this.group = string;
            this.pattern = list;
            this.key = map;
            this.advancement = advancementHolder;
            this.showNotification = bl;
        }

        public void serializeRecipeData(JsonObject jsonObject) {
            super.serializeRecipeData(jsonObject);
            if (!this.group.isEmpty()) {
                jsonObject.addProperty("group", this.group);
            }

            JsonArray jsonArray = new JsonArray();

            for (String string : this.pattern) {
                jsonArray.add(string);
            }

            jsonObject.add("pattern", jsonArray);
            JsonObject jsonObject2 = new JsonObject();

            for (Map.Entry<Character, Ingredient> entry : this.key.entrySet()) {
                jsonObject2.add(String.valueOf(entry.getKey()), entry.getValue().toJson(false));
            }

            jsonObject.add("key", jsonObject2);
            JsonObject jsonObject3 = new JsonObject();
            jsonObject3.addProperty("item", BuiltInRegistries.ITEM.getKey(this.result).toString());
            if (this.count > 1) {
                jsonObject3.addProperty("count", this.count);
            }

            jsonObject.add("result", jsonObject3);
            jsonObject.addProperty("show_notification", this.showNotification);
        }

        public @NotNull RecipeSerializer<?> type() {
            return BankMachineRecipeShaped.Serializer.INSTANCE;
        }

        public @NotNull ResourceLocation id() {
            return this.id;
        }

        public AdvancementHolder advancement() {
            return this.advancement;
        }
    }
}
