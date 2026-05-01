// WAP to convert a Decimal number to BCD(Binary Coded Decimal), represented by a 4-bit binary sequence.

public class Q16 {
    public static String decimalToBCD(int dec) {
        if (dec == 0) {
            return "0000";
        }
        String bi = "";

        while (dec > 0) {
            int r = dec % 2;
            bi = r + bi;
            dec /= 2;
        }

        if (bi.length() < 4) {
            int s = 4 - bi.length();
            for (int i = 0; i < s; i++) {
                bi = "0" + bi;
            }
        }

        return bi;
    }

    public static void main(String[] args) {
        int dec = 7;
        System.out.println("BCD of " + dec + " is: " + decimalToBCD(dec));
    }
}
