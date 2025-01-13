import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to find the sum of n natural numbers using a loop
    public int findSum(int n) {
        int sum = 0; // Initialize sum to 0
        for (int i = 1; i <= n; i++) { // Loop from 1 to n
            sum += i; // Add each number to the sum
        }
        return sum; // Return the calculated sum
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object for input
        
      
        System.out.print("Enter a positive integer (n): ");
        int n = scanner.nextInt(); // Read the input
        
        // Check if the input is valid (n should be positive)
        if (n <= 0) {
            System.out.println("Please enter a positive integer."); // Error message for invalid input
        } else {
            // Create an object of the SumOfNaturalNumbers class
            SumOfNaturalNumbers sumCalculator = new SumOfNaturalNumbers();
            
            // Call the findSum method and store the result
            int sum = sumCalculator.findSum(n);
            
            // Print the result
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }
    }
}
