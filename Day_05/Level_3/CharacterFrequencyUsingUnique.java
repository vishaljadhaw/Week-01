import java.util.Scanner;

public class CharacterFrequencyUsingUnique {

    // Method to find unique characters in a string using charAt() method
    public static char[] uniqueCharacters(String text) {
        // Create an array to store unique characters
        char[] uniqueChars = new char[text.length()];
        int uniqueCount = 0;

        // Loop through the text to find unique characters
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Nested loop to check if the character is already present
            for (int j = 0; j < i; j++) {
                if (currentChar == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            // If the character is unique, store it in the uniqueChars array
            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create a new array with the exact size for unique characters
        char[] result = new char[uniqueCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);
        return result;
    }

    // Method to find the frequency of characters in a string and return them in a 2D array
    public static String[][] findCharacterFrequency(String text) {
        // Array to store the frequency of each character (ASCII size is 256)
        int[] frequency = new int[256];

        // Loop to count the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Find unique characters using the uniqueCharacters method
        char[] uniqueChars = uniqueCharacters(text);

        // Create a 2D array to store the characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];

        // Loop through the unique characters and store their frequencies
        for (int i = 0; i < uniqueChars.length; i++) {
            char currentChar = uniqueChars[i];
            result[i][0] = String.valueOf(currentChar); // Character
            result[i][1] = String.valueOf(frequency[currentChar]); // Frequency
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter a string: ");
        String inputText = scanner.nextLine();

        // Find the character frequencies
        String[][] frequencies = findCharacterFrequency(inputText);

        // Display the result
        System.out.println("Character frequencies:");
        for (int i = 0; i < frequencies.length; i++) {
            System.out.println("Character: " + frequencies[i][0] + " | Frequency: " + frequencies[i][1]);
        }

        scanner.close();
    }
}
