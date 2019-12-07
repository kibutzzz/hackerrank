package challenges.problemsolving;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QueensAttackIITest {

    //@Test
    public void sampleZero() {

        int[][] obstacles = new int[][]{};

        assertEquals(9, QueensAttackII.queensAttack(4, 0, 4, 4, obstacles));
    }

    // @Test
    public void sampleOne() {

        int[][] obstacles = new int[][]{{4, 2}, {5, 5}, {2, 3}};

        assertEquals(10, QueensAttackII.queensAttack(5, 3, 4, 3, obstacles));
    }

    @Test
    public void diagonalSimpleTest() {

        int[][] obstacles = new int[][]{};

        assertEquals(9, QueensAttackII.queensAttack(4, 0, 1, 1, obstacles));
    }


    @Test
    public void diagonalWithObstacle() {

        int[][] obstacles = new int[][]{{3, 3}};

        assertEquals(7, QueensAttackII.queensAttack(4, 1, 1, 1, obstacles));
    }

    @Test
    public void diagonalWithObstacle2() {

        int[][] obstacles = new int[][]{{4, 4}};

        assertEquals(8, QueensAttackII.queensAttack(4, 1, 1, 1, obstacles));
    }

    @Test
    public void diagonalWithObstacle3() {

        int[][] obstacles = new int[][]{};

        assertEquals(9, QueensAttackII.queensAttack(4, 0, 4, 4, obstacles));
    }

    @Test
    public void explanation1() {
        int[][] obstacles = new int[][]{{5, 5}, {4, 2}, {2, 3}};

        assertEquals(10, QueensAttackII.queensAttack(5, 3, 4, 3, obstacles));

    }

    @Test
    public void bigExample2() {
        int[][] obstacles = new int[][]{{3, 5}};

        assertEquals(24, QueensAttackII.queensAttack(8, 1, 4, 4, obstacles));

    }

    @Test
    public void bigExample1() {
        int[][] obstacles = new int[][]{};

        assertEquals(27, QueensAttackII.queensAttack(8, 0, 4, 4, obstacles));

    }

    @Test
    public void teste1() {
        int[][] obstacles = new int[][]{};

        assertEquals(14, QueensAttackII.queensAttack(5, 0, 4, 3, obstacles));

    }

    @Test
    public void teste2() {
        int[][] obstacles = new int[][]{{4, 1}};

        assertEquals(13, QueensAttackII.queensAttack(5, 1, 4, 3, obstacles));

    }

    @Test
    public void teste3() {
        int[][] obstacles = new int[][]{{4, 2}};

        assertEquals(12, QueensAttackII.queensAttack(5, 1, 4, 3, obstacles));

    }

    @Test
    public void teste4() {
        int[][] obstacles = new int[][]{{4, 1}, {4, 2}};

        assertEquals(12, QueensAttackII.queensAttack(5, obstacles.length, 4, 3, obstacles));

    }


    @Test
    public void teste5() {
        int[][] obstacles = new int[][]{{4, 2}, {4, 1}};

        assertEquals(12, QueensAttackII.queensAttack(5, obstacles.length, 4, 3, obstacles));

    }


    @Test
    public void teste6() {
        int[][] obstacles = new int[][]{{5, 1}};

        assertEquals(14, QueensAttackII.queensAttack(5, obstacles.length, 4, 3, obstacles));

    }


    @Test
    public void teste7() {
        int[][] obstacles = new int[][]{{4, 4}};

        assertEquals(12, QueensAttackII.queensAttack(5, obstacles.length, 4, 3, obstacles));

    }

    @Test
    public void teste8() {
        int[][] obstacles = new int[][]{{4, 4}, {4, 2}};

        assertEquals(10, QueensAttackII.queensAttack(5, obstacles.length, 4, 3, obstacles));

    }

    @Test
    public void teste9() {
        int[][] obstacles = new int[][]{{4, 5}, {4, 2}};

        assertEquals(11, QueensAttackII.queensAttack(5, obstacles.length, 4, 3, obstacles));

    }

    @Test
    public void teste10() {
        int[][] obstacles = new int[][]{{3, 1}, {3, 5}, {5, 3}, {1, 3}};

        assertEquals(12, QueensAttackII.queensAttack(5, obstacles.length, 3, 3, obstacles));

    }

    @Test
    public void teste11() {
        int[][] obstacles = new int[][]{};

        assertEquals(9, QueensAttackII.queensAttack(4, obstacles.length, 1, 1, obstacles));

    }

    @Test
    public void teste12() {
        int[][] obstacles = new int[][]{{3, 3}};

        assertEquals(7, QueensAttackII.queensAttack(4, obstacles.length, 1, 1, obstacles));

    }

    @Test
    public void teste13() {
        int[][] obstacles = new int[][]{{4, 4}};

        assertEquals(8, QueensAttackII.queensAttack(4, obstacles.length, 1, 1, obstacles));

    }

    @Test
    public void teste14() {
        int[][] obstacles = new int[][]{};

        assertEquals(9, QueensAttackII.queensAttack(4, obstacles.length, 4, 4, obstacles));

    }

    @Test
    public void teste15() {
        int[][] obstacles = new int[][]{{2, 2}};

        assertEquals(7, QueensAttackII.queensAttack(4, obstacles.length, 4, 4, obstacles));

    }

    @Test
    public void teste16() {
        int[][] obstacles = new int[][]{};

        assertEquals(9, QueensAttackII.queensAttack(4, obstacles.length, 4, 1, obstacles));

    }

    @Test
    public void teste17() {
        int[][] obstacles = new int[][]{{3, 2}};

        assertEquals(7, QueensAttackII.queensAttack(4, obstacles.length, 1, 4, obstacles));

    }

    @Test
    public void testeMaximus() {

        int[][] obstacles = new int[][]{
                {54, 87},
                {64, 97},
                {42, 75},
                {32, 65},
                {42, 87},
                {32, 97},
                {54, 75},
                {64, 65},
                {48, 87},
                {48, 75},
                {54, 81},
                {42, 81},
                {45, 17},
                {14, 24},
                {35, 15},
                {95, 64},
                {63, 87},
                {25, 72},
                {71, 38},
                {96, 97},
                {16, 30},
                {60, 34},
                {31, 67},
                {26, 82},
                {20, 93},
                {81, 38},
                {51, 94},
                {75, 41},
                {79, 84},
                {79, 65},
                {76, 80},
                {52, 87},
                {81, 54},
                {89, 52},
                {20, 31},
                {10, 41},
                {32, 73},
                {83, 98},
                {87, 61},
                {82, 52},
                {80, 64},
                {82, 46},
                {49, 21},
                {73, 86},
                {37, 70},
                {43, 12},
                {94, 28},
                {10, 93},
                {52, 25},
                {50, 61},
                {52, 68},
                {52, 23},
                {60, 91},
                {79, 17},
                {93, 82},
                {12, 18},
                {75, 64},
                {69, 69},
                {94, 74},
                {61, 61},
                {46, 57},
                {67, 45},
                {96, 64},
                {83, 89},
                {58, 87},
                {76, 53},
                {79, 21},
                {94, 70},
                {16, 10},
                {50, 82},
                {92, 20},
                {40, 51},
                {49, 28},
                {51, 82},
                {35, 16},
                {15, 86},
                {78, 89},
                {41, 98},
                {70, 46},
                {79, 79},
                {24, 40},
                {91, 13},
                {59, 73},
                {35, 32},
                {40, 31},
                {14, 31},
                {71, 35},
                {96, 18},
                {27, 39},
                {28, 38},
                {41, 36},
                {31, 63},
                {52, 48},
                {81, 25},
                {49, 90},
                {32, 65},
                {25, 45},
                {63, 94},
                {89, 50},
                {43, 41},

        };

        assertEquals(40, QueensAttackII.queensAttack(100, 100, 48, 81, obstacles));
    }


}