package com.citg.fluroed.blocks;

import net.minecraft.world.level.block.*;
import net.minecraft.world.level.material.Material;

public class CrustBlock extends Block {

    public CrustBlock() {
        super(Block.Properties
                .of(Material.CAKE)
                .strength(0.0f, 0.0f)
                .sound(SoundType.SLIME_BLOCK)
                .jumpFactor(0.5f)
                .friction(0.95f)
                .lightLevel((p_50755_) -> {
                    return 10;
                })
                .speedFactor(0.3f)
        );
    }
}
