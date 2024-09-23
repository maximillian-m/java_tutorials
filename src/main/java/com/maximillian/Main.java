package com.maximillian;


import com.maximillian.java_encapsulation.Assignment1;
import com.maximillian.java_encapsulation.Dog;
import com.maximillian.java_encapsulation.Person;
import com.maximillian.java_methods.MethodSampleClass;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //This is where we instantiate the object of the class MethodSampleClass...
        MethodSampleClass maximillian = new MethodSampleClass();
        MethodSampleClass freedom = new MethodSampleClass();

        //Execution of the public method that doesn't have a return type.....
//        maximillian.printSumOfOneAndTwo();
//        System.out.println(maximillian.sumOfOneAndTwo());
//        System.out.println(freedom.sumOfOneAndTwo());

        //print methods with parameters to add dynamism
//        System.out.println(maximillian.summation(100, 300));
//        System.out.println(freedom.summation(1000, 500));

        //Static methods, you do not need to instantiate the classes before accessing them...
//        System.out.println( MethodSampleClass.division(10, 20));

//        Dog scooby = new Dog("Scooby", 5, "brown", "woof", true, "Ekwuke");

        Person person = new Person();
        System.out.println(person.getName());
        System.out.println(person.getId());

        person.setName("Freedom");
        person.setId(2);

        System.out.println(person.getName());
        System.out.println(person.getId());

        ////////////////////////////Assignment///////////////////////////
        System.out.println("enter word:  ");
        Scanner scanner = new Scanner(System.in);
        Assignment1 assignment1 = new Assignment1();
        String userInput = scanner.next();
        assignment1.typeToUpperCase(userInput);
        System.out.println(assignment1.reverse(userInput));
        assignment1.vowelCount(userInput);
        System.out.println(assignment1.isPalindrome(userInput));
    }
}