// Given an integer n, return the nth digit of the infinite integer sequence [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...]  
// Input: n = 11  
// Output: 0  
// ExplanaƟon: The 11th digit of the sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... is a 0, which is part of the number 10. 

public class Q23 {
    public static int findNthDigit(int n) {
        int digitCount = 0;
        int currentNumber = 1;

        while (digitCount < n) {
            String currentStr = Integer.toString(currentNumber);
            digitCount += currentStr.length();
            if (digitCount >= n) {
                return currentStr.charAt(currentStr.length() - 1 - (digitCount - n)) - '0';
            }
            currentNumber++;
        }

        return -1; // This line should never be reached
    }

    public static void main(String[] args) {
        int n = 11;
        System.out.println(findNthDigit(n));
    }
}
