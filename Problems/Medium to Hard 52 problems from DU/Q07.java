// Q07 - WAP that finds an angle between clock hands for the provided value of Minutes and Hours.

public class Q07 {
    public static void main(String[] args) {
        int hour = 3;
        int minute = 30;

        // Hour hand moves 0.5 degrees per minute
        double hourAngle = (hour % 12) * 30 + (minute * 0.5);

        // Minute hand moves 6 degrees per minute
        double minuteAngle = minute * 6;

        double angle = Math.abs(hourAngle - minuteAngle);

        // Smallest angle
        angle = Math.min(angle, 360 - angle);

        System.out.println("Angle = " + angle + " degrees");
    }
}