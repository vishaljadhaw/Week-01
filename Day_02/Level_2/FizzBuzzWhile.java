import java.util.Scanner;

public class FizzBuzzWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the input is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("FizzBuzz Output:");
            int i = 0; // Initialize the counter
            while (i <= number) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                i++; // Increment the counter
            }
        }

        scanner.close();
    }
}
