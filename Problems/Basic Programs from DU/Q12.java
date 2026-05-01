// WAP to find weather given number is Kaprekar or not. 
// A Kaprekar number is a non-negative integer that, when squared, can be split into two parts whose sum equals the original number.  
// For E.g. 45 is a Kaprekar number because 45 squared (2025) can be split into 20 and 25, and 20 + 25 = 45.

public class Q12 {
    public static boolean isKaprekar(int n) {
        if (n < 0)
            return false;

        int square = n * n;
        String squareStr = Integer.toString(square);
        int len = squareStr.length();

        for (int i = 0; i <= len; i++) {
            String leftPart = squareStr.substring(0, i);
            String rightPart = squareStr.substring(i);

            int leftNum = leftPart.isEmpty() ? 0 : Integer.parseInt(leftPart);
            int rightNum = rightPart.isEmpty() ? 0 : Integer.parseInt(rightPart);

            if (leftNum + rightNum == n)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int n = 45;
        System.out.println(isKaprekar(n));
    }
}
