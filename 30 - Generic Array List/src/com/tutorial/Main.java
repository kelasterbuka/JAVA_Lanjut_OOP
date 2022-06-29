package com.tutorial;

import java.util.ArrayList;

public class Main{

    public static void main(String[] args) {
        
        Hero hero1 = new Hero("Ucup",100);
        Hero hero2 = new Hero("Otong",20);
        AgilityHero agilityHero = new AgilityHero("Johny", 500);
        IntelHero intelHero = new IntelHero("Semith", 5);

        // Array sederhana
        Hero[] kumpulanHero = new Hero[3];

        // masukan anggota
        kumpulanHero[0] = hero1;
        kumpulanHero[1] = hero2;
        kumpulanHero[2] = agilityHero;
        // kumpulanHero[3] = intelHero; karena array fiks

        for(Hero hero:kumpulanHero){
            hero.display();
        }
        
        // Array List
        ArrayList<Hero> listHero = new ArrayList<Hero>();
        
        listHero.add(hero1);
        listHero.add(hero2);
        listHero.add(agilityHero);
        listHero.add(intelHero);
        
        System.out.println("\nArrayList\n");
        for(Hero hero:listHero){
            hero.display();
        }
        
        // referens
        agilityHero.setName("Dudung");
        
        System.out.println("\nArrayList\n");
        for(Hero hero:listHero){
            hero.display();
        }
        
        System.out.println("\nArray\n");
        for(Hero hero:kumpulanHero){
            hero.display();
        }
    }
}