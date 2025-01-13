import java.util.Scanner;

public class FindFootballTeamMeanHeight {
    public static void main(String[] args) {
    
        double[] heights = new double[11];
        
       
        Scanner input = new Scanner(System.in); 
        
        // Input values from the user
        System.out.println("Enter the heights of 11 football players in centimeters:");
        for (int index = 0; index < heights.length; index++) {
            System.out.print("Player " + (index + 1) + ": ");
            heights[index] = input.nextDouble(); 
        }
        
        // Calculate the sum of all the elements present in the array
        double sum = 0;
        for (double height : heights) {
            sum += height;
        }
        
        // Calculate the mean height
        double mean = sum / heights.length;
        
        
        System.out.printf("The mean height of the football team is: %.2f cm\n", mean);
        
       
        input.close();
    }
}
