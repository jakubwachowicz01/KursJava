package com.company;

import java.util.ArrayList;

public class Seller {
    private int coins;
    private int points;
    private ArrayList<Item> items;
    
    public Seller() {
        coins=0;
        points=0;
        items = new ArrayList<>();
    }

    public Item chooseItemToSell(int choice){
        return items.get(choice-1);
    }

    public void generateItems(){
        for (int i = 0 ; i < 5; i++){
            items.add(new Item());
        }
    }

    public void cleanItems(){
        items.removeAll(items);
    }

    public void displayItems(){
        int i = 1;
        for (Item item: items) { //iter
            System.out.println("Przedmiot " + i);
            item.printItem();
            i++;
        }
    }

    public void sellItem(Item item){
        coins += item.getPrice();
        if (coins>=10){
            points += coins%10;
            coins -= (coins%10)*10;
        }
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Sprzedawca zdobył " + points + " punktów.";
    }
}
