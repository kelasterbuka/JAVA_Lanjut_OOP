package com.tutorial;

public class Hero {
	String nama;

	Hero(String nama){
		this.nama = nama;
	}

	void display(){
		System.out.println("\nName \t: " + this.nama);
	}

	void attack(Hero enemy){
		System.out.println("Menyerang");
	}
}
