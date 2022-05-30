package com.citg.fluroed.blocks;

import net.minecraft.world.level.block.state.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class BasinBlock extends Block {

    //private static final VoxelShape SHAPE_ALL = Stream.of(Block.makeCuboidShape(2, 0, -2, 15, 7, 3), Block.makeCuboidShape(0, 0, 0, 16, 4, 16), Block.makeCuboidShape(-3, 6, 1, 1, 13, 15), Block.makeCuboidShape(14, 1, 1, 18, 8, 15), Block.makeCuboidShape(2, 7, 14, 15, 14, 19)).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public BasinBlock() {
        super(BlockBehaviour.Properties
                .of(Material.METAL)
                .strength(0.0f, 0.0f)
                .sound(SoundType.ANVIL)
                .noCollission()
        );
    }
}
