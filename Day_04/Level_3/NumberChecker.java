
public class NumberChecker {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // Method to store the digits of the number in a digits array
    public static int[] getDigitsArray(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int number) {
        int[] digits = getDigitsArray(number);
        for (int i = 1; i < digits.length; i++) { // Exclude the first digit
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int[] digits = getDigitsArray(number);
        int sum = 0;
        int power = digits.length;
        for (int i = 0; i < digits.length; i++) {
            sum += Math.pow(digits[i], power);
        }
        return sum == number;
    }

    // Method to find the largest and second largest digits
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Method to find the smallest and second smallest digits
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] < smallest) {
                secondSmallest = smallest;
                smallest = digits[i];
            } else if (digits[i] < secondSmallest && digits[i] != smallest) {
                secondSmallest = digits[i];
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        int number = 153; // Example number
        System.out.println("Number: " + number);

        // Count digits
        System.out.println("Count of digits: " + countDigits(number));

        // Get digits array
        int[] digits = getDigitsArray(number);
        System.out.println("Digits: " + java.util.Arrays.toString(digits));

        // Check for duck number
        System.out.println("Is Duck Number: " + isDuckNumber(number));

        // Check for Armstrong number
        System.out.println("Is Armstrong Number: " + isArmstrong(number));

        // Find largest and second largest digits
        int[] largestValues = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largestValues[0]);
        System.out.println("Second largest digit: " + largestValues[1]);

        // Find smallest and second smallest digits
        int[] smallestValues = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: " + smallestValues[0]);
        System.out.println("Second smallest digit: " + smallestValues[1]);
    }
}

