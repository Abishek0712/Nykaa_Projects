package javabasicprograms1;

import java.util.Scanner;

public class consonantsandvowels {
	
	public static void vowels(String a) {
		
		int count=0;
		for(int i=0;i<a.length();i++) {
			char ch=a.charAt(i);
			if((ch>='a'&&ch<='z')||(ch>='A' &&ch<='Z')){
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				count++;
			}
		}
			
		}
		System.out.println("Total vowels in the given string are "+count);
	}
	public static void consonants(String a) {
		char[] c=a.toCharArray();
		int count=0;
		for(int i=0;i<c.length;i++) {
			char ch=c[i];
			if((ch>='a'&&ch<='z')||(ch>='A' &&ch<='Z')){
			
			if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')) {
				count++;
			}
		}
			
		}
		System.out.println("Total consonants in the given string are "+count);
	}
public static void main(String[] args) {
	System.out.println("Enter String");
	Scanner sc=new Scanner(System.in);
	String a=sc.nextLine();
	vowels(a);
	consonants(a);
}
}
