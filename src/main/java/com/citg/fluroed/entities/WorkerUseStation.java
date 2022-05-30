package com.citg.fluroed.entities;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RedstoneLampBlock;

public class WorkerUseStation extends MoveToBlockGoal {
    private final WorkerFluro worker;

    public WorkerUseStation(WorkerFluro entity, double p_25150_) {
        super(entity, p_25150_, 8);
        this.worker = entity;
     }
  
     public boolean canUse() {
        return true;
     }
  
     public void start() {
        super.start();
     }
  
     public void stop() {
        super.stop();
     }
  
     public void tick() {
        super.tick();
     }
  
     protected boolean isValidTarget(LevelReader level, BlockPos position) {
        boolean isPressurePlate = level.getBlockState(position).getClass().getName().contains("pressure_plate");
        boolean isStandable = level.isEmptyBlock(position.above(1));
        boolean hasSignalLamp = level.getBlockState(position.above(2)).is(Blocks.REDSTONE_LAMP) 
            && level.getBlockState(position.above(2)).getValue(RedstoneLampBlock.LIT);
        
            return isPressurePlate && isStandable && hasSignalLamp;
     }
}
