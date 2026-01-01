// WAP to multiply two matrices with error checking for dimension compatibility.

public class Q37 {
    public static void main(String[] args) {
        int[][] matrixA = {
                { 1, 0 },
                { 0, 1 }
        };
        int[][] matrixB = {
                { 0, 1 },
                { 1, 0 }
        };

        int[][] result = multiplyMatrices(matrixA, matrixB);

        if (result != null) {
            printMatrix(result);
        }
    }

    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int rowsB = b.length;
        int colsB = b[0].length;

        // Check if multiplication is possible
        if (colsA != rowsB) {
            System.out.println("Error: Incompatible matrix dimensions for multiplication.");
            return null;
        }

        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
