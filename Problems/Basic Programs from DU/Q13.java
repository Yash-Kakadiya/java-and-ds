// WAP to find weather given number is Automorphic or not. 
// An automorphic number is a number whose square ends with the same digits as the number itself.  
// For example, 5 is automorphic because 5² = 25, which ends in 5.  
// Similarly, 76 is automorphic because 76² = 5776, which ends in 76.

public class Q13 {
    public static boolean isAutomorphic(int n) {
        int square = n * n;
        String strN = Integer.toString(n);
        String strSquare = Integer.toString(square);
        return strSquare.endsWith(strN);
    }

    public static void main(String[] args) {
        int n = 76;
        System.out.println(isAutomorphic(n));
    }
}
