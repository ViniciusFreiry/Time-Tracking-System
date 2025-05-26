import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        // User Inputs
        System.out.println("Enter your clock-in time (HH:mm):");
        LocalTime entry = LocalTime.parse(input.nextLine(), formatter);

        System.out.println("Enter the daily workload (in hours):");
        int workload = input.nextInt();

        System.out.println("Enter the actual clock-out time (HH:mm):");
        LocalTime exit = LocalTime.parse(input.nextLine(), formatter);
    }
}