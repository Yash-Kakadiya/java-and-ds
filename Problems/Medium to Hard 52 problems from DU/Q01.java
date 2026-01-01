// Q01 - WAP to find weather given number is Prime or not.

public class Q01 {
    public static void main(String[] args) {
        int n = 4; // sample input

        // Prime number check
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false; // 0 and 1 are not prime
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        System.out.println(n + " is Prime? " + isPrime);
    }
}