import java.util.Scanner;

// Class to calculate the total number of handshakes in a group
public class MaximumNumberOfHandshakesTwo{
    
    // Method to calculate and print the number of handshakes
    void findCombination(int n) {
        // Formula to calculate the number of handshakes: C(n, 2) = (n * (n - 1)) / 2
        if (n <= 1) {
            System.out.println("Total Number of Handshakes: 0 (Insufficient people for a handshake)");
        } else {
            int combination = (n * (n - 1)) / 2;
            System.out.println("Total Number of Handshakes: " + combination);
        }
    }

    // Main method to execute the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompting the user for input
        System.out.println("Enter the number of people (n): ");
        int n = sc.nextInt();

        // Creating an object of the class
        MaximumNumberOfHandshakes maximumNumberOfHandshakes = new MaximumNumberOfHandshakes();

        // Calculating the number of handshakes
        maximumNumberOfHandshakes.findCombination(n);
    }
}
