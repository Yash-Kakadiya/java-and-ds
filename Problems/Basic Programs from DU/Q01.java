// WAP to find a factorial of a given integer (iterative and recursive) 

public class Q01 {

    // Iterative
    public static int factorialIterative(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    // Recursive
    public static int factorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        int n = 7;

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }
        System.out.println("Factorial of " + n + " (iterative): " + factorialIterative(n));
        System.out.println("Factorial of " + n + " (recursive): " + factorialRecursive(n));
    }
}