package challenges.problemsolving;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleArraySumTest {

    @Test
    public void sample() {
        assertEquals(31, SimpleArraySum.simpleArraySum(new int[]{1, 2, 3, 4, 10, 11}));
    }

}