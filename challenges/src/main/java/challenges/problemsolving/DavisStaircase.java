package challenges.problemsolving;

import java.math.BigInteger;
import java.util.Map;

public class DavisStaircase {
    static int stepPerms(int n) {
        if (n < 6) {
            if (n == 1) return 1;
            if (n == 2) return 2;
            if (n == 3) return 4;
            if (n == 4) return 7;
            if (n == 5) return 13;
        }
        return stepPerms(n - 1) + stepPerms(n - 2) + stepPerms(n - 3);
    }

//    solução ridiculamente rapida O(n) - adaptado de cris_kgl em
//    https://www.hackerrank.com/challenges/ctci-recursive-staircase/forum

//    static final BigInteger TWO = BigInteger.ONE.add(BigInteger.ONE);
//    static final BigInteger THREE = TWO.add(BigInteger.ONE);
//    static BigInteger stepPerms(int n, Map<Integer, BigInteger> map){
//        if(n == 1) return BigInteger.ONE; if(n == 2) return TWO; if(n == 3) return TWO;
//        if(map.containsKey(n)) return map.get(n);
//        BigInteger res = BigInteger.ZERO;
//        res = res.add(stepPerms(n - 1, map));
//        res = res.add(stepPerms(n - 2, map));
//        res = res.add(stepPerms(n - 3, map));
//        map.put(n, res);
//        return res;
//    }
}
