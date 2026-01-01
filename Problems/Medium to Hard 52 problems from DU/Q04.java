// Q04 - WAP to find weather given number is Automorphic or not. 
// An automorphic number is a number whose square ends with the same digits as the number itself.  
// For example, 5 is automorphic because 5² = 25, which ends in 5.  
// Similarly, 76 is automorphic because 76² = 5776, which ends in 76.

public class Q04 {
    public static void main(String[] args) {
        int n = 76; // sample input
        long sq = (long) n * n;

        // Convert to string for ending check
        String numStr = Integer.toString(n);
        String sqStr = Long.toString(sq);

        boolean isAutomorphic = sqStr.endsWith(numStr);

        System.out.println(n + " is Automorphic? " + isAutomorphic);
    }
}