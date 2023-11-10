package com.hero;

public class AttackMelee implements IAttackSkill{
	private double power;

	public AttackMelee(double power){
		this.power = power;
	}

	public void attack(Hero enemy){
		System.out.println("Attack " + enemy.getName() + " with melee " + this.power);
	}
}
