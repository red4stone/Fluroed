package com.citg.fluroed.blocks;

import com.citg.fluroed.items.FluroedTab;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

public class BlockItemBase extends BlockItem {
    public BlockItemBase(Block blockIn) {
        super(blockIn, new Item.Properties().tab(FluroedTab.FLUROED_TAB));
    }
}
