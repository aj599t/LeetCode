package edu.usc.mycode;

import java.util.*;

public class DifferenceInTwoStrings {

	public static void main(String[] args) {
		
		System.out.println("Enter two strings: ");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next().toLowerCase();
		String s2 = sc.next().toLowerCase();
		boolean flag = false;
		
		System.out.println("The two strings ");
		if(Math.abs(s1.length() - s2.length())>1){
			System.out.println("difference is greater than 1");
			return;
		}
		
		
			for(int i=0, j=0;i<s1.length() && j<s2.length(); i++, j++){
				if(s1.charAt(i)!=s2.charAt(j)){
					if(flag){
						System.out.println("difference is greater than 1");
						return;
					}
					if(s1.length() == s2.length()){						
						flag = true;
					}else {
						if(s1.length()<s2.length()){
							i++;
							flag = true;
						}
						else{
							j++;
							flag = true;
						}
					}
				}
			}
			
			System.out.println("Strings differ by 1");
		
		

	}

}
