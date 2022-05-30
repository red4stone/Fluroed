package com.citg.fluroed.registry;

import com.citg.fluroed.Fluroed;
import com.citg.fluroed.items.ItemBase;
import net.minecraft.world.item.*;
import net.minecraft.util.*;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import com.citg.fluroed.blocks.BlockItemBase;
import com.citg.fluroed.registry.RegisterBlocks;

public class RegisterItems {
    // create DeferredRegister object
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Fluroed.MODID);
    
    public static void init() {
        // attach DeferredRegister to the event bus
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // register item
    public static final RegistryObject<Item> WORKER_SEED = ITEMS.register("worker_seed", ItemBase::new);
    public static final RegistryObject<Item> CHASER_SEED = ITEMS.register("chaser_seed", ItemBase::new);
    public static final RegistryObject<Item> SUCKER_SEED = ITEMS.register("sucker_seed", ItemBase::new);
    public static final RegistryObject<Item> LIGHT_SEED = ITEMS.register("lighter_seed", ItemBase::new);
    public static final RegistryObject<Item> DARK_SEED = ITEMS.register("darker_seed", ItemBase::new);

    public static final RegistryObject<Item> GOO_CRUST = ITEMS.register("crusty_goo", ItemBase::new);

    // register block items
    public static final RegistryObject<Item> GOO_ORE_ITEM = ITEMS.register("goo_ore", () -> new BlockItemBase(RegisterBlocks.GOO_ORE.get()));
    public static final RegistryObject<Item> CRUST_BLOCK_ITEM = ITEMS.register("crust_block", () -> new BlockItemBase(RegisterBlocks.CRUST_BLOCK.get()));
    public static final RegistryObject<Item> BASIN_ITEM = ITEMS.register("basin", () -> new BlockItemBase(RegisterBlocks.BASIN.get()));
}