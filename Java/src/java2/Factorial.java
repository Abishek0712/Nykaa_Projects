package java2;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	int num,n,fact=1;;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number ");
	num=sc.nextInt();
	int temp = num;
	while(num>0) {
		fact=fact*num;
		num-=1;
	}
	System.out.println("Factorial of "+temp+" is "+fact);
}
}
