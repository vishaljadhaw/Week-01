import java.util.Scanner;

public class MultiplicationTableNew {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take integer input and store it in the variable number
        System.out.print("Enter a number (6 to 9): ");
        int number = input.nextInt();

        // Validate input to ensure it is between 6 and 9
        if (number < 6 || number > 9) {
            System.out.println("Invalid input! Please enter a number between 6 and 9.");
            input.close();
            return;
        }

        // Define an integer array to store the multiplication result
        int[] multiplicationResult = new int[10];

        // Using a for loop, find the multiplication table of the number and save the result in the array
        for (int i = 1; i <= 10; i++) {
            multiplicationResult[i - 1] = number * i;
        }

        // Display the result from the array in the format number * i = ___
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 1]);
        }

        input.close();
    }
}
