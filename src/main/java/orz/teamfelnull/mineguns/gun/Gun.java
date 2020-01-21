package orz.teamfelnull.mineguns.gun;

import java.util.Random;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.renderer.entity.PlayerRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.SnowballEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderSpecificHandEvent;
import orz.teamfelnull.mineguns.util.GunHelper;

public class Gun {
	private String Name;//名前
	private GunTyape GunTyape;//銃タイプ
	private boolean Semi;//セミオートかどうか
	private int Capacity;//装填数
	private float Damege;//攻撃力
	private float Knockback;//ノックバック
	private float Propulsion;//推進力
	private float Penetrating;//貫通力、何体まで貫通するか
	private int Blaze;//連射力、何ticに何発か
	private int Endurance;//耐久力
	private float Accuracy;//精度

	public Gun(String name, GunTyape guntyape, boolean semi, int capacity, float damege, float knockback,
			float propulsion, float penetrating, int blaze, int endurance, float accuracy) {
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

	public void renderSpecificHand(RenderSpecificHandEvent e) {
		Minecraft mc = Minecraft.getInstance();
		GL11.glPushMatrix();
		AbstractClientPlayerEntity abstractclientplayerentity = mc.player;
		PlayerRenderer playerrenderer = (PlayerRenderer) mc.getRenderManager().getRenderer(abstractclientplayerentity);
		playerrenderer.func_225627_b_(abstractclientplayerentity, 1);

		GL11.glPopMatrix();

		e.setCanceled(true);
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

			GunHelper.setShotCooldwon(item, Blaze);
		}
	}

	public String getName() {
		return this.Name;
	}

	public GunTyape getGunTyape() {
		return this.GunTyape;
	}

	public boolean isBaseSemiAuto() {
		return this.Semi;
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
}
