package com.citg.fluroed.client.entity.render;

import com.citg.fluroed.Fluroed;
import com.citg.fluroed.client.entity.model.WorkerModel;
import com.citg.fluroed.entities.WorkerFluro;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class WorkerRenderer extends MobRenderer<WorkerFluro, EntityModel<WorkerFluro>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Fluroed.MODID, "textures/entity/fluro.png");

    public WorkerRenderer(Context context) {
        super(context, new WorkerModel<>(context.bakeLayer(WorkerModel.LAYER_LOCATION)), 0.6f);
    }

    @Override
    public ResourceLocation getEntityTexture(WorkerFluro entity) {
        return TEXTURE;
    }

    @Override
    public net.minecraft.resources.ResourceLocation getTextureLocation(WorkerFluro p_114482_) {
        // TODO Auto-generated method stub
        return null;
    }
}
