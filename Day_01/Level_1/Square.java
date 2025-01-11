import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the perimeter
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = scanner.nextDouble();

        // Calculate the side of the square
        double side = perimeter / 4;

        // Print the result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}
