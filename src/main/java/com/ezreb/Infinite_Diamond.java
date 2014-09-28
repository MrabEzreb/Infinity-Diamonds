package com.ezreb;

import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(name = Infinite_Diamond.NAME, modid = Infinite_Diamond.MODID, version = Infinite_Diamond.VERSION)
public class Infinite_Diamond
{
    public static final String MODID = "Infinite Diamonds";
    public static final String VERSION = "1.0";
    public static final String NAME = "Infinite Diamonds";
    
    @Instance(value = MODID)
    public static Infinite_Diamond instance;
    
    @SidedProxy(clientSide="com.ezreb.client.ClientProxy", serverSide="com.ezreb.CommonProxy")
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent preInitEvent) {
    	Item item1 = new SuperDiamond();
    	GameRegistry.registerItem(item1, "superDiamondEzreb");
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        System.out.println("You want diamonds? Fine, dupe them. Just be sure to have somthing to do!");
    }
}
