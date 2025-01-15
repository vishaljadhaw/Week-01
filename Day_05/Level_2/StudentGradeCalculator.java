import java.util.Random;
import java.util.Scanner;

public class StudentGradeCalculator {

    // Method to generate random scores for Physics, Chemistry, and Maths
    public static int[][] generateScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3]; // 2D array to store PCM scores for each student

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = random.nextInt(41) + 60; // Random score between 60 and 100 for Physics
            scores[i][1] = random.nextInt(41) + 60; // Random score between 60 and 100 for Chemistry
            scores[i][2] = random.nextInt(41) + 60; // Random score between 60 and 100 for Maths
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateMetrics(int[][] scores) {
        double[][] metrics = new double[scores.length][3]; // [total, average, percentage]

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            metrics[i][0] = total;
            metrics[i][1] = Math.round(average * 100.0) / 100.0; // Round off to 2 decimal places
            metrics[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return metrics;
    }

    // Method to calculate grade based on percentage
    public static String[] calculateGrades(double[][] metrics) {
        String[] grades = new String[metrics.length];

        for (int i = 0; i < metrics.length; i++) {
            double percentage = metrics[i][2];

            if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B";
            } else if (percentage >= 60) {
                grades[i] = "C";
            } else if (percentage >= 50) {
                grades[i] = "D";
            } else if (percentage >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }
        return grades;
    }

    // Method to display the scorecard in tabular format
    public static void displayScorecard(int[][] scores, double[][] metrics, String[] grades) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s%n", 
                          "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage", "Grade");
        System.out.println("-----------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10.0f %-10.2f %-10.2f %-10s%n", 
                              scores[i][0], scores[i][1], scores[i][2], metrics[i][0], metrics[i][1], metrics[i][2], grades[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Generate random scores for students
        int[][] scores = generateScores(numStudents);

        // Calculate total, average, and percentage for each student
        double[][] metrics = calculateMetrics(scores);

        // Calculate grade for each student
        String[] grades = calculateGrades(metrics);

        // Display the scorecard
        displayScorecard(scores, metrics, grades);

        scanner.close();
    }
}
 