// WAP to convert an Octal into hexa-decimal.

public class Q18 {

    public static String octalToHexadecimal(int oct) {
        int dec = 0;
        int power = 1;
        while (oct > 0) {
            int d = oct % 10;
            dec += d * power;
            power *= 8;
            oct /= 10;
        }

        System.out.println("Decimal: " + dec);

        String hex = "";
        while (dec > 0) {
            int rem = dec % 16;
            if (rem < 10) {
                hex = rem + hex;
            } else {
                hex = (char) ('A' + rem - 10) + hex;
            }
            dec /= 16;
        }
        return hex.isEmpty() ? "0" : hex;
    }

    public static void main(String[] args) {
        int oct = 12;
        System.out.println(octalToHexadecimal(oct));
    }
}
