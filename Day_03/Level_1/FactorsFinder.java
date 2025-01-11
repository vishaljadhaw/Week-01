import java.util.Scanner;

public class FactorsFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take the input for a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Initialize variables
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Loop through the numbers from 1 to the input number to find factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Add the factor to the array
                factors[index] = i;
                index++;

                // Check if the index has reached the maxFactor
                if (index == maxFactor) {
                    // Increase the size of the factors array
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp;
                }
            }
        }

        // Display the factors of the number
        System.out.println("The factors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();

        input.close();
    }
}
