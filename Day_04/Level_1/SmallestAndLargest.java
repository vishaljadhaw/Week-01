import java.util.Scanner;

public class SmallestAndLargest {

    // Method to find the smallest and largest of three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = number1; // Assume the first number is the smallest
        int largest = number1;  // Assume the first number is the largest

        // Check if the second number is smaller or larger
        if (number2 < smallest) smallest = number2;
        if (number2 > largest) largest = number2;

        // Check if the third number is smaller or larger
        if (number3 < smallest) smallest = number3;
        if (number3 > largest) largest = number3;

        return new int[] {smallest, largest}; // Return both smallest and largest
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // For user input

        // Get three numbers from the user
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        // Find the smallest and largest numbers
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // Display the results
        System.out.println("The smallest number is: " + result[0]);
        System.out.println("The largest number is: " + result[1]);
    }
}
