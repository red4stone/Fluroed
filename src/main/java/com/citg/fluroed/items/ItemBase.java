package com.citg.fluroed.items;

import com.citg.fluroed.Fluroed;
import net.minecraft.item.Item;
//import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {

    public ItemBase() {
        super(new Item.Properties().group(Fluroed.F_TAB));
    }
}
