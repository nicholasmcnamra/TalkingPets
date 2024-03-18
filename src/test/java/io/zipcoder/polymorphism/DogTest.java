package io.zipcoder.polymorphism;
import org.junit.Test;
import org.junit.Assert;

public class DogTest {

    @Test
    public void constructorTest() {
        String expectedName = "Tito";

        Dog dog = new Dog(expectedName);

        String actualName = dog.getName();

        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void setDogNameTest() {
        String name = "Tito";
        Dog dog = new Dog(name);

        dog.setName(name);

        String expectedName = "Tito";
        String actualName = dog.getName();

        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void getDogTest() {
        Dog dog = new Dog();

        Dog expectedDog = dog;
        Dog actualDog = dog.getDog();

        Assert.assertEquals(expectedDog, actualDog);
    }

    @Test
    public void speakDogTest() {
        Dog dog = new Dog();

        String expectedSpeak = "Bark!";
        String actualSpeak = dog.speak();

        Assert.assertEquals(expectedSpeak, actualSpeak);
    }

    @Test
    public void dogInstanceOfPet() {
        Dog dog = new Dog();

        Assert.assertTrue(dog instanceof Pet);
    }
}
