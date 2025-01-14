import java.util.Scanner;
 
	public class FindYoungestTallest{
		
		// method for finding youngest
        public int findYoungest(int[] age){
			int youngest = Integer.MAX_VALUE; 
			int i;
			int index = -1;
			for( i=0; i<age.length; i++){
				if(youngest > age[i]){
					youngest = age[i];
					index =i;
				}
			}
			return index;
		}
		
		//method for finding tallest
		public int findTallest(int[] height){
			int tallest = Integer.MIN_VALUE; 
			int i;
			int index = -1;
			for( i=0; i<height.length; i++){
				if(tallest < height[i]){
					tallest = height[i];
					index = i;
				}
			}
			return index;
		}
 
		public static void main(String args[]){
			Scanner input = new Scanner(System.in);
		
			int[] age = new int[3];
			int[] height = new int[3];
			
			//create string array of names
			String[] name = {"Amar", "Akbar", "Anthony"};
			
			//input loop for age and height of each friend
			for(int i=0; i<3; i++){
				System.out.println("Enter age of "+ name[i]);
				 age[i] = input.nextInt();
				
				System.out.println("Enter height of "+ name[i]);
				 height[i] = input.nextInt();
			}
			FindYoungestTallest obj = new FindYoungestTallest();
			int youngest = obj.findYoungest(age);
			int tallest = obj.findTallest(height);
			
			System.out.println("Youngest friend "+ name[youngest] + " and tallest friend is "+ name[tallest] );
			
			
			input.close();
	}
}