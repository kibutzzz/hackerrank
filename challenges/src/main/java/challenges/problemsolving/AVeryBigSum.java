package challenges.problemsolving;

public class AVeryBigSum {

    static long aVeryBigSum(long[] ar) {

        Long sum = 0L;

        for(long l : ar) {
            sum += l;
        }

        return sum;
    }
}
