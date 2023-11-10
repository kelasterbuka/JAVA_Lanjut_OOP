package com.tutorial;

import com.hero.Hero;

public class Main {
	public static void main(String[] args) {

		Hero hero1 = new Hero("ucup",100);
		Hero hero2 = new Hero("otong",20);
		
		hero1.attack(hero2);
	}
}
