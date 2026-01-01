// Q05 - WAP to find weather given number is Pronic or not. 
// A Pronic Number is defined as a number that is the product of two consecutive non-negative integers. In 
// other words, N is a Pronic Number if there exists a non-negative integer k such that N = k * (k + 1).  
// E.g. 6 is a Pronic Number because 6=2*3

public class Q05 {
    public static void main(String[] args) {
        int n = 6; // sample input

        boolean isPronic = false;

        for (int i = 0; i * (i + 1) <= n; i++) {
            if (i * (i + 1) == n) {
                isPronic = true;
                break;
            }
        }

        System.out.println(n + " is Pronic? " + isPronic);
    }
}