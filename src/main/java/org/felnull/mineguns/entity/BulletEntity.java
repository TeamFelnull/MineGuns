package org.felnull.mineguns.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.IProjectile;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.network.FMLPlayMessages;
import net.minecraftforge.fml.network.NetworkHooks;

public class BulletEntity extends Entity implements IProjectile {

	public BulletEntity(EntityType<?> entityTypeIn, World worldIn) {
		super(entityTypeIn, worldIn);

	}

	public BulletEntity(World world) {
		this(MGEntitys.BULETT, world);
	}

	public BulletEntity(FMLPlayMessages.SpawnEntity spawnEntity, World world) {
		this(MGEntitys.BULETT, world);
	}

	@Override
	protected void registerData() {

	}

	@Override
	protected void readAdditional(CompoundNBT compound) {

	}

	@Override
	protected void writeAdditional(CompoundNBT compound) {

	}

	@Override
	public IPacket<?> createSpawnPacket() {

		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	public void shoot(double x, double y, double z, float velocity, float inaccuracy) {
		this.setPosition(x, y, z);
	}

	@Override
	public void tick() {
		this.prevRotationYaw = this.rotationYaw;
		this.prevRotationPitch = this.rotationPitch;
	}

	public void shoting(double x, double y, double z, float yaw, float pitch) {
		shoot(x, y, z, 0, 0);

		this.rotationYaw = yaw;
		this.rotationPitch = pitch;
		System.out.println(rotationPitch + " : " + rotationYaw);
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public boolean isInRangeToRenderDist(double distance) {

		//	return distance <= 30;
		return true;
	}
}
