package orz.teamfelnull.mineguns.item;

import net.minecraft.item.Item;
import orz.teamfelnull.mineguns.gun.Gun;

public class GunItem extends Item {
	private Gun Gun;

	public GunItem(Item.Properties builder, Gun gun) {
		super(builder);
		this.Gun = gun;
	}

	public Gun getGun() {
		return Gun;
	}
}
