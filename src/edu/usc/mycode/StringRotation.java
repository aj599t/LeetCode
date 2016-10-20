package edu.usc.mycode;

import java.util.*;

public class StringRotation {

	public static void main(String[] args) {

		System.out.println("Enter a string and the string to check for rotation: ");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		
		String s1s1 = s1+s1;
		if(s1s1.contains(s2)){
			System.out.println("Rotation found");
			
		}
		else{
			System.out.println("Rotation not found");
		}
		

	}

}
