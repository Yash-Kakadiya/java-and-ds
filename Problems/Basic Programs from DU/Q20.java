// WAP to Convert a Decimal to Octal and Vice versa. 

public class Q20 {
    public static int decimalToOctal(int dec) {
        int oct = 0;

        while (dec > 0) {
            int r = dec % 8;
            oct = oct * 10 + r;
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

    public static int octalToDecimal(int oct) {
        int dec = 0;

        int power = 1;
        while (oct > 0) {
            int r = oct % 10;
            dec += r * power;
            power *= 8;
            oct /= 10;
        }
        return dec;
    }

    public static void main(String[] args) {
        int dec = 10;
        int oct = 10;

        System.out.println("Decimal " + dec + " to Octal: " + decimalToOctal(dec));
        System.out.println("Octal " + oct + " to Decimal: " + octalToDecimal(oct));
    }
}
