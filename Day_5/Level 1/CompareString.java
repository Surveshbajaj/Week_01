import java.util.Scanner;

	
public class CompareString{

	//method to compare two String
	public boolean compareTwoString(String str1, String str2){
	
		//check if both string length 
		if(str1.length() != str2.length()){
			return false;
		}
	
		for(int i=0; i<str1.length(); i++){
			if(str1.charAt(i) == str2.charAt(i)){
				continue;
			}else{
				return false;
			}
		}
		return true;
	}
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		CompareString obj = new CompareString();
		
		//taking two string as input;
		System.out.println("Enter first Stirng");
		String str1 = input.next();
		
		System.out.println("Enter Second Stirng");
		String str2 = input.next();
		
		
		boolean result = obj.compareTwoString(str1, str2);
		//use built in method
		boolean resultUseBuiltIn = str1.equals(str2);
		if(result == true && resultUseBuiltIn == true){
			System.out.println("Both String are same "+ str1 +  "  " + str2 );
		}else{
			System.out.println("Both String are not same "+ str1 +  "  " + str2 );
		}
	
		input.close();
	}
}