package com.tutorial;

public class Main{
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.name = "Saitama";
        // hero1.defencePower = gak punya;
        hero1.display();

        HeroStrength hero2 = new HeroStrength();
        hero2.name = "Mountain Lady";
        hero2.defencePower = 100;
        hero2.display();
    }
}