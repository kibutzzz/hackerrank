package challenges.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Java1DArrayTest {


    @Test
    public void test0() {
        assertTrue(Java1DArray.canWin(3, new int[]{0, 0, 0, 0, 0}));
    }

    @Test
    public void test1() {
        assertTrue(Java1DArray.canWin(5, new int[]{0, 0, 0, 1, 1, 1}));
    }

    @Test
    public void test2() {
        assertFalse(Java1DArray.canWin(3, new int[]{0, 0, 1, 1, 1, 0}));
    }

    @Test
    public void test3() {
        assertFalse(Java1DArray.canWin(1, new int[]{0, 1, 0}));
    }

    @Test
    public void test4() {
        assertFalse(Java1DArray.canWin(22, new int[]{48, 22, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 0,
                1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1}));
    }
}