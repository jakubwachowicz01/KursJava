package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Hero {
    private String name;
    private int power;
    private int defense;
    private int coins;
    //private int points;
    //private int coinsEarned;
    private Random random;
    private static String RESET = "\u001B[0m";
    private static String PURPLE = "\u001B[45m";

    public Hero(String name) {
        this.name = name;
        coins = 25;
        random = new Random();
        power = random.nextInt(5);
        defense = 4-power;
    }

    public void printHero(){
        System.out.println(PURPLE + name + "\nSiła: " + power + "\nObrona: " + defense + "\nMonety: " + coins+"\n" + RESET);
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

    public int getPower() {
        return power;
    }

    public int getDefense() {
        return defense;
    }
}
