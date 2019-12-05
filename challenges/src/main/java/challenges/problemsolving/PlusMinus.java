package challenges.problemsolving;

import java.util.Locale;

public class PlusMinus {


    public static void plusMinus(int[] arr) {
        double numberOfPositives = 0;
        double numberOfNegatives = 0;
        double numberOfZeroes = 0;

        for (int i : arr) {
            if (i < 0) {
                numberOfNegatives++;
            } else if (i == 0) {
                numberOfZeroes++;
            } else {
                numberOfPositives++;
            }
        }

        System.out.println(String.format(Locale.US,"%.6f", numberOfPositives / arr.length));
        System.out.println(String.format(Locale.US,"%.6f", numberOfNegatives / arr.length));
        System.out.print(String.format(Locale.US,"%.6f", numberOfZeroes / arr.length));

    }
}
