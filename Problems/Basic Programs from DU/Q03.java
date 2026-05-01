// WAP to find a total odd and total even digit of a given number. 

public class Q03 {
    public static void main(String[] args) {
        int n = 123456789;
        int evenC = 0;
        int oddC = 0;
        while (n != 0) {
            int d = n % 10;
            if (d % 2 == 0)
                evenC++;
            else
                oddC++;

            n /= 10;
        }

        System.out.println("Total even digits: " + evenC);
        System.out.println("Total odd digits: " + oddC);
    }
}
