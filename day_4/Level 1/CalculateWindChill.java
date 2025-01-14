import java.util.Scanner;

public class CalculateWindChill{
	//method for calculateWindChill
	public double calculateWindChill(double temperature, double windSpeed){
		//calculating windChill using formula
		double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed,0.16); 
		
		return windChill; // return windChill
	
	}
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a temperature ");
		double temperature = input.nextInt(); //taking a temperature as input 
		
		System.out.println("Enter a windSpeed ");
		double windSpeed = input.nextInt(); //taking a windSpeed as input

		CalculateWindChill obj = new CalculateWindChill;
		
		//storing result of method(calculateWindChill) in resultCalculateWindChill
		double resultCalculateWindChill = obj.calculateWindChill(temperature, windSpeed);
		System.out.println("windChill is: "+ resultCalculateWindChill);

		input.close();
		}

}