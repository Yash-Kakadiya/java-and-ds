// Q29: Given an integer n, return the least number of perfect square numbers that sum to n.  
// Input: n = 12 Output: 3 Explanation: 12 = 4 + 4 + 4. 
// Input: n = 13 Output: 2 Explanation: 13 = 4 + 9. 

public class Q29 {
    public static void main(String[] args) {
        int n1 = 13;
        System.out.println("Least number of perfect squares for " + n1 + ": " + numSquares(n1));
    }

    // easy to understand but less efficient
    public static int numSquares(int n) {
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
        return dp[n];
    }
}
