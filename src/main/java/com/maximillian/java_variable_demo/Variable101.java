package com.maximillian.java_variable_demo;

public class Variable101 {
    //comments are text that gives a detail about blocks of code.
    // It is also useful when you want to deactivate line or lines of codes that you are not using at the moment...

    // A class in java is a blue print or plan  of creating Object, while an object is an instance of a class { you will see more of this in OOP }
    //The Java Main class is the entry point of every Java application. The Main has the main method which is where the code is actually executed.

    //Keywords: Keywords that are unique and specific to the language.
    //public, private , protected, package private: -> Access modifiers.
    // what can have the access modifiers: classes, variables, Objects, methods.
    //static to be explained later on.

    //######################## DATA TYPES ##########################################################
    //Data bits of information that can be collected and as well as manipulated.
    // There are two types of Data Types in Java: 1. Primitive and 2. Non-Primitive.
    //Reference: https://www.w3schools.com/java/java_data_types_non-prim.asp
    //Primitive data types example: int, double, float, long, short, boolean, char and String(Sequence of these characters).
    //when you don't initialize a primitive value it does not default to null.
    //Non-Primitive (Reference types) or Wrapper Classes  data types: Objects types that represents the primitives:
    //example of non-primitive--> Integer, Boolean, Long, Double, Short, Float, Character....
    //When you don't initialize a non-primitive variable it takes a null value.
    //Variables are minute data container that can hold values saved memory for each data type

    //todo: Instance variable, Local variables and static variables as instance..
    //todo:return type..
    public static void main(String [] args){
        int age = 20; //initializing of the variable..
        age = 100;//reassigning of the variable.. when reassigning you don't need to specify the data type.
        age = 300;
        int numberOfTeeth;// this defaults to 0 without initialization.
        Integer can;//this default to null without initialization;
        can = 700;
        numberOfTeeth = 70;
        System.out.println(numberOfTeeth);
        System.out.println(can);
        System.out.println(age);

    }
}
