package com.example;

public class DuplicateChar {
    public boolean isDuplicate(String input){
        if(input.length()<2){
            return false;
        }
        for(int i=0;i<input.length();i++){
            for(int j=1;j<input.length();j++){
                if(input.charAt(i) ==input.charAt(j)){
                    return true;
                }
            }
        }
        return false;
    }
}
