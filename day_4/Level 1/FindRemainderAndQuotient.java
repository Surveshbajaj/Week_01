import java.util.Scanner;

public class FindRemainderAndQuotient{
	//method to check is season sprint or not
	public int[] findRemainderAndQuotient(int number, int divisor){
	
	//creating array that store remainder and quotient
	 int[] remainderQuotientArray = new int[2];
	 
	 int quotient = number/divisor; //calculating quotient
	 int remainder = number%divisor; //calculating remainder
	 
	 remainderQuotientArray[0] = quotient; //storing quotient
	 remainderQuotientArray[1] = remainder; //storing remainder
	 
	 return remainderQuotientArray;
		
	}
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number ");
		int number = input.nextInt(); //taking a number as input 
		
		System.out.println("Enter a divisor ");
		int divisor = input.nextInt(); //taking a number as input
		
		FindRemainderAndQuotient obj = new FindRemainderAndQuotient();
		
		//store result of method (findRemainderAndQuotient) in resultfindRemainderAndQuotient
		int[] resultfindRemainderAndQuotient = obj.findRemainderAndQuotient(number, divisor); 
		System.out.print("the quotient of the "+number +" is "+ resultfindRemainderAndQuotient[0] + " and remainder of the "+ number + " is "+ resultfindRemainderAndQuotient[1]);

		input.close();
		}

}