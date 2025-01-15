import java.util.Scanner;

public class VowelConsonantFinder2 {

    // Method to determine if a character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char ch) {
        // Convert to lowercase if it is an uppercase letter
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32); // Convert to lowercase
        }

        // Check if the character is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        }
        // Check if the character is a consonant
        else if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        }
        // If not a letter
        return "Not a Letter";
    }

    // Method to classify each character in a string and return the result as a 2D array
    public static String[][] classifyCharacters(String str) {
        int length = str.length();
        String[][] result = new String[length][2];

        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch); // Store the character
            result[i][1] = checkCharacterType(ch); // Store the type
        }

        return result;
    }

    // Method to display a 2D array in a tabular format
    public static void displayCharacterTypes(String[][] charTypes) {
        System.out.println("Character\tType");
        System.out.println("-------------------------");
        for (String[] entry : charTypes) {
            System.out.println(entry[0] + "\t\t" + entry[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Classify characters in the string
        String[][] charTypes = classifyCharacters(userInput);

        // Display the result in a tabular format
        displayCharacterTypes(charTypes);

        scanner.close();
    }
}
