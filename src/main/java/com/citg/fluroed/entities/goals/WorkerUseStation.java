package com.citg.fluroed.entities.goals;

import java.util.EnumSet;
import com.citg.fluroed.entities.WorkerFluro;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RedstoneLampBlock;
import net.minecraft.world.phys.AABB;

public class WorkerUseStation extends MoveToBlockGoal {
   private BlockPos checkedPos;

   public WorkerUseStation(WorkerFluro entity, double speedModifier, int searchRange, int searchRangeVertical) {
      super(entity, speedModifier, searchRange, searchRangeVertical);
   }

   public boolean canUse() {
      return super.canUse();
   }

   public void start() {
      super.start();
   }

   public void stop() {
      super.stop();
   }

   public void tick() {
      super.tick();
      this.mob.setCustomName(net.minecraft.network.chat.Component.nullToEmpty(checkedPos.toShortString() + " : " + this.isReachedTarget()));
   }

   protected boolean isValidTarget(LevelReader level, BlockPos position) {
      checkedPos = position;
      boolean isPressurePlate = level.getBlockState(position).is(BlockTags.PRESSURE_PLATES);
      boolean isStandable = level.isEmptyBlock(position.above(1));
      boolean hasSignalLamp = level.getBlockState(position.above(2)).is(Blocks.REDSTONE_LAMP) 
         && level.getBlockState(position.above(2)).getValue(RedstoneLampBlock.LIT);
      //boolean occupiedPlate = !level.getEntityCollisions(mob, new AABB(position)).isEmpty();
      return isPressurePlate && isStandable && hasSignalLamp;
   }
}
