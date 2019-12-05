package challenges.problemsolving;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QueensAttackIITest {

    //@Test
    public void sampleZero() {

        int[][] obstacles = new int[][]{};

        assertEquals(9, QueensAttackII.queensAttack(4, 0, 4, 4, obstacles));
    }

    @Test
    public void sampleOne() {

        int[][] obstacles = new int[][]{{4,1}};

        assertEquals(9, QueensAttackII.queensAttack(5, 1, 4, 3, obstacles));
    }

}