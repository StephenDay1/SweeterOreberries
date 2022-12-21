package net.ninjatek155.sweeteroreberries.world;

import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.ninjatek155.sweeteroreberries.SweeterOreberries;
import net.ninjatek155.sweeteroreberries.world.gen.ModOrebushGeneration;

@Mod.EventBusSubscriber(modid = SweeterOreberries.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModOrebushGeneration.generateOrebushes(event);
    }
}
