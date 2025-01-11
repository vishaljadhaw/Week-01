import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = input.nextInt();

        // Create arrays to store the weight, height, BMI, and weight status of the persons
        double[] weights = new double[numberOfPersons];
        double[] heights = new double[numberOfPersons];
        double[] bmis = new double[numberOfPersons];
        String[] weightStatuses = new String[numberOfPersons];

        // Take input for the weight and height of the persons
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.print("Enter the weight (in kg) of person " + (i + 1) + ": ");
            weights[i] = input.nextDouble();

            System.out.print("Enter the height (in cm) of person " + (i + 1) + ": ");
            heights[i] = input.nextDouble();

            // Convert height from cm to meters
            double heightMeters = heights[i] / 100;

            // Calculate the BMI of the person
            bmis[i] = weights[i] / (heightMeters * heightMeters);

            // Determine the weight status of the person based on BMI
            if (bmis[i] < 18.5) {
                weightStatuses[i] = "Underweight";
            } else if (bmis[i] >= 18.5 && bmis[i] <= 24.9) {
                weightStatuses[i] = "Normal weight";
            } else if (bmis[i] >= 25.0 && bmis[i] <= 29.9) {
                weightStatuses[i] = "Overweight";
            } else if (bmis[i] >= 30.0 && bmis[i] <= 39.9) {
                weightStatuses[i] = "Obese";
            } else {
                weightStatuses[i] = "Severely obese";
            }
        }

        // Display the height, weight, BMI, and weight status of each person
        System.out.println("\nBMI Results:");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Height: "+ heights[i]);
            System.out.println("Weight: "+ weights[i]);
            System.out.println("BMI: "+ bmis[i]);
            System.out.println("Weight Status: " + weightStatuses[i]);
            System.out.println();
        }

        input.close();
    }
}

