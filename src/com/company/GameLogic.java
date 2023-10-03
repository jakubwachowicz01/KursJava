package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class GameLogic {
    private Scanner scanner;
    private Hero hero;

    public GameLogic() {
        scanner = new Scanner(System.in);
    }

    public void startGame(){
        createHero();
        hero.printHero();
        Item item = createItem();
        //item.printItem();
        itemDecision(item);
        hero.printHero();
    }

    private void fightMonster(Monster monster){

    }

    private Monster createMonster(){
        return new Monster();
    }

    private void itemDecision(Item item){
        System.out.println("1.Sprzedaj\n2.Kup\n3.Pomiń");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                hero.sellItem(item);
                break;
            case 2:
                hero.buyItem(item);
                break;
            case 3:
                break;
        }
    }

    private void createHero(){
        System.out.print("Podaj imię herosa: ");
        String name = scanner.nextLine();
        //return new Hero(name);
        this.hero = new Hero(name);
    }

    private Item createItem(){
        System.out.print("Podaj nazwę generowanego przedmiotu: ");
        String name = scanner.nextLine();
        return new Item(name);
    }

}
