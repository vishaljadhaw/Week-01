// CartItem.java
import java.util.*;

public class CartItem {
    // Attributes
    private String itemName;
    private double price;
    private int quantity;

    // Constructor to initialize the item
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to get the total cost of the item
    public double getTotalCost() {
        return price * quantity;
    }

    // Method to update quantity of an item
    public void updateQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }

    // Method to display item details
    public void displayItem() {
        System.out.println(itemName + " | Price: $" + price + " | Quantity: " + quantity + " | Total: $" + getTotalCost());
    }

    // Main method to simulate the shopping cart
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<CartItem> cart = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Shopping Cart Menu ---");
            System.out.println("1. Add Item to Cart");
            System.out.println("2. Remove Item from Cart");
            System.out.println("3. Display Total Cost");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                // Add item
                System.out.print("Enter item name: ");
                String itemName = scanner.nextLine();
                System.out.print("Enter price of the item: ");
                double price = scanner.nextDouble();
                System.out.print("Enter quantity: ");
                int quantity = scanner.nextInt();
                cart.add(new CartItem(itemName, price, quantity));
                System.out.println(itemName + " added to the cart.");
            } else if (choice == 2) {
                // Remove item
                System.out.print("Enter item name to remove: ");
                String removeItemName = scanner.nextLine();
                boolean found = false;
                for (CartItem item : cart) {
                    if (item.itemName.equalsIgnoreCase(removeItemName)) {
                        cart.remove(item);
                        System.out.println(removeItemName + " removed from the cart.");
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Item not found in the cart.");
                }
            } else if (choice == 3) {
                // Display total cost
                double totalCost = 0;
                System.out.println("\n--- Cart Items ---");
                for (CartItem item : cart) {
                    item.displayItem();
                    totalCost += item.getTotalCost();
                }
                System.out.println("\nTotal Cost: $" + totalCost);
            } else if (choice == 4) {
                System.out.println("Thank you for shopping!");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
