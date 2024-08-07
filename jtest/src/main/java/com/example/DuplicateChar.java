package com.example;

public class DuplicateChar {
    public boolean isDuplicate(String input){
        if(input.length()<2){
            return false;
        }
        for(int i=0;i<input.length();i++){
            for(int j=i+1;j<input.length();j++){
                if(input.toLowerCase().charAt(i)==input.toLowerCase().charAt(j)){
                    return true;
                }
            }
        }
        return false;
    }
}
