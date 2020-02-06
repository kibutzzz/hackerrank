package challenges.sap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AtrasadinhosTest {


    @Test
    public void test0() {

        assertEquals("YES", Atrasadinhos.atrasadinhos(10, 1, new int[]{0, 0, 0, 0, 0, 0, 273, 0, 0, 0}));
    }

    @Test
    public void test1() {

        assertEquals("YES", Atrasadinhos.atrasadinhos(10, 1,
                new int[]{-3, -2, -9, -11, -20, 0, -1, -8, -10, -100}));
    }

    @Test
    public void test2() {

        assertEquals("NO", Atrasadinhos.atrasadinhos(10, 8,
                new int[]{-4, 7, 0, 3, 4, 0, 1, 88, 100, 390}));
    }

}