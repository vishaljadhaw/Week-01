import java.util.Scanner;

public class TextSplitter1 {

    // Method to calculate the length of the string without using the built-in length() method
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Reached the end of the string
        }
        return count;
    }

    // Method to split the text into words without using the split() method
    public static String[] splitText(String text) {
        int length = findLength(text);
        int wordCount = 0;

        // Count the number of words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ' || i == length - 1) {
                wordCount++;
            }
        }

        // Array to store the words
        String[] words = new String[wordCount];
        int start = 0, index = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ' || i == length - 1) {
                // Extract the word
                int end = (i == length - 1) ? i + 1 : i;
                char[] wordChars = new char[end - start];
                for (int j = start, k = 0; j < end; j++, k++) {
                    wordChars[k] = text.charAt(j);
                }
                words[index++] = new String(wordChars);
                start = i + 1;
            }
        }

        return words;
    }

    // Method to create a 2D array with words and their lengths
    public static String[][] wordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a text: ");
        String userInput = scanner.nextLine();

        // Split text using user-defined method
        String[] customSplitWords = splitText(userInput);

        // Generate 2D array with words and their lengths
        String[][] wordsWithLengths = wordsWithLengths(customSplitWords);

        // Display the results in tabular format
        System.out.println("Word\tLength");
        System.out.println("----------------");
        for (String[] wordInfo : wordsWithLengths) {
            System.out.println(wordInfo[0] + "\t" + Integer.parseInt(wordInfo[1]));
        }

        scanner.close();
    }
}
