package java2;

import java.util.Scanner;

public class armstrongornot {
public static void main(String[] args) {
	int n,num,rev=0;
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
	while(num>0) {
		n=num%10;
		rev=(rev*10)+n;
		num/=10;
	}
	
}
}
