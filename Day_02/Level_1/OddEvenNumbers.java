import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the input is a natural number
        if (number > 0) {
            // Iterate from 1 to the user-entered number
            for (int i = 1; i <= number; i++) {
                // Check if the current number is even or odd
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number.");
                } else {
                    System.out.println(i + " is an odd number.");
                }
            }
        } else {
            System.out.println("The input must be a natural number. Please enter a positive integer.");
        }

        // Close the scanner
        scanner.close();
    }
}
