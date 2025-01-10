import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the month
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        // Prompt the user to enter the day
        System.out.print("Enter the day: ");
        int day = scanner.nextInt();

        // Check if the date falls in the Spring season
        boolean isSpring = (month == 3 && day >= 20 && day <= 31) ||
                           (month == 4 && day >= 1 && day <= 30) ||
                           (month == 5 && day >= 1 && day <= 31) ||
                           (month == 6 && day >= 1 && day <= 20);

        // Print the result
        if (isSpring) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }

        // Close the scanner
        scanner.close();
    }
}
