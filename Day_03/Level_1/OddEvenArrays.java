import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get an integer input from the user
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Check for natural number
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number.");
            input.close();
            return;
        }

        // Create integer arrays for even and odd numbers with size = number / 2 + 1
        int[] evenNumbers = new int[number / 2 + 1];
        int[] oddNumbers = new int[number / 2 + 1];

        // Create index variables for odd and even numbers and initialize them to zero
        int evenIndex = 0;
        int oddIndex = 0;

        // Using a for loop, iterate from 1 to the number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                // Save even numbers into the even array
                evenNumbers[evenIndex] = i;
                evenIndex++;
            } else {
                // Save odd numbers into the odd array
                oddNumbers[oddIndex] = i;
                oddIndex++;
            }
        }

        // Print the odd numbers array
        System.out.println("Odd numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();

        // Print the even numbers array
        System.out.println("Even numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();

        input.close();
    }
}

