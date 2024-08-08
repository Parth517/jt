package com.example;

public class StringCalculator {
    public static int add(String number){
        int ans=0;
        number=number.replaceAll(" ","");
        if(number=="") ans=0;
        return ans;
    }

}
