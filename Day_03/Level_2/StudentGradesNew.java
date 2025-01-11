 import java.util.Scanner;

public class StudentGradesNew {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Create arrays to store marks, percentages, and grades of the students
        int[][] marks = new int[numberOfStudents][3];
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];

        // Take input for marks of students in physics, chemistry, and maths
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                String subject = "";
                if (j == 0) subject = "Physics";
                else if (j == 1) subject = "Chemistry";
                else if (j == 2) subject = "Maths";

                while (true) {
                    System.out.print(subject + ": ");
                    marks[i][j] = input.nextInt();
                    if (marks[i][j] < 0) {
                        System.out.println("Invalid input. Please enter positive values for marks.");
                    } else {
                        break;
                    }
                }
            }
        }

        // Calculate the percentage and grade of the students
        for (int i = 0; i < numberOfStudents; i++) {
            int totalMarks = 0;
            for (int j = 0; j < 3; j++) {
                totalMarks += marks[i][j];
            }
            percentages[i] = (double) totalMarks / 3;

            // Determine the grade based on the percentage
            if (percentages[i] >= 90) {
                grades[i] = "A";
            } else if (percentages[i] >= 80) {
                grades[i] = "B";
            } else if (percentages[i] >= 70) {
                grades[i] = "C";
            } else if (percentages[i] >= 60) {
                grades[i] = "D";
            } else {
                grades[i] = "F";
            }
        }

        // Display the marks, percentages, and grades of each student
        System.out.println("\nStudent Results:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.printf("Percentage: "+ percentages[i]);
            System.out.println("Grade: " + grades[i]);
            System.out.println();
        }

        input.close();
    }
}