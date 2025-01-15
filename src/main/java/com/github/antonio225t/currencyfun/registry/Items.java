package com.github.antonio225t.currencyfun.registry;

import com.github.antonio225t.currencyfun.CurrencyFun;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Items {

    public static final Item RUPEE = makeItem("rupee");
    public static final Item RUPEE5 = makeItem("rupee5");
    public static final Item RUPEE10 = makeItem("rupee10");
    public static final Item RUPEE50 = makeItem("rupee50");
    public static final Item RUPEE100 = makeItem("rupee100");
    public static final Item RUPEE500 = makeItem("rupee500");
    public static final Item RUPEE1000 = makeItem("rupee1000");
    public static final Item RUPEE5000 = makeItem("rupee5000");
    public static final Item RUPEE10000 = makeItem("rupee10000");
    public static final Item RUPEE50000 = makeItem("rupee50000");
    public static final Item RUPEE100000 = makeItem("rupee100000");



    public static Item makeItem(String name) {
        return makeItem(new Item(), name);
    }

    public static Item makeItem(Item itm, String name) {
        return itm.setRegistryName(name)
            .setUnlocalizedName(name)
            .setCreativeTab(CurrencyFun.MODTAB);
    }

    public static void registerItem(Item item) {
        GameRegistry.registerItem(item);
        try {
            Class.forName("net.minecraft.client.Minecraft");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(CurrencyFun.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
        } catch(Exception ignored) {}
    }

    public static void registerItems() {
        CurrencyFun.proxy.registerItem(RUPEE);
        CurrencyFun.proxy.registerItem(RUPEE5);
        CurrencyFun.proxy.registerItem(RUPEE10);
        CurrencyFun.proxy.registerItem(RUPEE50);
        CurrencyFun.proxy.registerItem(RUPEE100);
        CurrencyFun.proxy.registerItem(RUPEE500);
        CurrencyFun.proxy.registerItem(RUPEE1000);
        CurrencyFun.proxy.registerItem(RUPEE5000);
        CurrencyFun.proxy.registerItem(RUPEE10000);
        CurrencyFun.proxy.registerItem(RUPEE50000);
        CurrencyFun.proxy.registerItem(RUPEE100000);
    }
}
