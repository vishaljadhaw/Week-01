import java.util.Random;
import java.util.Scanner;

public class StudentVotingEligibility {

    // Method to generate random ages for students
    public static int[] generateRandomAges(int numberOfStudents) {
        Random random = new Random();
        int[] ages = new int[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            ages[i] = random.nextInt(50) + 1; // Random age between 1 and 50
        }
        return ages;
    }

    // Method to determine voting eligibility
    public static String[][] determineVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            result[i][0] = String.valueOf(age);
            if (age < 0) {
                result[i][1] = "Invalid Age";
            } else if (age >= 18) {
                result[i][1] = "Can Vote";
            } else {
                result[i][1] = "Cannot Vote";
            }
        }
        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayResults(String[][] results) {
        System.out.println("Age\tEligibility");
        System.out.println("-------------------------");
        for (String[] entry : results) {
            System.out.println(entry[0] + "\t" + entry[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number of students
        System.out.print("Enter the number of students in the class: ");
        int numberOfStudents = scanner.nextInt();

        // Generate random ages for students
        int[] studentAges = generateRandomAges(numberOfStudents);

        // Determine voting eligibility
        String[][] eligibilityResults = determineVotingEligibility(studentAges);

        // Display the results
        displayResults(eligibilityResults);

        scanner.close();
    }
}
