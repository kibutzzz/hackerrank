package challenges.hashtables;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SherlockAndAnagramsTest {

    @Test
    public void sampleZeroA() {
        assertEquals(4, SherlockAndAnagrams.sherlockAndAnagrams("abba"));
    }

    @Test
    public void sampleZeroB() {
        assertEquals(0, SherlockAndAnagrams.sherlockAndAnagrams("abcd"));
    }

    @Test
    public void sampleOneA() {
        assertEquals(3, SherlockAndAnagrams.sherlockAndAnagrams("ifailuhkqq"));
    }

    @Test
    public void sampleOneB() {
        assertEquals(10, SherlockAndAnagrams.sherlockAndAnagrams("kkkk"));
    }

    @Test
    public void sampleTwoA() {
        assertEquals(5, SherlockAndAnagrams.sherlockAndAnagrams("cdcd"));
    }


}