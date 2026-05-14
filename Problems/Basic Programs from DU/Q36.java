// You are given an integer num. Rearrange the digits of num such that its value is minimized and it does not contain any leading zeros. 
// Return the rearranged number with minimal value. 
// Note that the sign of the number does not change after rearranging the digits. 
// Input: num = 310 
// Output: 103 
// Explanation: The possible arrangements for the digits of 310 are 013, 031, 103, 130, 301, 
// 310. 
// The arrangement with the smallest value that does not contain any leading zeros is 103.

import java.util.Arrays;

public class Q36 {
    public static int smallestNumber(int num) {
        if (num == 0) {
            return 0;
        }
        boolean isNegative = num < 0;
        char[] digits = (Math.abs(num) + "").toCharArray();
        Arrays.sort(digits);
        if (isNegative) {
            // For negative numbers, we want the largest possible arrangement
            for (int i = 0; i < digits.length / 2; i++) {
                char temp = digits[i];
                digits[i] = digits[digits.length - 1 - i];
                digits[digits.length - 1 - i] = temp;
            }
            return -Integer.parseInt(new String(digits));
        } else {
            // For positive numbers, we want the smallest possible arrangement
            if (digits[0] == '0') {
                for (int i = 1; i < digits.length; i++) {
                    if (digits[i] != '0') {
                        char temp = digits[i];
                        digits[i] = digits[0];
                        digits[0] = temp;
                        break;
                    }
                }
            }
            return Integer.parseInt(new String(digits));
        }
    }

    public static void main(String[] args) {
        int num = 310;
        System.out.println(smallestNumber(num)); // Output: 103
    }

}
