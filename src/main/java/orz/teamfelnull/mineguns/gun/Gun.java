package orz.teamfelnull.mineguns.gun;

import java.util.Random;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.SnowballEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class Gun {
	private String Name;//名前
	private GunTyape GunTyape;//銃タイプ
	private boolean Semi;//セミオートかどうか
	private int Capacity;//装填数
	private float Damege;//攻撃力
	private float Knockback;//ノックバック
	private float Propulsion;//推進力
	private float Penetrating;//貫通力、何体まで貫通するか
	private float Blaze;//連射力、秒間何発か
	private int Endurance;//耐久力
	private float Accuracy;//精度

	public Gun(String name, GunTyape guntyape, boolean semi, int capacity, float damege, float knockback,
			float propulsion, float penetrating, float blaze, int endurance, float accuracy) {
		this.Name = name;
		this.Semi = semi;
		this.Capacity = capacity;
		this.Damege = damege;
		this.Knockback = knockback;
		this.Propulsion = propulsion;
		this.Penetrating = penetrating;
		this.Blaze = blaze;
		this.GunTyape = guntyape;
		this.Endurance = endurance;
		this.Accuracy = accuracy;
	}

	public void shot(ItemStack item, Entity attacker, World worldIn) {
		worldIn.playSound((PlayerEntity) null, attacker.func_226277_ct_(), attacker.func_226278_cu_(),
				attacker.func_226281_cx_(), SoundEvents.ENTITY_SNOWBALL_THROW, SoundCategory.NEUTRAL, 0.5F,
				0.4F / (new Random().nextFloat() * 0.4F + 0.8F));
		if (!worldIn.isRemote) {
			SnowballEntity snowballentity = new SnowballEntity(worldIn, (LivingEntity) attacker);
			snowballentity.func_213884_b(item);
			snowballentity.shoot(attacker, attacker.rotationPitch, attacker.rotationYaw, 0.0F, 1.5F, 1.0F);
			worldIn.addEntity(snowballentity);
		}
	}

	public String getName() {
		return this.Name;
	}

	public GunTyape getGunTyape() {
		return this.GunTyape;
	}

	public boolean isSemiAuto() {
		return this.Semi;
	}

	public int getCapacity() {
		return this.Capacity;
	}

	public float getDamege() {
		return this.Damege * GunTyape.getDamegeCorrection();
	}

	public float getKnockback() {
		return this.Knockback * GunTyape.getKnockbackCorrection();
	}

	public float getPropulsion() {
		return this.Propulsion * GunTyape.getPropulsionCorrection();
	}

	public float getPenetrating() {
		return this.Penetrating * GunTyape.getPenetratingCorrection();
	}

	public float getBlaze() {
		return this.Blaze * GunTyape.getBlazeCorrection();
	}

	public int getEndurance() {
		return (int) (this.Endurance * GunTyape.getEnduranceCorrection());
	}

	public float getAccuracy() {
		return this.Accuracy * GunTyape.getAccuracyCorrection();
	}
}
