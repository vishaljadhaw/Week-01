import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get input values for the two numbers
        System.out.print("Enter the first number: ");
        double first = input.nextDouble();

        System.out.print("Enter the second number: ");
        double second = input.nextDouble();

        // Get input value for the operator
        System.out.print("Enter an operator (+, -, *, /): ");
        String op = input.next();

        // Perform the calculation based on the operator
        switch (op) {
            case "+":
                System.out.println("Result: " + (first + second));
                break;
            case "-":
                System.out.println("Result: " + (first - second));
                break;
            case "*":
                System.out.println("Result: " + (first * second));
                break;
            case "/":
                // Check for division by zero
                if (second != 0) {
                    System.out.println("Result: " + (first / second));
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }

        input.close();
    }
}
