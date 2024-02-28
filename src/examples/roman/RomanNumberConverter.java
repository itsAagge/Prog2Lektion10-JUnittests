package examples.roman;

public abstract class RomanNumberConverter {
    public static String convertToRomanNumber(int arabicNumber) {
        String romanNumber = "";
        while (arabicNumber > 0) {
            if (arabicNumber > 1000) {
                for (int i = 0; i < arabicNumber / 1000; i++) {
                    romanNumber = romanNumber.concat("M");
                }
                arabicNumber = arabicNumber % 1000;
            } else if (arabicNumber >= 500) {
                romanNumber = romanNumber.concat("D");
                arabicNumber = arabicNumber - 500;
            } else if (arabicNumber > 100) {
                for (int i = 0; i < arabicNumber / 100; i++) {
                    romanNumber = romanNumber.concat("C");
                }
                arabicNumber = arabicNumber % 100;
            } else if (arabicNumber >= 50) {
                romanNumber = romanNumber.concat("L");
                arabicNumber = arabicNumber - 50;
            } else if (arabicNumber > 10) {
                for (int i = 0; i < arabicNumber / 10; i++) {
                    romanNumber = romanNumber.concat("X");
                }
                arabicNumber = arabicNumber % 10;
            } else if (arabicNumber >= 5) {
                romanNumber = romanNumber.concat("V");
                arabicNumber = arabicNumber - 5;
            } else {
                for (int i = 0; i < arabicNumber; i++) {
                    romanNumber = romanNumber.concat("I");
                }
                arabicNumber = 0;
            }
        }
        return romanNumber;
    }
}
