import java.util.Scanner;

	

public class SplitString{
	public static String sptilStringCustom(String str){
		 StringBuilder word = new StringBuilder();
		 StringBuilder result = new StringBuilder();
		for(int i=0; i<str.length(); i++){
		char ch = str.charAt(i);
			if(ch == " "){
				
			}else{
			word.append(ch);
			}
			result.append(wordBuilder.toString());
            wordBuilder.setLength(0);
			
		}
		   String[] words = result.toString();
        return words;
	}
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		
		String[] word = sptilStringCustom(str);
		input.close();
		
	}

}