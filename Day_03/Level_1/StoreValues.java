import java.util.Scanner;

public class StoreValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define an array of 10 elements of type double
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // Use infinite while loop
        while (true) {
            // Take user entry
            System.out.print("Enter a number: ");
            double number = input.nextDouble();

            // Check if the user entered 0 or a negative number to break the loop
            if (number <= 0) {
                break;
            }

            // Check if the index has reached the limit of the array size
            if (index == 10) {
                break;
            }

            // Assign the number to the array element and increment the index value
            numbers[index] = number;
            index++;
        }

        // Display all the numbers and calculate the total
        System.out.println("The numbers entered are:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        // Display the total value
        System.out.println("The sum of all numbers is: " + total);

        input.close();
  
  }
  }