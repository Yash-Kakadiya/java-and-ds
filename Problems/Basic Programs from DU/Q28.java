// WAP to implement a following pattern 
// 1
// 1 * 1
// 1 * 3 * 1
// 1 * 3 * 3 * 1
// 1 * 3 * 5 * 3 * 1

public class Q28 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int val = 1;
            for (int j = 1; j <= 2 * i - 1; j++) {

                if (j % 2 == 1) {
                    System.out.print(val + " ");
                } else {
                    System.out.print("* ");
                }
                if (j < i)
                    val++;
                else
                    val--;
            }
            System.out.println();
        }
    }
}
