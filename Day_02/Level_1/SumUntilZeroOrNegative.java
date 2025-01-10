import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Initialize total to 0
        double total = 0.0;

        // Variable to store user input
        double number;

        // Prompt the user
        System.out.println("Enter numbers to add (enter 0 or a negative number to stop):");

        // Infinite while loop
        while (true) {
            // Input: user-entered value
            number = scanner.nextDouble();

            // Check if the input is 0 or negative
            if (number <= 0) {
                break; // Exit the loop
            }

            // Add the number to the total
            total += number;
        }

        // Display the total
        System.out.println("The total sum is: " + total);


    }
}
