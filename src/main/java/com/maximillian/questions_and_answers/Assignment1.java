package com.maximillian.questions_and_answers;

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
    public  String reverseStr(String input){
        char[] chars = input.toCharArray();
        String reversed = "";
        for(int i = chars.length - 1; i >= 0; i--){
            reversed = reversed + chars[i];
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
    public int vowelCount2(String input){
        String vowels = "aeiou";
        int count = 0;
        for (int i = 0; i <  input.length(); i++){
            if (vowels.contains(String.valueOf(input.charAt(i)))){
                count++;
            }
        }
        return count;
    }
    public  boolean isPalindrome(String input){
        return reverse(input).equalsIgnoreCase(input);
    }
}
