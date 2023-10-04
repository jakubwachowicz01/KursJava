package com.company;

public class GameLogic {

    private Hero hero;
    private Seller seller;
    private GameInterface gameInterface;

    public GameLogic() {
        gameInterface = new GameInterface();
        seller = new Seller();
    }

    public void startGame(){
        while (true){
            this.hero = new Hero(gameInterface.getHeroName());
            gameInterface.displayHeroStats(hero);

            while(true){
                Monster monster = new Monster(hero.getMonstersSlayed());
                gameInterface.displayMonsterStats(monster);
                seller.generateItems();
                gameInterface.displayItems(seller);
                sellingItem();

                int fightResult = fightBeing(monster);
                gameInterface.displayFightResults(fightResult);
                gameInterface.displayHeroStats(hero);
                if (fightResult == -1){
                    gameInterface.heroDefeated();
                    break;
                }
                if(hero.getMonstersSlayed() == 3){
                    gameInterface.gameWon(seller);
                    break;
                }
            }
        }
    }

    private void sellingItem(){
        int choice = gameInterface.chooseItemFromPool();
        // if(choice == 6) return;
        Item itemChosenToSell = seller.chooseItemToSell(choice);
        boolean couldBuy = hero.buyItem(itemChosenToSell);
        if(couldBuy){
            seller.sellItem(itemChosenToSell);
            seller.cleanItems();
        }else{
            //gameInterface.tooLittleMoney();
            sellingItem();
        }
    }

    private int fightBeing(Being being){
        if (hero.getPower() >= being.getDefense()){
            seller.setPoints(seller.getPoints()+2);
            hero.setMonstersSlayed(hero.getMonstersSlayed()+1);
            hero.setCoins(hero.getCoins()+5);
            return 1;
        }else if (being.getPower() > hero.getDefense()){
            return -1;
        }else{
            seller.setPoints(seller.getPoints()+1);
            return 0;
        }
    }
}
