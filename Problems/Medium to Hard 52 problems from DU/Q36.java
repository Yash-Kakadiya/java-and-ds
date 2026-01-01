// Q36: Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose 
// sum is equal to K.  
// Input: N = 4, K = 6, arr[] = {1, 5, 7, 1} Output: 2 

import java.util.*;

public class Q36 {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 7, 1 };
        int k = 6;
        int result = countPairsWithSumK(arr, k);
        System.out.println(result);
    }

    public static int countPairsWithSumK(int[] arr, int k) {
        int count = 0;
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {
            int complement = k - num;
            if (freqMap.containsKey(complement)) {
                count += freqMap.get(complement);
            }
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        return count;
    }
}
