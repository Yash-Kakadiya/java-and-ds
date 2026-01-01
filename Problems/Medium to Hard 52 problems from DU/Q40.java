// Given 2 sorted arrays a[] and b[], each of size n, the task is to find the median of the array obtained after merging a[] and b[]. 
// Input: a[] = [1, 12, 15, 26, 38], b[] = [2, 13, 17, 30, 45] 
// Output: 16 
// Explanation: The middle two elements are 15 and 17,  
// so median = (15 + 17)/2 = 16

public class Q40 {
    public static void main(String[] args) {
        int[] a = { 1, 12, 15, 26, 38 };
        int[] b = { 2, 13, 17, 30, 45 };
        double median = findMedianSortedArrays(a, b);
        System.out.println(median);
    }

    public static double findMedianSortedArrays(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int[] merged = new int[n + m];

        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (a[i] < b[j]) {
                merged[k++] = a[i++];
            } else {
                merged[k++] = b[j++];
            }
        }

        while (i < n) {
            merged[k++] = a[i++];
        }

        while (j < m) {
            merged[k++] = b[j++];
        }

        if ((n + m) % 2 == 0) {
            return (merged[(n + m) / 2 - 1] + merged[(n + m) / 2]) / 2.0;
        } else {
            return merged[(n + m) / 2];
        }
    }
}
