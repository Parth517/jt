package com.example;

public class NumberIsPrime {
    public boolean isPrime(int number){
        if(number<2)return false;
        for(int factor=2;factor<=number/2;factor++){
            if(number%factor==0){
                return false;
            }
        }
        return true;
    }
}
