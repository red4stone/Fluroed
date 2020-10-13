package com.citg.fluroed.client.entity.render;

import com.citg.fluroed.Fluroed;
import com.citg.fluroed.client.entity.model.WorkerModel;
import com.citg.fluroed.entities.WorkerFluro;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.util.ResourceLocation;

public class WorkerRenderer extends MobRenderer<WorkerFluro, EntityModel<WorkerFluro>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Fluroed.MODID, "textures/entity/fluro.png");

    public WorkerRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new WorkerModel<>(), 0.6f);
    }

    @Override
    public ResourceLocation getEntityTexture(WorkerFluro entity) {
        return TEXTURE;
    }
}
