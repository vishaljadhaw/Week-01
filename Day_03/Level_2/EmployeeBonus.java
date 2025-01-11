import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define arrays to save salary, years of service, bonus amount, and new salary
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];

        // Define variables to save the total bonus, total old salary, and total new salary
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // Take input from the user for each employee's salary and years of service
        for (int i = 0; i < 10; i++) {
            while (true) {
                System.out.print("Enter the salary of employee " + (i + 1) + ": ");
                salaries[i] = input.nextDouble();
                System.out.print("Enter the years of service of employee " + (i + 1) + ": ");
                yearsOfService[i] = input.nextDouble();

                // Check for invalid input
                if (salaries[i] <= 0 || yearsOfService[i] < 0) {
                    System.out.println("Invalid input. Please enter valid salary and years of service.");
                } else {
                    break;
                }
            }
        }

        // Calculate the bonus, new salary, total bonus, total old salary, and total new salary
        for (int i = 0; i < 10; i++) {
            double bonusPercentage = yearsOfService[i] > 5 ? 0.05 : 0.02;
            bonuses[i] = salaries[i] * bonusPercentage;
            newSalaries[i] = salaries[i] + bonuses[i];

            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Print the total bonus payout, total old salary, and total new salary
        System.out.println("\nTotal bonus payout: " + totalBonus);
        System.out.println("Total old salary: " + totalOldSalary);
        System.out.println("Total new salary: " + totalNewSalary);

        // Print the old and new salary for each employee
        for (int i = 0; i < 10; i++) {
            System.out.println("\nEmployee " + (i + 1) + ":");
            System.out.println("Old Salary: " + salaries[i]);
            System.out.println("New Salary: " + newSalaries[i]);
        }

        input.close();
    }
}
