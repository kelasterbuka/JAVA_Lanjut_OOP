package com.tutorial;

public class Main {
	public static void main(String[] args) {
		Hero hero1 = new Hero("Ucup");
		HeroStrength hero2 = new HeroStrength("Otong");
		hero1.display();
		hero2.display();

		// Polymorphic
		Hero hero3 = new HeroAgility("Maria");
		hero3.display();

		HeroAgility hero4 = new HeroAgility("Mahmud");
		hero4.display();
		hero4.showoff();
		// tidak bisa
		// HeroIntel hero4 = new Hero("Mahmud");
		// hero4.display();

		// Array list
		Hero[] kumpulanHero = new Hero[4];
		kumpulanHero[0] = hero1;
		kumpulanHero[1] = hero2;
		kumpulanHero[2] = hero3;
		kumpulanHero[3] = hero4; // casting

		kumpulanHero[0].display();
		kumpulanHero[1].display();
		kumpulanHero[2].display();

		// method calls
		// kumpulanHero[3].showoff(); // ini tidak bisa
		hero4.showoff();

		// aplikasi
		hero1.attack(hero2);
		hero1.attack(hero3);
		hero1.attack(hero4);

	}
}
