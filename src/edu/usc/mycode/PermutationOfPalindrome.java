package edu.usc.mycode;

import java.util.*;
import java.util.Scanner;

public class PermutationOfPalindrome {

	public static void main(String[] args) {
		
		System.out.println("Please enter a String");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		Map<String, Integer> m = new LinkedHashMap<String, Integer>(); 
		
		String a[] = s.split("");
		for(int i=0;i<a.length;i++){
			
			if(m.containsKey(a[i].toLowerCase()))
				m.put(a[i].toLowerCase(),((int) m.get(a[i].toLowerCase()))+1);
			else
				m.put(a[i].toLowerCase(),1);
			
		}
		
		boolean flag = false;
		for (Map.Entry<String, Integer> i : m.entrySet()) {
		    String key = i.getKey();
		    Integer value = i.getValue();
		    //System.out.println(key+ " "+value);
		    if(value % 2 == 1){
		    	if(flag){
		    		System.out.println("Not a palindrome");
		    		return;
		    	}
		    	flag = true;  	
		    	
		    }
		    
		}
		
		if(flag)
			System.out.println("String "+s+" is a Palindrome");
		
		
		sc.close();

	}

	
}
