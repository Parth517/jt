package com.example;

import java.util.HashSet;
import java.util.Set;

public class DuplicateChar {
    public boolean isDuplicate(String input){
        if(input.length()<2){
            return false;
        }
        input=input.replaceAll("[^A-Za-z0-9]", "");
        Set<Character> findDuplicate=new HashSet<>();
        for(char c:input.toLowerCase().toCharArray()){
            if(findDuplicate.contains(c)){
                return true;
            }
            findDuplicate.add(c);
        }
        return false;
    }
}
