import java.util.Scanner;

public class Countdown2 {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Input: counter for countdown
        System.out.print("Enter the countdown starting number: ");
        int counter = scanner.nextInt();

        // Countdown using a for loop
        for (int i = counter; i >= 1; i--) {
            System.out.println(i); // Print the current value of the counter
        }

        // Print rocket launch message
        System.out.println("Rocket Launched!");

        
    }
}
