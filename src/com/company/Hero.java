package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Hero extends Being{
    private String name;
    private int monstersSlayed;
    private static String RESET = "\u001B[0m";
    private static String PURPLE = "\u001B[45m";
    private HeroType heroType;
    private String[] heroNames;

    public Hero(String name) {
        monstersSlayed = 0;
        this.name = name;
        coins = 25;
        power = random.nextInt(5);
        defense = 4-power;
        this.heroType = HeroType.values()[random.nextInt(HeroType.values().length)];
    }

    public HeroType getHeroType() {
        return heroType;
    }

    public int getMonstersSlayed() {
        return monstersSlayed;
    }

    public void setMonstersSlayed(int monstersSlayed) {
        this.monstersSlayed = monstersSlayed;
    }

    public String toString(){
        return PURPLE + name +"\n"+ heroType.getDescription()+"\nSiła: " + power + "\nObrona: " + defense + "\nMonety: " + coins+"\n" + RESET;
    }

    public boolean buyItem(Item item){
        if (coins < item.getPrice()){
            System.out.println("Heros ma za mało pieniędzy, wybierz inny przedmiot!");
            return false;
        }else if(!(item.getItemType().name().equals(getHeroType().name()))){
            System.out.println("Niekompatybilna klasa!");
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

}
