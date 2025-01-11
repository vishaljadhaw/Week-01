
import java.util.Scanner;

public class MeanHeightCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create a double array named heights of size 11
        double[] heights = new double[11];

        // Get input values from the user
        System.out.println("Enter the heights of 11 players:");

        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i + 1) + " height: ");
            heights[i] = input.nextDouble();
        }

        // Find the sum of all the elements present in the array
        double sum = 0.0;
        for (double height : heights) {
            sum += height;
        }

        // Calculate the mean height
        double mean = sum / heights.length;

        // Print the mean height of the football team
        System.out.printf("The mean height of the football team is: %.2f\n", mean);

        input.close();
    }
}

