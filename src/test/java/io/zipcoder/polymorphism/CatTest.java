package io.zipcoder.polymorphism;
import org.junit.Test;
import org.junit.Assert;

public class CatTest {

    @Test
    public void constructorTest() {
        String expectedName = "fifi";

        Cat cat = new Cat(expectedName);

        String actualName = cat.getName();

        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void getCatTest() {
        Cat cat = new Cat();

        Cat expectedCat = cat;
        Cat actualCat = cat.getCat();

        Assert.assertEquals(expectedCat, actualCat);
    }

    @Test
    public void speakCatTest() {
        Cat cat = new Cat();

        String expectedSpeak = "Meow";
        String actualSpeak = cat.speak();

        Assert.assertEquals(expectedSpeak, actualSpeak);
    }

    @Test
    public void catInstanceOfAnimalTest() {
        Cat cat = new Cat();

        Assert.assertTrue(cat instanceof Pet);
    }
}
