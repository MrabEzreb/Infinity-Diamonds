package com.ezreb;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
//import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SuperDiamondShard extends Item {
	SuperDiamondShard(int size, CreativeTabs Tab) {
		String name = null;
		this.setMaxStackSize(64);
		int temperature = 0;
		if (size==1) {
			name = "part";
			setTextureName("infinitediamonds"+":superdiamond_half");
		}
		if (size==2) {
			name = "shard";
			setTextureName("infinitediamonds"+":superdiamond_shard");
		}
		if (size==3) {
			name = "chip";
			setTextureName("infinitediamonds"+":superdiamond_chip");
		}
		if (size==4) {
			name = "rchip";
			setTextureName("infinitediamonds"+":superdiamond_rchip");
		}
		if (size==5) {
			name = "cchip";
			setTextureName("infinitediamonds"+":superdiamond_cchip");
			setMaxStackSize(64);
			temperature = 5000;
			setMaxDamage(5000);
		}
		if (size==6) {
			name = "rshard";
			setTextureName("infinitediamonds"+":superdiamond_rshard");
		}
		if (size==7) {
			name = "facet";
			setTextureName("infinitediamonds"+":superdiamond_facet");
		}
		if (size==8) {
			name = "dpart";
			setTextureName("infinitediamonds"+":superdiamond_dpart");
		}
		if (size==9) {
			name = "rdiamond";
			setTextureName("infinitediamonds"+":superdiamond_rdiamond");
		}
		setCreativeTab(Tab)
		.setUnlocalizedName("superDiamond"+name);
//		.setTextureName("infinitediamonds"+":superdiamond");
//		registerIcons(func_111206_d());
		//func_111206_d("infiniteDiamonds:superDiamond");
		//setMaxStackSize(1);
		//setCreativeTab(CreativeTabs.tabMaterials);
		//setUnlocalizedName("superDiamond");
		//setTextureName("infiniteDiamonds:superDiamond");
	}
	@Override
	public void onUpdate(ItemStack p_77663_1_, World p_77663_2_,
			Entity p_77663_3_, int p_77663_4_, boolean p_77663_5_) {
		// TODO Auto-generated method stub
		super.onUpdate(p_77663_1_, p_77663_2_, p_77663_3_, p_77663_4_, p_77663_5_);
		int stackSize = p_77663_1_.stackSize;
		if(p_77663_1_==new ItemStack(Infinite_Diamond.item6,stackSize)) {
			p_77663_1_.setItemDamage(p_77663_1_.getItemDamage()-1);
			if(p_77663_1_.getItemDamage()==0) {
				p_77663_1_ = new ItemStack(Infinite_Diamond.item7, stackSize);
			} else if(p_77663_1_.isItemDamaged()==true) {
				p_77663_1_.getItem().showDurabilityBar(p_77663_1_);
			}
		}
	}
	@Override
	public boolean isDamageable() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean onItemUse(ItemStack p_77648_1_, EntityPlayer p_77648_2_,
			World p_77648_3_, int p_77648_4_, int p_77648_5_, int p_77648_6_,
			int p_77648_7_, float p_77648_8_, float p_77648_9_,
			float p_77648_10_) {
		// TODO Auto-generated method stub
		super.onItemUse(p_77648_1_, p_77648_2_, p_77648_3_, p_77648_4_, p_77648_5_,
						p_77648_6_, p_77648_7_, p_77648_8_, p_77648_9_, p_77648_10_);
		p_77648_1_.setItemDamage(p_77648_1_.getItemDamage()-100);
		return true;
	}
}