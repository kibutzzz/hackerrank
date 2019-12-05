package challenges.problemsolving;

import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here

        Integer primaryDiagonalSum = 0;
        Integer secondaryDiagonalSum = 0;

        //lines
        for (int i = 0; i < arr.size(); i++) {
            primaryDiagonalSum += arr.get(i).get(i);
        }

        for (int i = 0; i < arr.size(); i++) {
            secondaryDiagonalSum += arr.get(i).get(arr.size() - i - 1);
        }

        return Math.abs(primaryDiagonalSum - secondaryDiagonalSum);
    }


}
