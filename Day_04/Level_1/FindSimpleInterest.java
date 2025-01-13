import java.util.Scanner; // Importing the Scanner class for user input

// Class to calculate and find Simple Interest
public class FindSimpleInterest {
    
    // Method to calculate simple interest
    void simpleInterest(int principle, int rate, int time) {
        // Formula for simple interest: (P × R × T) / 100
        int simpleinterest = (principle * rate * time) / 100;
        // Printing the calculated simple interest
        System.out.println("The Simple Interest is " + simpleinterest + 
                           " for Principal " + principle + 
                           ", Rate of Interest " + rate + 
                           " and Time " + time);
    }
    
    // Main method to execute the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating Scanner object for input
        
        // Get the inputs of principal, rate, time 
        System.out.println("Enter the principal: ");
        int principle = sc.nextInt(); // Reading the principal amount
        
        System.out.println("Enter the rate: ");
        int rate = sc.nextInt(); // Reading the rate of interest
        
        System.out.println("Enter the time: ");
        int time = sc.nextInt(); // Reading the time period
        
        // Creating an object of FindSimpleInterest class
        FindSimpleInterest findSimpleInterest = new FindSimpleInterest();
        
        // Calling the simpleInterest method to calculate simple interest
        findSimpleInterest.simpleInterest(principle, rate, time);
    }
}
