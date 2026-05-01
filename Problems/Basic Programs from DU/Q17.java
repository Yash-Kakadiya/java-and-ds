// WAP to convert a Binary to Decimal.

public class Q17 {
    public static int binaryToDecimal(String bi) {
        int dec = 0;
        int l = bi.length();

        int power = 1;
        for (int i = l - 1; i >= 0; i--) {
            char bit = bi.charAt(i);
            if (bit == '1') {
                dec += power;
            }
            power *= 2;
        }

        return dec;
    }

    public static void main(String[] args) {
        String bi = "111";
        System.out.println(binaryToDecimal(bi));
    }
}
