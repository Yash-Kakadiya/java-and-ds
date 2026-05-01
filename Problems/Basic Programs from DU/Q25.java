// Print a following pattern  
// * * * * * * * * *  
//   * * * * * * *  
//     * * * * *  
//       * * *  
//         *

public class Q25 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // Print stars
            for (int j = 2 * i - 1; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
