package examples.roman;

import examples.roman.RomanNumberConverter;

public class RomanNumberConverterTests {
    public static void main(String[] args) {
        // 2500 -> MMD
        String expected = "MMD";
        String actual = RomanNumberConverter.convertToRomanNumber(2500);
        if (expected.equals(actual)) {
            System.out.println("Test passed");
        } else {
            System.out.println("TEST FAILED, expected: " + expected + " got: " + actual);
        }

        // 7 -> VII
        expected = "VII";
        actual = RomanNumberConverter.convertToRomanNumber(7);
        if (expected.equals(actual)) {
            System.out.println("Test passed");
        } else {
            System.out.println("TEST FAILED, expected: " + expected + " got: " + actual);
        }
    }
}
