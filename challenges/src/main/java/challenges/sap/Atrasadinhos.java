package challenges.sap;

public class Atrasadinhos {

    public static String atrasadinhos(int n, int k, int[] times) {

        int totalLate = 0;

        for (int i : times) {
            totalLate += i > 0 ? 1 : 0;
        }

        return (n - totalLate) >= k ? "YES" : "NO";

    }
}
