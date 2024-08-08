package com.example;

public class StringCalculator {
    public static int add(String number) {
        int ans = 0;
        number = number.replaceAll(" ", "");
        if (number.equals("")) {
            return 0;
        }else{
            return Integer.parseInt(number);
        }
    }

}
