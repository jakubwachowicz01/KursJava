package com.company;

public enum ItemType {
    KLERYK("Klasa: Kleryk\nBonus do obrony"),
    WOJOWNIK("Klasa: Wojownik\nBonus do ataku"),
    LOTR("Klasa: Lotr\nMały bonus do obrony i ataku");

    private final String description;

    private ItemType(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}
