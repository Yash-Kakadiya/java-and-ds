// Q30: WAP to check whether number is present in array or not (using recursion only) and the function’s syntax is given below 
// int isInArray(int a [], int m); Where int a [] is Array of integer and m is element to be searched. 

public class Q30 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, Integer.MIN_VALUE };
        int m = -5;
        System.out.println(isInArray(a, m));
    }

    public static int isInArray(int a[], int m) {
        if (a[0] == Integer.MIN_VALUE)
            return 0;

        if (a[0] == m)
            return 1;

        return isInArray(java.util.Arrays.copyOfRange(a, 1, a.length), m);
    }
}
