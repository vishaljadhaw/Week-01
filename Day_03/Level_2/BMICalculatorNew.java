
import java.util.Scanner;

public class BMICalculatorNew {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = input.nextInt();

        // Create a multi-dimensional array to store weight, height, and BMI
        double[][] personData = new double[numberOfPersons][3];
        String[] weightStatus = new String[numberOfPersons];

        // Take input for the weight and height of the persons
        for (int i = 0; i < numberOfPersons; i++) {
            while (true) {
                System.out.print("Enter the weight (in kg) of person " + (i + 1) + ": ");
                personData[i][0] = input.nextDouble();

                System.out.print("Enter the height (in cm) of person " + (i + 1) + ": ");
                personData[i][1] = input.nextDouble();

                // Check for negative values
                if (personData[i][0] <= 0 || personData[i][1] <= 0) {
                    System.out.println("Invalid input. Please enter positive values for weight and height.");
                } else {
                    break;
                }
            }

            // Convert height from cm to meters
            double heightMeters = personData[i][1] / 100;

            // Calculate the BMI of the person
            personData[i][2] = personData[i][0] / (heightMeters * heightMeters);

            // Determine the weight status of the person based on BMI
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] >= 25.0 && personData[i][2] <= 29.9) {
                weightStatus[i] = "Overweight";
            } else if (personData[i][2] >= 30.0 && personData[i][2] <= 39.9) {
                weightStatus[i] = "Obese";
            } else {
                weightStatus[i] = "Severely obese";
            }
        }

        // Display the height, weight, BMI, and weight status of each person
        System.out.println("\nBMI Results:");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.printf("Height: "+ personData[i][1]);
            System.out.printf("Weight: "+ personData[i][0]);
            System.out.printf("BMI: "+ personData[i][2]);
            System.out.println("Weight Status: " + weightStatus[i]);
            System.out.println();
        }

        input.close();
    }
}

