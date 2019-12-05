package challenges.problemsolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTriplets {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> scores = new ArrayList<>(Arrays.asList(0, 0));

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) < b.get(i)) {
                scores.set(1, scores.get(1) + 1);
            } else if (a.get(i) > b.get(i)) {
                scores.set(0, scores.get(0) + 1);
            }
        }
        return scores;
    }

}
