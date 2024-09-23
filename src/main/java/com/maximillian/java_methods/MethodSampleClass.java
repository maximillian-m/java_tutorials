package com.maximillian.java_methods;

public class MethodSampleClass {

    //1. public method without parameter without return type
    // 2. private method without parameter without return type

    //3. public method with return type and no parameter
    //4. private method with return type and no parameter

    //5. public method with return type and multiple parameters
    //6. private method with return type and multiple parameters

    // protected method...

    //static methods......

    public void printSumOfOneAndTwo(){
        int a  = 10;
        int b = 20;
        int sum =  a + b;
        System.out.println("The sum of a and b == " + sum);
        printSubtractionOneAndTwo();
        printMultiplication();
    }
    //can not be accessed through the main because it is private to the class..
    private void printSubtractionOneAndTwo(){
        int a = 100;
        int b = 50;
        int difference = a - b;
        System.out.println("The difference b/w a and be == " + difference);
    }
    // can be accessed from classes within the same package..
    protected void printMultiplication(){
        int a = 10;
        int b = 10;
        int product = a * b;
        System.out.println("The product of a and b is == " + product);
    }

    //Todo: give example where the return keyword is used within an if else statement...

    //Using return keyword to return the final result of the method.
    public int sumOfOneAndTwo(){
        int a = 10;
        int b = 20;
        return a + b;
        //it is important to note that return keyword is terminal...
    }

    public int summation(int a, int b){
        return a + b;
    }

    public static double division(int a, int b){
        return (double) a / b;
    }

}
