import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100; // Convert height from cm to meters
            data[i][2] = weight / (heightInMeters * heightInMeters); // Calculate BMI
        }
    }

    // Method to determine BMI status
    public static String determineStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2D array to store weight, height, and BMI for 10 members
        double[][] data = new double[10][3];
        String[] statuses = new String[10];

        // Input weight and height for each person
        System.out.println("Enter the weight (in kg) and height (in cm) for 10 persons:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " - Weight (kg): ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Person " + (i + 1) + " - Height (cm): ");
            data[i][1] = scanner.nextDouble();
        }

        // Calculate BMI for each person
        calculateBMI(data);

        // Determine BMI status for each person
        for (int i = 0; i < 10; i++) {
            statuses[i] = determineStatus(data[i][2]);
        }

        // Display the results
        System.out.println("\nResults:");
        System.out.println("Weight(kg)   Height(cm)   BMI         Status");
        for (int i = 0; i < 10; i++) {
            System.out.println(data[i][0] + "          " + data[i][1] + "         " + data[i][2] + "         " + statuses[i]);
        }

        scanner.close();
    }
}
