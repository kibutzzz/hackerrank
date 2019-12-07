package challenges.problemsolving;

import java.math.BigInteger;

public class ExtraLongFactorials {

    // Complete the extraLongFactorials function below.
    static void extraLongFactorials(int n) {

        BigInteger result = BigInteger.ONE;
        for(int i = n; i > 0; i --) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        System.out.print(result);

    }

}
