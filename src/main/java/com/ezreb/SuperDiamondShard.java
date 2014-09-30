package com.ezreb;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
//import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SuperDiamondShard extends Item {
	SuperDiamondShard() {
		this.setMaxStackSize(1)
		.setCreativeTab(CreativeTabs.tabMaterials)
		.setUnlocalizedName("superDiamondShard")
		.setTextureName("infinitediamonds"+":superdiamondshard");
//		registerIcons(func_111206_d());
		//func_111206_d("infiniteDiamonds:superDiamond");
		//setMaxStackSize(1);
		//setCreativeTab(CreativeTabs.tabMaterials);
		//setUnlocalizedName("superDiamond");
		//setTextureName("infiniteDiamonds:superDiamond");
	}
}