import java.util.Scanner;

public class UniqueCharacters {

    // Method to find the length of the text without using the String method length()
    public static int findLength(String text) {
        int length = 0;
        while (true) {
            try {
                text.charAt(length); // Try accessing each character until an exception occurs
                length++;
            } catch (StringIndexOutOfBoundsException e) {
                break; // Break when the exception occurs (end of string)
            }
        }
        return length;
    }

    // Method to find unique characters in the string using charAt() and return them as a 1D array
    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text);
        char[] uniqueChars = new char[length];
        int uniqueCount = 0;

        // Outer loop to go through each character in the string
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Inner loop to check if the character is unique
            for (int j = 0; j < i; j++) {
                if (currentChar == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            // If the character is unique, add it to the result array
            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create a new array to store only the unique characters (remove empty spaces)
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueChars[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter a string: ");
        String inputText = scanner.nextLine();

        // Find unique characters
        char[] uniqueChars = findUniqueCharacters(inputText);

        // Display the result
        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }

        scanner.close();
    }
}
