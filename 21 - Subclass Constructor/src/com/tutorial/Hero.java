package com.tutorial;

public class Hero {
    String name;
    double defencePower;
    double attackPower;

    Hero(String name,double defencePower,double attackPower){
        this.name = name;
        this.defencePower = defencePower;
        this.attackPower = attackPower;
    }

    void display(){
        System.out.println("Name \t\t: " + this.name);
        System.out.println("Attack Power \t: " + this.attackPower);
        System.out.println("Defence Power \t: " + this.defencePower);
    }
}