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
    public static Item item2;
    public static Item item3;
    public static Item item4;
    public static Item item5;
    public static Item item6;
    public static Item item7;
    public static Item item8;
    public static Item item9;
    public static Item item10;
    
    @Instance(value = MODID)
    public static Infinite_Diamond instance;
    
    @SidedProxy(clientSide="com.ezreb.client.ClientProxy", serverSide="com.ezreb.CommonProxy")
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent preInitEvent) {
    	item1 = GameRegistry.registerItem(new SuperDiamond(), "super_diamond", MODID);
    	item2 = GameRegistry.registerItem(new SuperDiamondShard(1), "super_diamond_part", MODID);
    	item3 = GameRegistry.registerItem(new SuperDiamondShard(2), "super_diamond_shard", MODID);
    	item4 = GameRegistry.registerItem(new SuperDiamondShard(3), "super_diamond_chip", MODID);
    	item5 = GameRegistry.registerItem(new SuperDiamondShard(4), "super_diamond_rchip", MODID);
    	item6 = GameRegistry.registerItem(new SuperDiamondShard(5), "super_diamond_cchip", MODID);
    	item7 = GameRegistry.registerItem(new SuperDiamondShard(6), "super_diamond_rshard", MODID);
    	item8 = GameRegistry.registerItem(new SuperDiamondShard(7), "super_diamond_facet", MODID);
    	item9 = GameRegistry.registerItem(new SuperDiamondShard(8), "super_diamond_dpart", MODID);
    	item10 = GameRegistry.registerItem(new SuperDiamondShard(9), "super_diamond_rawd", MODID);
    	
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
