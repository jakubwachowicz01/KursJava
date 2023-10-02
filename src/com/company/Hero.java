package com.company;

import java.util.Random;

public class Hero {
    String name;
    private int power;
    private int defense;
    private int coins;
    Random random;

    public Hero(String name) {
        this.name = name;
        coins = 25;
        random = new Random();

        power = random.nextInt(4);
    }
}
