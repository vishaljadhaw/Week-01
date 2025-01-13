import java.util.Random;

public class EmployeeBonusCalculator {

    // Method to generate random salaries and years of service
    public static int[][] generateEmployeeData(int numberOfEmployees) {
        Random random = new Random();
        int[][] employeeData = new int[numberOfEmployees][2];

        for (int i = 0; i < numberOfEmployees; i++) {
            employeeData[i][0] = 30000 + random.nextInt(70001); // Random salary between 30000 and 100000
            employeeData[i][1] = random.nextInt(11); // Random years of service between 0 and 10
        }
        return employeeData;
    }

    // Method to calculate new salary and bonus
    public static double[][] calculateNewSalaryAndBonus(int[][] employeeData) {
        double[][] updatedData = new double[employeeData.length][3];

        for (int i = 0; i < employeeData.length; i++) {
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double bonusPercentage = (yearsOfService > 5) ? 0.05 : 0.02;
            double bonus = oldSalary * bonusPercentage;
            double newSalary = oldSalary + bonus;

            updatedData[i][0] = oldSalary;
            updatedData[i][1] = bonus;
            updatedData[i][2] = newSalary;
        }
        return updatedData;
    }

    // Method to calculate totals and display the data
    public static void displayResults(int[][] employeeData, double[][] updatedData) {
        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;

        System.out.println("Emp ID  Old Salary  Years of Service  Bonus       New Salary");
        System.out.println("-----------------------------------------------------------");

        for (int i = 0; i < employeeData.length; i++) {
            int empId = i + 1;
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double bonus = updatedData[i][1];
            double newSalary = updatedData[i][2];

            System.out.println(empId + "       " + oldSalary + "        " + yearsOfService + "                " + 
                               String.format("%.2f", bonus) + "        " + String.format("%.2f", newSalary));

            totalOldSalary += oldSalary;
            totalBonus += bonus;
            totalNewSalary += newSalary;
        }

        System.out.println("-----------------------------------------------------------");
        System.out.println("TOTAL   " + totalOldSalary + "                " + 
                           String.format("%.2f", totalBonus) + "        " + String.format("%.2f", totalNewSalary));
    }

    public static void main(String[] args) {
        int numberOfEmployees = 10;

        // Step 1: Generate random salary and years of service for employees
        int[][] employeeData = generateEmployeeData(numberOfEmployees);

        // Step 2: Calculate new salary and bonus
        double[][] updatedData = calculateNewSalaryAndBonus(employeeData);

        // Step 3: Display results
        displayResults(employeeData, updatedData);
    }
}
