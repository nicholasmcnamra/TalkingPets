package io.zipcoder.polymorphism;

public class Cat extends Pet{
    public Cat(String name){
        super(name);
    }
    public Cat(){
        super();
    }

    public Cat getCat(){
        return this;
    }
    public String speak(){
        return "Meow";
    }
}
