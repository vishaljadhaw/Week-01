import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Input: counter for countdown
        System.out.print("Enter the countdown starting number: ");
        int counter = scanner.nextInt();

        // Countdown using a while loop
        while (counter >= 1) {
            System.out.println(counter); // Print the current value of the counter
            counter--; // Decrement the counter
        }

        // Print rocket launch message
        System.out.println("Rocket Launched!");

        
    }
}
