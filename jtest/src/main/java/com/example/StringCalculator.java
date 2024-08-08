package com.example;

public class StringCalculator {
    public static int add(String number) {
        int ans = 0;
        number = number.replaceAll(" ", "");
        if (number.equals("")) {
            return 0;
        }else if(number.contains(",")){
            String[] stringOfNumbers=number.split(",");
            return toInt(stringOfNumbers[0])+toInt(stringOfNumbers[1]);
        }
        else{
            return Integer.parseInt(number);
        }
    }

    private static int toInt(String number) throws NumberFormatException{
        return Integer.parseInt(number);
    }

}
