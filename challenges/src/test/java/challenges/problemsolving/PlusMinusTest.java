package challenges.problemsolving;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlusMinusTest {
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
    public void sampleZero() {
        int[] arr = new int[]{1, 1, 0, -1, -1};

        PlusMinus.plusMinus(arr);

        String expected = "0.400000" + System.lineSeparator() + "0.400000" + System.lineSeparator() + "0.200000";

        assertEquals(expected, outContent.toString());

    }

    @Test
    public void sampleOne() {
        int[] arr = new int[]{-4, 3, -9, 0, 4, 1};

        PlusMinus.plusMinus(arr);

        String expected = "0.500000" + System.lineSeparator() + "0.333333" + System.lineSeparator() + "0.166667";

        assertEquals(expected, outContent.toString());
    }

}