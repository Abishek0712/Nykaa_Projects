package javabasicprograms1;

import java.util.Scanner;

public class Factorialofanumber {
public static void main(String[] args) {
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number to be factorialized");
	n=sc.nextInt();
	int fact=1;
	while(n>0) {
		fact=fact*n;
		n-=1;
	}
	System.out.println("Factorial of the given number is "+fact);
}
}
