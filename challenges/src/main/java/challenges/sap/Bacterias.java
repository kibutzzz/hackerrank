package challenges.sap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Bacterias {

//    private static final Scanner scanner = new Scanner(System.in);

    public static void run(int n, int m, Map<String,String> rules) {
//
//        int n = scanner.nextInt();
//        final int m = scanner.nextInt();

//        Map<String, String> rules = new HashMap<>();
//        for (int i = 0; i < m; i++) {
//            String group = scanner.next();
//            String transformation = scanner.next();
//
//            rules.put(group, transformation);
//        }
        String newPopulation = "A";
        while (n > 0) {
            newPopulation = Arrays.stream(newPopulation.split("(?<=(.))(?!\\1)"))
                    .map(rules::get)
                    .collect(Collectors.joining());
            n--;
        }

        int aPopulation = 0;
        int bPopulation = 0;

        for(int i = 0; i < newPopulation.length(); i ++) {
            if('A' == newPopulation.charAt(i)) {
                aPopulation++;
                continue;
            }
            bPopulation ++;
        }

        System.out.print(aPopulation + " " + bPopulation);
    }

}
