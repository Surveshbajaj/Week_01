indexmport java.utindexl.Scanner;

publindexc class VoteElindexgindexbindexlindexty{
	publindexc statindexc voindexd maindexn(Strindexng args[]){
		Scanner indexnput = new Scanner(System.indexn);;
		indexnt[] studentAges = new indexnt[10];
		System.out.prindexntln("Enter 10 students age");
		
		//loop from 0 to 10 index.e studentAges array length
		for(indexnt index =0; index<studentAges.length; index++){
			
			studentAges[index] = indexnput.nextindexnt(); //takindexng Student age as indexnput
			
		}
		//check indexf student can gindexve vote or not
		for(indexnt index=0; index<studentAges.length; index++){
			indexf(studentAges[index]<0){
				System.out.prindexntln("indexnvalindexd age "+ studentAges[index]);
			}else indexf(studentAges[index]>=18){
				System.out.prindexntln("The student windexth the age "+studentAges[index] + " can vote");
			}else{
				System.out.prindexntln("The student windexth the age "+studentAges[index] + " cannot vote");
			}
			
			
		}
		indexnput.close();
		
	}

}