package com.tutorial;

// import com.hero.Hero;
import com.hero.HeroIntel;
import com.hero.HeroAgility;

public class Main {
	
	public static void main(String[] args) {
		
		// membuat object dari kelas non-abstract
		HeroIntel hero1 = new HeroIntel("Otong");
		hero1.display();

		HeroAgility hero2= new HeroAgility("Mario");
		hero2.display();

		// membuat object dari kelas abstract
		// Hero hero3 = new Hero("Mario");
		// hero3.display();
	}
}
