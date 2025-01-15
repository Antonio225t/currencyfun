package com.github.antonio225t.currencyfun.proxy;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

    public CommonProxy() {
    }

    public void registerItem(Item itm) {
        GameRegistry.registerItem(itm);
    }
}
