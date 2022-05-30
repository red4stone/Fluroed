package com.citg.fluroed.registry;

import com.citg.fluroed.Fluroed;
import com.citg.fluroed.entities.WorkerFluro;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.*;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegisterEntities {
    // create DeferredRegister object
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, Fluroed.MODID);

    public static void init() {
        // attach DeferredRegister to the event bus
        //ENTITY_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // register entities
    public static final RegistryObject<EntityType<WorkerFluro>> WORKER = ENTITIES.register(
        "worker", () ->
            EntityType.Builder.of(WorkerFluro::new, MobCategory.CREATURE)
                    .sized(0.8f, 1.5f)
                    .build(new ResourceLocation(Fluroed.MODID, "worker").toString())
    );
}