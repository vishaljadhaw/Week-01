import java.util.Scanner;

public class FindMultiple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get input value for a variable named number
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        System.out.println("The multiples of " + number + " below 100 are:");
        
        // Run a for loop backward: from i = 100 to i = 1
        for (int i = 100; i >= 1; i--) {
            // Inside the loop, check if i perfectly divides the number
            if (i % number == 0) {
                // If true, print the number and continue the loop
                System.out.println(i);
            }
        }

        input.close();
    }
}
