import java.util.Scanner;

public class Operation2{
    public static void main(String[] args) {
        // Declare variables a, b, and c
        double a, b, c;

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter values for a, b, and c
        System.out.print("Enter the value of a: ");
        a = input.nextDouble();

        System.out.print("Enter the value of b: ");
       b = input.nextDouble();

        System.out.print("Enter the value of c: ");
        c = input.nextDouble();

        // Perform the given operations
        double result1 = a + b * c;          // Multiplication (*) is evaluated before addition (+)
        double result2 = a * b + c;          // Multiplication (*) is evaluated before addition (+)
       double result3 = c + a / b;          // Division (/) is evaluated before addition (+)
       double result4 = a % b + c;          // Modulus (%) is evaluated before addition (+)

        // Print the results
        System.out.println("The results of Operations are " + result1+ "," + result2 + "," +result3+","+result4);
       
    }
}
																																																									