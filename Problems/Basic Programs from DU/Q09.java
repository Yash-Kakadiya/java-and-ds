// WAP to find a power a^b (without using power and multiplication operation)

public class Q09 {
    public static float findPower(int x, int y) {
        if (y == 0)
            return 1;
        if (y < 0)
            return 1 / findPower(x, -y); // Handle negative exponent

        int res = x;
        for (int i = 2; i <= y; i++) {
            int temp = 0;
            for (int j = 1; j <= x; j++) {
                temp += res;
            }
            res = temp;
        }

        return res;
    }

    public static void main(String[] args) {
        int a = 2; // base
        int b = 3; // exponent
        float res = findPower(a, b);

        System.out.println(a + " raised to the power of " + b + " is: " + res);
    }
}
