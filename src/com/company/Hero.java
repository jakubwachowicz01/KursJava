package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Hero {
    private String name;
    private int power;
    private int defense;
    private int coins;
    private int monstersSlayed;
    private Random random;
    private static String RESET = "\u001B[0m";
    private static String PURPLE = "\u001B[45m";

    public Hero(String name) {
        monstersSlayed = 0;
        this.name = name;
        coins = 25;
        random = new Random();
        power = random.nextInt(5);
        defense = 4-power;
    }

    public int getMonstersSlayed() {
        return monstersSlayed;
    }

    public void setMonstersSlayed(int monstersSlayed) {
        this.monstersSlayed = monstersSlayed;
    }

    public String toString(){
        return PURPLE + name + "\nSiła: " + power + "\nObrona: " + defense + "\nMonety: " + coins+"\n" + RESET;
    }

    public boolean buyItem(Item item){
        if (coins < item.getPrice()){
            System.out.println("Niewystarczające fundusze!");
            return false;
        }
        coins -= item.getPrice();
        power += item.getPower();
        defense += item.getDefense();
        return true;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public int getCoins() {
        return coins;
    }

    public int getPower() {
        return power;
    }

    public int getDefense() {
        return defense;
    }
}
