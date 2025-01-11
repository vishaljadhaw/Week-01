import java.util.Scanner;

public class TravelDetails {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user inputs for name and cities
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter the starting city: ");
        String fromCity = input.nextLine();

        System.out.print("Enter the via city: ");
        String viaCity = input.nextLine();

        System.out.print("Enter the destination city: ");
        String toCity = input.nextLine();

        // Take user inputs for distances
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " (in miles): ");
        double fromToVia = input.nextDouble();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " (in miles): ");
        double viaToFinalCity = input.nextDouble();

        // Take user input for time taken
        System.out.print("Enter the time taken for the journey (in hours): ");
        double timeTaken = input.nextDouble();

        // Calculate the total distance
        double totalDistance = fromToVia + viaToFinalCity;

        // Calculate the average speed
        double averageSpeed = totalDistance / timeTaken;

        // Print the results
        System.out.println("fromCity "+ fromCity+" toCity " +toCity +" viaCity "+viaCity);
        System.out.printf("The total distance traveled is "+totalDistance);
    }
}
