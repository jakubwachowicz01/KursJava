package com.company;

import java.util.Random;

public class Monster extends Being{

    public Monster(int monstersSlayed) {
        power = random.nextInt(5+monstersSlayed);
        defense = (4+monstersSlayed)-power;
    }

    public String toString(){
        return "AUWGHH!!!\nSiła: " + power + "\nObrona: " + defense;
    }
}
