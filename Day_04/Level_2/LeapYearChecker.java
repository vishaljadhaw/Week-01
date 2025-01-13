import java.util.Scanner;

public class LeapYearChecker {

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if (year >= 1582) {
            // Check leap year conditions
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        } else {
            // Year is not in the Gregorian calendar range
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take year input from the user
        System.out.print("Enter a year (>= 1582): ");
        int year = scanner.nextInt();

        // Check if the year is valid
        if (year < 1582) {
            System.out.println("The input year is not valid. Gregorian calendar starts from 1582.");
        } else {
            // Determine if the year is a leap year
            if (isLeapYear(year)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }

        scanner.close();
    }
}
