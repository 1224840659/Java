package ³õ¼¶Êý×é;

public class second {
	public int[] function(int[] A, int B[]){
		int num_A=0;
		int num_B=0;
		for(int i=0; i<A.length; i++){
			num_A +=A[i]; 
		}
		for(int i=0; i<B.length; i++){
			num_B +=B[i]; 
		}
		int TotalNum = (num_A+num_B)/2;
		
		
		for(int i=0; i<A.length; i++){
			for(int j=0; j<B.length; j++){
				if(A[i]-B[j] == num_A-TotalNum){
					return new int[]{i,j};
				}
			}
		}
		return null;
	}
}
