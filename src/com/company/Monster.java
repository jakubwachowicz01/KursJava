package com.company;

import java.util.Random;

public class Monster extends Being{

    public Monster(int monstersSlayed) {
        power = random.nextInt(5+monstersSlayed);
        defense = (4+monstersSlayed)-power;
        name = "Potwór";
    }

    public String toString(){
        return name+"\nSiła: " + power + "\nObrona: " + defense;
    }
}
