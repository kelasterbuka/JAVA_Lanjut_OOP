package com.Hero;

public class HeroAgility extends Hero{
    private double speedAttack;

    public HeroAgility(String name, double speedAttack){
        super(name);
        this.speedAttack = speedAttack;
    }

    public void display(){
        System.out.println("\nName : " + this.getName());
        System.out.println("Speed Attack : " + this.speedAttack);
    }

    public void win(){
        this.setName(this.getName() + " is a Winner");
    }
}
