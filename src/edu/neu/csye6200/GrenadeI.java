package edu.neu.csye6200;

public class GrenadeI implements Explodable{

	@Override
	public void explode() {
		System.out.println("Explode from Grenade I [Bang Bang Boom Boom]!!}");
	}
	
	@Override
	public String toString() {
		return GrenadeI.class.getName();
	}
}
