package com.ezreb;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
//import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SuperDiamond extends Item {
	SuperDiamond() {
		this.setMaxStackSize(1)
		.setCreativeTab(CreativeTabs.tabMaterials)
		.setUnlocalizedName("superDiamond")
		.setTextureName("infinitediamonds"+":superdiamond");
//		registerIcons(func_111206_d());
		//func_111206_d("infiniteDiamonds:superDiamond");
		//setMaxStackSize(1);
		//setCreativeTab(CreativeTabs.tabMaterials);
		//setUnlocalizedName("superDiamond");
		//setTextureName("infiniteDiamonds:superDiamond");
	}
}