package challenges.problemsolving;

import org.junit.jupiter.api.Test;

import static challenges.problemsolving.Encryption.encryption;
import static org.junit.jupiter.api.Assertions.*;

class EncryptionTest {

    @Test
    public void explanation() {

        String expected = "imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau";
        String actual = encryption("if man was meant to stay on the ground god would have given us roots");
        assertEquals(expected, actual);
    }

    @Test
    public void sample0() {

        String expected = "hae and via ecy";
        String actual = encryption("haveaniceday");
        assertEquals(expected, actual);
    }

    @Test
    public void sample1() {

        String expected = "fto ehg ee dd";
        String actual = encryption("feedthedog");
        assertEquals(expected, actual);
    }


    @Test
    public void sample2() {

        String expected = "clu hlt io";
        String actual = encryption("chillout");
        assertEquals(expected, actual);
    }

    @Test
    public void personalEncryption() {
        assertEquals("vesvrm aroaie msaips oeqetm siunao vsicr",
                encryption("vamos ver se isso aqui vai encriptar mesmo"));
    }


}