package com.citg.fluroed.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class CrustBlock extends Block {

    public CrustBlock() {
        super(Block.Properties
                .create(Material.CAKE)
                .hardnessAndResistance(0.0f, 0.0f)
                .sound(SoundType.SLIME)
                .jumpFactor(0.5f)
                .slipperiness(0.95f)
                .setLightLevel((lightLevel) -> 5)
                .speedFactor(0.3f)
        );
    }
}
