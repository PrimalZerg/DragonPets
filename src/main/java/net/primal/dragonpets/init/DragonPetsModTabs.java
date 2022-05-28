
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.primal.dragonpets.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class DragonPetsModTabs {
	public static CreativeModeTab TAB_DRAGONS;

	public static void load() {
		TAB_DRAGONS = new CreativeModeTab("tabdragons") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.DRAGON_EGG);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
