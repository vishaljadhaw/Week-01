import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their salary
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        // Prompt the user to enter their years of service
        System.out.print("Enter your years of service: ");
        int yearsOfService = scanner.nextInt();

        // Check if the years of service is more than 5
        if (yearsOfService > 5) {
            // Calculate the bonus as 5% of the salary
            double bonus = salary * 0.05;
            System.out.println("Congratulations! Your bonus is: " + bonus);
        } else {
            System.out.println("Sorry, you are not eligible for a bonus.");
        }

        // Close the scanner
        scanner.close();
    }
}
