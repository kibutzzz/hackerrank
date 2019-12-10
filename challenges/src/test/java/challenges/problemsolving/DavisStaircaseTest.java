package challenges.problemsolving;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static challenges.problemsolving.DavisStaircase.*;
import static org.junit.jupiter.api.Assertions.*;

class DavisStaircaseTest {

    @Test
    public void test0() {
        assertEquals(1, stepPerms(1));
    }
    @Test
    public void test1() {
        assertEquals(4, stepPerms(3));
    }

    @Test
    public void test10() {
        assertEquals(7, stepPerms(4));
    }
    @Test
    public void test8() {
        assertEquals(13, stepPerms(5));
    }
    @Test
    public void test2() {
        assertEquals(44, stepPerms(7));
    }
    @Test
    public void test3() {
        assertEquals(2, stepPerms(2));
    }

    @Test
    public void test4() {
        assertEquals(181997601, stepPerms(32));
    }

    @Test
    public void test5() {
        assertEquals(334745777, stepPerms(33));
    }

    @Test
    public void test6() {
        assertEquals(1132436852, stepPerms(35));
    }

    @Test
    public void test7() {
        assertEquals(2082876103, stepPerms(36));
    }
//
//    @Test
//    public void wtfTest() {
//        assertEquals(0, stepPerms(8008, new HashMap<>()));
//    }

}