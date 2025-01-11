import java.util.Scanner;

public class LargestDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Define an array to store the digits with a maximum size of 10
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Use a loop to iterate until the number is not equal to 0
        while (number != 0 && index < maxDigit) {
            // Remove the last digit from the number and add it to the array
            digits[index] = number % 10;
            number /= 10;
            index++;
        }

        // Define variables to store the largest and second largest digits
        int largest = 0;
        int secondLargest = 0;

        // Loop through the array to find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest) {
                secondLargest = digits[i];
            }
        }

        // Display the largest and second largest digits
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        input.close();
    }
}

