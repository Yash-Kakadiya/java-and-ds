// You are given a 0-indexed array nums consisting of positive integers. You can choose two indices i and j, such that i != j, and the sum of digits of the number nums[i] is equal to that of nums[j]. 
// Return the maximum value of nums[i] + nums[j] that you can obtain over all possible indices i and j that satisfy the conditions. 
// Input: nums = [18,43,36,13,7] 
// Output: 54 
// Explanation: The pairs (i, j) that satisfy the conditions are: 
// - (0, 2), both numbers have a sum of digits equal to 9, and their sum is 18 + 36 = 54. 
// - (1, 4), both numbers have a sum of digits equal to 7, and their sum is 43 + 7 = 50. 
// So the maximum sum that we can obtain is 54.

public class Q39 {
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static int maxSum(int[] nums) {
        int maxSum = -1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (sumOfDigits(nums[i]) == sumOfDigits(nums[j])) {
                    maxSum = Math.max(maxSum, nums[i] + nums[j]);
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = { 18, 43, 36, 13, 7 };
        System.out.println(maxSum(nums)); // Output: 54
    }
}
