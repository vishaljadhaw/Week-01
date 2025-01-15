import java.util.Scanner;

public class CharacterFrequency {

    // Method to find the frequency of characters in a string using charAt() method
    public static String[][] findCharacterFrequency(String text) {
        // Array to store frequency of each character (ASCII size is 256)
        int[] frequency = new int[256];

        // Loop to count the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Array to store characters and their frequencies (2D array)
        int uniqueCharCount = 0;
        
        // Count unique characters
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCharCount++;
            }
        }

        // Creating the result array to store the character and its frequency
        String[][] result = new String[uniqueCharCount][2];
        int index = 0;

        // Fill the result array with characters and their frequencies
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i); // Character
                result[index][1] = String.valueOf(frequency[i]); // Frequency
                index++;
            }
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
