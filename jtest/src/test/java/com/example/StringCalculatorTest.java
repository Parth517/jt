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
        stringCalculator=new StringCalculator();
    }

    @Test
    public void emptyStringShouldReturnZero(){
        assertEquals(stringCalculator.add(" "), 0);
    }
}
