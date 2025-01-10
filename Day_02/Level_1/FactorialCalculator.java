import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a positive integer
        System.out.print("Enter a positive integer to find its factorial: ");
        int number = scanner.nextInt();

        // Check if the input is a positive integer
        if (number >= 0) {
            // Initialize variables
            long factorial = 1; // Factorial result, start with 1
            int i = number; // Start from the input number

            // Compute factorial using a while loop
            while (i > 0) {
                factorial *= i; // Multiply factorial by the current number
                i--; // Decrement the number
            }

            // Print the result
            System.out.println("The factorial of " + number + " is: " + factorial);
        } else {
            System.out.println("The input must be a non-negative integer. Please try again.");
        }

        // Close the scanner
        scanner.close();
    }
}
