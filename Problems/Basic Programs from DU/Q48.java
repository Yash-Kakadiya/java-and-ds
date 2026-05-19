// WAP to sort an Array using CounƟng sort 

import java.util.Scanner;

public class Q48 {
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

        // Counting sort
        countingSort(arr, n);

        // Display the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void countingSort(int[] arr, int n) {
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

        // Create count array
        int range = max - min + 1;
        int[] count = new int[range];

        // Count occurrences of each element
        for (int i = 0; i < n; i++) {
            count[arr[i] - min]++;
        }

        // Update count array to store cumulative counts
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        int[] output = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        // Copy the sorted output back to the original array
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
}
