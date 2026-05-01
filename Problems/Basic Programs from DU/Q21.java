// WAP to Convert a Decimal to Hexa-decimal and vice versa.

public class Q21 {
    public static String decimalToHexadecimal(int dec) {
        String hex = "";
        while (dec > 0) {
            int r = dec % 16;
            if (r < 10) {
                hex = r + hex;
            } else {
                hex = (char) ('A' + r - 10) + hex;
            }
            dec /= 16;
        }
        return hex.isEmpty() ? "0" : hex;
    }

    public static int hexadecimalToDecimal(String hex) {
        int dec = 0;

        int power = 1;
        for (int i = hex.length() - 1; i >= 0; i--) {
            char c = hex.charAt(i);
            int d;
            if (c >= '0' && c <= '9') {
                d = c - '0';
            } else {
                d = c - 'A' + 10;
            }
            dec += d * power;
            power *= 16;
        }
        return dec;
    }

    public static void main(String[] args) {
        int dec = 10;
        System.out.println("Decimal " + dec + " to Hexadecimal: " + decimalToHexadecimal(dec));

        String hex = "A";
        System.out.println("Hexadecimal " + hex + " to Decimal: " + hexadecimalToDecimal(hex));
    }
}
