package com.tutorial;

// visibility
// 1. Public: Jika method atau attribute dalam public secara explisit, 
//    maka subclass tidak boleh mengurangi visibility
// 2. Private: Jika method atau attribute dalam private secara explisit,
//    maka subclass pun tidak dapat mengakses
// 3. Final: method atau attribute dengan final keyword akan diwariskan,
//    tetapi tidak bisa dioverride. dalam class yang sama bisa dioverload

public class Main {
	public static void main(String[] args) {
		System.out.println("test");

		Hero hero1 = new Hero("ucup", 100);
		IntelHero hero2 = new IntelHero("otong", 50);

		hero1.display();
		hero2.display();

		System.out.println(hero1.getHealth());
		System.out.println(hero2.getHealth());
		
		hero1.setHealth(120);
		hero2.setHealth(80);

		hero1.display();
		hero2.display();
		
		hero1.setHealth("reset");
		hero1.display();

		hero2.setHealth("reset");
		hero2.display();
	}
}
