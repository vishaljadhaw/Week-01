import java.util.Scanner;

public class HarshadNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get an integer input for the number variable
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Create an integer variable sum with initial value 0
        int sum = 0;

        // Assign the input number to originalNumber variable
        int originalNumber = number;

        // Create a while loop to access each digit of the number
        while (originalNumber != 0) {
            // Find the remainder number by using the modulus operator
            int digit = originalNumber % 10;

            // Add each digit of the number to sum
            sum += digit;

            // Find the quotient of the number and assign it to originalNumber
            originalNumber /= 10; // This removes the last digit of the original number
        }

        // Check if the number is perfectly divisible by the sum
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is not a Harshad Number.");
        }

        input.close();
    }
}
