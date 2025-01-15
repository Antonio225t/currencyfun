package com.github.antonio225t.currencyfun;

import com.github.antonio225t.currencyfun.proxy.CommonProxy;
import com.github.antonio225t.currencyfun.registry.CreativeTab;
import com.github.antonio225t.currencyfun.registry.Items;
import com.github.antonio225t.currencyfun.registry.Recipes;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;

@Mod(modid = CurrencyFun.MODID, useMetadata=true)
public class CurrencyFun {

    public static final String MODID = "currencyfun";
    public static final Logger LOGGER = LogManager.getLogger();

    public static final CreativeTabs MODTAB = new CreativeTab("currencyfun");
    public static Config config;

    @SidedProxy(serverSide = "com.github.antonio225t.currencyfun.proxy.CommonProxy", clientSide = "com.github.antonio225t.currencyfun.proxy.ClientProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        LOGGER.info("Loading config...");
        e.getModConfigurationDirectory().mkdirs();
        File confile = new File (e.getModConfigurationDirectory() + "/" + MODID + ".cfg");
        Config.init(confile);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        LOGGER.info("Registering items...");
        Items.registerItems();
        LOGGER.info("Registering recipes...");
        Recipes.registerRecipes();
        LOGGER.info("Registring handle for mobs...");
        MinecraftForge.EVENT_BUS.register(new EventHandler());
        LOGGER.info("Mod loaded!");
    }
}
