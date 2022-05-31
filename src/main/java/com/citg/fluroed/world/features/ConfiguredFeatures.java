package com.citg.fluroed.world.features;

import java.util.List;

import com.citg.fluroed.registry.RegisterBlocks;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;

public class ConfiguredFeatures {
    private static final RuleTest TUFF = new BlockMatchTest(Blocks.TUFF);
    
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_GOO_ORE_REPLACERS = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, RegisterBlocks.GOO_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> GOO_ORE = FeatureUtils.register("goo_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_GOO_ORE_REPLACERS, 14));
}
