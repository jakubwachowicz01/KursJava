package com.company;

import java.util.Random;

public abstract class Being {
    int power;
    int defense;
    int coins;
    String name;
    Random random = new Random();

    public int getPower() {
        return power;
    }

    public int getDefense() {
        return defense;
    }

    public String displayStats(){
        return name + "\nPower: " + power + "\nDefense: " + defense;
    }
}
