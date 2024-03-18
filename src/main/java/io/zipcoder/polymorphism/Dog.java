package io.zipcoder.polymorphism;

public class Dog extends Pet{

    private String name;

    Dog(String name){
        super();
        this.name = name;
    }

    Dog(){}

    public String speak(){
        return "Bark!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return this;
    }
}
