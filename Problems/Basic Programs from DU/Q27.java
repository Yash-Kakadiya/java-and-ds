// Write a program to print following pattern  
// For n=4 
// 4  4  4  4  4  4  4 
// 4  3  3  3  3  3  4 
// 4  3  2  2  2  3  4 
// 4  3  2  1  2  3  4 
// 4  3  2  2  2  3  4 
// 4  3  3  3  3  3  4 
// 4  4  4  4  4  4  4

public class Q27 {
    public static void main(String[] args) {
        int n = 4;
        int size = 2 * n - 1; // Calculate the size of the pattern

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // Calculate the value to be printed based on the distance from the center
                int value = n - Math.min(Math.min(i, j), Math.min(size - 1 - i, size - 1 - j));
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
