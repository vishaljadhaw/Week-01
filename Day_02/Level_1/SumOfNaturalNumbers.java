import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to find the sum of natural numbers: ");
        int n = scanner.nextInt();

        // Check if the input is a natural number
        if (n > 0) {
            // Compute the sum using the formula
            int formulaSum = n * (n + 1) / 2;

            // Compute the sum using a while loop
            int loopSum = 0;
            int i = 1;
            while (i <= n) {
                loopSum += i;
                i++;
            }

            // Display both results
            System.out.println("Sum calculated using formula: " + formulaSum);
            System.out.println("Sum calculated using while loop: " + loopSum);

            // Compare and confirm if both results match
            if (formulaSum == loopSum) {
                System.out.println("Both computations are correct!");
            } else {
                System.out.println("There is a mismatch in computations.");
            }
        } else {
            System.out.println("The input is not a natural number. Please enter a positive integer.");
        }

        // Close the scanner
        scanner.close();
    }
}
