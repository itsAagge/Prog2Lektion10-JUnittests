package examples.roman;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumberConverterTest {

    @Test
    @DisplayName("MMD")
    void convertToRomanNumber() {
        String expected = "MMD";
        String actual = RomanNumberConverter.convertToRomanNumber(2500);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("VII")
    void convertToRomanNumber2() {
        String expected = "VII";
        String actual = RomanNumberConverter.convertToRomanNumber(7);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("CLX")
    void convertToRomanNumber3() {
        String expected = "CLX";
        String actual = RomanNumberConverter.convertToRomanNumber(160);
        assertEquals(expected, actual);
    }
}