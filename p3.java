import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the distance in meters:");
        double distanceInMeters = sc.nextDouble();

        System.out.println("Enter the time taken in hours:");
        int hours = sc.nextInt();

        System.out.println("Enter the time taken in minutes:");
        int minutes = sc.nextInt();

        System.out.println("Enter the time taken in seconds:");
        int seconds = sc.nextInt();

        double timeInSeconds = hours * 3600 + minutes * 60 + seconds;

        double speedInMetersPerSecond = distanceInMeters / timeInSeconds;
        double speedInKilometersPerHour = (distanceInMeters / 1000) / (timeInSeconds / 3600);
        double speedInMilesPerHour = (distanceInMeters / 1609) / (timeInSeconds / 3600);

        System.out.println("Speed in meters per second: " + speedInMetersPerSecond);
        System.out.println("Speed in kilometers per hour: " + speedInKilometersPerHour);
        System.out.println("Speed in miles per hour: " + speedInMilesPerHour);
    }
}