package io.zipcoder.polymorphism;
import org.junit.Test;
import org.junit.Assert;

public class DogTest {

    public void constructorTest() {
        String expectedName = "Tito";

        Dog dog = new Dog(dogName);

        String actualName = dog.getName();

        Assert.assertEquals(expectedName, actualName);
    }

    public void setDogNameTest() {
        String name = "Tito";
        Dog dog = new Dog();

        dog.setName(name);

        String expectedName = "Tito";
        String actualName = dog.getName();

        Assert.assertEquals(expectedName, actualName);
    }
    public void getDogTest() {
        Dog dog = new Dog();

        Dog expectedDog = dog;
        Dog actualDog = dog.getDog();

        Assert.assertEquals(expectedDog, actualDog);
    }

    public void speakDogTest() {
        Dog dog = new Dog();

        String expectedSpeak = "Bark!";
        String actualSpeak = dog.speak();

        Assert.assertEquals(expectedSpeak, actualSpeak);
    }

    public void dogInstanceOfPet() {
        Dog dog = new Dog();

        Assert.assertTrue(dog instanceof Pet);
    }
}
