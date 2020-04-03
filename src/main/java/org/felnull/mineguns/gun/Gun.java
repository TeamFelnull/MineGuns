package org.felnull.mineguns.gun;

import org.felnull.mineguns.client.render.gun.animaiton.GunAnimation;
import org.felnull.mineguns.entity.BulletEntity;
import org.felnull.mineguns.gun.tyape.GunTyape;
import org.felnull.mineguns.item.GunItem;
import org.felnull.mineguns.registries.MGRegistrier;
import org.felnull.mineguns.registries.MGSoundEvents;
import org.felnull.mineguns.util.GunHelper;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.SnowballEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class Gun {
	private String Name;// 名前
	private GunTyape GunTyape;// 銃タイプ
	private int Burst;//バースド数（0でフルオート,1でセミオート)
	private int Capacity;// 装填数
	private float Damege;// 攻撃力
	private float Knockback;// ノックバック
	private float Propulsion;// 推進力
	private float Penetrating;// 貫通力、何体まで貫通するか
	private int Blaze;// 連射力、何ticに何発か
	private int Endurance;// 耐久力
	private float Accuracy;// 精度
	private int Hold; //構え速度

	public Gun(String name, GunTyape guntyape, int burst, int capacity, float damege,
			float knockback, float propulsion, float penetrating, int blaze, int endurance, float accuracy, int hold) {
		this.Name = name;
		this.Burst = burst;
		this.Capacity = capacity;
		this.Damege = damege;
		this.Knockback = knockback;
		this.Propulsion = propulsion;
		this.Penetrating = penetrating;
		this.Blaze = blaze;
		this.GunTyape = guntyape;
		this.Endurance = endurance;
		this.Accuracy = accuracy;
		this.Hold = hold;
	}

	public void shot(ItemStack itemstack, Entity attacker, World worldIn) {
		worldIn.playSound((PlayerEntity) null, attacker.func_226277_ct_(), attacker.func_226278_cu_(),
				attacker.func_226281_cx_(), MGSoundEvents.GUN_SHOT_HANDGUN, SoundCategory.NEUTRAL, 0.5F, 1);
		if (!worldIn.isRemote) {

					SnowballEntity snowballentity = new SnowballEntity(worldIn, (LivingEntity) attacker);
			//			snowballentity.func_213884_b(new ItemStack(MGItems.BULLET));
					snowballentity.shoot(attacker, attacker.rotationPitch, attacker.rotationYaw, 0.0F, 1.5F, 1.0F);

			BulletEntity bullete = new BulletEntity(worldIn);
			bullete.shoting(attacker.func_226277_ct_(), attacker.func_226280_cw_(), attacker.func_226281_cx_(),
					attacker.rotationYaw, attacker.rotationPitch);
			worldIn.addEntity(bullete);

			GunHelper.setShotCooldwon(itemstack, Blaze);
			GunHelper.setBurstCount(itemstack, GunHelper.getBurstCount(itemstack) + 1);
		}
	}

	public boolean canShot(ItemStack item, Entity attacker, World worldIn) {
		if ((item.getItem() instanceof GunItem) && (GunHelper.getShotCooldwon(item) <= 0)
				&& (GunHelper.getHoldProgress(item) == 0 || GunHelper.isMaxHolding(item))) {
			if (GunHelper.getBurstCount(item) <= (GunHelper.getBurst(item) - 1) || GunHelper.getBurst(item) <= 0)
				return true;
		}
		return false;
	}

	public void hold(ItemStack itemstack, Entity holder, World worldIn) {

	}

	public String getName() {
		return this.Name;
	}

	public GunTyape getGunTyape() {
		return this.GunTyape;
	}

	public GunAnimation getGunAnimation() {
		return MGRegistrier.getGunAnimation(this);
	}

	public int getBaseBurst() {
		return this.Burst;
	}

	public int getBaseCapacity() {
		return this.Capacity;
	}

	public float getBaseDamege() {
		return this.Damege * GunTyape.getDamegeCorrection();
	}

	public float getBaseKnockback() {
		return this.Knockback * GunTyape.getKnockbackCorrection();
	}

	public float getBasePropulsion() {
		return this.Propulsion * GunTyape.getPropulsionCorrection();
	}

	public float getBasePenetrating() {
		return this.Penetrating * GunTyape.getPenetratingCorrection();
	}

	public int getBaseBlaze() {
		return (int) (this.Blaze * GunTyape.getBlazeCorrection());
	}

	public int getBaseEndurance() {
		return (int) (this.Endurance * GunTyape.getEnduranceCorrection());
	}

	public float getBaseAccuracy() {
		return this.Accuracy * GunTyape.getAccuracyCorrection();
	}

	public int getBaseHold() {
		return (int) (this.Hold * GunTyape.getHoldCorrection());
	}
}
