import java.util.Scanner; // Importing the Scanner class for user input

// Class to determine if a given date falls in the Spring season
public class SpringSeason {

    // Method to check if the given month and day fall in the Spring season
    public void season(int month, int day) {
        // Check if the date is within the range of the Spring season
        if ((month == 3 && day >= 20 && day <= 31) || // March 20 to March 31
            (month == 4 && day >= 1 && day <= 30) ||  // Entire April
            (month == 5 && day >= 1 && day <= 31) ||  // Entire May
            (month == 6 && day >= 1 && day <= 20)) {  // June 1 to June 20
            System.out.print("It's a Spring Season"); // Output if within Spring season
        } else {
            System.out.print("Not a Spring Season."); // Output if not in Spring season
        }
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the month
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt(); // Read the month input

        // Prompt the user to enter the day
        System.out.print("Enter the day: ");
        int day = scanner.nextInt(); // Read the day input
        
        // Create an object of the SpringSeason class
        SpringSeason springSeason = new SpringSeason();
        
        // Call the season method to check if the date falls in the Spring season
        springSeason.season(month, day);
    }
}
