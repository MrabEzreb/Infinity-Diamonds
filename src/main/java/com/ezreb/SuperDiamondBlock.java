package com.ezreb;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class SuperDiamondBlock extends Block {
	SuperDiamondBlock(CreativeTabs tab, boolean isNew) {
		super(Material.iron);
		setHardness(25F).setStepSound(soundTypeMetal)
		.setBlockName("SuperDiamondBlock").setCreativeTab(tab)
		.setHarvestLevel("pickaxe", 3);
		String newIs = "";
		if(isNew==true) {
			newIs = "_new";
		}
		setBlockTextureName("infinitediamonds"+":super_diamond_block"+newIs);
	}
}
