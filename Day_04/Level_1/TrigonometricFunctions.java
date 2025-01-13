import java.util.Scanner;

public class TrigonometricFunctions {

    // Method to calculate sine, cosine, and tangent using Math class
    public double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle); // Convert angle to radians
        return new double[]{
            Math.sin(radians), // Sine of the angle
            Math.cos(radians), // Cosine of the angle
            Math.tan(radians)  // Tangent of the angle
        };
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input angle from user
        System.out.print("Enter angle in degrees: ");
        double angle = input.nextDouble();

        // Create instance of the class and calculate values
        TrigonometricFunctions trig = new TrigonometricFunctions();
        double[] results = trig.calculateTrigonometricFunctions(angle);

        // Output results
        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);

       }
}
