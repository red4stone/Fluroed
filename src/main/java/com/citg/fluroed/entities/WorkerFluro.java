package com.citg.fluroed.entities;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class WorkerFluro extends PathfinderMob {

    public WorkerFluro(EntityType<? extends WorkerFluro> type, Level level) {
        super(type, level);
    }

    // func_233666_p_() -> registerAttributes() soon
    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes()
            .add(Attributes.MAX_HEALTH, 0.10)
            .add(Attributes.MOVEMENT_SPEED, 1)
            .add(Attributes.JUMP_STRENGTH, 5);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(2, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(2, new LookAtPlayerGoal(this, Player.class, 5.0f));
        this.goalSelector.addGoal(0, new WorkerUseStation(this, 6.0f));
    }

    @Override
    protected int getExperienceReward(Player player) {
        return 0;
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.CONDUIT_ACTIVATE;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.CONDUIT_AMBIENT_SHORT;
    }

    @Override
    protected void playStepSound(BlockPos pos, BlockState blockIn) {
        this.playSound(SoundEvents.CONDUIT_ATTACK_TARGET, 0.15f, 2f);
    }
/*
    @Override
    protected void updateAITasks() {
        super.updateAITasks();
    }
*/

}
