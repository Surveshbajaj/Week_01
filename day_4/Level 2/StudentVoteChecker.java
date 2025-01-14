import java.util.Scanner;
public  class StudentVoteChecker {
	public boolean canStudentVote(int age){
		//check if age valid or not
		if(age <18){
			return false;
		}else{
			return true;
		}
	}
  
 public static void main(String args[]){
  Scanner input = new Scanner(System.in);

   
   int[] studentAgeArray = new int[10];
   for(int i=0; i<10; i++){
		System.out.println("Enter age of student "+ (i+1) );
		int studentAge = input.nextInt(); //taking student as input
		studentAgeArray[i] = studentAge;

   }
    
    StudentVoteChecker obj = new StudentVoteChecker();
    for (int i = 0; i < 10; i++) {
            int age = studentAgeArray[i];
            boolean canVote = obj.canStudentVote(age); // Call the method to check eligibility
            
            if (canVote) {
                System.out.println("Student " + (i + 1) + " with age " + age + " can vote ");
            } else {
                System.out.println("Student " + (i + 1) + " with age " + age + " cannot vote ");
            }
        }
   

   input.close();
   
	}
}