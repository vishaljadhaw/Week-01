import java.util.Scanner;

public class NumberCheckerTwo {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // Method to store the digits of the number in a digits array
    public static int[] getDigitsArray(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        int index = count - 1;
        while (number > 0) {
            digits[index--] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to find the sum of the digits of a number
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of a number
    public static int sumOfSquaresOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit;
            number /= 10;
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int number) {
        int sum = sumOfDigits(number);
        return number % sum == 0;
    }

    // Method to find the frequency of each digit in the number
    public static void findDigitFrequency(int number) {
        int[] frequency = new int[10]; // Array to store frequencies of digits 0-9
        while (number > 0) {
            int digit = number % 10;
            frequency[digit]++;
            number /= 10;
        }

        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " time(s)");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Display the count of digits
        System.out.println("Count of digits: " + countDigits(number));

        // Display the digits array
        int[] digits = getDigitsArray(number);
        System.out.print("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        // Display the sum of digits
        System.out.println("Sum of digits: " + sumOfDigits(number));

        // Display the sum of squares of digits
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(number));

        // Check and display if the number is a Harshad number
        System.out.println("Is Harshad Number: " + isHarshadNumber(number));

        // Display the frequency of each digit
        findDigitFrequency(number);

        scanner.close();
    }
}
