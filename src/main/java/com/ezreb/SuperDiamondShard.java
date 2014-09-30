package com.ezreb;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
//import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SuperDiamondShard extends Item {
	SuperDiamondShard(int size) {
		String name;
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
			name = "refinedchip";
		}
		if (size==5) {
			name = "cooledchip";
		}
		if (size==6) {
			name = "refinedshard";
		}
		if (size==7) {
			name = "diamondfacet";
		}
		if (size==8) {
			name = "diamondpart";
		}
		if (size==9) {
			name = "rawdiamond";
		}
		this.setMaxStackSize(64)
		.setCreativeTab(CreativeTabs.tabMaterials)
		.setUnlocalizedName("superDiamond"+name)
		.setTextureName("infinitediamonds"+":superdiamond"+name);
//		registerIcons(func_111206_d());
		//func_111206_d("infiniteDiamonds:superDiamond");
		//setMaxStackSize(1);
		//setCreativeTab(CreativeTabs.tabMaterials);
		//setUnlocalizedName("superDiamond");
		//setTextureName("infiniteDiamonds:superDiamond");
	}
}