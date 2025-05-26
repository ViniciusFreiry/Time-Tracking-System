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
        long overtimeMinutes = difference.toMinutes();
    }
}