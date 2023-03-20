package com.hero;

public class HeroAgility extends Hero{
	public String nickname;
	private String heroType = "Agility";

	public HeroAgility(String name, double health){
		super(name,health);
	}

	public void displayAll(){
		this.display();
		System.out.println("heroType: "+this.heroType);
		System.out.println("nickname: "+this.nickname);
	}

	private void setHeroType(String heroType){
		this.heroType = heroType;
	}
}
