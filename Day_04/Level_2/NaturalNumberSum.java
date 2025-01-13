import java.util.Scanner;

public class NaturalNumberSum {

    // Method to calculate the sum of n natural numbers using recursion
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumUsingRecursion(n - 1);
    }

    // Method to calculate the sum of n natural numbers using the formula
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        // Check if the input is a natural number
        if (n <= 0) {
            System.out.println("The input is not a natural number. Exiting...");
            scanner.close();
            return;
        }

        // Calculate the sum using recursion
        int sumRecursion = sumUsingRecursion(n);

        // Calculate the sum using the formula
        int sumFormula = sumUsingFormula(n);

        // Compare and display the results
        System.out.println("Sum using recursion: " + sumRecursion);
        System.out.println("Sum using formula: " + sumFormula);

        if (sumRecursion == sumFormula) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("There is a discrepancy between the two methods.");
        }

        scanner.close();
    }
}
