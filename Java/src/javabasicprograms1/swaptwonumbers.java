package javabasicprograms1;

import java.util.Scanner;

public class swaptwonumbers {
	public static void withthirdvariable(int a,int b) {
		System.out.println();
		System.out.println("Swappingwiththirdvariable");
		System.out.println("------------------------------");
		System.out.println("Value of a before swapping is "+a);
		System.out.println("Value of b before swapping is "+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("Value of a after swapping is "+a);
		System.out.println("Value of b after swapping is "+b);
	}
	public static void withoutthirdvariable(int a,int b) {
		System.out.println();
		System.out.println("Swappingwithoutthirdvariable");
		System.out.println("-----------------------------------");
		System.out.println("Value of a is "+a);
		System.out.println("Value of b is "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Value of a after swapping is "+a);
		System.out.println("Value of b after swapping is "+b);
	}
public static void main(String[] args) {
	System.out.println("Enter the value of a:");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	System.out.println("Enter the value of b:");
	int b=sc.nextInt();
	withthirdvariable(a,b);
	withoutthirdvariable(a,b);
	
}
}
