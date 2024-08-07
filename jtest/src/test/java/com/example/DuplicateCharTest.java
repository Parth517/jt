package com.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DuplicateCharTest {
    private DuplicateChar dc;
    private static int passedTests=0;
    private static int failedTests=0;

    @BeforeEach
    public void setup(){
        dc=new DuplicateChar();
    }

    @AfterAll
    public static void tearDown(){
        System.out.println("No of tests passed: " + passedTests);
        System.out.println("No of tests failed: " + failedTests);
    }

     private void runTest(String input, boolean expectedResult) {
        boolean result = dc.isDuplicate(input);
        if (result == expectedResult) {
            passedTests++;
            System.out.println("Test passed for " + input + " expected result " + expectedResult + " got " + result);
        } else {
            failedTests++;
            System.out.println("Test failed for " + input + " expected result " + expectedResult + " got " + result);
        }
        assertEquals(expectedResult, result);
    }
    @Test
    public void testCheckDuplicateIn2Chars() {
        runTest("AA", true);
    }
    @Test
    public void testCheckDuplicateIn2DifferentChars() {
        runTest("AC", false);
    }
    @Test
    public void testCheckDuplicateInMultipleChars() {
        runTest("ACDEA", true);
    }
    @Test
    public void testCheckDuplicateInMultipleDifferentChars() {
        runTest("ACDEF", false);
    }
    @Test
    public void testCheckDuplicateCases(){
        runTest("Abcdae", true);
    }
    @Test
    public void testCheckDuplicateCasesDifferentChars(){
        runTest("Abcdefg", false);
    }
    @Test
    public void testCheckDuplicateCasesWhenSingleSpaceIsPassed(){
        runTest("Parth Deshpande", true);
    }
    @Test
    public void testCheckDuplicateCasesWhenSingleSpaceIsPassedDifferentChars(){
        runTest("Parth Des", false);
    }
    
}
