package tk.bubustein.money.recipe;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.core.NonNullList;
import net.minecraft.core.RegistryAccess;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.util.ExtraCodecs;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import org.apache.commons.lang3.NotImplementedException;
import org.jetbrains.annotations.NotNull;

public class BankMachineRecipeShaped implements BankMachineRecipe {
    final int width;
    final int height;
    final NonNullList<Ingredient> recipeItems;
    final ItemStack result;
    final String group;
    //final CraftingBookCategory category;
    final boolean showNotification;

    public BankMachineRecipeShaped(String string, int i, int j, NonNullList<Ingredient> nonNullList, ItemStack itemStack, boolean bl) {
        this.group = string;
        //this.category = craftingBookCategory;
        this.width = i;
        this.height = j;
        this.recipeItems = nonNullList;
        this.result = itemStack;
        this.showNotification = bl;
    }

    public BankMachineRecipeShaped(String string, int i, int j, NonNullList<Ingredient> nonNullList, ItemStack itemStack) {
        this(string, i, j, nonNullList, itemStack, true);
    }

    public RecipeSerializer<?> getSerializer() {
        return ModRecipes.BANK_MACHINE_SHAPED.get();
    }

    public String getGroup() {
        return this.group;
    }

    public CraftingBookCategory category() {
        return null;
    }

    public ItemStack getResultItem(RegistryAccess registryAccess) {
        return this.result;
    }

    public NonNullList<Ingredient> getIngredients() {
        return this.recipeItems;
    }

    public boolean showNotification() {
        return this.showNotification;
    }

    public boolean canCraftInDimensions(int i, int j) {
        return i >= this.width && j >= this.height;
    }

