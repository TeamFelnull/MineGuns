package org.felnull.mineguns;

import org.felnull.mineguns.item.MGItems;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class MGItemGroup {
	public static final ItemGroup MINEGUN_TAB = new ItemGroup("minegun") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(MGItems.TEST_ITEM);
		}
	};
}
