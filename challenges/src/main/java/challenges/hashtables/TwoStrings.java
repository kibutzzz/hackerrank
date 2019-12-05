package challenges.hashtables;

import java.util.Set;

import static java.util.stream.Collectors.toSet;

public class TwoStrings {

    static String twoStrings(String s1, String s2) {

        Set<Integer> set1 = s1.chars().boxed().collect(toSet());
        Set<Integer> set2 = s2.chars().boxed().collect(toSet());

        for (int i : set1) {
            if (set2.remove(i)) {
                return "YES";
            }
        }

        return "NO";
    }

}
