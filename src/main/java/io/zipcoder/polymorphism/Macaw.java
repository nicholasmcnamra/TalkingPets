package io.zipcoder.polymorphism;

public class Macaw extends Pet{

    public Macaw(String expectedName) {
        super(expectedName);
    }
    public Macaw(){}

    public Macaw getMacaw(){
        return this;
    }

    public String speak(){
        return "Who's there?";
    }

}
