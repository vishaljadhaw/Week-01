import java.util.Scanner;

public class UnitConverterNew {

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unit Converter Utility");

        // Demonstrate conversions
        System.out.print("Enter kilometers to convert to miles: ");
        double km = scanner.nextDouble();
        System.out.println(km + " kilometers is equal to " + convertKmToMiles(km) + " miles.");

        System.out.print("Enter miles to convert to kilometers: ");
        double miles = scanner.nextDouble();
        System.out.println(miles + " miles is equal to " + convertMilesToKm(miles) + " kilometers.");

        System.out.print("Enter meters to convert to feet: ");
        double meters = scanner.nextDouble();
        System.out.println(meters + " meters is equal to " + convertMetersToFeet(meters) + " feet.");

        System.out.print("Enter feet to convert to meters: ");
        double feet = scanner.nextDouble();
        System.out.println(feet + " feet is equal to " + convertFeetToMeters(feet) + " meters.");

        System.out.print("Enter yards to convert to feet: ");
        double yards = scanner.nextDouble();
        System.out.println(yards + " yards is equal to " + convertYardsToFeet(yards) + " feet.");

        System.out.print("Enter feet to convert to yards: ");
        feet = scanner.nextDouble();
        System.out.println(feet + " feet is equal to " + convertFeetToYards(feet) + " yards.");

        System.out.print("Enter meters to convert to inches: ");
        meters = scanner.nextDouble();
        System.out.println(meters + " meters is equal to " + convertMetersToInches(meters) + " inches.");

        System.out.print("Enter inches to convert to meters: ");
        double inches = scanner.nextDouble();
        System.out.println(inches + " inches is equal to " + convertInchesToMeters(inches) + " meters.");

        System.out.print("Enter inches to convert to centimeters: ");
        inches = scanner.nextDouble();
        System.out.println(inches + " inches is equal to " + convertInchesToCentimeters(inches) + " centimeters.");

        scanner.close();
    }
}
