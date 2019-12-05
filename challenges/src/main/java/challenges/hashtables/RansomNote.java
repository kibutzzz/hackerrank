package challenges.hashtables;

import java.util.HashMap;

public class RansomNote {

    static void checkMagazine(String[] magazine, String[] note) {

        HashMap<String, Integer> magazineMap = createWordMapFrom(magazine);
        HashMap<String, Integer> noteMap = createWordMapFrom(note);

        for (String word : noteMap.keySet()) {
            Integer magazineWordCount = magazineMap.get(word);
            Integer noteWordCount = noteMap.get(word);
            if (magazineWordCount == null || magazineWordCount - noteWordCount < 0) {
                System.out.print("No");
                return;
            }
        }

        System.out.print("Yes");
    }


    static HashMap<String, Integer> createWordMapFrom(String[] array) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : array) {
            Integer value = map.get(word);

            if (value == null) {
                value = 0;
            } else {
                value++;
            }

            map.put(word, value);
        }
        return map;
    }
}
