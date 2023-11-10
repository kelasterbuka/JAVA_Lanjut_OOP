package com.tutorial;

import com.hero.HeroAgility;
import com.hero.HeroIntel;

public class Main {
	public static void main(String[] args) {

		HeroAgility hero1 = new HeroAgility("Ucup", 100);
		HeroIntel hero2 = new HeroIntel("Otong", 20);

		hero1.display();
		hero1.attack(hero2);
		hero2.spell(hero1);
	}
}
