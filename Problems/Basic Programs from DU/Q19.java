// WAP to convert a hexa-decimal to Octal.

public class Q19 {
    public static int hexadecimalToOctal(String hex) {
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

        System.out.println("Decimal: " + dec);

        int oct = 0;
        while (dec > 0) {
            int rem = dec % 8;
            oct = oct * 10 + rem;
            dec /= 8;
        }

        int temp = oct;
        int rev = 0;
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        String hex = "A";
        System.out.println(hexadecimalToOctal(hex));
    }
}
