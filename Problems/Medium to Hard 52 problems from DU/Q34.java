// Q34: Given an array of positive integers arr[] of size n, the task is to find the second largest distinct element in the array. 
// Note: If the second largest element does not exist, return -1. 
// Input: arr[] = [12, 35, 1, 10, 34, 1] 
// Output: 34 
// Explanation: The largest element of the array is 35 and the second largest element is 34. 
// Input: arr[] = [10, 10, 10] 
// Output: -1 
// Explanation: The largest element of the array is 10 there is no second largest element.

public class Q34 {
    public static void main(String[] args) {
        int[] arr = { 12, 35, 1, 10, 34, 1 };
        int result = findSecondLargest(arr);
        System.out.println(result);
    }

    public static int findSecondLargest(int[] arr) {
        int largest = -1;
        int secondLargest = -1;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }
}
