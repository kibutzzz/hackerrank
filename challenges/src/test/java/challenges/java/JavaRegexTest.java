package challenges.java;

import challenges.java.JavaRegex.MyRegex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaRegexTest {

    @Test
    public void test0() {
        assertTrue("000.12.12.034".matches(new MyRegex().pattern));

    }

    @Test
    public void test1() {
        assertTrue("121.234.12.12".matches(new MyRegex().pattern));

    }


    @Test
    public void test2() {
        assertTrue("23.45.12.56".matches(new MyRegex().pattern));

    }


    @Test
    public void test3() {
        assertFalse("00.12.123.123123.123".matches(new MyRegex().pattern));
    }

    @Test
    public void test4() {
        assertFalse("122.23".matches(new MyRegex().pattern));
    }

    @Test
    public void test5() {
        assertFalse("Hello.IP".matches(new MyRegex().pattern));
    }


    @Test
    public void test6() {
        assertFalse("259.259.259.259".matches(new MyRegex().pattern));
    }

    @Test
    public void test7() {
        assertFalse("266.266.266.266".matches(new MyRegex().pattern));
    }

    @Test
    public void test8() {
        assertTrue("255.255.255.255".matches(new MyRegex().pattern));

    }

    @Test
    public void test9() {
        assertFalse("555.555.555.555".matches(new MyRegex().pattern));
    }

    @Test
    public void test10() {
        assertFalse(" 666.666.666.666".matches(new MyRegex().pattern));
    }

    @Test
    public void test11() {
        assertTrue("249.249.249.249".matches(new MyRegex().pattern));
    }

    @Test
    public void test12() {
        assertFalse("249.249.249.256".matches(new MyRegex().pattern));
    }

}