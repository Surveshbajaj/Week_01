import java.util.Scanner;

public class FindVowelsConsonant{
	
	//method to find length of the string
	public static String convertToLowerCaseUsingAscii(char ch) {
        
            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                // Converting it to lowercase by adjusting the ASCII value
                ch = (char) (ch + 32);
            }
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'i' || ch == 'o'){
				return "Vowel";
			}else if (ch >= 98 && ch <=122){
				return "Consonant";
			}
				
		return "Not a Letter";	
     
      
    }
	
	public static int[] countVowelAndCon(String str) {
        int countVowel =0;
		int countConsonant ==0;
		//int[] array = new int[2];
         for(int i=0; i<str.length(); i++){
			if(str.charAt(i).equals(a) || str.charAt(i).equals(e) || str.charAt(i).equals(i) || str.charAt(i).equals(o) || str.charAt(i).equals(u)){
				countVowel++;
			}else{
				countConsonant++;
			}
		 }
		 return new countVowelCon{countVowel, countConsonant};
     
      
    }


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a String");
		String str = input.next();
		
		int vowelCount = countVowelAndCon[0];
		int conCount = countVowelAndCon[1];
	
		System.out.println("Vowels are "+ vowelCount);
		System.out.println("Vowels are "+ conCount);
		
		input.close();
	
	}
}