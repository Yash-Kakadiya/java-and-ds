// Q21: WAP to sort an Array using insertion sort.

public class Q21 {
    public static void main(String[] args) {
        int[] a = { 5, 2, 4, 6, 1, 3, 7 };
        int n = a.length;

        // Insertion Sort
        for (int i = 1; i < n; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }

        for (int x : a)
            System.out.print(x + " ");
    }
}
