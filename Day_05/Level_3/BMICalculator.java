import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and status
    public static String[] calculateBMIAndStatus(double weight, double height) {
        // Convert height from cm to meters
        height = height / 100;

        // Calculate BMI
        double bmi = weight / (height * height);

        // Determine BMI status
        String status = "";
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            status = "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            status = "Overweight";
        } else {
            status = "Obesity";
        }

        // Return the result as a String array
        return new String[]{String.format("%.2f", weight), String.format("%.2f", height * 100), String.format("%.2f", bmi), status};
    }

    // Method to process the data and store in a 2D String array
    public static String[][] processBMIData(double[][] weightHeightData) {
        String[][] resultData = new String[weightHeightData.length][4];

        for (int i = 0; i < weightHeightData.length; i++) {
            // Get the weight and height for each person
            double weight = weightHeightData[i][0];
            double height = weightHeightData[i][1];

            // Call the method to calculate BMI and status
            resultData[i] = calculateBMIAndStatus(weight, height);
        }

        return resultData;
    }

    // Method to display the 2D string array in tabular format
    public static void displayResults(String[][] resultData) {
        System.out.println("Person | Height (cm) | Weight (kg) | BMI   | Status");
        System.out.println("---------------------------------------------------------");

        for (int i = 0; i < resultData.length; i++) {
            System.out.printf("%6d | %12s | %12s | %5s | %s\n", i + 1, resultData[i][1], resultData[i][0], resultData[i][2], resultData[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] weightHeightData = new double[10][2];

        // Taking input for 10 persons (weight and height)
        for (int i = 0; i < 10; i++) {
            System.out.printf("Enter weight (in kg) for person %d: ", i + 1);
            weightHeightData[i][0] = scanner.nextDouble();

            System.out.printf("Enter height (in cm) for person %d: ", i + 1);
            weightHeightData[i][1] = scanner.nextDouble();
        }

        // Process the BMI data
        String[][] resultData = processBMIData(weightHeightData);

        // Display the results in tabular format
        displayResults(resultData);

        scanner.close();
    }
}
