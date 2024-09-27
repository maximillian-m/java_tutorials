package com.maximillian.questions_and_answers;

import java.util.Scanner;

public class QuestionExplanation {
    //1. capitalizing String input, converting to UpperCase
    //2. Printing your name....
    //Write a Java method that takes user input and using the inputs print your full name...
    //If a user inputs 3 names firstname, middlename and surname; I want to use his firstname and middlename as initials and then his last name
    //Ifeanyi Maximillian Agwaigbo ===> I.M Agwaigbo

    public void printUserNameInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = scanner.next();
        System.out.println("Enter your last name: ");
        String lastName = scanner.next();
        String fullName = firstName + " " + lastName;
        System.out.println("My full name is " + fullName);
    }

    public void capitalizeString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your input");
        String userInput = scanner.next();
        System.out.println("The word when input :: " + userInput);
        String capitalized = userInput.toUpperCase();
        System.out.println("Capitalized word :: " + capitalized);
    }

    public void printInitialsWithLastName() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first name");
        String firstName = scanner.next();
        System.out.println("Please enter middle name");
        String middleName =  scanner.next();
        System.out.println("Please enter your last name");
        String lastName = scanner.next();

        System.out.println("computing your initials in a bit hold......");
        Thread.sleep(5000);

        String firstInitial = String.valueOf(firstName.charAt(0)).toUpperCase();
        String secondInitial = String.valueOf(middleName.charAt(0)).toUpperCase();
        String nameWithInitials = firstInitial + "." + secondInitial + " " + lastName;

        System.out.println("Name with initial is : " + nameWithInitials);
    }
    //Given a specific we can calculate the number of occurrences of a particular letter in a word
    //Hippopotamus as the word and I put letter p as the letter my result should 3.
    public void printInitialsWithLoop(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter a word or q to quit");
            String word = scanner.next();
            if(!word.equalsIgnoreCase("q")){
                System.out.println("Enter search letter ");
                String letter = scanner.next();
                if(word.contains(letter)){
                   int count = 0;
                   for(int i = 0; i < word.length(); i++){
                       if(letter.equalsIgnoreCase(String.valueOf(word.charAt(i)))){
                           count++;
                       }
                   }
                    System.out.println("Number of occurrences for the letter " + letter + " is : " + count);
                }
            }else{
                scanner.close();
                break;
            }
        }
    }

}
