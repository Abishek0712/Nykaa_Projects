package JavaBasicPrograms;

import java.util.Scanner;

public class Armstrongg {
	private static int a;
	public static void checkIsArmstrong() {
		int n,a,i=0,j=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		a=n;
		while(n>0) {
			i=a%10;
			j=j+(i*i*i);
			a=a/10;
		}
		if(n==j) {
			System.out.println("It's an armstrong number..");
		}
		else {
			System.out.println("It's not an armstrong number");
		}
	}
	public static void check0to1000isArmstrong() {
		int i,a=0,sum=0,r=0;
		Scanner sc=new Scanner(System.in);
		for(i=1;i<=1000;i++) {
		a=i;
		while(i>0) {
			r=a%10;
			sum=sum+(r*r*r);
			a=a/10;
		}
		if(i==sum) {
			System.out.println("It's an armstrong number..");
		}
		else {
			System.out.println("It's not an armstrong number");
		}
	}

	}
	public static void descendingorder() {
		int temp;
		int a[]= {12,22,11,23,45,67};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int j=0;j<a.length;j++) {
			System.out.println(a[j]);
		}
	}
	public static void print() {
		// TODO Auto-generated method stub
		System.out.println("printed");
	}
	public static void fibonacci() {
		int a=0,b=1,c;
		for(int i=1;i<=10;i++) {
			c=a+b;
			System.out.print(c+",");
			a=b;
			b=c;
		}
		System.out.println();
	}
	public static void minval() {
		int num[]= {10,11,22,33,44,55};
		int min=num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i]<min) {
				min=num[i];
			}
		}
		System.out.println("Min number");
		System.out.println(min);
	}
	public static void multiplicationtable() {
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter the table to multiple");
		a = sc.nextInt();

		System.out.println("Till which number to multiple");
		b = sc.nextInt();
		for(int i=0;i<=b;i++) {
			int c=a*i;
			System.out.println(a+"*"+i+"="+c);
		}
	}
	public static void prime() {
		int c=0;
		System.out.println("Prime numbers");
		for(int n=1;n<10;n++) {
			int count=0;
			for(int i=2;i<n/2;i++) {
				
			}
		}
	}
	public static void main(String[] args) {
		descendingorder();
		fibonacci();
		minval();
		multiplicationtable();
	}
}
