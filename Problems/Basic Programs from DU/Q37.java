// Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K. 
// e.g. Input: N = 4, K = 6 
// arr[] = {1, 5, 7, 1} 
// Output: 2 
// Explanation: 
// arr[0] + arr[1] = 1 + 5 = 6 
// and arr[1] + arr[3] = 5 + 1 = 6. 

public class Q37 {
    public static int countPairs(int[] arr, int K) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == K) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 7, 1 };
        int K = 6;
        System.out.println(countPairs(arr, K)); // Output: 2
    }

}