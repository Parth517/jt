package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    public static int add(String number) {
        int ans = 0;
        number = number.replaceAll(" ", "");
        if (number.equals("")) {
            return 0;
        } else {
            return PatternMatcher(number);
        }
    }

    private static int toInt(String number) throws NumberFormatException {
        return Integer.parseInt(number);
    }

    private static int PatternMatcher(String number) throws NumberFormatException {
        if (number.startsWith("//")) {
            Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(number);
            if (matcher.matches()) {
                String customDelimiter = matcher.group(1);
                String numbers = matcher.group(2);
                return SumOfNumbers(numbers.split(Pattern.quote(customDelimiter)));
            }
        }
        String[] stringOfNumbers = number.split(",|\n");
        return SumOfNumbers(stringOfNumbers);
    }

    private static int SumOfNumbers(String[] numbers) {
        int sum = 0;
        for (String num : numbers) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }

}
