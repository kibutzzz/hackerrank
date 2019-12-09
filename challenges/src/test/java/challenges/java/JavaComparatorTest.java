package challenges.java;

import challenges.java.JavaComparator.Player;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class JavaComparatorTest {

    @Test
    public void sample0() {

        Player players[] = new Player[]{
                new Player("amy", 100),
                new Player("david", 100),
                new Player("heraldo", 50),
                new Player("aakansha", 75),
                new Player("aleksa", 150)
        };

        Player expected[] = new Player[]{
                new Player("aleksa", 150),
                new Player("amy", 100),
                new Player("david", 100),
                new Player("aakansha", 75),
                new Player("heraldo", 50)
        };
        Arrays.sort(players, new JavaComparator.Checker());

        assertTrue(Arrays.equals(expected, players));
    }

}