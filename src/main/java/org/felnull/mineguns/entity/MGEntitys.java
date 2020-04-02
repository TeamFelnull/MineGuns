package org.felnull.mineguns.entity;

import org.felnull.mineguns.MineGuns;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.registries.IForgeRegistry;

public class MGEntitys {
	public static final EntityType<BulletEntity> BULETT = EntityType.Builder
			.<BulletEntity> create(BulletEntity::new, EntityClassification.MISC).size(0.03F,
					0.03F)
			.setTrackingRange(150).setUpdateInterval(1).setShouldReceiveVelocityUpdates(true)
			.setCustomClientFactory(BulletEntity::new)
			.build(MineGuns.MODID + ":test_bullet");

	public static void registerEntityType(IForgeRegistry<EntityType<?>> r) {
		r.register(BULETT.setRegistryName(MineGuns.MODID, "test_bullet"));

	}
}
