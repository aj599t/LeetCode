package edu.usc.mycode;

import java.util.*;

public class StringCompression {

	public static void main(String[] args) {
		System.out.println("Enter a String: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		int a [][] = new int [s.length()][2];
		a[0][0] = s.charAt(0);
		a[0][1] = 1;
		int i = 1, k = 0;
		for(i=1; i <s.length(); i++){
			if(s.charAt(i)!=s.charAt(i-1)){
				char a2 = (char)(a[k][0]);
				System.out.print(a2+""+a[k][1]);
				++k;
				a[k][0] = s.charAt(i);
				a[k][1] = 1;
			}else{
				a[k][1] = a[k][1]+1;
			}
		}
		char a1 = (char)(a[k][0]);
		System.out.print(a1+""+a[k][1]);
		

	}

}
