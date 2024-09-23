package com.maximillian.java_variable_demo;

public class Exercises {
  /*  Exercise 1: Basic Variable Manipulation
    Objective: Declare and manipulate basic variables.
            Instructions:
    Declare three variables: an integer a, a double b, and a String message.
    Assign the values 10 to a, 20.5 to b, and "Hello, Java!" to message.
    Print each variable.
    Change the value of a to 15 and b to 30.75. Print the new values.

    Exercise 2: Calculating Area of a Circle

    Objective: Use variables and arithmetic operations.
    Instructions:
    Declare a double variable radius and assign it a value of 7.5.
    Declare a double variable area and calculate the area of the circle using the formula area = π * radius * radius. (Use 3.14 as the value of π).
    Print the area of the circle.
    */

    public static void main(String[] args) {
        //Question1.
        int a = 10;
        double b = 20.5;
        String message = "Hello, Java!";
        System.out.println(a);
        System.out.println(b);
        System.out.println(message);
        System.out.println("=================================================================");
        a = 15;
        b = 30.75;
        System.out.println(a);
        System.out.println(b);

        System.out.println("======================QUES 2. =====================");
       final double pie = 3.14;
       double radius = 7.5;
       double area = pie * radius * radius;

       int bigFish =  'A';
       bigFish++;
       char value = (char) bigFish;
        System.out.println(value);
        System.out.println(area);
    }
}
