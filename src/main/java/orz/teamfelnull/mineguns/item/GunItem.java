package orz.teamfelnull.mineguns.item;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import orz.teamfelnull.mineguns.gun.Gun;

public class GunItem extends Item {
	private Gun Gun;

	public GunItem(Item.Properties builder, Gun gun) {
		super(builder.maxStackSize(1));

		this.Gun = gun;

	}

	public Gun getGun() {
		return Gun;
	}

	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip,
			ITooltipFlag flagIn) {

		tooltip.add(new TranslationTextComponent(""));
		tooltip.add(new TranslationTextComponent("item.modifiers.mainoroff").applyTextStyle(TextFormatting.GRAY));
		tooltip.add(new TranslationTextComponent(
				" " + I18n.format("attribute.name.generic.damegecorrection", Gun.getDamege()))
						.applyTextStyle(TextFormatting.DARK_RED));

	}
}
