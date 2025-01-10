import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Variable to store if the number is prime or not
        boolean isPrime = true;

        // Prime number check (only for numbers greater than 1)
        if (number <= 1) {
            isPrime = false; // Numbers less than or equal to 1 are not prime
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false; // Found a divisor, number is not prime
                    break; // Exit the loop early
                }
            }
        }

        // Output result
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }

        scanner.close();
    }
}
