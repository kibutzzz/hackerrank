package challenges.problemsolving;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AVeryBigSumTest {


    @Test
    public void sample0() {

        long[] arr = new long[] {1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L};

        assertEquals(5000000015L, AVeryBigSum.aVeryBigSum(arr));
    }
}