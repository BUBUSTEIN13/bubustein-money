package tk.bubustein.money;

import dev.architectury.injectables.annotations.ExpectPlatform;
import me.shedaniel.architectury.platform.Platform;
<<<<<<< Updated upstream
import net.minecraft.resources.ResourceLocation;
=======
>>>>>>> Stashed changes
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
<<<<<<< Updated upstream
import net.minecraft.world.level.block.state.BlockState;

=======
>>>>>>> Stashed changes
import java.nio.file.Path;
import java.util.function.Supplier;

public class MoneyExpectPlatform {
    /**
     * We can use {@link Platform#getConfigFolder()} but this is just an example of {@link ExpectPlatform}.
     * <p>
     * This must be a <b>public static</b> method. The platform-implemented solution must be placed under a
     * platform sub-package, with its class suffixed with {@code Impl}.
     * <p>
     * Example:
     * Expect: net.examplemod.ExampleExpectPlatform#getConfigDirectory()
     * Actual Fabric: net.examplemod.fabric.ExampleExpectPlatformImpl#getConfigDirectory()
     * Actual Forge: net.examplemod.forge.ExampleExpectPlatformImpl#getConfigDirectory()
     * <p>
     * <a href="https://plugins.jetbrains.com/plugin/16210-architectury">You should also get the IntelliJ plugin to help with @ExpectPlatform.</a>
     */
    @ExpectPlatform
    public static Path getConfigDirectory() {
        // Just throw an error, the content should get replaced at runtime.
        throw new AssertionError();
    }
    @ExpectPlatform
    public static <T extends Block> Supplier<T> registerBlock(String name, Supplier<T> block) {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static <T extends Item> Supplier<T> registerItem(String name, Supplier<T> item) {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static Supplier<VillagerProfession> registerProfession(String name, Supplier<VillagerProfession> profession) {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static Supplier<PoiType> registerPoiType(String name, Supplier<PoiType> poiType) {
        throw new AssertionError();
    }
<<<<<<< Updated upstream

    @ExpectPlatform
    public static CreativeModeTab registerCreativeModeTab(ResourceLocation name, Supplier<ItemStack> icon) {
        throw new AssertionError();
    }
    @ExpectPlatform
    public static boolean generatePlainsHouses() {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static boolean generateTaigaHouses() {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static boolean generateSavannaHouses() {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static boolean generateSnowyHouses() {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static boolean generateDesertHouses() {
        throw new AssertionError();
    }
=======
>>>>>>> Stashed changes
}
