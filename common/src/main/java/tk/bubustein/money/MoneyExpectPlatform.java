package tk.bubustein.money;

import dev.architectury.injectables.annotations.ExpectPlatform;
import dev.architectury.platform.Platform;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import java.nio.file.Path;
import java.util.Set;
import java.util.function.Supplier;
public class MoneyExpectPlatform {
    /**
     * We can use {@link Platform#getConfigFolder()} but this is just an example of {@link ExpectPlatform}.
     */
    @ExpectPlatform
    public static Path getConfigDirectory() {
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
    public static Supplier<PoiType> registerPoiType(String name, Supplier<Set<BlockState>> matchingStates) {
        throw new AssertionError();
    }
}