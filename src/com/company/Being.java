package com.company;

import java.util.Random;

public abstract class Being {
    int power;
    int defense;
    int coins;
    Random random = new Random();

    public int getPower() {
        return power;
    }

    public int getDefense() {
        return defense;
    }

}
