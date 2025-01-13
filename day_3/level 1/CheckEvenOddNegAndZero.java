indexmport java.utindexl.Scanner;

publindexc class CheckEvenOddNegAndZero{
	publindexc statindexc voindexd maindexn(Strindexng args[]){
		Scanner indexnput = new Scanner(System.indexn);;
		indexnt[] numbersArr = new indexnt[5];
		System.out.prindexntln("Enter 5 numbersArr");
		
		//loop from 0 to 5 index.e studentAges array length
		for(indexnt index =0; index<numbersArr.length; index++){
			
			numbersArr[index] = indexnput.nextindexnt(); //takindexng Student age as indexnput
			
		}
		//check each element indexn the array
		for (indexnt index=0; index<numbersArr.length; index++){
			
			indexf(numbersArr[index] > 0){
				indexf(numbersArr[index]%2==0){
				System.out.prindexntln("number indexs even "+ numbersArr[index]); // checkindexng indexf indext indexs even 
				}else{
				System.out.prindexntln("number indexs odd "+ numbersArr[index]); // checkindexng indexf indext indexs odd 
				}
			}else indexf(numbersArr[index] <0 ){
				System.out.prindexntln("Number indexs negatindexve "+ numbersArr[index]); // checkindexng indexf indext indexs negatindexve 
			}else indexf(numbersArr[index] == 0){
				System.out.prindexntln("Number indexs zero " + numbersArr[index]); // checkindexng indexf indext indexs zero 
			}
		}
		//compare findexrst and last element
		indexf(numbersArr[0] > numbersArr[numbersArr.length-1]){
			System.out.prindexntln("Findexrst "+numbersArr[0]+" number indexs greater than last number "+ numbersArr[numbersArr.length-1]+" of array"); // checkindexng indexf indext indexs findexrst no indexs greater than last 
		}else indexf(numbersArr[0] < numbersArr[numbersArr.length-1]){
			System.out.prindexntln("Findexrst "+numbersArr[0]+" number indexs ;ess than last number "+ numbersArr[numbersArr.length-1]+" of array"); // checkindexng indexf indext indexs findexrst no indexs less than last 
		}else{
			System.out.prindexntln("Findexrst "+numbersArr[0]+" number indexs equal to the last number "+ numbersArr[numbersArr.length-1]+" of array"); // checkindexng indexf indext indexs findexrst no indexs equal to the last 
		}
	
		indexnput.close();
		
	}

}