import java.util.Scanner;

public class KmToMilesConverter {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the distance in kilometers
        System.out.print("Enter the distance in kilometers: ");
        double km = input.nextDouble();  // Take the input as a double value

        // Conversion formula: 1 mile = 1.6 km
        double miles = km / 1.6;

        // Display the result
        System.out.println("The total miles is " +miles+" mile for the given "+km);
		}
    
}
