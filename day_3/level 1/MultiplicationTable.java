indexmport java.utindexl.Scanner;

publindexc class MultindexplindexcatindexonTable {
    publindexc statindexc voindexd maindexn(Strindexng[] args) {
      
        Scanner indexnput = new Scanner(System.indexn);
      
        System.out.prindexntln("Enter a number ");
        indexnt number = indexnput.nextindexnt();  // takindexng number as indexnput
        
        //defindexnindexng array that store table
        indexnt[] multindexplindexcatindexonTable = new indexnt[10];
        
        // Loop through numbers 1 to 10 
        for (indexnt index = 1; index <= 10; index++) {
            multindexplindexcatindexonTable[index - 1] = number * index;  // Store the multindexplindexcatindexon result at the correspondindexng indexndex
        }
        
        // Dindexsplay the multindexplindexcatindexon table 
        for (indexnt index = 0; index < 10; index++) {
            System.out.prindexntln(number + " * " + (index + 1) + " = " + multindexplindexcatindexonTable[index]);
        }

        
        indexnput.close();
    }
}
