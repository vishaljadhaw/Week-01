import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    // Method to find the first non-repeating character in a string using charAt() method
    public static char findFirstNonRepeatingCharacter(String text) {
        // Array to store frequency of each character (ASCII size is 256)
        int[] frequency = new int[256];

        // Loop to count the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Loop to find the first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (frequency[currentChar] == 1) {
                return currentChar;
            }
        }

        // If no non-repeating character found, return a placeholder
        return '\0'; // Null character if no non-repeating character exists
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter a string: ");
        String inputText = scanner.nextLine();

        // Find the first non-repeating character
        char result = findFirstNonRepeatingCharacter(inputText);

        // Display the result
        if (result == '\0') {
            System.out.println("No non-repeating character found.");
        } else {
            System.out.println("The first non-repeating character is: " + result);
        }

        scanner.close();
    }
}
