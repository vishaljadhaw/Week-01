import java.util.Scanner;

public class TextSplitter3 {

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

    // Method to find the shortest and longest words
    public static String[] findShortestAndLongest(String[][] wordsWithLengths) {
        String shortest = wordsWithLengths[0][0];
        String longest = wordsWithLengths[0][0];
        int minLength = Integer.parseInt(wordsWithLengths[0][1]);
        int maxLength = Integer.parseInt(wordsWithLengths[0][1]);

        for (String[] wordInfo : wordsWithLengths) {
            int length = Integer.parseInt(wordInfo[1]);
            if (length < minLength) {
                minLength = length;
                shortest = wordInfo[0];
            }
            if (length > maxLength) {
                maxLength = length;
                longest = wordInfo[0];
            }
        }

        return new String[]{shortest, String.valueOf(minLength), longest, String.valueOf(maxLength)};
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

        // Find the shortest and longest words
        String[] shortestAndLongest = findShortestAndLongest(wordsWithLengths);

        // Display the results in tabular format
        System.out.println("Word\tLength");
        System.out.println("----------------");
        for (String[] wordInfo : wordsWithLengths) {
            System.out.println(wordInfo[0] + "\t" + Integer.parseInt(wordInfo[1]));
        }

        System.out.println("\nShortest Word: " + shortestAndLongest[0] + " (Length: " + shortestAndLongest[1] + ")");
        System.out.println("Longest Word: " + shortestAndLongest[2] + " (Length: " + shortestAndLongest[3] + ")");

        scanner.close();
    }
}
