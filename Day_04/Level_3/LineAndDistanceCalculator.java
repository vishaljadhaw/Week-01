import java.util.Scanner;

public class LineAndDistanceCalculator {

    // Method to find the Euclidean distance between two points
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to find the equation of the line given two points
    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        double slope = (y2 - y1) / (x2 - x1); // Slope (m)
        double yIntercept = y1 - slope * x1; // Y-intercept (b)
        return new double[]{slope, yIntercept}; // Return slope and intercept as an array
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input points
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        // Calculate and display Euclidean distance
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance between the points: %.2f%n", distance);

        // Calculate and display the equation of the line
        if (x1 == x2) {
            System.out.println("The line is vertical and cannot be represented in the slope-intercept form.");
        } else {
            double[] lineEquation = calculateLineEquation(x1, y1, x2, y2);
            double slope = lineEquation[0];
            double yIntercept = lineEquation[1];
            System.out.printf("Equation of the line: y = %.2fx + %.2f%n", slope, yIntercept);
        }
    }
}
