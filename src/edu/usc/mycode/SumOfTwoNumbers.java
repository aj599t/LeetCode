package edu.usc.mycode;
//Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -
public class SumOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5,y=10;
		while (y != 0)
		{
		    // carry now contains common set bits of x and y
		    int carry = x & y;  
		 
		    // Sum of bits of x and y where at least one of the bits is not set
		    x = x ^ y; 
		
		    // Carry is shifted by one so that adding it to x gives the required sum
		    y = carry << 1;
		}
		
		System.out.println(x);

	}

}
