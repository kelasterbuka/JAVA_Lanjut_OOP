package com.tutorial;

public class HeroStrength extends Hero{
    double defencePower;

    // overriding methods
    void display(){
        System.out.println("\nHero Strength");
        System.out.println("Hero Name : " + this.name);
        System.out.println("Defence Power : " + this.defencePower);
    }
}