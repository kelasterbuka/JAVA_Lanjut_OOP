package com.tutorial;

class Player{
    private String name;

    Player(String name){
        this.name = name;
    }

    void setName(String name){
        this.name = name;
    }

    void show(){
        System.out.println("Player name = " + this.name);
    }
}