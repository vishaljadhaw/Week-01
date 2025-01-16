class MobilePhone1 {
    // Attributes
    private String brand;
    private String model;
    private double price;

    // Constructor
    public MobilePhone1(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }


   public class MobilePhone
   {
    // Main method to test the class
    public static void main(String[] args) {
        // Create objects of MobilePhone
        MobilePhone1 phone1 = new MobilePhone1("Apple", "iPhone 14", 999.99);
        MobilePhone1 phone2 = new MobilePhone1("Samsung", "Galaxy S23", 799.99);

        // Display details of each phone
        System.out.println("Phone 1 Details:");
        phone1.displayDetails();

        System.out.println("\nPhone 2 Details:");
        phone2.displayDetails();
    }
}
}
