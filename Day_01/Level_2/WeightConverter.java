import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for weight in pounds
        System.out.print("Enter the weight in pounds: ");
        double weightInPounds = input.nextDouble();

        // Convert weight to kilograms
        double weightInKilograms = weightInPounds / 2.2;

        // Display the results
        System.out.printf("The weight of the person in pounds is " + weightInPounds +" and in kilograms is " +weightInKilograms);
    }
}
