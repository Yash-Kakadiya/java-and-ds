// WAP for following Scenario. 
// Given n rupees and a chocolate price of m for each chocolate, with a wrapper exchange offer of 1 chocolate per k wrappers, calculate the total number of chocolates you can eat with n rupees.

public class Q15 {
    public static int totalChocolates(int n, int m, int k) {
        int chocolates = n / m;
        int wrappers = chocolates;
        while (wrappers >= k) {
            int newChocolates = wrappers / k;
            chocolates += newChocolates;
            wrappers = wrappers % k + newChocolates;
        }
        return chocolates;
    }

    public static void main(String[] args) {
        int n = 15; // Total rupees
        int m = 1; // Price of each chocolate
        int k = 3; // Number of wrappers needed for 1 chocolate
        System.out.println(totalChocolates(n, m, k));
    }
}
