package com.ezreb;

import net.minecraft.creativetab.CreativeTabs;
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
    public static final String MODID = "infinitediamonds";
    public static final String VERSION = "0.0.1";
    public static final String NAME = "Infinite Diamonds";
    
    public static Item item1;
    
    @Instance(value = MODID)
    public static Infinite_Diamond instance;
    
    @SidedProxy(clientSide="com.ezreb.client.ClientProxy", serverSide="com.ezreb.CommonProxy")
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent preInitEvent) {
    	item1 = new SuperDiamond()
    		.setMaxStackSize(1)
			.setCreativeTab(CreativeTabs.tabMaterials)
			.setUnlocalizedName("superDiamond")
			.setTextureName("infinitediamonds:superdiamond");
//			.registerIcons(func_111206_d());
    		//.func_111206_d("infiniteDiamonds:superDiamond");
    	GameRegistry.registerItem(item1, "super_diamond");
    	
    }

	@EventHandler
    public void init(FMLInitializationEvent event)
    {
        System.out.println("You want diamonds? Fine, dupe them. Just be sure to have somthing to do!");
    }
}
