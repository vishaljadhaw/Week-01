import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        // Declare variables to hold the numbers
        int number1, number2, temp;

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        number1 = input.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        number2 = input.nextInt();

        // Swap the numbers using a temporary variable
        temp = number1;
        number1 = number2;
        number2 = temp;

        // Print the swapped values
        System.out.printf("The swapped numbers are "+ number1 +" and "+number2);
    }
}
