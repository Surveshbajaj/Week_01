import java.util.Scanner;
public class SumNaturalNumber{
  public static int sumNaturalNumberRec(int number){
	if(number <= 1){
		return number;
	}
	return number+ sumNaturalNumberRec(number-1);
  }
   public static int sumNaturalNumberLoop(int number){
   int sum =0;
	sum = number*(number+1)/2;
	return sum;
   }
  
 public static void main(String args[]){
  Scanner input = new Scanner(System.in);
  
   System.out.println("Enter a number");
   int number = input.nextInt();
   
   if(number <= 0){
		return;
   }
   int resutlRec = sumNaturalNumberRec(number);
   int resutlLoop = sumNaturalNumberLoop(number);
   
   if(resutlRec == resutlLoop){
	 System.out.print("Both are same result of recursion is " + resutlRec+ " and result of loop is"+ resutlLoop );
   }else{
	 System.out.print("Both are not same");
	}
   
   input.close();
   
	}
}