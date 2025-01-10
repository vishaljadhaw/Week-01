import java.util.Scanner;

public class FindFactor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input: number
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.println("The value of i is " + i);
            }
        }

        input.close();
    }
}
