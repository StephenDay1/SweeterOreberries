package net.ninjatek155.sweeteroreberries.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.GlowLichenConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.ninjatek155.sweeteroreberries.setup.ModBlocks;

public class ModConfiguredFeatures {
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> IRON_OREBERRY_BUSH =
            FeatureUtils.register("iron_oreberry_bush", Feature.RANDOM_PATCH,
                    new RandomPatchConfiguration(5, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.IRON_OREBERRY_BUSH_BLOCK.get().getStateForAge(3))))));


    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> GOLD_OREBERRY_BUSH =
            FeatureUtils.register("gold_oreberry_bush", Feature.RANDOM_PATCH,
                    new RandomPatchConfiguration(1, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.GOLD_OREBERRY_BUSH_BLOCK.get().getStateForAge(3))))));


    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> COPPER_OREBERRY_BUSH =
            FeatureUtils.register("copper_oreberry_bush", Feature.RANDOM_PATCH,
                    new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.COPPER_OREBERRY_BUSH_BLOCK.get().getStateForAge(3))))));
}
