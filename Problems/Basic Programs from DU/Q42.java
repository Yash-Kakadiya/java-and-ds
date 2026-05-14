// Given 2 sorted arrays a[] and b[], each of size n, the task is to find the median of the array obtained after merging a[] and b[]. 
// Input: a[] = [1, 12, 15, 26, 38], b[] = [2, 13, 17, 30, 45] 
// Output: 16 
// Explanation: The middle two elements are 15 and 17,  so median = (15 + 17)/2 = 16

public class Q42 {
    public static void main(String[] args) {
        int[] a = { 1, 12, 15, 26, 38 };
        int[] b = { 2, 13, 17, 30, 45 };
        int n = a.length; // Assuming both arrays have the same size
        int[] merged = new int[2 * n];

        // Merge the two sorted arrays
        int i = 0, j = 0, k = 0;
        while (i < n && j < n) {
            if (a[i] < b[j]) {
                merged[k++] = a[i++];
            } else {
                merged[k++] = b[j++];
            }
        }
        while (i < n) {
            merged[k++] = a[i++];
        }
        while (j < n) {
            merged[k++] = b[j++];
        }

        // Find the median
        double median;
        if (merged.length % 2 == 0) {
            median = (merged[merged.length / 2 - 1] + merged[merged.length / 2]) / 2.0;
        } else {
            median = merged[merged.length / 2];
        }

        System.out.println("The median of the merged array is: " + median);
    }
}
