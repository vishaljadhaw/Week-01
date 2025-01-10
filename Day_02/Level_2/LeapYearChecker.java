import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input year
        System.out.print("Enter a year (>= 1582): ");
        int year = scanner.nextInt();

        //  Using multiple if-else statements
        if (year < 1582) {
            System.out.println("The program only works for years >= 1582.");
        } else {
            if (year % 4 == 0) {
                // if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year.");
                    } else {
                        System.out.println(year + " is not a Leap Year.");
                    }
                } else {
                    System.out.println(year + " is a Leap Year.");
                }
            } else {
                System.out.println(year + " is not a Leap Year.");
            }

		

        scanner.close();
    }
}

