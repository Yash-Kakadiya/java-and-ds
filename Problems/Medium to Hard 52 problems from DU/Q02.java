// Q02 - WAP to find weather given number is Ugly or not. 
// An ugly number is a positive integer which does not have a prime factor other than 2, 3, and 5. 
// Input: n = 6 Output: true Explanation: 6 = 2 × 3

public class Q02 {
    public static void main(String[] args) {
        int n = 6; // sample input

        // Ugly numbers have only prime factors 2, 3, and 5
        if (n <= 0) {
            System.out.println(n + " is Ugly? false");
            return;
        }

        int temp = n;

        // Keep dividing by 2, 3, and 5
        int[] factors = { 2, 3, 5 };
        for (int f : factors) {
            while (temp % f == 0) {
                temp /= f; // reduce by allowed factors
            }
        }

        // If after reduction number becomes 1 → Ugly
        boolean isUgly = (temp == 1);

        System.out.println(n + " is Ugly? " + isUgly);
    }
}