package edu.usc.mycode;

public class DigitSum {

	public static void main(String[] args) {
		int n=19;
		if(n%9 == 0)
			System.out.println(9);
		else
			System.out.println(n-9*(n/9));

	}

}
