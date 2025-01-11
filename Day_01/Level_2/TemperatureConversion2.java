import java.util.Scanner;

public class TemperatureConversion2{
    public static void main(String[] args) {
        // Declare a variable to store temperature in Fahrenheit
        double fahrenheit;

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the temperature in Fahrenheit
        System.out.print("Enter the temperature in Fahrenheit: ");
        fahrenheit = input.nextDouble();

        // Convert Fahrenheit to Celsius using the formula: (°F − 32) × 5/9 = °C
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Print the result
        System.out.printf("The"+ fahrenheit+ " Fahrenheit is " + celsius +" Celsius");
    }
}
