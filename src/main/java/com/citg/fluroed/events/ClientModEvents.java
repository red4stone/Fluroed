package com.citg.fluroed.events;

import com.citg.fluroed.Fluroed;
import com.citg.fluroed.client.entity.model.WorkerModel;
import com.citg.fluroed.client.entity.render.WorkerRenderer;
import com.citg.fluroed.entities.WorkerFluro;
import com.citg.fluroed.registry.RegisterEntities;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Fluroed.MODID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientModEvents {

    @SubscribeEvent
    public static void clientSetup(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(RegisterEntities.WORKER.get(), WorkerRenderer::new);
    }

    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(WorkerModel.WORKER_OUTER_LAYER, WorkerModel::createOuterLayer);
        event.registerLayerDefinition(WorkerModel.WORKER_EYE_LAYER, WorkerModel::createEyeLayer);
    }

    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(RegisterEntities.WORKER.get(), WorkerRenderer::new);
    }

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(RegisterEntities.WORKER.get(), WorkerFluro.createAttributes().build());
    }
}
