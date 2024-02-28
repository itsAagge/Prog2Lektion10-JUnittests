package opgave02.models;

import java.time.LocalDate;

public class Loan {
    private LocalDate returnDate;

    public Loan(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public int calculateFine(LocalDate calculatedDate, LocalDate actualDate, boolean adult) {
        return 0;
    }

}
