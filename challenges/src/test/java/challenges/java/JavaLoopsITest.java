package challenges.java;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaLoopsITest {

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
    public void test() {

        String expected = "2 x 1 = 2\n" +
                "2 x 2 = 4" + System.lineSeparator() +
                "2 x 3 = 6" + System.lineSeparator() +
                "2 x 4 = 8" + System.lineSeparator() +
                "2 x 5 = 10" + System.lineSeparator() +
                "2 x 6 = 12" + System.lineSeparator() +
                "2 x 7 = 14" + System.lineSeparator() +
                "2 x 8 = 16" + System.lineSeparator() +
                "2 x 9 = 18" + System.lineSeparator() +
                "2 x 10 = 20";

        JavaLoopsI.printMultiplicationTable(2);

        assertEquals(expected, outContent.toString());
    }

}