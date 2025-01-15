package com.github.antonio225t.currencyfun.registry;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Recipes {

    public static void registerRecipes() {
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE5), new Object[] {Items.RUPEE, Items.RUPEE, Items.RUPEE, Items.RUPEE, Items.RUPEE});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE, 5), new Object[] {Items.RUPEE5});

        // 10
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE10), new Object[] {Items.RUPEE5, Items.RUPEE, Items.RUPEE, Items.RUPEE, Items.RUPEE, Items.RUPEE});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE10), new Object[] {Items.RUPEE5, Items.RUPEE5});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE5, 2), new Object[] {Items.RUPEE10});

        // 50
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE50), new Object[] {Items.RUPEE10, Items.RUPEE5, Items.RUPEE5, Items.RUPEE5, Items.RUPEE5, Items.RUPEE5, Items.RUPEE5, Items.RUPEE5, Items.RUPEE5});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE50), new Object[] {Items.RUPEE10, Items.RUPEE10, Items.RUPEE5, Items.RUPEE5, Items.RUPEE5, Items.RUPEE5, Items.RUPEE5, Items.RUPEE5});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE50), new Object[] {Items.RUPEE10, Items.RUPEE10, Items.RUPEE10, Items.RUPEE5, Items.RUPEE5, Items.RUPEE5, Items.RUPEE5});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE50), new Object[] {Items.RUPEE10, Items.RUPEE10, Items.RUPEE10, Items.RUPEE10, Items.RUPEE5, Items.RUPEE5});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE50), new Object[] {Items.RUPEE10, Items.RUPEE10, Items.RUPEE10, Items.RUPEE10, Items.RUPEE10});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE10, 5), new Object[] {Items.RUPEE50});

        // 100
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE100), new Object[] {Items.RUPEE50, Items.RUPEE10, Items.RUPEE10, Items.RUPEE5, Items.RUPEE5, Items.RUPEE5, Items.RUPEE5, Items.RUPEE5, Items.RUPEE5});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE100), new Object[] {Items.RUPEE50, Items.RUPEE10, Items.RUPEE10, Items.RUPEE10, Items.RUPEE5, Items.RUPEE5, Items.RUPEE5, Items.RUPEE5});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE100), new Object[] {Items.RUPEE50, Items.RUPEE10, Items.RUPEE10, Items.RUPEE10, Items.RUPEE10, Items.RUPEE5, Items.RUPEE5});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE100), new Object[] {Items.RUPEE50, Items.RUPEE10, Items.RUPEE10, Items.RUPEE10, Items.RUPEE10, Items.RUPEE10});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE100), new Object[] {Items.RUPEE50, Items.RUPEE50});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE50, 2), new Object[] {Items.RUPEE100});

        // 500
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE500), new Object[] {Items.RUPEE100, Items.RUPEE50, Items.RUPEE50, Items.RUPEE50, Items.RUPEE50, Items.RUPEE50, Items.RUPEE50, Items.RUPEE50, Items.RUPEE50});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE500), new Object[] {Items.RUPEE100, Items.RUPEE100, Items.RUPEE50, Items.RUPEE50, Items.RUPEE50, Items.RUPEE50, Items.RUPEE50, Items.RUPEE50});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE500), new Object[] {Items.RUPEE100, Items.RUPEE100, Items.RUPEE100, Items.RUPEE50, Items.RUPEE50, Items.RUPEE50, Items.RUPEE50});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE500), new Object[] {Items.RUPEE100, Items.RUPEE100, Items.RUPEE100, Items.RUPEE100, Items.RUPEE50, Items.RUPEE50});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE500), new Object[] {Items.RUPEE100, Items.RUPEE100, Items.RUPEE100, Items.RUPEE100, Items.RUPEE100});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE100, 5), new Object[] {Items.RUPEE500});

        // 1k
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE1000), new Object[] {Items.RUPEE500, Items.RUPEE100, Items.RUPEE100, Items.RUPEE50, Items.RUPEE50, Items.RUPEE50, Items.RUPEE50, Items.RUPEE50, Items.RUPEE50});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE1000), new Object[] {Items.RUPEE500, Items.RUPEE100, Items.RUPEE100, Items.RUPEE100, Items.RUPEE50, Items.RUPEE50, Items.RUPEE50, Items.RUPEE50});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE1000), new Object[] {Items.RUPEE500, Items.RUPEE100, Items.RUPEE100, Items.RUPEE100, Items.RUPEE100, Items.RUPEE50, Items.RUPEE50});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE1000), new Object[] {Items.RUPEE500, Items.RUPEE100, Items.RUPEE100, Items.RUPEE100, Items.RUPEE100, Items.RUPEE100});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE1000), new Object[] {Items.RUPEE500, Items.RUPEE500});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE500, 2), new Object[] {Items.RUPEE1000});

        // 5k
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE5000), new Object[] {Items.RUPEE1000, Items.RUPEE500, Items.RUPEE500, Items.RUPEE500, Items.RUPEE500, Items.RUPEE500, Items.RUPEE500, Items.RUPEE500, Items.RUPEE500});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE5000), new Object[] {Items.RUPEE1000, Items.RUPEE1000, Items.RUPEE500, Items.RUPEE500, Items.RUPEE500, Items.RUPEE500, Items.RUPEE500, Items.RUPEE500});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE5000), new Object[] {Items.RUPEE1000, Items.RUPEE1000, Items.RUPEE1000, Items.RUPEE500, Items.RUPEE500, Items.RUPEE500, Items.RUPEE500});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE5000), new Object[] {Items.RUPEE1000, Items.RUPEE1000, Items.RUPEE1000, Items.RUPEE1000, Items.RUPEE500, Items.RUPEE500});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE5000), new Object[] {Items.RUPEE1000, Items.RUPEE1000, Items.RUPEE1000, Items.RUPEE1000, Items.RUPEE1000});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE1000, 5), new Object[] {Items.RUPEE5000});

        // 10k
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE10000), new Object[] {Items.RUPEE5000, Items.RUPEE1000, Items.RUPEE1000, Items.RUPEE500, Items.RUPEE500, Items.RUPEE500, Items.RUPEE500, Items.RUPEE500, Items.RUPEE500});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE10000), new Object[] {Items.RUPEE5000, Items.RUPEE1000, Items.RUPEE1000, Items.RUPEE1000, Items.RUPEE500, Items.RUPEE500, Items.RUPEE500, Items.RUPEE500});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE10000), new Object[] {Items.RUPEE5000, Items.RUPEE1000, Items.RUPEE1000, Items.RUPEE1000, Items.RUPEE1000, Items.RUPEE500, Items.RUPEE500});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE10000), new Object[] {Items.RUPEE5000, Items.RUPEE1000, Items.RUPEE1000, Items.RUPEE1000, Items.RUPEE1000, Items.RUPEE1000});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE10000), new Object[] {Items.RUPEE5000, Items.RUPEE5000});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE5000, 2), new Object[] {Items.RUPEE10000});

        // 50k
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE50000), new Object[] {Items.RUPEE10000, Items.RUPEE5000, Items.RUPEE5000, Items.RUPEE5000, Items.RUPEE5000, Items.RUPEE5000, Items.RUPEE5000, Items.RUPEE5000, Items.RUPEE5000});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE50000), new Object[] {Items.RUPEE10000, Items.RUPEE10000, Items.RUPEE5000, Items.RUPEE5000, Items.RUPEE5000, Items.RUPEE5000, Items.RUPEE5000, Items.RUPEE5000});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE50000), new Object[] {Items.RUPEE10000, Items.RUPEE10000, Items.RUPEE10000, Items.RUPEE5000, Items.RUPEE5000, Items.RUPEE5000, Items.RUPEE5000});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE50000), new Object[] {Items.RUPEE10000, Items.RUPEE10000, Items.RUPEE10000, Items.RUPEE10000, Items.RUPEE5000, Items.RUPEE5000});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE50000), new Object[] {Items.RUPEE10000, Items.RUPEE10000, Items.RUPEE10000, Items.RUPEE10000, Items.RUPEE10000});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE10000, 5), new Object[] {Items.RUPEE50000});

        // 100k
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE100000), new Object[] {Items.RUPEE50000, Items.RUPEE10000, Items.RUPEE10000, Items.RUPEE5000, Items.RUPEE5000, Items.RUPEE5000, Items.RUPEE5000, Items.RUPEE5000, Items.RUPEE5000});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE100000), new Object[] {Items.RUPEE50000, Items.RUPEE10000, Items.RUPEE10000, Items.RUPEE10000, Items.RUPEE5000, Items.RUPEE5000, Items.RUPEE5000, Items.RUPEE5000});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE100000), new Object[] {Items.RUPEE50000, Items.RUPEE10000, Items.RUPEE10000, Items.RUPEE10000, Items.RUPEE10000, Items.RUPEE5000, Items.RUPEE5000});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE100000), new Object[] {Items.RUPEE50000, Items.RUPEE10000, Items.RUPEE10000, Items.RUPEE10000, Items.RUPEE10000, Items.RUPEE10000});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE100000), new Object[] {Items.RUPEE50000, Items.RUPEE50000});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.RUPEE50000, 2), new Object[] {Items.RUPEE100000});
    }
}
