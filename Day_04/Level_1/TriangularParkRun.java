import java.util.Scanner;

public class TriangularParkRun {

    // Method to calculate the number of rounds to complete 5 km
    void calculateRounds(double side1, double side2, double side3) {
        // Calculate the perimeter of the triangular park
        double perimeter = side1 + side2 + side3;

        // Convert 5 km to meters (1 km = 1000 meters)
        double distanceToRun = 5000;

        // Calculate the number of rounds (distance / perimeter)
        if (perimeter <= 0) {
            System.out.println("The perimeter of the park must be greater than zero.");
        } else {
            double rounds = distanceToRun / perimeter;
            System.out.printf("Number of rounds user needs to do to complete 5km run. ", rounds);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the three sides of the triangular park
        System.out.println("Enter the length of the first side of the triangular park (in meters): ");
        double side1 = sc.nextDouble();

        System.out.println("Enter the length of the second side of the triangular park (in meters): ");
        double side2 = sc.nextDouble();

        System.out.println("Enter the length of the third side of the triangular park (in meters): ");
        double side3 = sc.nextDouble();

        // Create an object of the class
        TriangularParkRun parkRun = new TriangularParkRun();

        // Call the method to calculate the number of rounds
        parkRun.calculateRounds(side1, side2, side3);
    }
}
