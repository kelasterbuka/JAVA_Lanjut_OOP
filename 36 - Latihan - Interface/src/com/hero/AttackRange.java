package com.hero;

public class AttackRange implements IAttackSkill {
	private double power;
	private double range;

	public AttackRange(double power, double range){
		this.power = power;
		this.range = range;
	}

	public void attack(Hero enemy){
		System.out.println("Attack " + enemy.getName() + " with power " + this.power + " at range " + this.range);
	}
}
