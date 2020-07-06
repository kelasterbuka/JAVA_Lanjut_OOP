package com.tutorial;

class Main{
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        HeroStrength hero2 = new HeroStrength();
        
        hero1.display();
        hero2.display();
        hero2.displaySuper();
    }
}