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
    private int coinsEarned;
    private Random random;

    public Hero(String name) {
        this.name = name;
        items = new ArrayList<>();
        coins = 25;
        random = new Random();
        power = random.nextInt(5);
        defense = 4-power;
        points = 0;
        coinsEarned = 0;
    }

    public void printHero(){
        System.out.println("Do sklepu przychodzi heros: \nImię: " + name + "\nSiła: " + power + "\nObrona: " + defense + "\nMonety: " + coins+"\n");
    }

    public void sellItem(Item item){
        coins += item.getPrice();
        coinsEarned += item.getPrice();
        if(coinsEarned%10 > 1){
            points += coinsEarned%10;
            coinsEarned -= (coinsEarned%10)*10;
        }
    }

    public void buyItem(Item item){
        if (coins < item.getPrice()){
            System.out.println("Niewystarczające fundusze!");
            return;
        }
        coins -= item.getPrice();
        power += item.getPower();
        defense += item.getDefense();
    }

    public void fightMonster(Monster monster){

    }
}
