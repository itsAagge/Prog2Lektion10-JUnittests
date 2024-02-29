package opgave02.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class LoanTest {
    Loan loan = new Loan(LocalDate.now());

    @Test
    @DisplayName("No fine")
    void calculateFine() {
        int expected = 0;
        int actual = loan.calculateFine(LocalDate.now(), true);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Child, 3 days late")
    void calculateFine2() {
        int expected = 10;
        int actual = loan.calculateFine(LocalDate.now().plusDays(3), false);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Adult, 33 days late")
    void calculateFine3() {
        int expected = 90;
        int actual = loan.calculateFine(LocalDate.now().plusDays(33), true);
        assertEquals(expected, actual);
    }
}