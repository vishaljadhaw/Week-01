import java.util.Scanner; // Importing Scanner class for user input

// Class to check if a number is positive, negative, or zero
public class NumberCheck {

    // Method to check the nature of the number
    void check(int number) {
        // If the number is greater than 0, it's positive
        if (number > 0) {
            System.out.println("1"); // Output 1 for positive number
        }
        // If the number is less than 0, it's negative
        else if (number < 0) {
            System.out.println("-1"); // Output -1 for negative number
        }
        // If the number is 0
        else {
            System.out.println("0"); // Output 0 for zero
        }
    }

    // Main method to execute the program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creating Scanner object for input

        // get the input from user
        System.out.println("Enter the number: ");
        int number = input.nextInt(); // Reading the number from user

        // Creating an object of NumberCheck class
        NumberCheck numbercheck = new NumberCheck();
        // Calling the check method to determine the nature of the number
        numbercheck.check(number);
    }
}
