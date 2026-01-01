// Q27: WAP for given N digits, arrange them to form the largest number divisible by 3.

import java.util.Scanner;

public class Q27 {
    // Steps in detail:
    // 1. Read input digits
    // 2. Calculate sum of digits
    // 3. Sort digits in descending order using counting sort
    // 4. Check remainder of sum when divided by 3
    // 5. If remainder is not zero, remove the smallest digits to make sum divisible by 3
    // 5.a. If remainder is 1, try to remove one digit with remainder 1 or two
    // digits with remainder 2
    // 5.b. If remainder is 2, try to remove one digit with remainder 2 or two
    // digits with remainder 1
    // 6. If all digits are removed or only zeros remain, the result is 0
    // 7. Print the largest number formed by the remaining digits

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, sum = 0;

        System.out.print("Enter total number of digits: ");
        n = sc.nextInt();

        int[] digits = new int[n];
        System.out.println("Enter " + n + " digits:");
        for (int i = 0; i < n; i++) {
            System.out.print("Digit " + (i + 1) + ": ");
            digits[i] = sc.nextInt();
            sum += digits[i];
        }

        // Sort digits in descending order using counting sort

        // Frequency array for digits 0-9
        int[] count_freq = new int[10];

        // Count frequency of each digit
        for (int i = 0; i < n; i++) {
            count_freq[digits[i]]++;
        }

        // Reconstruct array in descending order
        int idx = 0;
        for (int i = 9; i >= 0; i--) {
            while (count_freq[i] > 0) {
                digits[idx++] = i;
                count_freq[i]--;
            }
        }

        int remainder = sum % 3;
        int count = n; // Number of digits can use

        if (remainder != 0) {
            boolean removed = false;

            // Try to remove smallest digit with remainder equal to sum%3
            for (int i = n - 1; i >= 0 && !removed; i--) {
                if (digits[i] % 3 == remainder) {
                    digits[i] = -1;
                    count--;
                    removed = true;
                }
            }

            // If not found, try to remove two digits whose sum%3 == remainder
            if (!removed) {
                int needed = (3 - remainder) % 3;
                int removedCount = 0;

                for (int i = n - 1; i >= 0 && removedCount < 2; i--) {
                    if (digits[i] != -1 && digits[i] % 3 == needed) {
                        digits[i] = -1;
                        count--;
                        removedCount++;
                    }
                }
            }
        }

        // Check if we have any valid digits left
        if (count == 0) {
            System.out.println("Not possible to form a number divisible by 3");
            return;
        }

        // Check if all remaining digits are 0
        boolean allZeros = true;
        for (int i = 0; i < n; i++) {
            if (digits[i] != -1 && digits[i] != 0) {
                allZeros = false;
                break;
            }
        }

        if (allZeros && count > 0) {
            System.out.println("Largest number divisible by 3: 0");
            return;
        }

        // Print the largest number
        System.out.print("Largest number divisible by 3: ");
        for (int i = 0; i < n; i++) {
            if (digits[i] != -1) {
                System.out.print(digits[i]);
            }
        }
        System.out.println();

    }
}