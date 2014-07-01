package com.syiseiko.salvationfurnace;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.syiseiko.salvationfurnace.lib.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION)
public class SalvationFurnace {
	/**
	 * Initilize everything in the mod
	 * @param event - The pre-initilization event passed by FML
	 */
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		/** Smelting Recipies **/
		/* Stone Tools/Weapon */
		GameRegistry.addSmelting(Items.stone_axe, new ItemStack(Blocks.stone, 3, 1), 0.0f);
		GameRegistry.addSmelting(Items.stone_hoe, new ItemStack(Blocks.stone, 2, 1), 0.0f);
		GameRegistry.addSmelting(Items.stone_pickaxe, new ItemStack(Blocks.stone, 3, 1), 0.0f);
		GameRegistry.addSmelting(Items.stone_shovel, new ItemStack(Blocks.stone, 1, 1), 0.0f);
		GameRegistry.addSmelting(Items.stone_sword, new ItemStack(Blocks.stone, 2, 1), 0.0f);

		/* Leather Armor */
		GameRegistry.addSmelting(Items.leather_helmet, new ItemStack(Items.coal, 5, 1), 0.0f);
		GameRegistry.addSmelting(Items.leather_chestplate, new ItemStack(Items.coal, 8, 1), 0.0f);
		GameRegistry.addSmelting(Items.leather_leggings, new ItemStack(Items.coal, 7, 1), 0.0f);
		GameRegistry.addSmelting(Items.leather_boots, new ItemStack(Items.coal, 4, 1), 0.0f);

		/* Iron */
		GameRegistry.addSmelting(Items.iron_axe, new ItemStack(Items.iron_ingot, 3, 1), 0.0f);
		GameRegistry.addSmelting(Items.iron_hoe, new ItemStack(Items.iron_ingot, 2, 1), 0.0f);
		GameRegistry.addSmelting(Items.iron_pickaxe, new ItemStack(Items.iron_ingot, 3, 1), 0.0f);
		GameRegistry.addSmelting(Items.iron_shovel, new ItemStack(Items.iron_ingot, 1, 1), 0.0f);
		GameRegistry.addSmelting(Items.iron_sword, new ItemStack(Items.iron_ingot, 2, 1), 0.0f);
		GameRegistry.addSmelting(Items.chainmail_helmet, new ItemStack(Items.iron_ingot, 5), 0.0f);
		GameRegistry.addSmelting(Items.chainmail_chestplate, new ItemStack(Items.iron_ingot, 8), 0.0f);
		GameRegistry.addSmelting(Items.chainmail_leggings, new ItemStack(Items.iron_ingot, 7), 0.0f);
		GameRegistry.addSmelting(Items.chainmail_boots, new ItemStack(Items.iron_ingot, 4), 0.0f);
		GameRegistry.addSmelting(Items.iron_helmet, new ItemStack(Items.iron_ingot, 5), 0.0f);
		GameRegistry.addSmelting(Items.iron_chestplate, new ItemStack(Items.iron_ingot, 8), 0.0f);
		GameRegistry.addSmelting(Items.iron_leggings, new ItemStack(Items.iron_ingot, 7), 0.0f);
		GameRegistry.addSmelting(Items.iron_boots, new ItemStack(Items.iron_ingot, 4), 0.0f);
		GameRegistry.addSmelting(Items.iron_horse_armor, new ItemStack(Items.iron_ingot, 6), 0.0f);

		/* Gold */
		GameRegistry.addSmelting(Items.golden_axe, new ItemStack(Items.gold_ingot, 3, 1), 0.0f);
		GameRegistry.addSmelting(Items.golden_hoe, new ItemStack(Items.gold_ingot, 2, 1), 0.0f);
		GameRegistry.addSmelting(Items.golden_pickaxe, new ItemStack(Items.gold_ingot, 3, 1), 0.0f);
		GameRegistry.addSmelting(Items.golden_shovel, new ItemStack(Items.gold_ingot, 1, 1), 0.0f);
		GameRegistry.addSmelting(Items.golden_sword, new ItemStack(Items.gold_ingot, 2, 1), 0.0f);
		GameRegistry.addSmelting(Items.golden_helmet, new ItemStack(Items.gold_ingot, 5), 0.0f);
		GameRegistry.addSmelting(Items.golden_chestplate, new ItemStack(Items.gold_ingot, 8), 0.0f);
		GameRegistry.addSmelting(Items.golden_leggings, new ItemStack(Items.gold_ingot, 7), 0.0f);
		GameRegistry.addSmelting(Items.golden_boots, new ItemStack(Items.gold_ingot, 4), 0.0f);
		GameRegistry.addSmelting(Items.golden_horse_armor, new ItemStack(Items.gold_ingot, 6), 0.0f);

		/* Diamond */
		GameRegistry.addSmelting(Items.diamond_axe, new ItemStack(Items.diamond, 3, 1), 0.0f);
		GameRegistry.addSmelting(Items.diamond_hoe, new ItemStack(Items.diamond, 2, 1), 0.0f);
		GameRegistry.addSmelting(Items.diamond_pickaxe, new ItemStack(Items.diamond, 3, 1), 0.0f);
		GameRegistry.addSmelting(Items.diamond_shovel, new ItemStack(Items.diamond, 1, 1), 0.0f);
		GameRegistry.addSmelting(Items.diamond_sword, new ItemStack(Items.diamond, 2, 1), 0.0f);
		GameRegistry.addSmelting(Items.diamond_helmet, new ItemStack(Items.diamond, 5), 0.0f);
		GameRegistry.addSmelting(Items.diamond_chestplate, new ItemStack(Items.diamond, 8), 0.0f);
		GameRegistry.addSmelting(Items.diamond_leggings, new ItemStack(Items.diamond, 7), 0.0f);
		GameRegistry.addSmelting(Items.diamond_boots, new ItemStack(Items.diamond, 4), 0.0f);
		GameRegistry.addSmelting(Items.diamond_horse_armor, new ItemStack(Items.diamond, 6), 0.0f);
	}
}
