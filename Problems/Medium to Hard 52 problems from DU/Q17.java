// Q17: Write a program to print Pascal triangle.

public class Q17 {
    public static void main(String[] args) {
        int n = 6;

        // Method 1: Using Binomial Coefficient
        for (int i = 0; i < n; i++) {
            int val = 1;
            for (int s = 0; s < n - i; s++)
                System.out.print(" ");
            for (int j = 0; j <= i; j++) {
                System.out.print(val + " ");
                val = val * (i - j) / (j + 1);
            }
            System.out.println();
        }
        System.out.println("-----------------------");

        // Method 2: Using previous row values
        int[][] pascal = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < n - i; s++)
                System.out.print(" ");
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    pascal[i][j] = 1;
                } else {
                    pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                }
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }
    }
}