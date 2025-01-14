import java.util.Scanner;
public class Trignometry{
  public double[] calculateTrigonometricFunctions(double angle){
	  
	double[] trigonometricArray = new double[3]; //creating array
    double angelInRadian = Math.toRadians(angle); //converting angle to radius
    trigonometricArray[0] = Math.sin(angelInRadian); //convert sin
    trigonometricArray[1] = Math.cos(angelInRadian); //convert cos
    trigonometricArray[2] = Math.tan(angelInRadian); //convert tan
   
   
   
   return trigonometricArray; // return trigonometricArray
   
  }
 public static void main(String args[]){
  Scanner input = new Scanner(System.in);
   System.out.println("Enter the Angele in degree");
   double angle = input.nextDouble();
   
   Trignometry obj = new Trignometry;
   //storing result of method(calculateTrigonometricFunctions) in result
   double[] resultCalculateTrigonometricFunctions = obj.calculateTrigonometricFunctions(angle);
   
   System.out.println("Sine " + resultCalculateTrigonometricFunctions[0] + " cosine "+ resultCalculateTrigonometricFunctions[1] + " tangent "+ resultCalculateTrigonometricFunctions[2]);
   input.close();
   
	}
}