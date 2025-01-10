import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the number from the user
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Initialize the greatestFactor variable
        int greatestFactor = 1;

        // Check for greatest factor using a loop
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i; // Assign i to greatestFactor
                break; // Exit the loop once the greatest factor is found
            }
        }

        // Output: Display the greatest factor
        System.out.println("The greatest factor of " + number + " (other than itself) is: " + greatestFactor);

        scanner.close();
    }
}
