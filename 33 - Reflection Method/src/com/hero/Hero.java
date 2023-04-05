package com.hero;

public abstract class Hero {
	private String name;
	private double health;

	Hero(String name, double health){
		this.name = name;
		this.health = health;
	}

	void display(){
		System.out.println("Name: " + this.name);
		System.out.println("Health: " + this.health);
	}
}
