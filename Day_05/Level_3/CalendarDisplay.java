import java.util.Scanner;

public class CalendarDisplay {

    // Array to store the names of the months
    private static final String[] MONTH_NAMES = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    // Array to store the number of days in each month
    private static final int[] DAYS_IN_MONTH = {
        31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }

    // Method to get the number of days in a given month of a specific year
    public static int getNumberOfDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29; // February in a leap year
        }
        return DAYS_IN_MONTH[month - 1];
    }

    // Method to get the first day of the month using the Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int month, int year) {
        int y = year;
        int m = month;
        int d = 1; // Day is set to the first day of the month

        y -= (14 - m) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        m += 12 * ((14 - m) / 12) - 2;
        return (d + x + (31 * m) / 12) % 7;
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        System.out.println("     " + MONTH_NAMES[month - 1] + " " + year);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDayOfMonth(month, year);
        int daysInMonth = getNumberOfDaysInMonth(month, year);

        // Print initial spaces for the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf(" %3d", day);

            // Move to the next line after Saturday
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println(); // Move to the next line after the calendar
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.println("Enter month (1-12): ");
        int month = scanner.nextInt();

        System.out.println("Enter year: ");
        int year = scanner.nextInt();

        // Validate input
        if (month < 1 || month > 12 || year < 1) {
            System.out.println("Invalid input! Please enter a valid month and year.");
        } else {
            // Display the calendar
            displayCalendar(month, year);
        }

        scanner.close();
    }
}
