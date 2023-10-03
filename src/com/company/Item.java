package com.company;

import java.util.Random;

public class Item {
    private String name;
    private int price;
    private int power;
    private int defense;
    Random random;

    public Item(String name) {
        this.name = name;
        random = new Random();
        drawStats();
    }


    private void drawStats(){
        int cost123 = random.nextInt(3);
        if(cost123 == 0){
            price = 5;
            power = random.nextInt(2);
            defense = 1-power;
        }else if(cost123 == 1){
            price = 10;
            power = random.nextInt(3);
            defense = 2-power;
        }else{
            price = 15;
            power = random.nextInt(4);
            defense = 3-power;
        }



    }
}
