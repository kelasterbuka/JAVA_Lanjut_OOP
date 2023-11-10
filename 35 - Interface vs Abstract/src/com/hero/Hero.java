package com.hero;

public class Hero {
	private String name;
	private double health;

	public Hero(String name, double health){
		this.name = name;
		this.health = health;
	}

	public String getName(){
		return this.name;
	}

	public double getHealth(){
		return this.health;
	}

	public void display(){
		System.out.println("Name : " + this.name);
		System.out.println("Health : " + this.health);
	}
}
