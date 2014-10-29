package com.ezreb;

import net.minecraft.creativetab.CreativeTabs;
//import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SuperDiamondShard extends Item {
	SuperDiamondShard(int size) {
		String name = null;
		if (size==1) {
			name = "part";
		}
		if (size==2) {
			name = "shard";
		}
		if (size==3) {
			name = "chip";
		}
		if (size==4) {
			name = "rchip";
		}
		if (size==5) {
			name = "cchip";
		}
		if (size==6) {
			name = "rshard";
		}
		if (size==7) {
			name = "facet";
		}
		if (size==8) {
			name = "dpart";
		}
		if (size==9) {
			name = "rdiamond";
		}
		this.setMaxStackSize(64)
		.setCreativeTab(CreativeTabs.tabMaterials)
		.setUnlocalizedName("superDiamond"+name)
//		.setTextureName("infinitediamonds"+":superdiamond");
//		registerIcons(func_111206_d());
		//func_111206_d("infiniteDiamonds:superDiamond");
		//setMaxStackSize(1);
		//setCreativeTab(CreativeTabs.tabMaterials);
		//setUnlocalizedName("superDiamond");
		//setTextureName("infiniteDiamonds:superDiamond");
	}
}