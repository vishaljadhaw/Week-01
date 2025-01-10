import java.util.Scanner;

public class FindGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input marks for three subjects
        System.out.print("Enter the marks of Physics: ");
        int physics = input.nextInt();

        System.out.print("Enter the marks of Chemistry: ");
        int chemistry = input.nextInt();

        System.out.print("Enter the marks of Maths: ");
        int maths = input.nextInt();

        // Calculate total marks and percentage
        int totalMarks = physics + chemistry + maths;
        double totalPercentage = (double) totalMarks / 3;

        // Determine the grade and remarks based on the percentage
        char grade;
        String remarks;
        if (totalPercentage >= 80) {
            grade = 'A';
            remarks = "Level 4, above agency-normalized standards";
        } else if (totalPercentage >= 70 && totalPercentage <= 79) {
            grade = 'B';
            remarks = "Level 3, at agency-normalized standards";
        } else if (totalPercentage >= 60 && totalPercentage <= 69) {
            grade = 'C';
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (totalPercentage >= 50 && totalPercentage <= 59) {
            grade = 'D';
            remarks = "Level 1, well below agency-normalized standards";
        } else if (totalPercentage >= 40 && totalPercentage <= 49) {
            grade = 'E';
            remarks = "Level 1, too below agency-normalized standards";
        } else {
            grade = 'R';
            remarks = "Remedial standards";
        }

        // Display the results
        System.out.println("Total Percentage: " + totalPercentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        input.close();
    }
}
