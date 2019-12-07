package challenges.problemsolving;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExtraLongFactorialsTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void sample1() {
        ExtraLongFactorials.extraLongFactorials(25);
        assertEquals("15511210043330985984000000", outContent.toString());
    }

    @Test
    public void sample0() {
        ExtraLongFactorials.extraLongFactorials(30);
        assertEquals("265252859812191058636308480000000", outContent.toString());
    }

    @Test
    public void testCase12() {
        ExtraLongFactorials.extraLongFactorials(45);
        assertEquals("119622220865480194561963161495657715064383733760000000000", outContent.toString());
    }

}