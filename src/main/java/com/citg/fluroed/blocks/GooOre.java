package com.citg.fluroed.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;

public class GooOre extends OreBlock {

    public GooOre() {
        super(Block.Properties
                .create(Material.IRON)
                .hardnessAndResistance(3.0f, 4.0f)
                .sound(SoundType.STONE)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
                .jumpFactor(0.7f)
                .slipperiness(0.8f)
                .setLightLevel((lightLevel) -> 3)
                .setRequiresTool()
                .speedFactor(0.5f)
        );
    }

    @Override
    public int getExpDrop(BlockState state, IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
        return(1);
    }
    // TODO: Figure out how the heck OreGen works
}
