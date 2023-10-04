package com.company;

import java.util.Random;

public class Item {
    private String name;
    private int price;
    private int power;
    private int defense;
    private Random random;
    private String[] itemNames;
    private ItemType itemType;

    public Item() {
        itemNames = new String[]{"Zbroja", "Miecz", "Tarcza", "Kolczuga", "Patyk", "Amulet"};
        random = new Random();
        name = itemNames[random.nextInt(6)];
        drawStats();
        this.itemType = ItemType.values()[random.nextInt(ItemType.values().length)];
        addBonus();
    }

    private void drawStats(){
        int cost123 = 1+random.nextInt(3);
        price = 5*(cost123);
        power = random.nextInt(cost123);
        defense = cost123-power;
    }

    private void addBonus(){
        switch (itemType){
            case LOTR:
                power++;
                defense++;
                break;
            case WOJOWNIK:
                power+=2;
                break;
            case KLERYK:
                defense+=2;
                break;
        }
    }

    public void printItem(){
        System.out.println("Nazwa: " + name + "\nSiła: " + power + "\nObrona: " + defense + "\nCena: " + price + "\n" + itemType.getDescription()+"\n");
    }

    public int getPrice() {
        return price;
    }

    public int getPower() {
        return power;
    }

    public int getDefense() {
        return defense;
    }
}
