import java.util.Scanner;

public class ArmstrongNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get an integer input and store it in the number variable
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Define sum variable, initialize it to zero
        int sum = 0;

        // Assign the input number to originalNumber variable
        int originalNumber = number;

        // Use the while loop till the originalNumber is not equal to zero
        while (originalNumber != 0) {
            // Find the remainder number by using the modulus operator
            int digit = originalNumber % 10;

            // Find the cube of the digit and add it to the sum variable
            sum += Math.pow(digit, 3);

            // Find the quotient of the number and assign it to originalNumber
            originalNumber /= 10; // This removes the last digit of the original number
        }

        // Check if the number and the sum are the same
        if (number == sum) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        input.close();
    }
}
