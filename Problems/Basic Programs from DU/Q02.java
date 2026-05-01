// WAP to find a summaƟon of a digit of a given number. (Iterative and recursive)

public class Q02 {
    // Iterative
    public static int sumOfDigitsIterative(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    // Recursive
    public static int sumOfDigitsRecursive(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumOfDigitsRecursive(n / 10);
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println("Sum of digits of " + n + " (iterative): " + sumOfDigitsIterative(n));
        System.out.println("Sum of digits of " + n + " (recursive): " + sumOfDigitsRecursive(n));
    }
}
