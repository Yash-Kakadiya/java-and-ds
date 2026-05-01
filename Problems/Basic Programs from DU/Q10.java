// WAP to find a quotient and reminder of 2 number (bigger number should be divided by lower number) and you are not allowed to use a division and quoƟent operator. 

public class Q10 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 3;

        if (n1 < n2) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }

        int q = 0;
        int r = n1;

        while (r >= n2) {
            r -= n2;
            q++;
        }

        System.out.println(n1 + "/" + n2);
        System.out.println("Quotient: " + q);
        System.out.println("Remainder: " + r);
    }
}
