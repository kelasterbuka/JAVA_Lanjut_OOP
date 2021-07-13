package com.tutorial;

public class HeroStrength extends Hero{
	String type = "Strength";

	// subclass constructor
	HeroStrength(String nameInput, double attackInput, double healthInput){
		super(nameInput, attackInput, healthInput);
	}

	@Override
	void display(){
		super.display();
		System.out.println("Type : " + this.type);
	}

	@Override
	void takeDamage(double damage){
		System.out.println(this.name + " receive half damage " + damage + " -> " + 0.5*damage);
		this.health = this.health - 0.5*damage;
	}
}
