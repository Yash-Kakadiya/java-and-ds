// Q03 - WAP to find weather given number is Kaprekar or not. 
// A Kaprekar number is a non-negative integer that, when squared, can be split into two parts whose sum equals the original number.  
// For E.g. 45 is a Kaprekar number because 45 squared (2025) can be split into 20 and 25, and 20 + 25 = 45.

public class Q03 {
    public static void main(String[] args) {
        int n = 45; // sample input

        long sq = (long) n * n; // square the number
        String s = Long.toString(sq);

        boolean isKaprekar = false;

        // Try splitting the square into two parts
        // For single digit squares, we can consider left part as 0
        for (int i = 0; i <= s.length(); i++) {
            String left = (i == 0) ? "0" : s.substring(0, i);
            String right = (i == s.length()) ? "0" : s.substring(i);

            long l = Long.parseLong(left);
            long r = Long.parseLong(right);

            if (l + r == n && r != 0) {
                isKaprekar = true;
                break;
            }
        }

        System.out.println(n + " is Kaprekar? " + isKaprekar);
    }
}