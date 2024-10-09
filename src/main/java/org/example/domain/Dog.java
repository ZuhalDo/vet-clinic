package org.example.domain;

import java.time.LocalDateTime;

public class Dog {
    private final String name;
    private final String breed;
    private final LocalDateTime birthday;
    private final String favouriteFood;
    private final String colour;
    private final String toy;

    public Dog(String name, String breed, LocalDateTime birthday, String favouriteFood,String colour, String toy) {
        this.name = name;
        this.breed = breed;
        this.birthday = birthday;
        this.favouriteFood = favouriteFood;
        this.colour=colour;
        this.toy=toy;
    }

    public String getColour() {
        return colour;
    }

    public String getToy() {
        return toy;
    }

    public String getName() {
        return name;
    }

    public String getBreed(){
        return breed;
    }
    public LocalDateTime getBirthday(){
        return birthday;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }
}
