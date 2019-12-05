package challenges.problemsolving;

import java.util.Arrays;

public class MiniMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        long sum = Arrays.stream(arr).asLongStream().sum();

        long minSum = sum - Arrays.stream(arr).max().getAsInt();
        long maxSum = sum - Arrays.stream(arr).min().getAsInt();

        System.out.print(minSum + " " + maxSum);
    }


}
