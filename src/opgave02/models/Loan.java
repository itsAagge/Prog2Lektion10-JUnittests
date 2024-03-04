package opgave02.models;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class Loan {
    private LocalDate returnDate;

    public Loan(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public int calculateFine(LocalDate actualDate, boolean adult) {
         long daysBetween = ChronoUnit.DAYS.between(returnDate, actualDate);
         int fine = 0;
         if (daysBetween > 0) {
             if (daysBetween < 7) {
                 if (adult) {
                     fine += 20;
                 } else {
                     fine += 10;
                 }
             } else if (daysBetween >= 8 && daysBetween <= 14) {
                 if (adult) {
                     fine += 60;
                 } else {
                     fine += 30;
                 }
             } else {
                 if (adult) {
                     fine += 90;
                 } else {
                     fine += 45;
                 }
             }
         }
         return fine;
    }

}
