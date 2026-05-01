// WAP to find weather given number is Pronic or not. 
// A Pronic Number is defined as a number that is the product of two consecutive non-negative integers. In other words, N is a Pronic Number if there exists a non-negative integer k such that N = k * (k + 1).  
// E.g. 6 is a Pronic Number because 6=2*3

public class Q14 {
    public static boolean isPronic(int n) {
        for (int k = 0; k <= n; k++) {
            if (k * (k + 1) == n)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(isPronic(n));
    }
}
