package com.github.antonio225t.currencyfun.proxy;

import com.github.antonio225t.currencyfun.CurrencyFun;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ClientProxy extends CommonProxy {

    @Override
    public void registerItem(Item itm) {
        super.registerItem(itm);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itm, 0, new ModelResourceLocation(CurrencyFun.MODID + ":" + itm.getUnlocalizedName().substring(5), "inventory"));
    }
}
