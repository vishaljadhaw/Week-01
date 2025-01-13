import java.util.Scanner;

public class Temperature {

    // Method to calculate the wind chill
    public double calculateWindChill(double temperature, double windSpeed) {
        // Formula to calculate wind chill
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for temperature and wind speed
        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = input.nextDouble();

        System.out.print("Enter the wind speed in mph: ");
        double windSpeed = input.nextDouble();

        // Create an instance of the Temperature class
        Temperature tempCalculator = new Temperature();

        // Calculate the wind chill
        double windChill = tempCalculator.calculateWindChill(temperature, windSpeed);

        // Display the result
        System.out.println("Wind Chill: " + windChill);

       
    }
}
