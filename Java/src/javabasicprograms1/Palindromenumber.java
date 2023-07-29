package javabasicprograms1;

import java.util.Scanner;

public class Palindromenumber {
public static void main(String[] args) {
	int num,temp,rev=0,n;
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
	temp=num;
	while(num>0) {
		n=num%10;
		rev=(rev*10)+n;
		num/=10;
	}
	if(temp==rev) {
		System.out.println("Given number is a palindrome number.");
	}
	else {
		System.out.println("Given number is not a palindrome number.");
	}
}
}
