package com.tutorial;

public class Hero {
    String name = "Class Hero";
    
    void display(){
        System.out.println("Ini adalah " + this.name);
    }

    void dummyMethod(){
        System.out.println("method ini ada di superclass");
    }
}