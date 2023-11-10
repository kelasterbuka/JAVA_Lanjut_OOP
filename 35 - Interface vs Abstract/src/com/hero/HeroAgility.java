package com.hero;

public class HeroAgility extends Hero implements IAttackSkill {

	public HeroAgility(String name, double health){
		super(name,health);
	}

	public void attack(Hero enemy){
		System.out.println(this.getName() + " menyerang " + enemy.getName());
	}
	
}
