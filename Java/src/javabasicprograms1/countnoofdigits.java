package javabasicprograms1;

import java.util.Scanner;

public class countnoofdigits {
public static void main(String[] args) {
	int num,count=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number :");
	num=sc.nextInt();
	while(num>0) {
		count++;
		num/=10;
	}
	System.out.println("No of digits in the entered number is:"+count);
}
}
