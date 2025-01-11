import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightCm = scanner.nextDouble();

        // Conversion factors
        double cmToInches = 2.54; // 1 inch = 2.54 cm
        int inchesPerFoot = 12;   // 1 foot = 12 inches

        // Convert height to total inches
        double totalInches = heightCm / cmToInches;

        // Convert total inches to feet and remaining inches
        int feet = (int) (totalInches / inchesPerFoot); // Integer division for feet
        double inches = totalInches % inchesPerFoot;   // Remainder for inches

        // Print the results
        System.out.printf("Your Height in cm is" + heightCm + " while in feet is " + feet+" and inches is "+inches);
    }
}
