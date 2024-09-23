package com.maximillian.java_variable_demo;

import java.util.LinkedList;

public class DataTypeIntensiveClazz {
    /*
    The data types that we have covered: Primitive and Non-Primitive
    ###### PRIMITIVE #############
    Data types that are in-built in Java(predefined):
    char, int, double, long, short, float, byte

    ##### NON-PRIMITIVE ######
    These are types that are Objects or defined by programmers to solve some other problems that the primitives cannot solve.
    They are almost similar to the primitives except that they are objects and occupy more memory. In other words they can be referred to as
    reference types or wrapper classes.

   Character, Integer, Double, Long, Short, Float, Boolean, String, Byte
   String is a special case, because it is somewhat considered a primitive but by definition it is a non-primitive.
     */

    //TODO: 1. practice using combination of decimal and integers(long, int, double and float)


    public static void main(String[] args) {
        //These declarations are specific to data types that are involves operations using numbers.
        //Auto-boxing(Assignment)
        // whole number.
       int maxAge = 120;
       long duration = 120;

        // Are decimal oriented
       double shares = 120;
       float dividends = 120;

//       Non-primitive
       Integer maxAge2 = 120;
       Long duration2 = 120L;
       Double share2 = 120D;
       Float dividends2 = 120F;

        //Print out the initial values for the primitives.
        System.out.println("================================== For Primitives =================================");
        System.out.println
                ("int value:: "+ maxAge + "\n long value:: " + duration + "\n double value:: " + shares + "\n float value: " + dividends);
        System.out.println("================================== For Non-Primitives =================================");
        System.out.println
                ("int value:: "+ maxAge2 + "\n long value:: " + duration2 + "\n double value:: " + share2 + "\n float value: " + dividends2);
        //Example of the use of Non-primitives as wrappers for primitives.
        String numStr = "120.0";
        double numValue = Double.parseDouble(numStr);
        System.out.println(numValue);

        //Other reason is when you want to parameterize types: Java Generics, especially when dealing with Collections. e.g LinkedList.
        int num1 = 2;
        int num2 = 3;
        int num3 = 4;
        LinkedList<Integer> list = new LinkedList<>();
        list.add(num1);
        list.add(num2);
        list.add(num3);
        list.forEach(System.out::println);

//        int _1 = null; unacceptable
        Integer _2 = null; //acceptable.

    }
}
