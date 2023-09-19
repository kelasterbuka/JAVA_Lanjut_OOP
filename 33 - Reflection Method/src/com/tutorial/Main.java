package com.tutorial;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.hero.HeroAgility;

public class Main {
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException{
		HeroAgility hero1 = new HeroAgility("ucup", 100);
		hero1.displayAll();

		// kita memanggil private method
		System.out.println("\nmemanggil private method\n");
		Method[] methodHero = hero1.getClass().getDeclaredMethods();

		for(Method method:methodHero){
			// System.out.println(method.getName());
			if (method.getName().equals("setNickName")){
				method.setAccessible(true);
				method.invoke(hero1,"brandon");
			}
			System.out.println(method);
		}
		hero1.displayAll();
	}
}
