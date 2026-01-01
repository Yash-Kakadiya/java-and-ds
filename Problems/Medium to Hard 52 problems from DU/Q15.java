// Q15: Implement a following pattern 
// 1 
// 1 2 1 
// 1 * 3 * 1 
// 1 * * 4 * * 1 
// 1 * * * 5 * * * 1 
// 1 * * * * 6 * * * * 1

public class Q15 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("1 ");
                } else if (i == j) {
                    System.out.print(j + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}