package domain;

import org.example.domain.Dog;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

public class WhenCreatingANewDog {

    @Test
    public void itShouldHaveAName() throws Exception{

        LocalDateTime birthday= LocalDateTime.now();

        Dog fido = DogBreeder.aLargeDog()
                .called("Fido")
               // .ofBreed("Poodle")
                .ofColour("black")
                .withFavouriteFood("pizza")
                .bornOn(birthday);
                //.build();

        Assert.assertEquals("Fido",fido.getName());
        Assert.assertEquals("Labrador",fido.getBreed());
        Assert.assertEquals(birthday,fido.getBirthday());
        Assert.assertEquals("pizza",fido.getFavouriteFood());
        Assert.assertEquals("black",fido.getColour());

        Dog lab= DogBreeder.aSmallDog()
                .called("Stella")
                .ofBreed("Puppy")
                .ofColour("Mix")
                .bornOn(birthday);

        Assert.assertEquals("Stella",lab.getName());
        Assert.assertEquals("Puppy",lab.getBreed());
        Assert.assertEquals(birthday,lab.getBirthday());
        Assert.assertEquals("Mix",lab.getColour());

        Dog guard = DogBreeder.aGuardDog()
                .called("Guardian")
                .ofColour("black")
                .bornOn(birthday);

        Assert.assertEquals("Guardian",guard.getName());
        Assert.assertEquals("Wolf",guard.getBreed());
        Assert.assertEquals("black",guard.getColour());
    }

//    @Test
//    public void itShouldHaveFavouriteFood(){
//
//        LocalDateTime birthday= LocalDateTime.now();
//        Dog fido =new Dog("Fido","Poodle",birthday,"pizza");
//
//
//        Assert.assertEquals("pizza",fido.getFavouriteFood());
//    }

    @Test
    public void dogCanHaveOptionalColour(){
        LocalDateTime birthday= LocalDateTime.now();
        Dog fido = DogBreeder.aDog()
                .called("Fido")
                .ofBreed("Labrador")
                .ofColour("Brown")
                .bornOn(birthday);
        Assert.assertEquals("Fido",fido.getName());
        Assert.assertEquals("Labrador",fido.getBreed());

    }
    @Test
    public void dogHaveOptionalFoodAndToy(){
        LocalDateTime birthday= LocalDateTime.now();

        Dog toto= DogBreeder.aDog()
                .called("Toto")
                .ofBreed("Chiwa")
                .ofColour("White")
                .withFavouriteFood("Meat")
                .withToy("Bone")
                .build();
        Assert.assertEquals("Toto",toto.getName());
        Assert.assertEquals("Chiwa",toto.getBreed());
        Assert.assertEquals("White",toto.getColour());
        Assert.assertEquals("Bone",toto.getToy());

    }
}
