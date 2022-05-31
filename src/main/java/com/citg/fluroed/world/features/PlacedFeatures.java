package com.citg.fluroed.world.features;

import net.minecraft.world.level.levelgen.placement.*;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import java.util.List;

public class PlacedFeatures {
    private static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }
  
    private static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }
  
    private static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }

    public static final Holder<PlacedFeature> GOO_ORE = PlacementUtils.register("goo_ore",
            ConfiguredFeatures.GOO_ORE, commonOrePlacement(3, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.bottom(), VerticalAnchor.top())));
}