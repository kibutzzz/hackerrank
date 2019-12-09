package challenges.problemsolving;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciRecursionTest {

    @Test
    public void test0() {
        assertEquals(2, FibonacciRecursion.fibonacci(3));
    }

    @Test
    public void test1() {
        assertEquals(3, FibonacciRecursion.fibonacci(4));
    }

    @Test
    public void test2() {
        assertEquals(5, FibonacciRecursion.fibonacci(5));
    }

    @Test
    public void test3() {
        assertEquals(8, FibonacciRecursion.fibonacci(6));
    }

    @Test
    public void test4() {
        assertEquals(13, FibonacciRecursion.fibonacci(7));
    }
    @Test
    public void test5() {
        assertEquals(21, FibonacciRecursion.fibonacci(8));
    }

    @Test
    public void test6() {
        assertEquals(1597, FibonacciRecursion.fibonacci(17));
    }
    @Test
    public void test7() {
        assertEquals(6765 , FibonacciRecursion.fibonacci(20));
    }

    @Test
    public void test8() {
        assertEquals(102334155 , FibonacciRecursion.fibonacci(40));
    }

}