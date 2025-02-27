package io.zipcoder.polymorphism;
import org.junit.Test;
import org.junit.Assert;

public class MacawTest {

    @Test
    public void constructorTest() {
        String expectedName = "bezo";

        Macaw macaw = new Macaw(expectedName);

        String actualName = macaw.getName();

        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void setMacawNameTest() {
        String name = "bezo";
        Macaw macaw = new Macaw();

        macaw.setName(name);

        String expectedName = "bezo";
        String actualName = macaw.getName();

        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void getMacawTest() {
        Macaw macaw = new Macaw();

        Macaw expectedMacaw = macaw;
        Macaw actualMacaw = macaw.getMacaw();

        Assert.assertEquals(expectedMacaw, actualMacaw);
    }

    @Test
    public void speakMacawTest() {
        Macaw macaw = new Macaw();

        String expectedSpeak = "Who's there?";
        String actualSpeak = macaw.speak();

        Assert.assertEquals(expectedSpeak, actualSpeak);
    }

    @Test
    public void macawInstanceOfPeTest() {
        Macaw macaw = new Macaw();

        Assert.assertTrue(macaw instanceof Pet);
    }


}
