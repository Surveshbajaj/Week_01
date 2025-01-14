public class UnitConverterYards {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3 * yards;  // Conversion factor: 1 yard = 3 feet
        return yards2feet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333 * feet;  // Conversion factor: 1 foot = 1/3 yard
        return feet2yards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701 * meters;  // Conversion factor: 1 meter = 39.3701 inches
        return meters2inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254 * inches;  // Conversion factor: 1 inch = 0.0254 meters
        return inches2meters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54 * inches;  // Conversion factor: 1 inch = 2.54 centimeters
        return inches2cm;
    }

    public static void main(String[] args) {
        // Example usage of the UnitConverter methods
        double yards = 10.0;
        double feetFromYards = convertYardsToFeet(yards);
        System.out.println(yards + " yards is equal to " + feetFromYards + " feet.");

        double feet = 10.0;
        double yardsFromFeet = convertFeetToYards(feet);
        System.out.println(feet + " feet is equal to " + yardsFromFeet + " yards.");

        double meters = 10.0;
        double inchesFromMeters = convertMetersToInches(meters);
        System.out.println(meters + " meters is equal to " + inchesFromMeters + " inches.");

        double inches = 10.0;
        double metersFromInches = convertInchesToMeters(inches);
        System.out.println(inches + " inches is equal to " + metersFromInches + " meters.");

        double inchesForCm =10.0;
        double centimeters = convertInchesToCentimeters(inchesForCm);
        System.out.println(inchesForCm + " inches is equal to " + centimeters + " centimeters.");
    }
}