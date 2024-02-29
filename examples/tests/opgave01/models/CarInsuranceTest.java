package opgave01.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarInsuranceTest {
    CarInsurance carInsurance = new CarInsurance(1000);

    @Test
    @DisplayName("26, man, 1")
    void calculatePremium() {
        Double expected = 1000.0;
        Double actual = carInsurance.calculatePremium(26, false, 1);
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    @DisplayName("26, woman, 1")
    void calculatePremium2() {
        Double expected = 950.0;
        Double actual = carInsurance.calculatePremium(26, true, 1);
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    @DisplayName("Should throw RuntimeError")
    void calculatePremium3() {
        Throwable exception = assertThrows(RuntimeException.class, () -> carInsurance.calculatePremium(10, true, 1));
        assertEquals("Error in age or years without damage", exception.getMessage());
    }
}