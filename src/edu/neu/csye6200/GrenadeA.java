package edu.neu.csye6200;

public class GrenadeA extends AbstractExplosion{

	@Override
	public void explode() {
		System.out.println("Explode from Grenade A [Bang Bang Boom Boom]!!}");
	}
	
	@Override
	public String toString() {
		return GrenadeA.class.getName();
	}

}
