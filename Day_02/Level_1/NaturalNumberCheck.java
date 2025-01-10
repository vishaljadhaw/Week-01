import java.util.Scanner;

public class NaturalNumberCheck {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Input: number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a positive integer (natural number)
        if (number > 0) {
            // Calculate the sum of first n natural numbers
            int sum = (number * (number + 1)) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
    }
}
