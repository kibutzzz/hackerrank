package challenges.hashtables;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TwoStringsTest {

    @Test
    public void shouldSucceed() {
        assertEquals("YES", TwoStrings.twoStrings("hello", "world"));
    }

    @Test
    public void shouldFail() {
        assertEquals("NO", TwoStrings.twoStrings("hi", "world"));
    }

    @Test
    public void veryLongTest() {
        assertEquals("NO", TwoStrings.twoStrings("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc",
                "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyffffffffffffffffffffffffffggggggggggggggggggggggggggggggggggggggggggggggggggggggrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrroooooooooooooooooooooooooooooooooooooooooooooooooopppppppppppppppppppppppppppppppppp"));
    }


}