package edu.usc.mycode;

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class Timein24Hrs {
	
	List numbers = new ArrayList();

	
	public String solution(int A, int B, int C, int D){
		String result = "";
		int num[] = {A,B,C,D};
		
		
		permute(num, 0);
		
		Iterator it = numbers.iterator();
		//System.out.println("value");
		int max = 0;
		while(it.hasNext()){
			int k = (int)it.next();
			//System.out.println(k);
			int a = k/100;
			int b = k%100;
			if(a<24 && a>0){
				if(b<60 && b>0)
					if(k>max)
						max = k;
					
			}
			
		}
		if(max == 0)
			return "NOT POSSIBLE";
		else{
			result = Integer.toString(max);
			if(result.length() == 3)
				result="0"+result.charAt(0)+":"+result.substring(1);
			else
				result = result.substring(0, 2)+":"+result.substring(2);
			return result;
		}
		

		
		
	}
	
	public static void main(String[] args) {
		Timein24Hrs t = new Timein24Hrs();
		System.out.println("Please enter 3 numbers");
		//Scanner sc = new Scanner(System.in);
		//int num[] = new int[4];
		int num[] = {9,3,5,9};
		//for(int i=0; i<num.length; i++)
			//num[i] = sc.nextInt();
		System.out.println(t.solution(5,0,3,4));
		
		
	}
	
	int [] swap(int i, int j, int a[]){
		
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		return a;
	}
	
	
	void permute(int a[], int k){
		
		if(k == a.length){
			String b = "";
			for(int i=0; i<a.length; i++){
				//System.out.print(a[i]);
				b += a[i]+"";
			}
			numbers.add(Integer.parseInt(b));
			//System.out.println();
		}
		
		for(int i=k;i<a.length;i++){
			a = swap(i, k, a);
			permute(a, k+1);
			a = swap(i, k, a);
		}
		
	}

}
