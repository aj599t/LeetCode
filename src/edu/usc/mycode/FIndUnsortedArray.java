package edu.usc.mycode;

public class FIndUnsortedArray {

	public static void main(String[] args) {
		int A[] = {1, 2, 6, 5, 5, 8, 9};
		FIndUnsortedArray f = new FIndUnsortedArray();
		System.out.println(f.solution(A));
		
	
	}
	public  int solution(int[] A) {		
		
		if(A.length == 0)
			return 0;
		int i=0, j=0;
		for(i=0;i<A.length-1;i++){
			if(A[i]>A[i+1])
				break;
		}
		
		for(j=A.length-1;j>0;j--){
			if(A[j]<A[j-1])
				break;
		}
		System.out.println(i+" "+j);
		int min = i+1, max= j-1;
		for(int k=i-1; k>=0; k--){
			if(A[k]<A[min]){
				
				System.out.println("k: "+A[k]+" min "+A[min]);
				min = k;
				break;			
			}

		}
		
		for(int k=j+1; k<A.length; k++){
			if(A[k]>A[max]){
				max = k;
				break;
			}
		}
		
		System.out.println(min +" "+max);
		
		System.out.println(max-min-1);
		
		return max-min-1;

	}

}
