// WAP to find weather given number is Armstrong number is not. 

public class Q06 {
    public static int findLength(int n) {
        int l = 0;
        while (n > 0) {
            l++;
            n /= 10;
        }
        return l;
    }

    public static boolean isArmstrong(int n) {
        int l = findLength(n);
        int sum = 0;
        int temp = n;
        while (temp > 0) {
            int d = temp % 10;
            sum += Math.pow(d, l);
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        int n = 153;

        if (isArmstrong(n)) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
}
