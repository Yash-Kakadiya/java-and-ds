// Q08 - WAP to Convert a Decimal to Octal and vice versa.

public class Q08 {
    public static void main(String[] args) {
        int decimal = 25;
        int octalInput = 31;
        System.out.println("Given Decimal: " + decimal);
        System.out.println("Given Octal: " + octalInput);

        // Decimal -> Octal
        int temp = decimal;
        int octalResult = 0, place = 1;
        while (temp > 0) {
            int rem = temp % 8;
            octalResult = rem * place + octalResult;
            place *= 10;
            temp /= 8;
        }

        // Octal -> Decimal
        int decResult = 0, pow = 1; // pow=1 => 8^0
        temp = octalInput;
        while (temp > 0) {
            int digit = temp % 10;
            decResult += digit * pow;
            pow *= 8;
            temp /= 10;
        }

        System.out.println("Decimal to Octal: " + octalResult);
        System.out.println("Octal to Decimal: " + decResult);
    }
}