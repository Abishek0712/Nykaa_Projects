package javabasicprograms1;

import java.util.Scanner;

public class checkarmstrongornot {
public static void main(String[] args) {
	int num,n,rev=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number to be checked armstrong or not ");
	num=sc.nextInt();
	int temp=num;
	while(num>0) {
		n=num%10;
		rev=rev+(n*n*n);
		num/=10;
	}
	if(temp==rev) {
		System.out.println("Given number is an armstrong number.");
	}
	else {
		System.out.println("Given number is not an armstrong number.");
	}
}
}
