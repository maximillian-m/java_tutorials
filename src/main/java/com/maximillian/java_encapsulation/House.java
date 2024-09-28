package com.maximillian.java_encapsulation;

public class House {
    private String type;
    private int numberOfRooms;
    private int numberOfCompoundEntrance;
    private String interiorColor;
    private String exteriorColor;
    private String roofColor;
    private int numberOfBalcony;

    public House(String type, int numberOfRooms, int numberOfCompoundEntrance, String interiorColor,
                 String exteriorColor, String roofColor, int numberOfBalcony){
        this.type = type;
        this.numberOfRooms = numberOfRooms;
        this.numberOfCompoundEntrance = numberOfCompoundEntrance;
        this.interiorColor = interiorColor;
        this.exteriorColor = exteriorColor;
        this.roofColor = roofColor;
        this.numberOfBalcony = numberOfBalcony;
    }

}
