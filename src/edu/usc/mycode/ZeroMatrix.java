package edu.usc.mycode;

public class ZeroMatrix {

	public static void main(String[] args) {
		
		int a[][] = {{1,0,4,5},{1,2,6,7},{5,6,1,0}};
		
		System.out.println("Input:");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		int row[] = new int[a.length];
		int col[] = new int[a[0].length];
		
		for(int i=0;i<a.length;i++)
			for(int j=0;j<a[0].length;j++){
				if(a[i][j] == 0){
					row[i] = 1;
					col[j] = 1;
				}
			}
		
		for(int i=0; i<row.length; i++){
			if(row[i] == 1){
				for(int k=0; k<a[0].length;k++){
					a[i][k] = 0;
				}
			}
		}
		
		for(int i=0; i<col.length; i++){
			if(col[i] == 1){
				for(int k=0; k<a.length;k++){
					a[k][i] = 0;
				}
			}
		}
		
		System.out.println("Output:");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
