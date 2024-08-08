package com.example;

public class StringCalculator {
    public static int add(String number) {
        int ans = 0;
        number = number.replaceAll(" ", "");
        if (number.equals("")) {
            return 0;
        } else{
            return sumOfNumber(number);
        }
    }

    private static int toInt(String number) throws NumberFormatException {
        return Integer.parseInt(number);
    }

    private static int sumOfNumber(String number) throws NumberFormatException {
        String[] stringOfNumbers = number.split(",|\n");
        int sum = 0;
        for (String num : stringOfNumbers) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }

}
