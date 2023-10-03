package com.company;

import java.util.Random;

public class Monster {
    private int power;
    private int defense;
    private Random random;

    public Monster() {
        random = new Random();
        power = random.nextInt(5);
        defense = 4-power;
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
