package domain;

import org.example.domain.Dog;

import java.time.LocalDateTime;

public  class DogBreeder implements WithBreed, OfColour{

        private  String name;
        private String breed;
        private LocalDateTime birthday;
        private String favouriteFood;
        private String colour;
        private String toy;




    public static DogBreeder aDog() {
            return new DogBreeder();
    }

    public static DogBreeder aLargeDog() {
        return aDog().ofBreed("Labrador");
    }

    public static DogBreeder aSmallDog() {
        return aDog().ofBreed("Puppy");
    }

    public static DogBreeder aGuardDog() {
        return aDog().ofBreed("Wolf");
    }

    public  DogBreeder called(String name) {
            this.name=name;
            return this;
    }

    public DogBreeder ofBreed(String breed) {
            this.breed = breed;
            return this;
        }

        public Dog build() {
            return new Dog(name,breed,birthday,null,colour,toy);
        }

        public Dog bornOn(LocalDateTime birthday) {

           return new Dog(name,breed,birthday,favouriteFood, colour,toy);
        }
        public DogBreeder withFavouriteFood(String favouriteFood){
            this.favouriteFood = favouriteFood;
            return this;
        }
        public DogBreeder ofColour(String colour){
            this.colour=colour;
            return this;
        }

        public DogBreeder withToy(String toy) {
            this.toy= toy;
            return this;
        }
    }