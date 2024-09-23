package com.maximillian.java_encapsulation;

public class Dog {
    //Instance variables.... attributes
    private String name;
    private int age;
    private String color;
    private String noise;
    private boolean isHealthy;
    private String breed;

    // Every class must have a constructors..
    //1. No arguments
    public Dog(String name, int age, String color, String noise, boolean isHealthy, String breed){
        this.name = name;
        this.age = age;
        this.color = color;
        this.noise = noise;
        this.isHealthy = isHealthy;
        this.breed = breed;
    }
}
