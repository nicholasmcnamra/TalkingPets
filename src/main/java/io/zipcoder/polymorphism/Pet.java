package io.zipcoder.polymorphism;

public abstract class Pet {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    Pet(String name){
        this.name = name;
    }

    Pet(){}
    public String speak(){
        return null;
    }


}
