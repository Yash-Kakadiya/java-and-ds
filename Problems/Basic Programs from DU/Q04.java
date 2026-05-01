// WAP to find whether a number is Odd or Even without using a % operator. 

public class Q04 {
    public static void main(String[] args) {
        int n = 123456789;
        if ((n & 1) == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");

    }
}
