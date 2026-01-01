// Q35: Given an array nums with n integers, your task is to check if it could become non-decreasing by modifying at most one element.  
// Input: nums = [4,2,3] 
// Output: true 
// Explanation: You could modify the first 4 to 1 to get a non-decreasing array.

public class Q35 {
    public static void main(String[] args) {
        int[] nums = { 4, 2, 3 };
        boolean result = checkPossibility(nums);
        System.out.println(result);
    }

    public static boolean checkPossibility(int[] nums) {
        int count = 0; // Count of modifications

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                count++;
                if (count > 1) {
                    return false;
                }
                // Modify nums[i-1] or nums[i]
                if (i - 2 < 0 || nums[i] >= nums[i - 2]) {
                    nums[i - 1] = nums[i]; // Modify nums[i-1]
                } else {
                    nums[i] = nums[i - 1]; // Modify nums[i]
                }
            }
        }

        return true;
    }
}
