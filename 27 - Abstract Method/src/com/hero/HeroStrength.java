package com.hero;

public class HeroStrength extends Hero{

	public HeroStrength(String name){
		super(name);
	}

	public void levelUp(){
		this.setLevel(10);
	}
}
