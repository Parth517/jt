package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class StringCalculator {
    public static int add(String number) {
        int ans = 0;
        number = number.replaceAll(" ", "");
        if (number.isEmpty()) {
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
            return SumOfNumbers(SplitUsingCustomDelimiter(number));
        }
        String[] stringOfNumbers = number.split(",|\n");
        return SumOfNumbers(stringOfNumbers);
    }

    private static int SumOfNumbers(String[] numbers) {
        ArrayList<Integer> NegativeNumbers = new ArrayList<>();
        int sum = 0;
        for (String num : numbers) {
            if (toInt(num) < 0) {
                NegativeNumbers.add(toInt(num));
            }
            if (!NegativeNumbers.isEmpty()) {
                String negativesString = NegativeNumbers.toString()
                        .replace("[", "")
                        .replace("]", "");
                throw new RuntimeException("Negatives are not allowed: " + negativesString);
            }
            sum += Integer.parseInt(num);
        }
        return sum;
    }

    private static String[] SplitUsingCustomDelimiter(String number) {
        Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(number);
        matcher.matches();
        String customDelimiter = matcher.group(1);
        String numbers = matcher.group(2);
        return numbers.split(Pattern.quote(customDelimiter));
    }

}
