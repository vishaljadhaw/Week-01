import java.util.Scanner;

public class TotalPriceCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the unit price of the item (INR): ");
        double unitPrice = scanner.nextDouble();

        
        System.out.print("Enter the quantity to be bought: ");
        int quantity = scanner.nextInt();

        // Calculate the total price by multiplying unit price and quantity
        double totalPrice = unitPrice * quantity;

        // Print the result
        System.out.printf("The total purchase price is INR " + totalPrice+ " if the quantity " +quantity+" and unit price is INR" +unitPrice); 
                          
    }
}
