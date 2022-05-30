package com.citg.fluroed.blocks;

import net.minecraft.world.level.block.state.*;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class GooOre extends OreBlock {

    public GooOre() {
        super(BlockBehaviour.Properties
                .of(Material.METAL)
                .strength(3.0f, 4.0f)
                .sound(SoundType.SLIME_BLOCK)
                .jumpFactor(0.7f)
                .friction(0.8f)
                .lightLevel((lightLevel) -> 3)
                .requiresCorrectToolForDrops()
                .speedFactor(0.5f)
        );
    }
    // TODO: Figure out how the heck OreGen works
}
