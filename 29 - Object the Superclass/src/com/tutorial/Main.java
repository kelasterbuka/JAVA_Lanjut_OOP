package com.tutorial;

public class Main{
    public static void main(String[] args) {
        
        Hero hero1 = new Hero("ucup");

        hero1.display();

        // kita sebut class Object sebagai superclass
        Object hero2 = hero1;
        
        String hero2_str = hero2.toString();
        String hero1_str = hero1.toString();
        System.out.println(hero1_str);
        System.out.println(hero2_str);

        // salah satu method dari class Object adalah equals
        System.out.println(hero1.equals(hero2));

        // contoh dari equals
        Hero hero3 = new Hero("Otong");
        Hero hero4 = new Hero("Otong");
        Hero hero5 = new Hero("Otong");

        Jagoan hero6 = new Jagoan("Otong");

        System.out.println(hero3.equals(hero4));

        // override equals di class Hero
        System.out.println(hero3.equals(hero4));
        System.out.println(hero3.equals(hero1));

    }
}