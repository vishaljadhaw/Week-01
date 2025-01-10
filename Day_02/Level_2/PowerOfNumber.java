import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the base number and power from the user
        System.out.print("Enter the base number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the power: ");
        int power = scanner.nextInt();

        // Initialize the result variable
        int result = 1;

        // Calculate power using a loop
        for (int i = 1; i <= power; i++) {
            result *= number; // Multiply result with the number
        }

        // Output: Display the result
        System.out.println(number + " raised to the power of " + power + " is: " + result);

        scanner.close();
    }
}
