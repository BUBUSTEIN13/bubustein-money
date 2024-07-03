package tk.bubustein.money.recipe;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.Criterion;
import net.minecraft.advancements.AdvancementRequirements.Strategy;
import net.minecraft.advancements.AdvancementRewards.Builder;
import net.minecraft.advancements.critereon.RecipeUnlockedTrigger;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.ShapedRecipePattern;
import net.minecraft.world.level.ItemLike;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BankMachineRecipeShapedBuilder implements RecipeBuilder {
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
        if (!this.rows.isEmpty() && string.length() != this.rows.getFirst().length()) {
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
    public BankMachineRecipeShapedBuilder group(@Nullable String string) {
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
        ShapedRecipePattern shapedRecipePattern = this.ensureValid(resourceLocation);
        Advancement.Builder builder = recipeOutput.advancement().addCriterion("has_the_recipe", RecipeUnlockedTrigger.unlocked(resourceLocation)).rewards(Builder.recipe(resourceLocation)).requirements(Strategy.OR);
        Objects.requireNonNull(builder);
        this.criteria.forEach(builder::addCriterion);
        BankMachineRecipeShaped shapedRecipe = new BankMachineRecipeShaped(Objects.requireNonNullElse(this.group, ""), shapedRecipePattern, new ItemStack(this.result, this.count), this.showNotification);
        recipeOutput.accept(resourceLocation, shapedRecipe, builder.build(resourceLocation.withPrefix("recipes/" + this.category.getFolderName() + "/")));
    }
    private ShapedRecipePattern ensureValid(ResourceLocation resourceLocation) {
        if (this.criteria.isEmpty()) {
            throw new IllegalStateException("No way of obtaining recipe " + resourceLocation);
        } else {
            return ShapedRecipePattern.of(this.key, this.rows);
        }
    }
}