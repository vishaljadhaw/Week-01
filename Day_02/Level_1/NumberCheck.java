import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Input: number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check the sign of the number
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        
    }
}
