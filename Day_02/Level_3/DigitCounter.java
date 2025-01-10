import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get an integer input for the number variable
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Create an integer variable count with value 0
        int count = 0;

        // Use a loop to iterate until number is not equal to 0
        while (number != 0) {
            // Remove the last digit from number in each iteration
            number /= 10;

            // Increase count by 1 in each iteration
            count++;
        }

        // Display the count to show the number of digits
        System.out.println("The number of digits is: " + count);

        input.close();
    }
}
