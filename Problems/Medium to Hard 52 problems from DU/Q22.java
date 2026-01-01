// Q22: WAP to sort an Array using selection sort.

public class Q22 {
    public static void main(String[] args) {
        int[] a = { 5, 2, 4, 6, 1, 3, 7 };
        int n = a.length;

        // Selection Sort
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIdx])
                    minIdx = j;
            }
            int temp = a[minIdx];
            a[minIdx] = a[i];
            a[i] = temp;
        }

        for (int x : a)
            System.out.print(x + " ");
    }
}
