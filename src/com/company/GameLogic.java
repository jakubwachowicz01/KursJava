package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class GameLogic {
    private Scanner scanner;
    private Hero hero;
    private Seller seller;
    private static String GREEN ="\u001B[32m";
    private static String RESET = "\u001B[0m";
    private static String YELLOW = "\u001B[33m";
    private static String RED = "\u001B[31m";

    public GameLogic() {
        scanner = new Scanner(System.in);
    }

    public void startGame(){
        this.seller = new Seller();
        while (true){
            createHero();
            hero.printHero();
            for (int i = 0; i < 3; i++){
                seller.generateItems();
                seller.displayItems();
                sellerChooseItem();
                Monster monster = createMonster();
                boolean isHeroAlive = fightMonster(monster);
                if (isHeroAlive == false){
                    break;
                }
                hero.printHero();
                i++;
            }
        }
    }

    private void sellerChooseItem(){
        System.out.println("Wybierz przedmiot, który chcesz sprzedać: ");
        int choice = scanner.nextInt();
        Item item = seller.getItems().get(choice-1);
        boolean canBuy = hero.buyItem(item);
        if(canBuy){
            seller.sellItem(item);
        }
        seller.cleanItems();
    }

    private boolean fightMonster(Monster monster){
        System.out.println();
        System.out.println("Walka z potworem o statystykach: ");
        System.out.println(monster.toString());
        if (hero.getPower() >= monster.getDefense()){
            System.out.println(GREEN + "Heros pokonał potwora!" + RESET);
            seller.setPoints(seller.getPoints()+2);
            return true;
        }else if (monster.getPower() > hero.getDefense()){
            System.out.println(RED + "Potwór pokonał herosa." + RESET);
            return false;
        }else{
            System.out.println(YELLOW + "Herosowi nie udało się pokonać potwora, ale heros przeżył." + RESET);
            seller.setPoints(seller.getPoints()+1);
            return true;
        }
    }

    private void createHero(){
        /*System.out.print("Podaj imię herosa: ");
        String name = scanner.nextLine();*/
        //return new Hero(name);
        this.hero = new Hero("Jan");
    }
    private Monster createMonster(){
        return new Monster();
    }
}
