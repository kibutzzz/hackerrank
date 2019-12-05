package challenges.java;

import javax.swing.text.NumberFormatter;
import java.text.NumberFormat;
import java.util.Locale;

public class JavaCurrencyFormatter {
    public static void main(String[] args) {
        printFormatted(1534.54);
    }

    static void printFormatted(double val) {

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(val);
        String india = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(val);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(val);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(val);


        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);

    }
}
