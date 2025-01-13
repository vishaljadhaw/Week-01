import java.util.Scanner;

public class ChocolatesDistribution {

    // Method to find the remainder and quotient of a number
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2]; // Array to store quotient and remainder
        result[0] = number / divisor; // Quotient
        result[1] = number % divisor; // Remainder
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the number of chocolates and children
        System.out.print("Enter the total number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        System.out.print("Enter the total number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Ensure number of children is not zero
        if (numberOfChildren == 0) {
            System.out.println("Number of children cannot be zero. Please try again.");
        } else {
            // Call the method to find quotient and remainder
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

            // Print the results
            System.out.println("Each child gets: " + result[0] + " chocolates");
            System.out.println("Remaining chocolates: " + result[1]);
        }
	}
}