package challenges.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaExceptionHandlingTest {

    @Test
    public void test0() throws Exception {
        assertEquals(243L, new JavaExceptionHandling().power(3, 5));
    }

    @Test
    public void test1() throws Exception {
        assertEquals(16L, new JavaExceptionHandling().power(2, 4));
    }

    @Test
    public void test2() {
        try {
            new JavaExceptionHandling().power(0, 0);
        } catch (Exception e) {
            assertEquals("java.lang.Exception: n and p should not be zero.", e.toString());
        }
    }

    @Test
    public void test3() {
        try {
            new JavaExceptionHandling().power(-1, -2);
        } catch (Exception e) {
            assertEquals("java.lang.Exception: n or p should not be negative.", e.toString());
        }
    }
    @Test
    public void test4() {
        try {
            new JavaExceptionHandling().power(-1, 3);
        } catch (Exception e) {
            assertEquals("java.lang.Exception: n or p should not be negative.", e.toString());
        }
    }

}