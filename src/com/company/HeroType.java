package com.company;

public enum HeroType {
    KLERYK("Klasa: Kleryk\nStawia na obronę"),
    WOJOWNIK("Klasa: Wojownik\nMistrz ataku"),
    LOTR("Klasa: Lotr\nTrochę ataku, trochę obrony");

    private final String description;

    private HeroType(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

}
