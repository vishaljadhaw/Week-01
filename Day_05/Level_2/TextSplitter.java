import java.util.Scanner;

public class TextSplitter {

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

    // Method to split the text into words without using the split() method or StringBuilder
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

    // Method to compare two string arrays
    public static boolean compareStringArrays(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a text: ");
        String userInput = scanner.nextLine();

        // Split text using user-defined method
        String[] customSplitWords = splitText(userInput);

        // Split text using built-in split() method
        String[] builtInSplitWords = userInput.split(" ");

        // Compare the two results
        boolean areEqual = compareStringArrays(customSplitWords, builtInSplitWords);

        // Display the results
        System.out.println("Words using custom split method: ");
        for (String word : customSplitWords) {
            System.out.println(word);
        }

        System.out.println("Words using built-in split method: ");
        for (String word : builtInSplitWords) {
            System.out.println(word);
        }

        System.out.println("Are the two results equal? " + areEqual);

        scanner.close();
    }
}