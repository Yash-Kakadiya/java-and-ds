// Q06 - Write a program to check whether number is Happy number or not.
// A happy number are those number whose digit’s square summation eventually reaches to 1, if the sequence start repeating then it is not a happy number.
// Example: 49 → 49 97 130 10 1 (Happy)
// Example: 50 → sequence repeats at 89 (Not Happy)

public class Q06 {
    public static int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 89; // sample input

        int slow = n;
        int fast = n;

        // Floyd's cycle detection
        do {
            slow = sumOfSquares(slow);
            fast = sumOfSquares(sumOfSquares(fast));
        } while (slow != fast);

        boolean isHappy = (slow == 1);

        System.out.println(n + " is Happy? " + isHappy);
    }
}