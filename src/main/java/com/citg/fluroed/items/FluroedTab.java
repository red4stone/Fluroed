package com.citg.fluroed.items;

import com.citg.fluroed.Fluroed;
import com.citg.fluroed.registry.RegisterItems;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class FluroedTab {
    public static final CreativeModeTab FLUROED_TAB = new CreativeModeTab("fluroedTab")
    {
        @Override
        public ItemStack makeIcon()
        {
            return RegisterItems.WORKER_SEED.get().getDefaultInstance();
        }
    };
}
