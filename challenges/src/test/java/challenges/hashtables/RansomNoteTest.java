package challenges.hashtables;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RansomNoteTest {

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
    public void shouldSucceed() {

        RansomNote.checkMagazine(new String[]{"give", "me", "one", "grand", "today", "night"},
                new String[]{"give", "one", "grand", "today"});

        assertEquals("Yes", outContent.toString());

    }

    @Test
    public void shouldFail() {

        RansomNote.checkMagazine(new String[]{"ive", "got", "a", "lovely", "bunch", "of", "coconuts"},
                new String[]{"ive", "got", "some", "coconuts"});

        assertEquals("No", outContent.toString());

    }

    @Test
    public void shouldFail2() {

        RansomNote.checkMagazine(new String[]{"two", "times", "three", "is", "not", "four"},
                new String[]{"two", "times", "two", "is", "four"});

        assertEquals("No", outContent.toString());
    }
}