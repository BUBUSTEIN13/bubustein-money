package tk.bubustein.money.recipe;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.Criterion;
import net.minecraft.advancements.AdvancementRequirements.Strategy;
import net.minecraft.advancements.AdvancementRewards.Builder;
import net.minecraft.advancements.critereon.RecipeUnlockedTrigger;
import net.minecraft.core.NonNullList;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.ShapelessRecipe;
import net.minecraft.world.level.ItemLike;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BankMachineRecipeShapelessBuilder implements RecipeBuilder {
    private final RecipeCategory category;
    private final Item result;
    private final int count;
    private final NonNullList<Ingredient> ingredients = NonNullList.create();
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
    public @NotNull BankMachineRecipeShapelessBuilder unlockedBy(String string, Criterion<?> criterion) {
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
        ShapelessRecipe shapelessRecipe = new ShapelessRecipe(Objects.requireNonNullElse(this.group, ""), RecipeBuilder.determineBookCategory(this.category), new ItemStack(this.result, this.count), this.ingredients);
        recipeOutput.accept(resourceLocation, shapelessRecipe, builder.build(resourceLocation.withPrefix("recipes/" + this.category.getFolderName() + "/")));
    }
    private void ensureValid(ResourceLocation resourceLocation) {
        if (this.criteria.isEmpty()) {
            throw new IllegalStateException("No way of obtaining recipe " + resourceLocation);
        }
    }
}