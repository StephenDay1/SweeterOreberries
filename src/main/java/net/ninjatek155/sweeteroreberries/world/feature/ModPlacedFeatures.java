package net.ninjatek155.sweeteroreberries.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;

public class ModPlacedFeatures {
    public static final Holder<PlacedFeature> IRON_OREBUSH_PLACED = PlacementUtils.register(
            "iron_oreberry_bush_placed",
            ModConfiguredFeatures.IRON_OREBERRY_BUSH,
            CountPlacement.of(UniformInt.of(104, 157)),
            RarityFilter.onAverageOnceEvery(45),
            HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(20)),
            InSquarePlacement.spread(),
            SurfaceRelativeThresholdFilter.of(Heightmap.Types.OCEAN_FLOOR_WG, Integer.MIN_VALUE, -13),
            BiomeFilter.biome());

    public static final Holder<PlacedFeature> GOLD_OREBUSH_PLACED = PlacementUtils.register(
            "gold_oreberry_bush_placed",
            ModConfiguredFeatures.GOLD_OREBERRY_BUSH,
            CountPlacement.of(UniformInt.of(104, 157)),
            RarityFilter.onAverageOnceEvery(50),
            HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(20)),
            InSquarePlacement.spread(),
            SurfaceRelativeThresholdFilter.of(Heightmap.Types.OCEAN_FLOOR_WG, Integer.MIN_VALUE, -13),
            BiomeFilter.biome());

    public static final Holder<PlacedFeature> COPPER_OREBUSH_PLACED = PlacementUtils.register(
            "copper_oreberry_bush_placed",
            ModConfiguredFeatures.COPPER_OREBERRY_BUSH,
            CountPlacement.of(UniformInt.of(104, 157)),
            RarityFilter.onAverageOnceEvery(25),
            InSquarePlacement.spread(),
            HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(40)),
            SurfaceRelativeThresholdFilter.of(Heightmap.Types.OCEAN_FLOOR_WG, Integer.MIN_VALUE, -13),
            BiomeFilter.biome());
}
