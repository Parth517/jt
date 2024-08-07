package com.example;

import org.junit.jupiter.api.BeforeEach;

public class NumberIsPrimeTest {
    private NumberIsPrime np;
    private static int passedTests = 0;
    private static int failedTests = 0;

    @BeforeEach
    public void setup() {
        np = new NumberIsPrime();
    }

    public void tearDown() {
        System.out.println("No of tests passed:" + passedTests);
        System.out.println("No of failed passed:" + failedTests);
    }

    public void runTest(int number, boolean expectedResult) {
        int result = isPrime(number);
        if (result == expectedResult) {
            passedTests++;
            System.out.println("Test passed for " + input + " expected result " + expectedResult + " got " + result);
        } else {
            failedTests++;
            System.out.println("Test failed for " + input + " expected result " + expectedResult + " got " + result);
        }
    }

}
