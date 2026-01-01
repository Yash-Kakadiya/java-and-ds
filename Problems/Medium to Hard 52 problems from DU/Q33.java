// Take an Input in the form of Binary String that contains only 0’s and 1’s and convert this number into integer.  
// Input: 101.110 
// Output: 5.75

public class Q33 {
    public static void main(String[] args) {
        String binaryString = "101.110";
        double result = binaryStringToDecimal(binaryString);
        System.out.println(result);
    }

    public static double binaryStringToDecimal(String binaryString) {
        String[] parts = binaryString.split("\\.");
        String integerPart = parts[0];
        String fractionalPart = parts.length > 1 ? parts[1] : "0";

        // Convert integer part
        int intValue = 0;
        for (int i = 0; i < integerPart.length(); i++) {
            char bit = integerPart.charAt(integerPart.length() - 1 - i);
            if (bit == '1') {
                intValue += Math.pow(2, i);
            }
        }

        // Convert fractional part
        double fracValue = 0.0;
        for (int i = 0; i < fractionalPart.length(); i++) {
            char bit = fractionalPart.charAt(i);
            if (bit == '1') {
                fracValue += Math.pow(2, -(i + 1));
            }
        }

        return intValue + fracValue;
    }
}
