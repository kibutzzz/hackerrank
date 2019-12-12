package challenges.problemsolving;

import org.junit.jupiter.api.Test;

import static challenges.problemsolving.SparseArrays.matchingStrings;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SparseArraysTest {

    @Test
    public void test() {

        int[] result = matchingStrings(new String[]{"ab", "ab", "abc"}, new String[]{"ab", "abc", "bc"});

        assertArrayEquals(new int[]{2, 1, 0}, result);
    }

    @Test
    public void test1() {

        int[] result = matchingStrings(new String[]{"aba", "baba", "aba", "xzxb"}, new String[]{"aba", "xzxb", "ab"});

        assertArrayEquals(new int[]{2, 1, 0}, result);
    }


    @Test
    public void test2() {

        int[] result = matchingStrings(new String[]{"def", "de", "fgh"}, new String[]{"de", "lmn", "fgh"});

        assertArrayEquals(new int[]{1, 0, 1}, result);
    }

    @Test
    public void test3() {

        int[] result = matchingStrings(new String[]{"abcde", "sdaklfj", "asdjf", "na", "basdn", "sdaklfj", "asdjf",
                        "na", "asdjf", "na", "basdn", "sdaklfj", "asdjf"},
                new String[]{"abcde", "sdaklfj", "asdjf", "na", "basdn"});

        assertArrayEquals(new int[]{1, 3, 4, 3, 2}, result);
    }


}