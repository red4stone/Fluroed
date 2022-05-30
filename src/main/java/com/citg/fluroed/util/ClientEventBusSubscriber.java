package com.citg.fluroed.util;

import com.citg.fluroed.Fluroed;
import com.citg.fluroed.client.entity.render.WorkerRenderer;
import com.citg.fluroed.registry.RegisterEntities;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Fluroed.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

    @SubscribeEvent
    public static void onClientSetup(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(RegisterEntities.WORKER.get(), WorkerRenderer::new);
    }
}
