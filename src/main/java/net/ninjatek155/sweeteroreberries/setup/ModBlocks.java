package net.ninjatek155.sweeteroreberries.setup;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import net.ninjatek155.sweeteroreberries.block.OreberryBushBlock;

import java.util.function.Supplier;

public class ModBlocks {
    public static final RegistryObject<OreberryBushBlock> IRON_OREBERRY_BUSH_BLOCK = register("iron_oreberry_bush",
            () -> new OreberryBushBlock(Items.RAW_IRON), getBasicModItemProperties());
    public static final RegistryObject<OreberryBushBlock> COPPER_OREBERRY_BUSH_BLOCK = register("copper_oreberry_bush",
            () -> new OreberryBushBlock(Items.RAW_COPPER), getBasicModItemProperties());
    public static final RegistryObject<OreberryBushBlock> GOLD_OREBERRY_BUSH_BLOCK = register("gold_oreberry_bush",
            () -> new OreberryBushBlock(Items.RAW_GOLD), getBasicModItemProperties());

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
        return Registration.BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block, Item.Properties itemProperties) {
        RegistryObject<T> ret = registerNoItem(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(ret.get(), itemProperties));
        return ret;
    }

    // Call this method to load the static class.
    public static void register() {}

    public static Item.Properties getBasicModItemProperties() {
        return new Item.Properties().tab(ModCreativeModeTabs.SWEETER_OREBERRIES_ITEM_GROUP);
    }
}
