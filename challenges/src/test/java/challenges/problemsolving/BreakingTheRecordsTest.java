package challenges.problemsolving;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static challenges.problemsolving.BreakingTheRecords.breakingRecords;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BreakingTheRecordsTest {


    @Test
    public void sample0() {
        assertTrue(Arrays.equals(new int[]{2, 4},
                breakingRecords(new int[]{10, 5, 20, 20, 4, 5, 2, 25, 1})));
    }

    @Test
    public void sample1() {
        assertTrue(Arrays.equals(new int[]{4, 0},
                breakingRecords(new int[]{3, 4, 21, 36, 10, 28, 35, 5, 24, 42})));
    }
}