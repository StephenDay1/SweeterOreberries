package net.ninjatek155.sweeteroreberries.world.gen;

import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.ninjatek155.sweeteroreberries.SweeterOreberries;
import net.ninjatek155.sweeteroreberries.world.feature.ModPlacedFeatures;

import java.util.List;
import java.util.Set;

public class ModOrebushGeneration {
    public static void generateOrebushes(final BiomeLoadingEvent event) {
        List<Holder<PlacedFeature>> base =
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_DECORATION);

        base.add(ModPlacedFeatures.IRON_OREBUSH_PLACED);
        base.add(ModPlacedFeatures.GOLD_OREBUSH_PLACED);
        base.add(ModPlacedFeatures.COPPER_OREBUSH_PLACED);
    }
}
