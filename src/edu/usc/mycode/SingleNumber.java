package edu.usc.mycode;
//Given an array of integers, every element appears twice except for one. Find that single one.
//Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
//xor is used for sum of 2 bits. It two bits are same the result is 0 else result is 1.
//for integers, if two integers are same result is 0 else its an intermediate number
public class SingleNumber {

	public static void main(String[] args) {
		
		int a[] = {1,2,1,2,3};
		
		for(int i=1;i<a.length;i++){
			a[i]^=a[i-1]; //return 0 if same else return 
			System.out.println(a[i]);
		}
		
		System.out.println("Result: "+a[a.length-1]);

	}

}
