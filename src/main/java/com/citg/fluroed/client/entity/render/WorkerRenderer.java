package com.citg.fluroed.client.entity.render;

import com.citg.fluroed.Fluroed;
import com.citg.fluroed.client.entity.model.WorkerModel;
import com.citg.fluroed.client.entity.model.WorkerOuterLayer;
import com.citg.fluroed.entities.WorkerFluro;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class WorkerRenderer<Type extends WorkerFluro> extends MobRenderer<WorkerFluro, WorkerModel<WorkerFluro>> {

    private static final ResourceLocation WORKER_TEXTURE = new ResourceLocation(Fluroed.MODID, "textures/entity/worker_fluro.png");

    public WorkerRenderer(EntityRendererProvider.Context p_173958_) {
        super(p_173958_, new WorkerModel<>(p_173958_.bakeLayer(WorkerModel.WORKER_EYE_LAYER)), 0.25F);
        this.addLayer(new WorkerOuterLayer<>(this, p_173958_.getModelSet()));
    }

    public void render(WorkerFluro p_115976_, float p_115977_, float p_115978_, PoseStack p_115979_, MultiBufferSource p_115980_, int p_115981_) {
        super.render(p_115976_, p_115977_, p_115978_, p_115979_, p_115980_, p_115981_);
     }

    @Override
    public net.minecraft.resources.ResourceLocation getTextureLocation(WorkerFluro p_114482_) {
        return WORKER_TEXTURE;
    }
}
