package challenges.problemsolving;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BirthdayCandlesTest {

    @Test
    public void sampleZero() {

        assertEquals(2, BirthdayCandles.birthdayCakeCandles(new int[]{3, 2, 1, 3}));

    }

}