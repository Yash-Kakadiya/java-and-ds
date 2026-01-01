// Q09 - WAP to Convert a Decimal to Hexa-decimal and vice versa.
public class Q09 {
    public static void main(String[] args) {
        int decimal = 255; // sample decimal
        String hexInput = "FF"; // sample hex
        System.out.println("Input Decimal: " + decimal);
        System.out.println("Input Hex: " + hexInput);

        // Decimal -> Hex
        int temp = decimal;
        String hex = "";
        char[] hexChars = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

        while (temp > 0) {
            int rem = temp % 16;
            hex = hexChars[rem] + hex;
            temp /= 16;
        }

        // Hex -> Decimal
        int decResult = 0;
        int pow = 1; // 16^0
        for (int i = hexInput.length() - 1; i >= 0; i--) {
            char c = hexInput.charAt(i);
            int val;

            if (c >= '0' && c <= '9')
                val = c - '0';
            else
                val = c - 'A' + 10;

            decResult += val * pow;
            pow *= 16;
        }

        System.out.println("Decimal to Hex: " + hex);
        System.out.println("Hex to Decimal: " + decResult);
    }
}
