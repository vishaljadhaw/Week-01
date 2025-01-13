import java.util.Scanner;
import java.util.Random;

public class SimpleStudentScorecard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Input number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Arrays to store scores and results
        int[][] scores = new int[numberOfStudents][3]; // Physics, Chemistry, Maths
        int[] totals = new int[numberOfStudents];
        double[] averages = new double[numberOfStudents];
        double[] percentages = new double[numberOfStudents];

        // Generate scores and calculate results
        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = 50 + random.nextInt(51); // Physics
            scores[i][1] = 50 + random.nextInt(51); // Chemistry
            scores[i][2] = 50 + random.nextInt(51); // Maths

            totals[i] = scores[i][0] + scores[i][1] + scores[i][2];
            averages[i] = Math.round((totals[i] / 3.0) * 100.0) / 100.0;
            percentages[i] = Math.round((totals[i] / 300.0) * 100.0 * 100.0) / 100.0;
        }

        // Display results
        System.out.println("ID  Physics  Chemistry  Maths  Total  Average  Percentage");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(
                    (i + 1) + "   " + 
                    scores[i][0] + "       " + 
                    scores[i][1] + "         " + 
                    scores[i][2] + "      " + 
                    totals[i] + "     " + 
                    averages[i] + "      " + 
                    percentages[i]);
        }

        scanner.close();
    }
}
