// Q11: Implement a following pattern without array.
// For n=4 
// 1 
// 2   5 
// 3   6   8 
// 4   7   9  10 
// For n=5 
// 1 
// 2   6 
// 3   7   10 
// 4   8   11  13 
// 5   9   12  14   15

public class Q11 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int start = i;
            int gap = n - 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(start + " ");
                start += gap;
                gap--;
            }
            System.out.println();
        }
    }
}