// WAP to find Max, Min, Average of n numbers, n should be taken from user and all n value should be taken from user (Note that you are not allowed to use an array for this)

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        int n, num, max, min;
        double sum = 0, avg;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        n = sc.nextInt();

        System.out.print("Enter number 1: ");
        num = sc.nextInt();
        max = num;
        min = num;
        sum += num;

        for (int i = 2; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            num = sc.nextInt();
            sum += num;

            if (num > max)
                max = num;

            if (num < min)
                min = num;
        }

        avg = sum / n;

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Average: " + avg);

        sc.close();
    }
}
