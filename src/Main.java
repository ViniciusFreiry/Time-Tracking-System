import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        // User Inputs
        System.out.println("Enter your clock-in time (HH:mm):");
        LocalTime entry = LocalTime.parse(input.next(), formatter);

        System.out.println("Enter the daily workload (in hours):");
        int workload = input.nextInt();

        System.out.println("Enter the actual clock-out time (HH:mm):");
        LocalTime exit = LocalTime.parse(input.next(), formatter);

        input.close();

        // Calculating difference between actual and expected check-out
        LocalTime expectedCheckOut = entry.plusHours(workload);

        Duration difference = Duration.between(expectedCheckOut, exit);
        long overtimeHours = difference.toHours();
        long overtimeMinutes = difference.toMinutesPart();

        // Displaying the formatted results
        System.out.println("\nClock-in time: " + entry.format(formatter));
        System.out.println("Expected check-out: " + expectedCheckOut.format(formatter));
        System.out.println("Real check-out: " + exit.format(formatter));

        System.out.println("\nHours Balance: " + (overtimeHours >= 0 || overtimeMinutes >= 0 ? "+" : "-")
            + Math.abs(overtimeHours) + "h " + Math.abs(overtimeMinutes) + "min");
    }
}