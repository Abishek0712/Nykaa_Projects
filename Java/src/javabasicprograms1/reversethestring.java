package javabasicprograms1;

public class reversethestring {

	public static void main(String[] args) 
	{
		String s="hello";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println("Reverse a string value is "+rev);
	}
}
