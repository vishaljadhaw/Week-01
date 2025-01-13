import java.util.HashSet;

public class OTPGenerator {

    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        return 100000 + (int) (Math.random() * 900000); // Ensures a 6-digit number
    }

    // Method to ensure all OTPs in an array are unique
    public static boolean areOTPsUnique(int[] otps) {
        HashSet<Integer> uniqueOTPs = new HashSet<>();
        for (int i = 0; i < otps.length; i++) {
            if (uniqueOTPs.contains(otps[i])) { // If OTP already exists, return false
                return false;
            }
            uniqueOTPs.add(otps[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];

        // Generate 10 OTPs
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        // Display generated OTPs
        System.out.println("Generated OTPs:");
        for (int i = 0; i < otps.length; i++) {
            System.out.println(otps[i]);
        }

        // Check if all OTPs are unique
        boolean unique = areOTPsUnique(otps);
        System.out.println("\nAre all OTPs unique? " + unique);
    }
}
