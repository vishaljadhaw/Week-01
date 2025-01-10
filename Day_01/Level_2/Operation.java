import java.util.Scanner;

public class Operation{
    public static void main(String[] args) {
        // Declare variables a, b, and c
        int a, b, c;

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter values for a, b, and c
        System.out.print("Enter the value of a: ");
        a = input.nextInt();

        System.out.print("Enter the value of b: ");
        b = input.nextInt();

        System.out.print("Enter the value of c: ");
        c = input.nextInt();

        // Perform the given operations
        int result1 = a + b * c;          // Multiplication (*) is evaluated before addition (+)
        int result2 = a * b + c;          // Multiplication (*) is evaluated before addition (+)
        int result3 = c + a / b;          // Division (/) is evaluated before addition (+)
        int result4 = a % b + c;          // Modulus (%) is evaluated before addition (+)

        // Print the results
        System.out.println("The results of Operations are " + result1+ "," + result2 + "," +result3+","+result4);
       
    }
}
																																																									