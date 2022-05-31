package com.citg.fluroed.events;

import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import com.citg.fluroed.Fluroed;
import com.citg.fluroed.world.generate.GenerateOre;

@Mod.EventBusSubscriber(modid = Fluroed.MODID)
public class WorldModEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        GenerateOre.generateOres(event);
    }
}
