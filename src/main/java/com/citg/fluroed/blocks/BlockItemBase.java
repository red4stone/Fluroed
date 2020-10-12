package com.citg.fluroed.blocks;

import com.citg.fluroed.Fluroed;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {
    public BlockItemBase(Block blockIn) {
        super(blockIn, new Item.Properties().group(Fluroed.F_TAB));
    }
}
