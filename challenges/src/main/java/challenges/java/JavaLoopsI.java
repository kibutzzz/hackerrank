package challenges.java;

public class JavaLoopsI {

    static void printMultiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(n + " x " + i + " = " + n * i);
            if (i != 10) {
                System.out.print(System.lineSeparator());
            }
        }
    }
}
