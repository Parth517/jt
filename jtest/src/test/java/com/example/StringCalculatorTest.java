package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;

public class StringCalculatorTest {
    private StringCalculator stringCalculator;
    private static int passedTests=0;
    private static int failedTests=0;

    @BeforeEach
    public void setup(){
        System.out.println("Starting Tests...");
        stringCalculator=new StringCalculator();
    }

    @Test
    public void emptyStringWithSpacesShouldReturnZero(){
        assertEquals(stringCalculator.add(" "), 0);
    }
    @Test 
    public void emptyStringSHouldReturnZero(){
        assertEquals(stringCalculator.add(""), 0);

    }
    @Test 
    public void stringHavingOnly1NumberShouldReturnNumber(){
        assertEquals(stringCalculator.add("20"),20);
    }
    @Test 
    public void stringHavingTwoNumbersDelemitedByCommasShouldReturnSum(){
        assertEquals(stringCalculator.add("10,20"),30);
    }

    @Test
    public void stringHavingMultipleDigitsShouldReturnSum(){
        assertEquals(stringCalculator.add("20,40,60"), 120);
    } 
    

    @Test 
    public void stringHavingNewlineShouldBeValid(){
        assertEquals(stringCalculator.add("20,\n60,20"),100);
    }
}
