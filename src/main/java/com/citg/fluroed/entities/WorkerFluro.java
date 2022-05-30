package com.citg.fluroed.entities;

import com.citg.fluroed.entities.goals.WorkerUseStation;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
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

    public WorkerFluro(EntityType<? extends PathfinderMob> type, Level level) {
        super(type, level);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes()
            .add(Attributes.MAX_HEALTH, 1.0D)
            .add(Attributes.MOVEMENT_SPEED, 0.20D)
            .add(Attributes.JUMP_STRENGTH, 5.0D);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(1, new WorkerUseStation(this, 3f, 10, 5));
        this.goalSelector.addGoal(2, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(2, new LookAtPlayerGoal(this, Player.class, 5.0f));
    }

    @Override
    protected int getExperienceReward(Player player) {
        return 0;
    }

    @Override
    public boolean causeFallDamage(float p_148859_, float p_148860_, DamageSource p_148861_) {
        return false;
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
        this.playSound(SoundEvents.COPPER_PLACE, 0.15f, 2f);
    }
}
