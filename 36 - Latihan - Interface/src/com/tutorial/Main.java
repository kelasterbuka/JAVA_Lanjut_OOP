package com.tutorial;

import com.hero.HeroAgility;
import com.hero.AttackMelee;
import com.hero.AttackRange;

public class Main {
	public static void main(String[] args) {
		
		HeroAgility hero1 = new HeroAgility("ucup", 100);
		HeroAgility hero2 = new HeroAgility("otong", 20);

		hero1.setAttackSkill(new AttackMelee(100));
		hero2.setAttackSkill(new AttackRange(100,10));

		hero1.display();
		hero2.display();

		hero1.attack(hero2);
		hero2.attack(hero1);

	}
}
