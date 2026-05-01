// WAP to find weather given number is Ugly or not. 
// An ugly number is a positive integer which does not have a prime factor other than 2, 3, and 5. 
// Input: n = 6 Output: true Explanation: 6 = 2 × 3

public class Q11 {
    public static boolean isUgly(int n) {
        if (n <= 0)
            return false;

        while (n % 2 == 0)
            n /= 2;

        while (n % 3 == 0)
            n /= 3;

        while (n % 5 == 0)
            n /= 5;

        return n == 1;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(isUgly(n));
    }
}
