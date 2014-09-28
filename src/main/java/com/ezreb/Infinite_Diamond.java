package com.ezreb;

//import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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
    public static final String VERSION = "0.0.5";
    public static final String NAME = "Infinite Diamonds";
    
    public static Item item1;
    
    @Instance(value = MODID)
    public static Infinite_Diamond instance;
    
    @SidedProxy(clientSide="com.ezreb.client.ClientProxy", serverSide="com.ezreb.CommonProxy")
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent preInitEvent) {
    	item1 = GameRegistry.registerItem(new SuperDiamond(), "super_diamond", MODID);
    	
    }

	@EventHandler
    public void init(FMLInitializationEvent event)
    {
        System.out.println("You want diamonds? Fine, dupe them. Just be sure to have somthing to do!");
        ItemStack diamondBlock = new ItemStack(Blocks.diamond_block, 1);
        ItemStack superDia = new ItemStack(item1, 1);
        GameRegistry.addShapelessRecipe(superDia, diamondBlock, diamondBlock, diamondBlock, diamondBlock, diamondBlock, diamondBlock, diamondBlock, diamondBlock, diamondBlock);
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.diamond_block, 9), superDia);
        
    }
}
