package com.tutorial;

class Player{
    private String name;
    private int baseHealth;
    private int baseAttack;
    private int incrementHealth;
    private int incrementAttack;
    private int level;
    private int totalDamage;
    private boolean isAlive;

    // Ini adalah object member
    private Armor armor;
    private Weapon weapon;

    public Player(String name){
        this.name = name;
        this.baseHealth = 100;
        this.baseAttack = 100;
        this.level = 1;
        this.incrementHealth = 20;
        this.incrementAttack = 20;
        this.isAlive = true;
    }

    public String getName(){
        return this.name;
    }

    public int getHealth(){
        return this.maxHealth() - this.totalDamage;
    }

    public void display(){
        System.out.println("Player\t\t: " + this.name);
        System.out.println("Level\t\t: " + this.level);
        System.out.println("Health\t\t: " + this.getHealth() +"/" + this.maxHealth());
        System.out.println("Attack\t\t: " + this.getAttackPower());
        System.out.println("Alive\t\t: " + this.isAlive + "\n");
    }

    public void attack(Player opponent){
        // hitung damage
        int damage = this.getAttackPower();
        // print event
        System.out.println(this.name + " is attacking " + opponent.getName() + " with " + damage);
        // attack si opponent
        opponent.defence(damage);

        this.levelUp();
    }

    public void defence(int damage){

        // receive damage
        int defencePower = this.armor.getDefencePower();
        int deltaDamage;

        System.out.println(this.name + " defence power = "+ defencePower);
        if(damage > defencePower){
            deltaDamage = damage - defencePower;
        } else {
            deltaDamage = 0;
        }
        
        System.out.println("damage earned = " + deltaDamage + "\n");
        
        // adding total damage
        this.totalDamage += deltaDamage;

        // check is alive
        if (this.getHealth() <= 0){
            this.isAlive = false;
            this.totalDamage = this.maxHealth();
        }

        this.display();
    }
    
    private int getAttackPower(){
        return this.baseAttack + this.level*this.incrementAttack + this.weapon.getAttack();
    }

    private void levelUp(){
        this.level++;
    }

    public void setArmor(Armor armor){
        this.armor = armor;
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public int maxHealth(){
        return this.baseHealth + this.level*this.incrementHealth + this.armor.getAddHealth();
    }


}

class Weapon{
    private String name;
    private int attack;

    public Weapon(String name, int attack){
        this.name = name;
        this.attack = attack;
    }

    public int getAttack(){
        return this.attack;
    }
}

class Armor{
    private String name;
    private int strength;
    private int health;

    public Armor(String name, int strength, int health){
        this.name = name;
        this.strength = strength;
        this.health = health;
    }

    public int getAddHealth(){
        return this.strength*10 + this.health;
    }

    public int getDefencePower(){
        return this.strength*2;
    }

}

public class Main{
    public static void main(String[] args) {
        Player player1 = new Player("Marni");
        Armor armor1 = new Armor("Baju besi",5,100);
        Weapon weapon1 = new Weapon("Pedang", 10);
        player1.setArmor(armor1);
        player1.setWeapon(weapon1);

        Player player2 = new Player("Issabela");
        Armor armor2 = new Armor("Gaun Pesta",1,40);
        Weapon weapon2 = new Weapon("Pecut", 40);
        player2.setArmor(armor2);
        player2.setWeapon(weapon2);

        player1.display();
        player2.display();

        player1.attack(player2);
        player2.attack(player1);
        player2.attack(player1);
    }
}