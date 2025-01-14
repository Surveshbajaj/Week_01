import java.util.Scanner;
public class UnitConvertorKm {
	
	 // Method to convert kilometers to miles
  public static double convertKmToMiles(double km) {
    double km2miles = 0.621371 * km;
    return km2miles;
  }

  // Method to convert miles to kilometers
  public static double convertMilesToKm(double miles) {
    double miles2km = 1.60934 * miles;
    return miles2km;
  }

  // Method to convert feet to meters
  public static double convertFeetToMeters(double feet) {
    double feet2meters = 0.3048 * feet;
    return feet2meters;
  }

  // Method to convert meters to feet
  public static double convertMetersToFeet(double meters) {
    double meters2feet = 3.28084 * meters;
    return meters2feet;
  }

 public static void main(String args[]){
 
  
     // Example of the UnitConverter methods
        double km = 10.0;
        double miles = convertKmToMiles(km);
        System.out.println(km + " kilometers is equal to " + miles + " miles.");

        double milesInput = 10.0;
        double kmConverted = convertMilesToKm(milesInput);
        System.out.println(milesInput + " miles is equal to " + kmConverted + " kilometers.");

        double meters = 10.0;
        double feet = convertMetersToFeet(meters);
        System.out.println(meters + " meters is equal to " + feet + " feet.");

        double feetInput = 10.0;
        double metersConverted = convertFeetToMeters(feetInput);
        System.out.println(feetInput + " feet is equal to " + metersConverted + " meters.");
		
   
   
	}
}