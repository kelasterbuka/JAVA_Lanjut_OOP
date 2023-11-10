package com.hero;

public abstract class Hero {
	private String name;
	private double health;
	private IAttackSkill attackSkill;


	public Hero(String name, double health){
		this.name = name;
		this.health = health;
	}

	public void setAttackSkill(IAttackSkill attackskill){
		this.attackSkill = attackskill;
	}

	public void attack(Hero enemy){
		System.out.println(this.name + " is attacking ");
		this.attackSkill.attack(enemy);
	}

	public String getName(){
		return this.name;
	}

	public void display(){
		System.out.println("Name : " + this.name);
		System.out.println("Health : " + this.health);
	}
}
