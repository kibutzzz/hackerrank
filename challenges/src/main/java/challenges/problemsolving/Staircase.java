package challenges.problemsolving;

public class Staircase {

    static void staircase(int n) {

        int spaceNumber = 0;
        int stairNumber = 0;

        spaceNumber = n;
        for (int k = 0; k < n; k++) {
            spaceNumber -= 1;
            stairNumber = n - spaceNumber;
            StringBuilder stairBuilder = new StringBuilder();

            for (int i = 0; i < spaceNumber; i++) {
                stairBuilder.append(" ");
            }

            for (int i = 0; i < stairNumber; i++) {
                stairBuilder.append("#");
            }

            System.out.print(stairBuilder.toString());
            if(k != n -1) {
                System.out.println();
            }
        }

    }

}
