import java.util.Scanner;

public class PalindromeCheck {

    // Logic 1: Compare characters from start and end using a loop
    public static boolean isPalindromeLoop(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive method to check palindrome
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Compare original and reversed character arrays
    public static boolean isPalindromeCharArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);
        
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    // Method to reverse a string using charAt() method
    public static char[] reverseString(String text) {
        int n = text.length();
        char[] reversed = new char[n];

        for (int i = 0; i < n; i++) {
            reversed[i] = text.charAt(n - i - 1);
        }

        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Check palindrome using three logics
        boolean result1 = isPalindromeLoop(text);
        boolean result2 = isPalindromeRecursive(text, 0, text.length() - 1);
        boolean result3 = isPalindromeCharArray(text);

        // Display the results
        System.out.println("\nPalindrome check using three logics:");
        System.out.println("Logic 1 (Loop): " + (result1 ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Logic 2 (Recursion): " + (result2 ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Logic 3 (Char Array): " + (result3 ? "Palindrome" : "Not a Palindrome"));

        scanner.close();
    }
}
 