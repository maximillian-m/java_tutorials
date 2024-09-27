package com.maximillian;


import com.maximillian.java_encapsulation.InstanceOfClass;
import com.maximillian.java_encapsulation.MysteryBox;
import com.maximillian.java_encapsulation.Person;
import com.maximillian.questions_and_answers.QuestionExplanation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        //This is where we instantiate the object of the class MethodSampleClass...
//        MethodSampleClass maximillian = new MethodSampleClass();
//        MethodSampleClass freedom = new MethodSampleClass();

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

//        Person person = new Person();
//        System.out.println(person.getName());
//        System.out.println(person.getId());
//
//        person.setName("Freedom");
//        person.setId(2);
//
//        System.out.println(person.getName());
//        System.out.println(person.getId());
//
//        ////////////////////////////Assignment///////////////////////////
//        System.out.println("enter word:  ");
//        Scanner scanner = new Scanner(System.in);
//        Assignment1 assignment1 = new Assignment1();
//        String userInput = scanner.next();
////        assignment1.typeToUpperCase(userInput);
////        System.out.println(assignment1.reverse(userInput));
////        assignment1.vowelCount(userInput);
////        System.out.println(assignment1.isPalindrome(userInput));
//        System.out.println(assignment1.reverseStr(userInput));
//        System.out.println(assignment1.vowelCount2(userInput));

//        QuestionExplanation questionExplanation = new QuestionExplanation();
//        questionExplanation.printUserNameInput();
//        questionExplanation.capitalizeString();
//        questionExplanation.printInitialsWithLastName();
//        questionExplanation.printInitialsWithLoop();
//
//        InstanceOfClass  instance = new InstanceOfClass();
//        //changing the value
//        instance.age = 200;
//        int age =  instance.age;
//        System.out.println(age);
//
//        MysteryBox mysteryBox = new MysteryBox();
//        MysteryBox mysteryBox2 = new MysteryBox("Sugar", "goggles", "perfume", "comb", "Cigarettes");
//
//        MysteryBox mkposkiesMysteryBox = new MysteryBox("Gown", "Head-tie", "Chocolates", "Bracelet", "Sandals");
//        System.out.println(mysteryBox.toString());
//        System.out.println(mysteryBox2.toString());
//        System.out.println("Mkposkies mystery box :: "+ mkposkiesMysteryBox.toString());

        System.out.println("============ WELCOME TO MAXY'S MYSTERY GIFT SHOP =============");
        System.out.println("Please how can we help you today, let's begin with your name, what's your name please? ");

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Wow " + userName + " is a lovely name");
        System.out.println(userName + " our mystery boxes are five items box, in case you don't know what to choose we can help " +
                "by providing for you what we have in the default box, would you like to know the items in the default box?");

        System.out.println("enter yes to view and no to go the next item");
        String agreement = scanner.next();
        if(agreement.equalsIgnoreCase("yes")){
            System.out.println("""
                    1. camera
                    2. shoes
                    3. chocolate
                    4. shirts
                    5. cash
                    """);
        }

        System.out.println("now " + userName + " would you like to have the default mystery box or would you want to specify your mystery box items");
        System.out.println("enter 1 to go for default mystery box or 2 for special mystery box");
        int input = scanner.nextInt();
        if(input == 1){
            MysteryBox defaultMysteryBox = new MysteryBox();
            System.out.println("Dear " + userName + " your mystery box is ready.... Here you go:: " + defaultMysteryBox.toString());
        }
        if(input == 2){
            System.out.println(" Please choose your items for your special mystery box");
            System.out.println("Enter your first item: ");
            String firstItem = scanner.next();
            System.out.println("Enter your second item: ");
            String second = scanner.next();
            System.out.println("Enter your third item: ");
            String thirdItem = scanner.next();
            System.out.println("Enter your fourth item: ");
            String fourthItem = scanner.next();
            System.out.println("Enter your fifth item: ");
            String fifth = scanner.next();

            MysteryBox specialMysteryBox = new MysteryBox(firstItem, second, thirdItem, fourthItem, fifth);
            System.out.println("Dear " + userName + " your mystery box is ready.... Here you go:: " + specialMysteryBox.toString());
        }
        if(input != 1 && input != 2){
            System.out.println("Sorry you entered a wrong input please try again later");
        }
        System.out.println("Thank you for shopping with us dear " + userName + " bye...");
    }

}