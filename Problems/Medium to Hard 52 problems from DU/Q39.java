//  Q39: Implement the myAtoi(string s)function,which converts a string to a 32-bit signed integer.The algorithm for myAtoi(string s)is as follows:Whitespace:Ignore any leading whitespace(" ").
//Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positivity is neither present. 
// Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached. If no digits were read, then the result is 0. 
// Rounding: If the integer is out of the 32-bit signed integer range [-2^31, 2^31 - 1], then round the integer to remain in the range. Specifically, integers less than -2^31 should be rounded to -2^31, and integers greater than 2^31 - 1 should be rounded to 2^31 - 1. 
// Return the integer as the final result. 
// Input: s = " -042" 
// Output: -42 
// Explanation: 
// Step 1: "-042" (leading whitespace is read and ignored) 
// Step 2: "-042" ('-' is read, so the result should be negative) 
// Step 3: "042" ("042" is read in, leading zeros ignored in the result)

public class Q39 {
    public static void main(String[] args) {
        String s = " -042";
        int result = myAtoi(s);
        System.out.println(result);
    }

    public static int myAtoi(String s) {
        int index = 0, sign = 1, total = 0;
        int n = s.length();

        // Step 1: Ignore leading whitespace
        while (index < n && s.charAt(index) == ' ') {
            index++;
        }

        // Step 2: Check for sign
        if (index < n) {
            char currentChar = s.charAt(index);
            if (currentChar == '+') {
                sign = 1;
                index++;
            } else if (currentChar == '-') {
                sign = -1;
                index++;
            }
        }

        // Step 3: Convert digits to integer
        while (index < n) {
            char currentChar = s.charAt(index);
            if (!Character.isDigit(currentChar)) {
                break;
            }

            int digit = currentChar - '0';

            // Check for overflow/underflow
            // Why? Because total * 10 + digit > Integer.MAX_VALUE
            int x = total * 10 + digit;
            if (x > Integer.MAX_VALUE) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            total = x;
            index++;
        }

        return total * sign;
    }
}
