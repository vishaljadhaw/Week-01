import java.util.Scanner;

public class Voting{
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Input: age
        System.out.print("Enter the age: ");
        int age = scanner.nextInt();

        // Check if the person can vote
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

       
    }
}
