package com.hero;

public class Hero implements IAttack{
	private String name;
	private double health;

	public Hero(String name, double health){
		this.name = name;
		this.health = health;
	}

	// memaksa class ini untuk mengimplementasikan method attack
	public void attack(Hero enemy){
		System.out.println(this.name + " attacks " + enemy.name);
	}

	public void display(){
		System.out.println("Name: " + this.name);
		System.out.println("health: " + this.health);
	}
}
