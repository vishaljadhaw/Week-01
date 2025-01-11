import java.util.Scanner;

public class TriangularPark {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user inputs for the sides of the triangular park
        System.out.print("Enter the length of side 1 (in meters): ");
        double side1 = input.nextDouble();

        System.out.print("Enter the length of side 2 (in meters): ");
        double side2 = input.nextDouble();

        System.out.print("Enter the length of side 3 (in meters): ");
        double side3 = input.nextDouble();

        // Calculate the perimeter of the triangular park
        double perimeter = side1 + side2 + side3;

        // Convert the total distance to meters
        double totalDistance = 5*1000; // 5 km = 5000 meters

        // Calculate the number of rounds the athlete needs to complete
        double rounds = totalDistance / perimeter;

        // Print the result, rounding up if necessary
        System.out.printf("The total number of rounds the athlete will run is " + rounds+" to complete 5 km");
    }
}
