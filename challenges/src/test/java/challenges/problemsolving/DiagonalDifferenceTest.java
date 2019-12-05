package challenges.problemsolving;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiagonalDifferenceTest {


    @Test
    public void sampleZero() {
        List<List<Integer>> squareMatrix = Arrays.asList(Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(9, 8, 9));

        assertEquals(2, DiagonalDifference.diagonalDifference(squareMatrix));
    }


    @Test
    public void sampleOne() {
        List<List<Integer>> squareMatrix = Arrays.asList(Arrays.asList(11, 2, 4),
                Arrays.asList(4, 5, 6),
                Arrays.asList(10, 8, -12));

        assertEquals(15, DiagonalDifference.diagonalDifference(squareMatrix));
    }

}