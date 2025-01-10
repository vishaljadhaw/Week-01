import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for weight in kg
        System.out.print("Enter your weight in kg: ");
        double weight = input.nextDouble();

        // Take user input for height in cm
        System.out.print("Enter your height in cm: ");
        double heightCm = input.nextDouble();

        // Convert height from cm to meters
        double heightMeters = heightCm / 100;

        // Calculate BMI
        double bmi = weight / (heightMeters * heightMeters);
		System.out.println("bmi  "+bmi);

        // Determine BMI category and display result
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Normal");
        } else if (bmi >= 25.0 && bmi <= 29.9) {
            System.out.println("Overweight");
        } else if (bmi >= 30.0 && bmi <= 39.9) {
            System.out.println("Obesity");
        } else if (bmi >= 40.0) {
            System.out.println("Severe Obesity");
        }

        // Close the scanner
        input.close();
    }
}
