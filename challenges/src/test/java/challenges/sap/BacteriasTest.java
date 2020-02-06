package challenges.sap;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BacteriasTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;
//    private InputStream stdin ;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
//        stdin = System.in;
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);

    }

    @Test
    public void test2() {

        Map<String, String> rules = new HashMap<>();
        rules.put("A", "AA");
        rules.put("AA", "AA");
        Bacterias.run(20, 2, rules);

        assertEquals("2 0", outContent.toString());
//        System.setIn(stdin);
    }

    @Test
    public void test1() {

        System.setIn(new ByteArrayInputStream("2 2 A AB B AA".getBytes()));
        Map<String, String> rules = new HashMap<>();
        rules.put("A", "AB");
        rules.put("B", "AA");
        Bacterias.run(2, 2, rules);

        assertEquals("3 1", outContent.toString());
//        System.setIn(stdin);
    }

    @Test
    public void test0() {

        Map<String, String> rules = new HashMap<>();
        rules.put("A", "AB");
        rules.put("B", "AA");
        rules.put("AA", "BB");
        rules.put("BB", "BA");
        Bacterias.run(4, 3, rules);

        assertEquals("4 4", outContent.toString());
    }


}