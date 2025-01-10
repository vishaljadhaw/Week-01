import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        // Declare a variable to store temperature in Celsius
        double celsius;

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the temperature in Celsius
        System.out.print("Enter the temperature in Celsius: ");
        celsius = input.nextDouble();

        // Convert Celsius to Fahrenheit using the formula: (°C × 9/5) + 32 = °F
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Print the result
        System.out.printf("The " +  celsius + " celsius is "+ fahrenheit+ " fahrenheit ");
    }
}
