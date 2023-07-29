package javabasicprograms1;

import java.util.Scanner;

public class reversenumber {
public static void main(String[] args) {
	int rev=0,n,num;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number to be reversed :");
	num=sc.nextInt();
	while(num>0) {
		n=num%10;      //1//312%10=2    //2//31%10=1      //3//3%10=3
		rev=(rev*10)+n;//1//(0*10)+2=2  //2//(2*10)+1=21  //3//210+3=213
		num/=10;       //1//312/10=31   //2//31/3=3       //3//3/10=0
	}
	System.out.println(rev);
}
}
