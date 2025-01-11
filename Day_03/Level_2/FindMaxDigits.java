
import java.util.Scanner;

public class FindMaxDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        System.out.print("Enter a number: ");
        String number = scanner.next();

        // Store digits in the array
        for (char ch : number.toCharArray()) {
            if (index == maxDigit) {
                // Increase the size of the array
                maxDigit += 10;
                int[] tempArray = new int[maxDigit];
                System.arraycopy(digits, 0, tempArray, 0, digits.length);
                digits = tempArray;
            }
            digits[index++] = Character.getNumericValue(ch);
        }

        // Find the largest and second largest numbers
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display the largest and second largest numbers
        System.out.println("The largest number is: " + largest);
        System.out.println("The second largest number is: " + secondLargest);

        scanner.close();
    }
}

