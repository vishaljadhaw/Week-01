import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the date from the user
        System.out.print("Enter year (e.g., 2023): ");
        int year = scanner.nextInt();
        
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        
        System.out.print("Enter day (1-31): ");
        int day = scanner.nextInt();

        // Adjust month and year for January and February
        if (month < 3) {
            month += 12;
            year -= 1;
        }

        // Zeller's Congruence Formula
        int k = year % 100; // Last two digits of the year
        int j = year / 100; // Century
        int dayOfWeek = (day + (13 * (month + 1)) / 5 + k + (k / 4) + (j / 4) - (2 * j)) % 7;

        // Map the result to the corresponding day
        String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        if (dayOfWeek < 0) {
            dayOfWeek += 7; // Handle negative results
        }

        // Output: Display the day of the week
        System.out.println("The day of the week is: " + days[dayOfWeek]);

        scanner.close();
    }
}
