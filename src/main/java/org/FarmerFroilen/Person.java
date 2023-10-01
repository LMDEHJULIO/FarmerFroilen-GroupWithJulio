package org.FarmerFroilen;

public abstract class Person implements Noisemaker, Eater{
    //ivar of type string called name
    private String name;

    //a constructor
    public Person(String name){
        this.name = name;
    }
    //getter and setter for the ivar
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
