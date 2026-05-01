// Print a following pattern  
// * * * * * * * * *  
// * * * *   * * * *  
// * * *       * * *   
// * *           * *  
// *               * 

public class Q26 {
    public static void main(String[] args) {
        int n = 15;

        for (int i = n; i >= 1; i--) {
            // Print stars on the left side
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            // Print spaces in the middle
            for (int j = 1; j <= 2 * (n - i) - 1; j++) {
                System.out.print("  ");
            }
            // Print stars on the right side
            for (int j = 1; j <= i; j++) {
                if (j == 1 && i == n)
                    continue;
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line
        }
    }
}