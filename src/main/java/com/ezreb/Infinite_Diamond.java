package com.ezreb;

//import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(name = Infinite_Diamond.NAME, modid = Infinite_Diamond.MODID, version = Infinite_Diamond.VERSION)
public class Infinite_Diamond
{
    public static final String MODID = "infinitediamonds";
    public static final String VERSION = "0.0.9";
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
    	CreativeTabs infiniteDiamondLXXXIITab = new CreativeTabs("infiniteDiamondLXXXII") {
    		@Override
    		@SideOnly(Side.CLIENT)
    		public Item getTabIconItem() {
    			return item1;
    		}
    	};
    	item1 = GameRegistry.registerItem(new SuperDiamond(infiniteDiamondLXXXIITab), "super_diamond", MODID);
    	item2 = GameRegistry.registerItem(new SuperDiamondShard(1, infiniteDiamondLXXXIITab), "super_diamond_part", MODID);
    	item3 = GameRegistry.registerItem(new SuperDiamondShard(2, infiniteDiamondLXXXIITab), "super_diamond_shard", MODID);
    	item4 = GameRegistry.registerItem(new SuperDiamondShard(3, infiniteDiamondLXXXIITab), "super_diamond_chip", MODID);
    	item5 = GameRegistry.registerItem(new SuperDiamondShard(4, infiniteDiamondLXXXIITab), "super_diamond_rchip", MODID);
    	item6 = GameRegistry.registerItem(new SuperDiamondShard(5, infiniteDiamondLXXXIITab), "super_diamond_cchip", MODID);
    	item7 = GameRegistry.registerItem(new SuperDiamondShard(6, infiniteDiamondLXXXIITab), "super_diamond_rshard", MODID);
    	item8 = GameRegistry.registerItem(new SuperDiamondShard(7, infiniteDiamondLXXXIITab), "super_diamond_facet", MODID);
    	item9 = GameRegistry.registerItem(new SuperDiamondShard(8, infiniteDiamondLXXXIITab), "super_diamond_dpart", MODID);
    	item10 = GameRegistry.registerItem(new SuperDiamondShard(9, infiniteDiamondLXXXIITab), "super_diamond_rawd", MODID);
    	
    }

	@EventHandler
    public void init(FMLInitializationEvent event)
    {
        System.out.println("You want diamonds? Fine, dupe them. Just be sure to have somthing to do!");
        ItemStack diamondBlock = new ItemStack(Blocks.diamond_block, 1);
        ItemStack superDia = new ItemStack(item1, 1);
        ItemStack superDiaPart1 = new ItemStack(item2, 41);
        ItemStack superDiaPart2 = new ItemStack(item2, 1);
        ItemStack superDiaShard1 = new ItemStack(item3, 4);
        ItemStack superDiaShard2 = new ItemStack(item3, 1);
        ItemStack superDiaChip1 = new ItemStack(item4, 4);
        ItemStack superDiaChip2 = new ItemStack(item4, 1);
        ItemStack superDiaRChip1 = new ItemStack(item5, 1);
        ItemStack superDiaRChip2 = new ItemStack(item5, 1);
        ItemStack superDiaCChip1 = new ItemStack(item6, 1);
        ItemStack superDiaCChip2 = new ItemStack(item6, 4);
        ItemStack superDiaRShard1 = new ItemStack(item7, 1);
        ItemStack superDiaRShard2 = new ItemStack(item7, 1);
        ItemStack superDiaFacet1 = new ItemStack(item8, 2);
        ItemStack superDiaFacet2 = new ItemStack(item8, 1);
        ItemStack superDiaDPart1 = new ItemStack(item9, 1);
        ItemStack superDiaDPart2 = new ItemStack(item9, 1);
        ItemStack superDiaRDia1 = new ItemStack(item10, 1);
        ItemStack superDiaRDia2 = new ItemStack(item10, 1);
        ItemStack superDiaDia1 = new ItemStack(Items.diamond, 1);
        GameRegistry.addShapelessRecipe(superDia, diamondBlock, diamondBlock, diamondBlock, diamondBlock, diamondBlock, diamondBlock, diamondBlock, diamondBlock, diamondBlock);
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.diamond_block, 9), superDia);
        GameRegistry.addSmelting(superDia, superDiaPart1, (float) 0.1);
        GameRegistry.addSmelting(superDiaPart2, superDiaShard1, (float) 0.1);
        GameRegistry.addSmelting(superDiaShard2, superDiaChip1, (float) 0.1);
        GameRegistry.addSmelting(superDiaChip2, superDiaRChip1, (float) 0.1);
        GameRegistry.addShapelessRecipe(superDiaCChip1, superDiaRChip2);
        GameRegistry.addShapelessRecipe(superDiaRShard1, superDiaCChip1, superDiaCChip1, superDiaCChip1, superDiaCChip1);
        GameRegistry.addSmelting(superDiaRShard2, superDiaFacet1, (float) 0.1);
        GameRegistry.addSmelting(superDiaFacet2, superDiaDPart1, (float) 0.1);
        GameRegistry.addShapelessRecipe(superDiaRDia1, superDiaDPart2, superDiaDPart2, superDiaDPart2, superDiaDPart2);
        GameRegistry.addSmelting(superDiaRDia2, superDiaDia1, (float) 0.1);
        
    }
}
