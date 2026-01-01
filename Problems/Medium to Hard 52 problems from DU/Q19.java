// Q19: Write a program to print following pattern 
// For n=5 
// 1 2 3 4 5 
// 10 9 8 7 6 
// 11 12 13 14 15 
// 20 19 18 17 16 
// 21 22 23 24 25

public class Q19 {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                for (int j = 1; j <= n; j++)
                    System.out.print(num++ + " ");
            } else {
                int temp = num + n - 1;
                for (int j = 1; j <= n; j++)
                    System.out.print(temp-- + " ");
                num += n;
            }
            System.out.println();
        }
    }
}