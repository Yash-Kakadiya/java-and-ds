// Q26: Find the difference between the second largest element and the second smallest element of an array. 
// Input :  Enter the size of array: 7 
//          Enter 7 elements: 5 1 9 7 1 5 3 
// Output: Difference: 4 

public class Q26 {
    public static void main(String[] args) {
        int[] a = { 5, 1, 9, 7, 1, 5, 3 };
        int n = a.length;

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (a[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = a[i];
            } else if (a[i] > secondLargest && a[i] != firstLargest) {
                secondLargest = a[i];
            }

            if (a[i] < firstSmallest) {
                secondSmallest = firstSmallest;
                firstSmallest = a[i];
            } else if (a[i] < secondSmallest && a[i] != firstSmallest) {
                secondSmallest = a[i];
            }
        }

        System.out.println("Difference: " + (secondLargest - secondSmallest));
    }
}