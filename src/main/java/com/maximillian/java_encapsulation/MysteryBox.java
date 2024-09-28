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
    //research more......................
    public MysteryBox(String firstItem, String secondItem, String thirdItem, String fourthItem, String fifthItem){
        this.firstItem = firstItem;
        this.secondItem = secondItem;
        this.thirdItem = thirdItem;
        this.fourthItem = fourthItem;
        this.fifthItem = fifthItem;
    }

    public void setFirstItem(String _1stItem){
        firstItem = _1stItem;
    }
    public String getFirstItem(){
        return firstItem;
    }

    public void setSecondItem(String _2ndItem){
        secondItem = _2ndItem;
    }
    public String getSecondItem(){
        return secondItem;
    }

    public void setThirdItem(String _3rdItem){
        thirdItem = _3rdItem;
    }
    public String getThirdItem(){
        return thirdItem;
    }
    public void setFourthItem(String _4thItem){
        fourthItem = _4thItem;
    }
    public String getFourthItem(){
        return fourthItem;
    }
    public void setFifthItem(String _5thItem){
        fifthItem = _5thItem;
    }
    public String getFifthItem(){
        return fifthItem;
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
