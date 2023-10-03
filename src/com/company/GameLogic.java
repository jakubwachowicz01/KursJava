package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class GameLogic {
    private Scanner scanner;

    public GameLogic() {
        scanner = new Scanner(System.in);
    }

    public void startGame(){
        Hero hero = createHero();
        hero.printHero();
        Item item = createItem();
        item.printItem();
    }

    private Hero createHero(){
        System.out.print("Podaj imię herosa: ");
        String name = scanner.nextLine();
        return new Hero(name);
    }

    private Item createItem(){
        System.out.print("Podaj nazwę generowanego przedmiotu: ");
        String name = scanner.nextLine();
        return new Item(name);
    }



}
