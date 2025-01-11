import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define an array of 10 integer elements to store the ages
        int[] ages = new int[10];

        // Take user input for the ages of the students
        System.out.println("Enter the ages of 10 students:");

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Student " + (i + 1) + " age: ");
            ages[i] = input.nextInt();
        }

        // Check voting eligibility for each student
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                System.out.println("Student " + (i + 1) + " has an invalid age: " + ages[i]);
            } else if (ages[i] >= 18) {
                System.out.println("Student " + (i + 1) + " with the age " + ages[i] + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " with the age " + ages[i] + " cannot vote.");
            }
        }

        input.close();
    }
}
