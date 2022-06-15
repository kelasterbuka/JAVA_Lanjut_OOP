package com.Hero;

public abstract class Hero {
    private String name;
    // protected String name; // jarang dilakukan, karena ini menyalahi encapsulasi

    public Hero (String name){
        this.name = name;
    }

    // getter
    public String getName(){
        return this.name;
    }
    
    // setter
    protected void setName(String name){
        this.name = name;
    }

    public abstract void display();
}
