package challenges.hashtables;

import java.util.List;
import java.util.stream.Collectors;

public class SherlockAndAnagrams {

    static int sherlockAndAnagrams(String s) {
        List<Integer> chars = s.chars().boxed().collect(Collectors.toList());

        int count = 0;
        //TODO
        for(int i = 0; i < chars.size(); i ++) {
            for(int j = i + 1; j < chars.size(); j ++) {

                if(chars.get(i) == chars.get(j)) count ++;
            }
        }

        return count;
    }


}
