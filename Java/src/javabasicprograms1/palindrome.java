package javabasicprograms1;

import java.util.Scanner;

public class palindrome {
public static void main(String[] args) {
	String s;
	Scanner sc=new Scanner(System.in);
	s=sc.next();
	String rev="";
	for(int i=s.length()-1;i>=0;i--) {
		rev=rev+s.charAt(i);
	}
	if(s.equals(rev)) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println("Not a palindrome");
	}
}
}
