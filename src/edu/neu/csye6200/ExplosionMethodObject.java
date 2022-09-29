package edu.neu.csye6200;

public class ExplosionMethodObject {
	public static void demo() {
		Explosion exp = new Explosion();
		Explosion gun = new GunShot();
		Explosion grenade = new Grenade();
		
		Object exp1 = new GunShot();
		Object exp2 = new Grenade();
		exp1.toString();
		exp2.toString();
		
		
		AbstractExplosion aGun = new GunShotA();
		AbstractExplosion aGre = new GrenadeA();
		
		Explodable iGun = new GunShotI();
		Explodable iGre = new GrenadeI();
		exp.explode();
		gun.explode();
		grenade.explode();
		aGun.explode();
		aGre.explode();
		iGun.explode();
		iGre.explode();
		ExplosionMethodObject s = new ExplosionMethodObject();
		System.out.println(s.toString());
	}
	
	@Override
	public String toString() {
		return ExplosionMethodObject.class.getName();
	}
}
