package org.felnull.mineguns.entity;

import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.network.FMLPlayMessages;
import net.minecraftforge.fml.network.NetworkHooks;

public class BulletEntity extends Entity implements IProjectile {
	public boolean inGround;
	public float speed;

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
		this.inGround = compound.getBoolean("inGround");
		this.speed = compound.getFloat("speed");
	}

	@Override
	protected void writeAdditional(CompoundNBT compound) {
		compound.putBoolean("inGround", this.inGround);
		compound.putFloat("speed", this.speed);
	}

	@Override
	public IPacket<?> createSpawnPacket() {

		return NetworkHooks.getEntitySpawningPacket(this);
	}

	public void onHitBlock(BlockState blockstate, BlockPos blockpos) {
		this.world.playSound((PlayerEntity) null, this.func_226277_ct_(), this.func_226278_cu_(),
				this.func_226281_cx_(), SoundEvents.BLOCK_ANVIL_PLACE, SoundCategory.NEUTRAL, 0.5F, 1);

		this.remove();
	}

	public void onHitEntity(Entity entity) {
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).setLastAttackedEntity(entity);
		}

		this.world.playSound((PlayerEntity) null, this.func_226277_ct_(), this.func_226278_cu_(),
				this.func_226281_cx_(), SoundEvents.BLOCK_ANVIL_PLACE, SoundCategory.NEUTRAL, 0.5F, 1);

		this.remove();
	}

	@Override
	public void tick() {
		this.prevRotationYaw = this.rotationYaw;
		this.prevRotationPitch = this.rotationPitch;

		this.setMotion(this.getLookVec());

		Vec3d vec3d = this.getMotion();

		BlockPos blockpos = new BlockPos(this);
		BlockState blockstate = this.world.getBlockState(blockpos);

		if (!blockstate.isAir(this.world, blockpos)) {
			VoxelShape voxelshape = blockstate.getCollisionShape(this.world, blockpos);
			if (!voxelshape.isEmpty()) {
				Vec3d vec3d1 = this.getPositionVec();

				for (AxisAlignedBB axisalignedbb : voxelshape.toBoundingBoxList()) {
					if (axisalignedbb.offset(blockpos).contains(vec3d1)) {
						this.onHitBlock(blockstate, blockpos);
						break;
					}
				}
			}
		}

		double d3 = vec3d.x / 20;
		double d4 = vec3d.y / 20;
		double d0 = vec3d.z / 20;

		double d5 = this.func_226277_ct_() + d3;
		double d1 = this.func_226278_cu_() + d4;
		double d2 = this.func_226281_cx_() + d0;
		this.setPosition(d5, d1, d2);
	}

	@Override
	public void shoot(double x, double y, double z, float velocity, float inaccuracy) {
		this.setPosition(x, y, z);
	}

	public void shoting(double x, double y, double z, float yaw, float pitch) {
		shoot(x, y, z, 0, 0);
		this.rotationYaw = yaw;
		this.rotationPitch = pitch;
		this.speed = 0;

	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public boolean isInRangeToRenderDist(double distance) {

		//	return distance <= 30;
		return distance <= 1000;
	}
}
