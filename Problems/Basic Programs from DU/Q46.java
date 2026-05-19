// WAP to sort an Array using Bucket sort.

import java.util.Scanner;

public class Q46 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element [" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        sc.close();

        // Bucket sort
        bucketSort(arr, n);

        // Display the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void bucketSort(int[] arr, int n) {
        if (n <= 0)
            return;

        // Find maximum and minimum values in the array
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }

        // Create buckets
        int bucketCount = (max - min) / n + 1;
        int[][] buckets = new int[bucketCount][n];
        int[] bucketSizes = new int[bucketCount];

        // Distribute input array values into buckets
        for (int i = 0; i < n; i++) {
            int bucketIndex = (arr[i] - min) / n;
            buckets[bucketIndex][bucketSizes[bucketIndex]++] = arr[i];
        }

        // Sort individual buckets and concatenate results
        int index = 0;
        for (int i = 0; i < bucketCount; i++) {
            if (bucketSizes[i] > 0) {
                insertionSort(buckets[i], bucketSizes[i]);
                for (int j = 0; j < bucketSizes[i]; j++) {
                    arr[index++] = buckets[i][j];
                }
            }
        }
    }

    public static void insertionSort(int[] arr, int size) {
        for (int i = 1; i < size; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
