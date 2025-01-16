// MovieTicket.java
import java.util.Scanner;

public class MovieTicket {
    // Attributes
    private String movieName;
    private String seatNumber;
    private double price;
    private boolean isBooked;

    // Constructor
    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.isBooked = false; // Ticket is not booked initially
    }

    // Method to book a ticket
    public void bookTicket(String seatNumber, double price) {
        if (!isBooked) {
            this.seatNumber = seatNumber;
            this.price = price;
            isBooked = true;
            System.out.println("Ticket booked successfully!");
        } else {
            System.out.println("Ticket is already booked.");
        }
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        if (isBooked) {
            System.out.println("Movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: $" + price);
        } else {
            System.out.println("No ticket has been booked yet.");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a ticket
        System.out.print("Enter the name of the movie: ");
        String movieName = scanner.nextLine();
        MovieTicket ticket = new MovieTicket(movieName);

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Book Ticket");
            System.out.println("2. Display Ticket Details");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter seat number: ");
                scanner.nextLine(); // Consume newline
                String seatNumber = scanner.nextLine();
                System.out.print("Enter ticket price: ");
                double price = scanner.nextDouble();
                ticket.bookTicket(seatNumber, price);
            } else if (choice == 2) {
                ticket.displayTicketDetails();
            } else if (choice == 3) {
                System.out.println("Thank you for using the system!");
                break;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}
