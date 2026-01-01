// Q23: Given an array, rotate the array to the right by k steps, where k is non-negative.  
// Input: nums = [1,2,3,4,5,6,7], k = 3 
// Output: [5,6,7,1,2,3,4]

public class Q23 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7 };
        int[] b = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        int n = a.length;

        System.out.println("Array before rotation: ");
        for (int x : a)
            System.out.print(x + " ");

        k = k % n;
        // right rotation
        for (int i = 0; i < k; i++) {
            int last = a[n - 1];
            for (int j = n - 1; j > 0; j--) {
                a[j] = a[j - 1];
            }
            a[0] = last;
        }

        System.out.println("\nArray after right rotation by " + k + " steps:");
        for (int x : a)
            System.out.print(x + " ");

        // left rotation
        for (int i = 0; i < k; i++) {
            int first = b[0];
            for (int j = 0; j < n - 1; j++) {
                b[j] = b[j + 1];
            }
            b[n - 1] = first;
        }

        System.out.println("\nArray after left rotation by " + k + " steps:");
        for (int x : b)
            System.out.print(x + " ");

    }
}
