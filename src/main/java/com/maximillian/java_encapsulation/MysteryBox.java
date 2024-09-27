package com.maximillian.java_encapsulation;

public class MysteryBox {
    private String firstItem;
    private String secondItem;
    private String thirdItem;
    private String fourthItem;
    private String fifthItem;

    //No argument constructor.
    public MysteryBox(){
        firstItem = "camera";
        secondItem = "shoes";
        thirdItem = "chocolate";
        fourthItem = "shirts";
        fifthItem = "cash";
    }

    public MysteryBox(String firstItem, String secondItem, String thirdItem, String fourthItem, String fifthItem){
        this.firstItem = firstItem;
        this.secondItem = secondItem;
        this.thirdItem = thirdItem;
        this.fourthItem = fourthItem;
        this.fifthItem = fifthItem;
    }

    @Override
    public String toString() {
        return "MysteryBox{" +
                "firstItem='" + firstItem + '\'' +
                ", secondItem='" + secondItem + '\'' +
                ", thirdItem='" + thirdItem + '\'' +
                ", fourthItem='" + fourthItem + '\'' +
                ", fifthItem='" + fifthItem + '\'' +
                '}';
    }
}
