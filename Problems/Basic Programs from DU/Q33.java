// WAP to check weather number is present in array or not (using recursion only) and the 
// function’s syntax is given below 0
// Int isInArray(int a[],int m); 
// Where int a[] is Array of integer and m is element to be searched.

import java.util.Arrays;

public class Q33 {
    public static int isInArray(int a[], int m) {
        if (a[0] == m)
            return 1;
        if (a.length == 1)
            return 0;
        return isInArray(Arrays.copyOfRange(a, 1, a.length), m);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int m = 3;
        if (isInArray(arr, m) == 1) {
            System.out.println(m + " is present in the array.");
        } else {
            System.out.println(m + " is not present in the array.");
        }
    }
}
