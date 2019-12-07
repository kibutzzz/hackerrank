package challenges.problemsolving;

public class BreakingTheRecords {


    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {

        int [] results = new int []{0,0};
        Integer min = null;
        Integer max = null;

        for(int score : scores) {
            if(min == null && max ==null) {
                min = score;
                max = score;
                continue;
            }

            if(score > max) {
                results[0] ++;
                max = score;
            }

            if(score < min) {
                results[1] ++;
                min = score;
            }

        }

        return results;
    }


}
