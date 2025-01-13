import java.util.Scanner;

public class NumberChecker3 {

    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find the greatest factor of a number using the factors array
    public static int findGreatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }

    // Method to find the sum of the factors using the factors array
    public static int sumFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors using the factors array
    public static int productFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cube of the factors using the factors array
    public static double productOfCubes(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int[] factors = findFactors(number);
        int sumOfFactors = sumFactors(factors) - number; // exclude the number itself
        return sumOfFactors == number;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int[] factors = findFactors(number);
        int sumOfFactors = sumFactors(factors) - number; // exclude the number itself
        return sumOfFactors > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int[] factors = findFactors(number);
        int sumOfFactors = sumFactors(factors) - number; // exclude the number itself
        return sumOfFactors < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int temp = number;
        int sumOfFactorials = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sumOfFactorials += factorial(digit);
            temp /= 10;
        }
        return sumOfFactorials == number;
    }

    // Helper method to calculate factorial of a number
    private static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Find factors of the number
        int[] factors = findFactors(number);
        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Find and display the greatest factor
        System.out.println("Greatest factor: " + findGreatestFactor(factors));

        // Find and display the sum of the factors
        System.out.println("Sum of factors: " + sumFactors(factors));

        // Find and display the product of the factors
        System.out.println("Product of factors: " + productFactors(factors));

        // Find and display the product of the cubes of the factors
        System.out.println("Product of cubes of factors: " + productOfCubes(factors));

        // Check if the number is perfect
        System.out.println("Is Perfect Number: " + isPerfectNumber(number));

        // Check if the number is abundant
        System.out.println("Is Abundant Number: " + isAbundantNumber(number));

        // Check if the number is deficient
        System.out.println("Is Deficient Number: " + isDeficientNumber(number));

        // Check if the number is strong
        System.out.println("Is Strong Number: " + isStrongNumber(number));

        scanner.close();
    }
}
