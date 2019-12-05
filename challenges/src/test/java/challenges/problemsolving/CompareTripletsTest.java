package challenges.problemsolving;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CompareTripletsTest {

    private List<Integer> expected;


    @Test
    public void sampleZero() {

        List<Integer> tripletA = new ArrayList<>(Arrays.asList(5, 6, 7));
        List<Integer> tripletB = new ArrayList<>(Arrays.asList(3, 6, 10));

        expected = new ArrayList<>(Arrays.asList(1,1));

        assertEquals(expected, CompareTriplets.compareTriplets(tripletA, tripletB));
    }

    @Test
    public void sampleOne() {

        List<Integer> tripletA = new ArrayList<>(Arrays.asList(17, 28, 30));
        List<Integer> tripletB = new ArrayList<>(Arrays.asList(99, 16, 8));

        expected = new ArrayList<>(Arrays.asList(2,1));

        assertEquals(expected, CompareTriplets.compareTriplets(tripletA, tripletB));
    }


}