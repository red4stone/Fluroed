package com.citg.fluroed;

import com.citg.fluroed.blocks.BasinBlock;
import com.citg.fluroed.blocks.BlockItemBase;
import com.citg.fluroed.blocks.CrustBlock;
import com.citg.fluroed.blocks.GooOre;
import com.citg.fluroed.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    // create DeferredRegister object
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Fluroed.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Fluroed.MODID);

    public static void init() {
        // attach DeferredRegister to the event bus
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // register item
    public static final RegistryObject<Item> WORKER_SEED = ITEMS.register("worker_seed", ItemBase::new);
    public static final RegistryObject<Item> CHASER_SEED = ITEMS.register("chaser_seed", ItemBase::new);
    public static final RegistryObject<Item> SUCKER_SEED = ITEMS.register("sucker_seed", ItemBase::new);
    public static final RegistryObject<Item> LIGHT_SEED = ITEMS.register("lighter_seed", ItemBase::new);
    public static final RegistryObject<Item> DARK_SEED = ITEMS.register("darker_seed", ItemBase::new);

    public static final RegistryObject<Item> GOO_CRUST = ITEMS.register("crusty_goo", ItemBase::new);

    // register block
    public static final RegistryObject<Block> GOO_ORE = BLOCKS.register("goo_ore", GooOre::new);
    public static final RegistryObject<Block> CRUST_BLOCK = BLOCKS.register("crust_block", CrustBlock::new);
    public static final RegistryObject<Block> BASIN = BLOCKS.register("basin", BasinBlock::new);

    // register block items
    public static final RegistryObject<Item> GOO_ORE_ITEM = ITEMS.register("goo_ore", () -> new BlockItemBase(GOO_ORE.get()));
    public static final RegistryObject<Item> CRUST_BLOCK_ITEM = ITEMS.register("crust_block", () -> new BlockItemBase(CRUST_BLOCK.get()));
    public static final RegistryObject<Item> BASIN_ITEM = ITEMS.register("basin", () -> new BlockItemBase(BASIN.get()));
}