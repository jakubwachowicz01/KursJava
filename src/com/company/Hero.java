package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Hero extends Being{


    ArrayList<Item> items;

    public Hero() {
        items = new ArrayList<>();
        coins = 25;
        random = new Random();
        power = random.nextInt(5);
        defense = 4-power;
    }

    public void setName(String name){
        this.name = name;
    }
}
