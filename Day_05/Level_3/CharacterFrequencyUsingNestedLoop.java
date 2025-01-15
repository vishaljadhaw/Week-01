import java.util.Scanner;

public class CharacterFrequencyUsingNestedLoop {

    // Method to find the frequency of characters in a string
    public static String[] findCharFrequency(String text) {
        char[] charArray = text.toCharArray();        // Convert string to character array
        int[] frequency = new int[charArray.length];  // Array to store frequency of characters
        int n = charArray.length;

        // Outer loop to iterate through each character
        for (int i = 0; i < n; i++) {
            if (charArray[i] != '0') {  // Skip if character is already counted
                frequency[i] = 1;       // Initialize frequency to 1

                // Inner loop to check for duplicate characters
                for (int j = i + 1; j < n; j++) {
                    if (charArray[i] == charArray[j]) {
                        frequency[i]++;  // Increment frequency count
                        charArray[j] = '0'; // Mark duplicate character as '0'
                    }
                }
            }
        }

        // Create a 1D array to store characters and their frequencies
        int resultSize = 0;
        for (int freq : frequency) {
            if (freq > 0) resultSize++;
        }

        String[] result = new String[resultSize];
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (frequency[i] > 0) {
                result[index++] = charArray[i] + " -> " + frequency[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Call method to find character frequency
        String[] result = findCharFrequency(text);

        // Display the result
        System.out.println("Character Frequencies:");
        for (String entry : result) {
            System.out.println(entry);
        }

        scanner.close();
    }
}
