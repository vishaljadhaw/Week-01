import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Input: number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check divisibility by 5
        if (number % 5 == 0) {
            System.out.println("Is the number " + number + " divisible by 5? Yes");
        } else {
            System.out.println("Is the number " + number + " divisible by 5? No");
        }

       
    }
}
