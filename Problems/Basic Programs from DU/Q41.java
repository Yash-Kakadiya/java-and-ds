// WAP to find the multiplication of 2 Matrix (dimension and value should be entered by user)

public class Q41 {
    public static void main(String[] args) {
        int r1, c1, r2, c2;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the number of rows and columns of first matrix:");
        System.out.print("Enter the number of rows of first matrix: ");
        r1 = sc.nextInt();
        System.out.print("Enter the number of columns of first matrix:");
        c1 = sc.nextInt();
        System.out.println("Enter the number of rows and columns of second matrix:");
        System.out.print("Enter the number of rows of second matrix: ");
        r2 = sc.nextInt();
        System.out.print("Enter the number of columns of second matrix: ");
        c2 = sc.nextInt();

        if (c1 != r2) {
            System.out.println("Matrix multiplication is not possible.");
            return;
        }

        int[][] m1 = new int[r1][c1];
        int[][] m2 = new int[r2][c2];
        int[][] m3 = new int[r1][c2];

        System.out.println("Enter the elements of first matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                m1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of second matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                m2[i][j] = sc.nextInt();
            }
        }

        // Matrix multiplication
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                m3[i][j] = 0;
                for (int k = 0; k < c1; k++) {
                    m3[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }

        // Display the first matrix
        System.out.println("First matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(m1[i][j] + " ");
            }
            System.out.println();
        }

        // Display the second matrix
        System.out.println("Second matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(m2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Result of matrix multiplication:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(m3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
