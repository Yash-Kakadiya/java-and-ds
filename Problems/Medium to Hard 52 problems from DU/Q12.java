// Q12: WAP to implement a following pattern 
// 1 
// 1 * 1 
// 1 * 3 * 1 
// 1 * 3 * 3 * 1
// 1 * 3 * 5 * 3 * 1 
// 1 * 3 * 5 * 5 * 3 * 1

public class Q12 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            int num = 1;
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j % 2 == 1) {
                    System.out.print(num + " ");
                } else {
                    System.out.print("* ");
                }
                if (j < i) {
                    num++;
                } else {
                    num--;
                }
            }
            System.out.println();
        }
    }
}