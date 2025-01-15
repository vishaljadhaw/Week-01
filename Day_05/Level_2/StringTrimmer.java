import java.util.Scanner;

public class StringTrimmer {

    // Method to find the start and end indexes for trimming spaces
    public static int[] findTrimIndexes(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Trim leading spaces
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create a substring using charAt() method
    public static String substringUsingCharAt(String str, int start, int end) {
        char[] result = new char[end - start + 1];
        for (int i = start, j = 0; i <= end; i++, j++) {
            result[j] = str.charAt(i);
        }
        return new String(result);
    }

    // Method to compare two strings using charAt() method
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string with leading and trailing spaces: ");
        String userInput = scanner.nextLine();

        // Trim spaces using the custom method
        int[] trimIndexes = findTrimIndexes(userInput);
        String trimmedStringCustom = substringUsingCharAt(userInput, trimIndexes[0], trimIndexes[1]);

        // Trim spaces using the built-in method
        String trimmedStringBuiltIn = userInput.trim();

        // Compare the two trimmed strings
        boolean areEqual = compareStrings(trimmedStringCustom, trimmedStringBuiltIn);

        // Display the results
        System.out.println("Custom Trimmed String: '" + trimmedStringCustom + "'");
        System.out.println("Built-in Trimmed String: '" + trimmedStringBuiltIn + "'");
        System.out.println("Are both strings equal? " + areEqual);

        scanner.close();
    }
}
