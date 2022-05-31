package com.citg.fluroed.world.generate;

import net.minecraft.core.Holder;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;

import com.citg.fluroed.Fluroed;
import com.citg.fluroed.world.features.PlacedFeatures;

public class GenerateOre {
    public static void generateOres(final BiomeLoadingEvent event) {
        List<Holder<PlacedFeature>> base =
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        base.add(PlacedFeatures.GOO_ORE);
        Fluroed.LOGGER.info("Generating Fluroed! ores");
    }
}