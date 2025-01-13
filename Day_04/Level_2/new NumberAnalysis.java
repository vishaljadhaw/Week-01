import java.util.Scanner;

public class NumberAnalysis {

    // Method to check if a number is positive or negative
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    // Method to check if a number is even or odd
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Taking input for 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Using a simple for loop to check each number
        for (int i = 0; i < numbers.length; i++) {
            if (isPositive(numbers[i])) {
                System.out.print(numbers[i] + " is positive and ");
                if (isEven(numbers[i])) {
                    System.out.println("even.");
                } else {
                    System.out.println("odd.");
                }
            } else {
                System.out.println(numbers[i] + " is negative.");
            }
        }

        // Compare the first and last elements of the array
        int result = compare(numbers[0], numbers[4]);
        System.out.print("The first and last elements are ");
        if (result == 1) {
            System.out.println("first greater than the last.");
        } else if (result == 0) {
            System.out.println("equal.");
        } else {
            System.out.println("first less than the last.");
        }

        scanner.close();
    }
}
