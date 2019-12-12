package challenges.problemsolving;

public class SparseArrays {

    // Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) {

        int result[] = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            result[i] = 0;
            for(String s : strings) {
                if(queries[i].equals(s)) {
                    result[i] ++;
                }
            }
        }

        return result;
    }


}
