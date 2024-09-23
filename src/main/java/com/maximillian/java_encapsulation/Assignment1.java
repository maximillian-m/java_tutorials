package com.maximillian.java_encapsulation;

public class Assignment1 {

    public  void typeToUpperCase(String input){
        String upperCase = input.toUpperCase();
        System.out.println(" the Upper case value is ===>" + upperCase);
    }
    public  String reverse(String input){
        String [] strArr = input.split("");
        String reversed = "";
        for(int i = strArr.length - 1; i >= 0; i--){
            reversed = reversed + strArr[i];
        }
        return reversed;
    }
    public  void vowelCount(String input){
        String vowels = "aeiou";
        String [] arrStr = input.split("");
        int count = 0;
        for (int i = 0; i < input.length(); i++){
            if (vowels.contains(arrStr[i])){
                count++;
            }
        }
        System.out.println("the count of vowels ===> " + count);
    }
    public  boolean isPalindrome(String input){
        return reverse(input).equalsIgnoreCase(input);
    }
}
