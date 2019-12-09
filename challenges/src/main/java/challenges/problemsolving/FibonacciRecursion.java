package challenges.problemsolving;

public class FibonacciRecursion {

    public static int fibonacci(int n) {
        return (n < 2) ? n : fibonacci(n - 1) + fibonacci(n - 2);
    }
}
