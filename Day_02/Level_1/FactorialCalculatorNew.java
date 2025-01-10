import java.util.Scanner;

public class FactorialCalculatorNew{
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a positive integer
        System.out.print("Enter a positive integer to find its factorial: ");
        int number = scanner.nextInt();

        // Check if the input is a positive integer
        if (number >= 0) {
            // Initialize factorial to 1
            long factorial = 1;

            // Compute factorial using a for loop
            for (int i = 1; i <= number; i++) {
                factorial *= i; // Multiply factorial by the current value of i
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