    public boolean matches(CraftingContainer craftingContainer, Level level) {
        for(int i = 0; i <= craftingContainer.getWidth() - this.width; ++i) {
            for(int j = 0; j <= craftingContainer.getHeight() - this.height; ++j) {
                if (this.matches(craftingContainer, i, j, true)) {
                    return true;
                }

                if (this.matches(craftingContainer, i, j, false)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean matches(CraftingContainer craftingContainer, int i, int j, boolean bl) {
        for(int k = 0; k < craftingContainer.getWidth(); ++k) {
            for(int l = 0; l < craftingContainer.getHeight(); ++l) {
                int m = k - i;
                int n = l - j;
                Ingredient ingredient = Ingredient.EMPTY;
                if (m >= 0 && n >= 0 && m < this.width && n < this.height) {
                    if (bl) {
                        ingredient = this.recipeItems.get(this.width - m - 1 + n * this.width);
                    } else {
                        ingredient = this.recipeItems.get(m + n * this.width);
                    }
                }

                if (!ingredient.test(craftingContainer.getItem(k + l * craftingContainer.getWidth()))) {
                    return false;
                }
            }
        }

        return true;
    }

    public ItemStack assemble(CraftingContainer craftingContainer, RegistryAccess registryAccess) {
        return this.getResultItem(registryAccess).copy();
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    @VisibleForTesting
    static String[] shrink(List<String> list) {
        int i = Integer.MAX_VALUE;
        int j = 0;
        int k = 0;
        int l = 0;

        for(int m = 0; m < list.size(); ++m) {
            String string = list.get(m);
            i = Math.min(i, firstNonSpace(string));
            int n = lastNonSpace(string);
            j = Math.max(j, n);
            if (n < 0) {
                if (k == m) {
                    ++k;
                }

                ++l;
            } else {
                l = 0;
            }
        }

        if (list.size() == l) {
            return new String[0];
        } else {
            String[] strings = new String[list.size() - l - k];

            for(int o = 0; o < strings.length; ++o) {
                strings[o] = list.get(o + k).substring(i, j + 1);
            }

            return strings;
        }
    }

    public boolean isIncomplete() {
        NonNullList<Ingredient> nonNullList = this.getIngredients();
        return nonNullList.isEmpty() || nonNullList.stream().filter((ingredient) -> !ingredient.isEmpty()).anyMatch((ingredient) -> ingredient.getItems().length == 0);
    }

    private static int firstNonSpace(String string) {
        int i;
        for(i = 0; i < string.length() && string.charAt(i) == ' '; ++i) {
        }

        return i;
    }

    private static int lastNonSpace(String string) {
        int i;
        for(i = string.length() - 1; i >= 0 && string.charAt(i) == ' '; --i) {
        }

        return i;
    }
    @Override
    public @NotNull RecipeType<?> getType() {
        return BankMachineRecipe.super.getType();
    }
    public static class Serializer implements RecipeSerializer<BankMachineRecipeShaped> {
        public static final Serializer INSTANCE = new Serializer();
        static final Codec<List<String>> PATTERN_CODEC;
        static final Codec<String> SINGLE_CHARACTER_STRING_CODEC;
        private static final Codec<BankMachineRecipeShaped> CODEC;

        public Serializer() {
        }

        public Codec<BankMachineRecipeShaped> codec() {
            return CODEC;
        }

        public BankMachineRecipeShaped fromNetwork(FriendlyByteBuf friendlyByteBuf) {
            int i = friendlyByteBuf.readVarInt();
            int j = friendlyByteBuf.readVarInt();
            String string = friendlyByteBuf.readUtf();
            CraftingBookCategory craftingBookCategory = friendlyByteBuf.readEnum(CraftingBookCategory.class);
            NonNullList<Ingredient> nonNullList = NonNullList.withSize(i * j, Ingredient.EMPTY);

            nonNullList.replaceAll(ignored -> Ingredient.fromNetwork(friendlyByteBuf));

            ItemStack itemStack = friendlyByteBuf.readItem();
            boolean bl = friendlyByteBuf.readBoolean();
            return new BankMachineRecipeShaped(string, i, j, nonNullList, itemStack, bl);
        }

        public void toNetwork(FriendlyByteBuf friendlyByteBuf, BankMachineRecipeShaped shapedRecipe) {
            friendlyByteBuf.writeVarInt(shapedRecipe.width);
            friendlyByteBuf.writeVarInt(shapedRecipe.height);
            friendlyByteBuf.writeUtf(shapedRecipe.group);
            //friendlyByteBuf.writeEnum(shapedRecipe.category);

            for (Ingredient ingredient : shapedRecipe.recipeItems) {
                ingredient.toNetwork(friendlyByteBuf);
            }

            friendlyByteBuf.writeItem(shapedRecipe.result);
            friendlyByteBuf.writeBoolean(shapedRecipe.showNotification);
        }

        static {
            PATTERN_CODEC = Codec.STRING.listOf().flatXmap((list) -> {
                if (list.size() > 3) {
                    return DataResult.error(() -> "Invalid pattern: too many rows, 3 is maximum");
                } else if (list.isEmpty()) {
                    return DataResult.error(() -> "Invalid pattern: empty pattern not allowed");
                } else {
                    int i = list.get(0).length();
                    Iterator<String> var2 = list.iterator();

                    String string;
                    do {
                        if (!var2.hasNext()) {
                            return DataResult.success(list);
                        }

                        string = var2.next();
                        if (string.length() > 3) {
                            return DataResult.error(() -> "Invalid pattern: too many columns, 3 is maximum");
                        }
                    } while(i == string.length());

                    return DataResult.error(() -> "Invalid pattern: each row must be the same width");
                }
            }, DataResult::success);
            SINGLE_CHARACTER_STRING_CODEC = Codec.STRING.flatXmap((string) -> {
                if (string.length() != 1) {
                    return DataResult.error(() -> "Invalid key entry: '" + string + "' is an invalid symbol (must be 1 character only).");
                } else {
                    return " ".equals(string) ? DataResult.error(() -> "Invalid key entry: ' ' is a reserved symbol.") : DataResult.success(string);
                }
            }, DataResult::success);
            CODEC = Serializer.RawShapedRecipe.CODEC.flatXmap((rawShapedRecipe) -> {
                String[] strings = shrink(rawShapedRecipe.pattern);
                int i = strings[0].length();
                int j = strings.length;
                NonNullList<Ingredient> nonNullList = NonNullList.withSize(i * j, Ingredient.EMPTY);
                Set<String> set = Sets.newHashSet(rawShapedRecipe.key.keySet());

                for(int k = 0; k < strings.length; ++k) {
                    String string = strings[k];

                    for(int l = 0; l < string.length(); ++l) {
                        String string2 = string.substring(l, l + 1);
                        Ingredient ingredient = string2.equals(" ") ? Ingredient.EMPTY : rawShapedRecipe.key.get(string2);
                        if (ingredient == null) {
                            return DataResult.error(() -> "Pattern references symbol '" + string2 + "' but it's not defined in the key");
                        }

                        set.remove(string2);
                        nonNullList.set(l + i * k, ingredient);
                    }
                }

                if (!set.isEmpty()) {
                    return DataResult.error(() -> "Key defines symbols that aren't used in pattern: " + set);
                } else {
                    BankMachineRecipeShaped shapedRecipe = new BankMachineRecipeShaped(rawShapedRecipe.group, i, j, nonNullList, rawShapedRecipe.result, rawShapedRecipe.showNotification);
                    return DataResult.success(shapedRecipe);
                }
            }, (shapedRecipe) -> {
                throw new NotImplementedException("Serializing ShapedRecipe is not implemented yet.");
            });
        }

        private record RawShapedRecipe(String group, Map<String, Ingredient> key, List<String> pattern, ItemStack result, boolean showNotification) {
            /*
            final static String group;
            final static CraftingBookCategory category;
            final static Map<String, Ingredient> key;
            final static List<String> pattern;
            final static ItemStack result;
            final static boolean showNotification;*/
            public static final Codec<RawShapedRecipe> CODEC = RecordCodecBuilder.create((instance) -> instance.group(ExtraCodecs.strictOptionalField(Codec.STRING, "group", "").forGetter((rawShapedRecipe) -> rawShapedRecipe.group), ExtraCodecs.strictUnboundedMap(Serializer.SINGLE_CHARACTER_STRING_CODEC, Ingredient.CODEC_NONEMPTY).fieldOf("key").forGetter((rawShapedRecipe) -> rawShapedRecipe.key), Serializer.PATTERN_CODEC.fieldOf("pattern").forGetter((rawShapedRecipe) -> rawShapedRecipe.pattern), CraftingRecipeCodecs.ITEMSTACK_OBJECT_CODEC.fieldOf("result").forGetter((rawShapedRecipe) -> rawShapedRecipe.result), ExtraCodecs.strictOptionalField(Codec.BOOL, "show_notification", true).forGetter((rawShapedRecipe) -> rawShapedRecipe.showNotification)).apply(instance, RawShapedRecipe::new));

            private RawShapedRecipe(String group, Map<String, Ingredient> key, List<String> pattern, ItemStack result, boolean showNotification) {
                this.group = group;
                //this.category = category;
                this.key = key;
                this.pattern = pattern;
                this.result = result;
                this.showNotification = showNotification;
            }

            public String group() {
                return this.group;
            }

            public CraftingBookCategory category() {
                return null;
            }

            public Map<String, Ingredient> key() {
                return this.key;
            }

            public List<String> pattern() {
                return this.pattern;
            }

            public ItemStack result() {
                return this.result;
            }

            public boolean showNotification() {
                return this.showNotification;
            }
        }
    }
}
