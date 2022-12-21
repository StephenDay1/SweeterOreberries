package net.ninjatek155.sweeteroreberries.data;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import net.ninjatek155.sweeteroreberries.SweeterOreberries;
import net.ninjatek155.sweeteroreberries.data.client.ModItemModelProvider;

@Mod.EventBusSubscriber(modid = SweeterOreberries.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    private DataGenerators() {}

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        // TODO: find out purpose/function of boolean value...
        // All I know is the stuff doesn't generate unless it's true.
        generator.addProvider(new ModItemModelProvider(generator, existingFileHelper));
//
//        generator.addProvider(true, new ModRecipeProvider(generator));
//        generator.addProvider(true, new ModLootTableProvider(generator));
//        generator.addProvider(true, new ModBlockTagsProvider(generator, existingFileHelper));

    }
}
