package challenges.problemsolving;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MiniMaxSumTest {

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
        int[] input = {1, 2, 3, 4, 5};
        MiniMaxSum.miniMaxSum(input);

        assertEquals("10 14", outContent.toString());
    }


    @Test
    public void sampleOne() {
        int[] input = {942381765, 627450398, 954173620, 583762094, 236817490};
        MiniMaxSum.miniMaxSum(input);

        assertEquals("2390411747 3107767877", outContent.toString());
    }
}