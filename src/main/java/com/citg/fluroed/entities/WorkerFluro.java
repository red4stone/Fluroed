package com.citg.fluroed.entities;

import net.minecraft.block.BlockState;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.JumpGoal;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.MoveToBlockGoal;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class WorkerFluro extends CreatureEntity {

    public WorkerFluro(EntityType<? extends CreatureEntity> type, World worldIn) {
        super(type, worldIn);
    }

    // func_233666_p_() -> registerAttributes() soon
    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return MobEntity.func_233666_p_()
                .createMutableAttribute(Attributes.MAX_HEALTH, 0.10)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 1);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(2, new LookRandomlyGoal(this));
        this.goalSelector.addGoal(2, new LookAtGoal(this, PlayerEntity.class, 5));
        this.goalSelector.addGoal(10, new MoveToBlockGoal(this, 1.0, 50) {
            @Override
            protected boolean shouldMoveTo(IWorldReader worldIn, BlockPos pos) {
                return false;
            }
        });
    }

    @Override
    protected int getExperiencePoints(PlayerEntity player) {
        return 0;
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.BLOCK_CONDUIT_ACTIVATE;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.BLOCK_CONDUIT_AMBIENT_SHORT;
    }

    @Override
    protected void playStepSound(BlockPos pos, BlockState blockIn) {
        this.playSound(SoundEvents.BLOCK_CONDUIT_ATTACK_TARGET, 0.15f, 2f);
    }
/*
    @Override
    protected void updateAITasks() {
        super.updateAITasks();
    }
*/

}
