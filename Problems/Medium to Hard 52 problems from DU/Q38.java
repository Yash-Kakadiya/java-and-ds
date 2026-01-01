// Write a Function that returns either 1 or 0 based on following condition if the array is in ascending order and occurrence of all numbers at least 3 then it should return 1 otherwise it should return 0.
// e.g. if A=[1,1,1,2,2] it should return 0, if A= [1,1,1,3,3,3,3] it should return 1.

public class Q38 {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 3, 3, 3, 3 };
        int result = checkArray(arr);
        System.out.println(result);
    }

    public static int checkArray(int[] arr) {
        // Check if the array is in ascending order
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return 0; // Not in ascending order
            }
        }

        // Check occurrence of each number
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                if (count < 3) {
                    return 0; // Occurrence less than 3
                }
                count = 1; // Reset count for new number
            }
        }
        // Final check for the last number
        if (count < 3) {
            return 0;
        }

        return 1; // Array is in ascending order and all numbers occur at least 3 times
    }
}
