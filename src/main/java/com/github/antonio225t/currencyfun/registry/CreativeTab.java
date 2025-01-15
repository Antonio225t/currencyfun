package com.github.antonio225t.currencyfun.registry;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTab extends CreativeTabs {

    public CreativeTab(String label) {
        super(label);
    }

    @Override
    public Item getTabIconItem() {
        return Items.RUPEE;
    }
}
