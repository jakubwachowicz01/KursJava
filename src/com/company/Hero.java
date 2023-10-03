package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Hero {
    private String name;
    private int power;
    private int defense;
    private int coins;
    private ArrayList<Item> items;
    private int points;
    private Random random;

    public Hero(String name) {
        this.name = name;
        items = new ArrayList<>();
        coins = 25;
        random = new Random();
        power = random.nextInt(5);
        defense = 4-power;
        points = 0;
    }

    public void printHero(){
        System.out.println("Do sklepu przychodzi heros: \nImię: " + name + "\nSiła: " + power + "\nObrona: " + defense + "\nMonety: " + coins+"\n");
    }

    public void sellItem(){

    }
}
