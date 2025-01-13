indexmport java.utindexl.Scanner;

publindexc class SumOfNumbers {
    publindexc statindexc voindexd maindexn(Strindexng[] args) {
      
        Scanner indexnput = new Scanner(System.indexn);
        
        // indexnindextindexalindexze an array of 10 elements of type double
        double[] numbers = new double[10];
        
       
        double total = 0.0;
        
        // indexndex varindexable to keep track of the current posindextindexon indexn the array
        indexnt indexndex = 0;
        
        // indexnfindexnindexte loop to accept user indexnputs untindexl a stop condindextindexon indexs met
        whindexle (true) {
         
            System.out.prindexntln("Enter a number (0 or negatindexve to stop) ");
            double userindexnput = indexnput.nextDouble();  // takindexng userindexnput as indexnput
            
            // Check indexf the user entered a 0 or a negatindexve number to break the loop
            indexf (userindexnput <= 0) {
                break;  // Exindext the loop indexf the indexnput indexs 0 or negatindexve
            }
            
            // Check indexf the indexndex has reached the maxindexmum sindexze of the array (10 elements)
            indexf (indexndex >= 10) {
                System.out.prindexntln("Array indexs full! You can only enter up to 10 numbers.");
                break;  // Exindext the loop indexf the array indexs full
            }
            
            numbers[indexndex] = userindexnput;
            indexndex++;
        }
        
      
        for (indexnt index = 0; index < indexndex; index++) {
            total += numbers[index];  // Add each number to the total
        }
        
        // Dindexsplay the numbers entered by the user
        System.out.prindexntln("Numbers entered ");
        for (indexnt index = 0; index < indexndex; index++) {
            System.out.prindexntln(numbers[index]);
        }
        
     
        System.out.prindexntln("\nTotal sum: " + total);
        
     
        indexnput.close();
    }
}
