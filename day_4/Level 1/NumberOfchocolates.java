import java.util.Scanner;

public class NumberOfchocolates{
	//method to check is season sprint or not
	public int[] findRemainderAndQuotient(int number, int divisor){
		//creating array
		int[] result = new int[2];
		int numberOfChocolatesStudentGet = number/divisor; // calculating number of chocolates each student gets
		int remaingChocolate = number%divisor; // calculating reaming chocolates
		
		result[0] = numberOfChocolatesStudentGet; //chocolates each child gets
		result[1] = remaingChocolate; // remaing chocolates
		
		return result;
		
	
	}
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number of chocolates ");
		int numberOfchocolates  = input.nextInt(); //taking a number of chocolates as input 
		
		System.out.println("Enter a number children ");
		int numberOfChildren  = input.nextInt(); //taking a number of children as input 
		
		NumberOfchocolates obj = new NumberOfchocolates();
		
		//store result of method(findRemainderAndQuotient) in result
		int[] result = obj.findRemainderAndQuotient(numberOfchocolates, numberOfChildren);
            System.out.println("Each child gets " + result[0] + " chocolates and Remaining chocolates: " + result[1]);
            
		
		input.close();
		}

}