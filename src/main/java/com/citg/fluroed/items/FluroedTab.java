package com.citg.fluroed.items;

import com.citg.fluroed.registry.RegisterItems;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class FluroedTab {
    public static final CreativeModeTab FLUROED_TAB = new CreativeModeTab("besttab")
    {
        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(RegisterItems.WORKER_SEED.get());
        }
    };
}
