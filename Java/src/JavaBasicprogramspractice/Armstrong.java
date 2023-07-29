package JavaBasicprogramspractice;

import java.util.Scanner;

public class Armstrong {

public static void main(String[] args) {
	int sum=0,a=0,rev=0,n;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	a=n;
	while(n>0) {
		rev=n%10;
		sum=sum+(rev*rev*rev);
		n=n/10;
		
	}
	if(sum==a) {
		System.out.println("Armstrong ");
	}
	else
	{
		System.out.println("No Armstrong");
	}

}
}
