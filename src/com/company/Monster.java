package com.company;

import java.util.Random;

public class Monster {
    private int power;
    private int defense;
    private Random random;

    public Monster(int monstersSlayed) {
        random = new Random();
        power = random.nextInt(5+monstersSlayed);
        defense = (4+monstersSlayed)-power;
    }

    public int getPower() {
        return power;
    }

    public int getDefense() {
        return defense;
    }

    public String toString(){
        return "AUWGHH!!!\nSiła: " + power + "\nObrona: " + defense;
    }
}
