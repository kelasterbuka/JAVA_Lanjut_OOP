package com.hero;

// abstract class
public abstract class Hero {
	private String name;
	private int level;
	public Hero(String name){
		this.name = name;
		this.level = 1;
	}

	public void display(){
		System.out.println("Aku adalah "+this.name);
		System.out.println("Level " + this.level);
	}

	// abstract method
	public abstract void levelUp();

	// setter
	public void setLevel(int deltaLevel){
		this.level += deltaLevel;
	}
}
