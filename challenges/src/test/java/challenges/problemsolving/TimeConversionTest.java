package challenges.problemsolving;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeConversionTest {

    @Test
    public void sampleZero() {
        assertEquals("19:05:45",TimeConversion.timeConversion("07:05:45PM"));
    }

     @Test
    public void sampleOne() {
        assertEquals("12:45:54",TimeConversion.timeConversion("12:45:54PM"));
    }
     @Test
    public void sampleTwo() {
        assertEquals("00:00:00",TimeConversion.timeConversion("12:00:00AM"));
    }

}