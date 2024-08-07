package com.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class NumberIsPrimeTest {
    private NumberIsPrime np;
    private static int passedTests = 0;
    private static int failedTests = 0;

    @BeforeEach
    public void setup() {
        np = new NumberIsPrime();
    }

    @AfterAll
    public static void tearDown() {
        System.out.println("No of tests passed:" + passedTests);
        System.out.println("No of failed passed:" + failedTests);
    }

    public void runTest(int number, boolean expectedResult) {
        boolean result = np.isPrime(number);
        if (result == expectedResult) {
            passedTests++;
            System.out.println("Test passed for " + number + " expected result " + expectedResult + " got " + result);
        } else {
            failedTests++;
            System.out.println("Test failed for " + number + " expected result " + expectedResult + " got " + result);
        }
        assertEquals(expectedResult, result);
    }

    @Test
    public void testIsPrime1Digit(){
        runTest(3,true);
    }
    @Test
    public void testIsNotPrime1Digit(){
        runTest(4,false);
    }
    @Test 
    public void testIPrime2Digits(){
        runTest(23,true);
    }
    @Test 
    public void testIsNotPrime2Digits(){
        runTest(24,false);
    }
}
