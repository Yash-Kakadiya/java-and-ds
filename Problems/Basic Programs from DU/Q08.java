// WAP to calculate an angle between hour and minute hand. (Hours and minutes should be taken from user)

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the hour (0-12): ");
        int hour = sc.nextInt();

        System.out.print("Enter the minute (0-59): ");
        int minute = sc.nextInt();

        // Calculate angles
        double hourAngle = (hour % 12) * 30 + minute * 0.5;
        double minuteAngle = minute * 6;

        // Calculate the difference
        double angle = Math.abs(hourAngle - minuteAngle);

        // Return the smaller angle
        if (angle > 180) {
            angle = 360 - angle;
        }

        System.out.println("The angle between hour and minute hand is: " + angle + " degrees.");

        sc.close();
    }
}
