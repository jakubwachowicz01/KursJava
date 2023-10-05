package com.company;

import java.util.Scanner;



public class GameInterface {
    private Scanner scanner;
    private static String GREEN = "\u001B[32m";
    private static String RESET = "\u001B[0m";
    private static String YELLOW = "\u001B[33m";
    private static String RED = "\u001B[31m";
    private static String PURPLE = "\u001B[45m";
    private static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";

    public GameInterface() {
        scanner = new Scanner(System.in);
    }

    public void displayHeroStats(Hero hero){
        System.out.println("\n" + hero.toString());
    }

    public void displayBeingStats(Being being){
        System.out.println( "\n" + ANSI_YELLOW_BACKGROUND + "Wioskę zaatakował \n" + being.displayStats() + RESET + "\n");
    }

    public int chooseItemFromPool() {
        //System.out.print("6 pomiń\nWybierz przedmiot, który chcesz sprzedać: ");
        return Integer.valueOf(scanner.nextLine());
    }

    public void tooLittleMoney(){
        System.out.println("Heros ma za mało pieniędzy, wybierz inny przedmiot!");
    }

    public String getHeroName() {
        System.out.print("Podaj imię herosa: ");
        return scanner.nextLine();
    }

    public void displayItems(Seller seller) {
        int i = 1;
        for (Item item : seller.getItems()) {
            System.out.println("Przedmiot " + i);
            item.printItem();
            i++;
        }
    }

    public void gameWon(Seller seller){
        System.out.println("Gratulacje, wygrałes!");
        System.out.println(seller.toString());
    }

    public void displayFightResults(int result){
        if (result == 1) {
            System.out.println(GREEN + "Heros pokonał potwora!" + RESET);
        } else if (result == -1) {
            System.out.println(RED + "Potwór pokonał herosa." + RESET);
        } else {
            System.out.println(YELLOW + "Herosowi nie udało się pokonać potwora, ale heros przeżył." + RESET);
        }
    }

    public void heroDefeated(){
        System.out.println("Heros został pokonany. Do sklepu zaraz trafi inny klient :)");
    }
}
