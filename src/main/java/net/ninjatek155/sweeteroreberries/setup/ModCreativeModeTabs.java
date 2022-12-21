package net.ninjatek155.sweeteroreberries.setup;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;

public class ModCreativeModeTabs {
    public static final CreativeModeTab SWEETER_OREBERRIES_ITEM_GROUP = new CreativeModeTab("sweeter_oreberries") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.IRON_OREBERRY_BUSH_BLOCK.get().asItem());
        }
    };
}
