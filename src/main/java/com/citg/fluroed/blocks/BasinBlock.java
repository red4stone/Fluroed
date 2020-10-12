package com.citg.fluroed.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

import java.util.stream.Stream;

public class BasinBlock extends Block {

    //private static final VoxelShape SHAPE_ALL = Stream.of(Block.makeCuboidShape(2, 0, -2, 15, 7, 3), Block.makeCuboidShape(0, 0, 0, 16, 4, 16), Block.makeCuboidShape(-3, 6, 1, 1, 13, 15), Block.makeCuboidShape(14, 1, 1, 18, 8, 15), Block.makeCuboidShape(2, 7, 14, 15, 14, 19)).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public BasinBlock() {
        super(AbstractBlock.Properties
                .create(Material.IRON)
                .hardnessAndResistance(0.0f, 0.0f)
                .sound(SoundType.ANVIL)
                .doesNotBlockMovement()
        );
    }
}
