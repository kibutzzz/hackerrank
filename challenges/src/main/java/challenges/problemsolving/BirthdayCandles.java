package challenges.problemsolving;

import java.util.Arrays;

public class BirthdayCandles {

    static int birthdayCakeCandles(int[] ar) {
        int max = Arrays.stream(ar).max().getAsInt();

        return (int) Arrays.stream(ar).filter(n -> n == max).count();
    }

}
