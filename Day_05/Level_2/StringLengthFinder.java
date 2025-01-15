import java.util.Scanner;

public class StringLengthFinder {

    // Method to calculate the length of the string without using built-in length() method
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                // Attempt to access characters by index
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception indicates we've reached the end of the string
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a string: ");
        String userInput = scanner.next(); // Reads the input string

        // Calculate length using the user-defined method
        int customLength = findLength(userInput);

        // Calculate length using the built-in length() method
        int actualLength = userInput.length();

        // Display the results
        System.out.println("Length of the string (custom method): " + customLength);
        System.out.println("Length of the string (built-in method): " + actualLength);

        scanner.close();
    }
}
