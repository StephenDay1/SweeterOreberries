package net.ninjatek155.sweeteroreberries.setup;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModItems {
//    public static final RegistryObject<Item> IRON_OREBERRY_BUSH = register("iron_oreberry_bush",
//            () -> new Item(getBasicModItemProperties()));

    private static <T extends Item> RegistryObject<T> register(String name, Supplier<T> item) {
//        return Registration.ITEMS.register(name, () -> new Item(properties));
        return Registration.ITEMS.register(name, item);
    }

    public static Item.Properties getBasicModItemProperties() {
        return new Item.Properties().tab(ModCreativeModeTabs.SWEETER_OREBERRIES_ITEM_GROUP);
    }

    // Call this method to load the static class.
    public static void register() {}
}
