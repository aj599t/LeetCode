package edu.usc.mycode;

public class ReverseAString {

	public static void main(String[] args) {
		System.out.println(new ReverseAString().reverseString("Ankita"));

	}
	
	public String reverseString(String s) {
		
        String a[]=s.split("");
        s="";
        for(int i=a.length-1;i>=0;i--)
            s+=(a[i]);
        return s;
        
    }

}
