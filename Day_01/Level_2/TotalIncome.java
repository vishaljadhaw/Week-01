import java.util.Scanner;

public class TotalIncome {
    public static void main(String[] args) {
        // Declare variables for salary, bonus, and total income
        double salary, bonus, totalIncome;

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter salary
        System.out.print("Enter the salary (INR): ");
        salary = input.nextDouble();

        // Prompt the user to enter bonus
        System.out.print("Enter the bonus (INR): ");
        bonus = input.nextDouble();

        // Calculate total income
        totalIncome = salary + bonus;

        // Print the results
        System.out.printf("The salary is INR "+ salary +" and bonus is INR " +bonus+" Hence Total Income is INR " + totalIncome); 
                        
}
}
