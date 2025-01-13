import java.util.Scanner;

public class FindRemainderAndQuotient {

    // Method to find the remainder and quotient of a number
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2]; // Array to store quotient and remainder
        result[0] = number / divisor; // Quotient
        result[1] = number % divisor; // Remainder
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the two numbers
        System.out.print("Enter the first number (numerator): ");
        int number = scanner.nextInt();

        System.out.print("Enter the second number (divisor): ");
        int divisor = scanner.nextInt();

        // Ensure divisor is not zero
        if (divisor == 0) {
            System.out.println("Divisor cannot be zero. Please try again.");
        } else {
            // Call the method to find quotient and remainder
            int[] result = findRemainderAndQuotient(number, divisor);

            // Print the results
            System.out.println("Quotient: " + result[0]);
            System.out.println("Remainder: " + result[1]);
        }

    }
}
