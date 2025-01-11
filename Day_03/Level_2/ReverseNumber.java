import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Find the count of digits in the number
        int tempNumber = number;
        int count = 0;
        while (tempNumber != 0) {
            tempNumber /= 10;
            count++;
        }

        // Find the digits in the number and save them in an array
        int[] digits = new int[count];
        for (int i = 0; i < count; i++) {
            digits[i] = number % 10;
            number /= 10;
        }

        // Create an array to store the elements in reverse order
        int[] reversedDigits = new int[count];
        for (int i = 0; i < count; i++) {
            reversedDigits[i] = digits[count - i - 1];
        }

        // Display the elements of the reversed array
        System.out.println("Digits in reverse order:");
        for (int digit : reversedDigits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        input.close();
    }
}
