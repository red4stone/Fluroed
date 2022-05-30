package com.citg.fluroed.registry;

import com.citg.fluroed.Fluroed;
import com.citg.fluroed.blocks.BasinBlock;
import com.citg.fluroed.blocks.BlockItemBase;
import com.citg.fluroed.blocks.CrustBlock;
import com.citg.fluroed.blocks.GooOre;
import net.minecraft.world.level.block.*;
import net.minecraft.util.*;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegisterBlocks {
    // create DeferredRegister object
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Fluroed.MODID);
    
    public static void init() {
        // attach DeferredRegister to the event bus
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<Block> GOO_ORE = BLOCKS.register("goo_ore", GooOre::new);
    public static final RegistryObject<Block> CRUST_BLOCK = BLOCKS.register("crust_block", CrustBlock::new);
    public static final RegistryObject<Block> BASIN = BLOCKS.register("basin", BasinBlock::new);
}