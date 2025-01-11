import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = scanner.nextDouble();

        // Convert the distance to yards (1 yard = 3 feet)
        double distanceInYards = distanceInFeet / 3;

        // Convert the distance to miles (1 mile = 1760 yards)
        double distanceInMiles = distanceInYards / 1760;

        // Print the results
        System.out.printf("Your Height in cm is " +distanceInFeet+" while in feet is " +distanceInYards+ " and inches is "+distanceInMiles); 
    }
}
