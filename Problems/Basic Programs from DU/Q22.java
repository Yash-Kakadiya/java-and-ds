// Write a program to take 2 numbers from user and find out the distance between them. (How to compute distance: If number is 10 and 18 then 10 in binary 1010 and 18 in binary is 10010 and distance is 2 means total number of bits that needs to be changed when 10 is converted into 18 or 18 is converted into 10, do not convert the number into binary)

public class Q22 {
    public static int calculateDistance(int num1, int num2) {
        int distance = 0;
        int xorResult = num1 ^ num2; // XOR will give us the bits that are different

        while (xorResult > 0) {
            distance += xorResult & 1; // Increment distance if the least significant bit is 1
            xorResult >>= 1; // Right shift to check the next bit
        }

        return distance;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 18;

        int distance = calculateDistance(num1, num2);
        System.out.println("The distance between " + num1 + " and " + num2 + " is: " + distance);
    }
}
