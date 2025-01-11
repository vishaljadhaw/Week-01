public class EarthVolume {
    public static void main(String[] args) {
        
        // Constants
        double radiusKm = 6378;  // Radius of Earth in kilometers
        double pi = Math.PI;     // Value of pi (3.14159...)
        
        // Compute the volume in cubic kilometers using the formula for the volume of a sphere
        double volumeKmCubed = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);

        // Convert cubic kilometers to cubic miles (1 km = 0.621371 miles, so we cube the conversion factor)
        double kmToMilesConversionFactor = 0.621371;
        double volumeMilesCubed = volumeKmCubed * Math.pow(kmToMilesConversionFactor, 3);
        
        // Print the results
        System.out.printf("The volume of earth in cubic kilometers is " + volumeKmCubed+" and cubic miles is "+ volumeMilesCubed);
    }
}
