package tk.bubustein.money.recipe;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Map;
import java.util.Set;
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

public class BankMachineRecipeShapedBuilder implements RecipeBuilder {
    private final Item result;
    private final int count;
    private final List<String> rows = Lists.newArrayList();
    private final Map<Character, Ingredient> key = Maps.newLinkedHashMap();
    private final Advancement.Builder advancement = Builder.advancement();
    @Nullable
    private String group;
    public BankMachineRecipeShapedBuilder(ItemLike itemLike, int i) {
        this.result = itemLike.asItem();
        this.count = i;
    }
    public static BankMachineRecipeShapedBuilder shaped(ItemLike itemLike) {
        return shaped(itemLike, 1);
    }
    public static BankMachineRecipeShapedBuilder shaped(ItemLike itemLike, int i) {
        return new BankMachineRecipeShapedBuilder(itemLike, i);
    }
    public BankMachineRecipeShapedBuilder define(Character character, TagKey<Item> tagKey) {
        return this.define(character, Ingredient.of(tagKey));
    }
    public BankMachineRecipeShapedBuilder define(Character character, ItemLike itemLike) {
        return this.define(character, Ingredient.of(new ItemLike[]{itemLike}));
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
    public BankMachineRecipeShapedBuilder unlockedBy(String string, CriterionTriggerInstance criterionTriggerInstance) {
        this.advancement.addCriterion(string, criterionTriggerInstance);
        return this;
    }
    public BankMachineRecipeShapedBuilder group(@Nullable String string) {
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
        String var10012 = resourceLocation.getNamespace();
        assert this.result.getItemCategory() != null;
        String var10013 = this.result.getItemCategory().getRecipeFolderName();
        consumer.accept(new Result(resourceLocation, this.result, this.count, var10006, this.rows, this.key, this.advancement, new ResourceLocation(var10012, "recipes/" + var10013 + "/" + resourceLocation.getPath())));
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
            } else if (this.advancement.getCriteria().isEmpty()) {
                throw new IllegalStateException("No way of obtaining recipe " + resourceLocation);
            }
        }
    }
    private static class Result implements FinishedRecipe {
        private final ResourceLocation id;
        private final Item result;
        private final int count;
        private final String group;
        private final List<String> pattern;
        private final Map<Character, Ingredient> key;
        private final Advancement.Builder advancement;
        private final ResourceLocation advancementId;
        public Result(ResourceLocation resourceLocation, Item item, int i, String string, List<String> list, Map<Character, Ingredient> map, Advancement.Builder builder, ResourceLocation resourceLocation2) {
            this.id = resourceLocation;
            this.result = item;
            this.count = i;
            this.group = string;
            this.pattern = list;
            this.key = map;
            this.advancement = builder;
            this.advancementId = resourceLocation2;
        }
        public void serializeRecipeData(JsonObject jsonObject) {
            if (!this.group.isEmpty()) {
                jsonObject.addProperty("group", this.group);
            }
            JsonArray jsonArray = new JsonArray();
            for (String string : this.pattern) {
                jsonArray.add(string);
            }
            jsonObject.add("pattern", jsonArray);
            JsonObject jsonObject2 = new JsonObject();
            for (Map.Entry<Character, Ingredient> characterIngredientEntry : this.key.entrySet()) {
                jsonObject2.add(String.valueOf(characterIngredientEntry.getKey()), ((Ingredient) characterIngredientEntry.getValue()).toJson());
            }
            jsonObject.add("key", jsonObject2);
            JsonObject jsonObject3 = new JsonObject();
            jsonObject3.addProperty("item", Registry.ITEM.getKey(this.result).toString());
            if (this.count > 1) {
                jsonObject3.addProperty("count", this.count);
            }
            jsonObject.add("result", jsonObject3);
        }
        public @NotNull RecipeSerializer<?> getType() {
            return ModRecipes.BANK_MACHINE_SHAPED.get();
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