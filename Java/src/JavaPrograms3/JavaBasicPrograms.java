package JavaPrograms3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaBasicPrograms {
	public static void oddnumber() {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		a=sc.nextInt();
		if(a%2!=0) {
			System.out.println("odd number");
		}
	}
	public static void oddnumbersrange() {
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Odd Numbers starting from");
		i=sc.nextInt();
		System.out.println("ending to");
		int j=sc.nextInt();
		System.out.println("-----------------------------------");
		System.out.println("Odd numbers from "+i+" to "+j+" are");
		System.out.println("-----------------------------------");
		while(i<=j) {
			if(i%2!=0) {

				System.out.print(i+" ");	
			}
			i++;
		}
	}
	public static void evennumber() {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		a=sc.nextInt();
		if(a%2==0) {
			System.out.println("Even number");
		}
	}
	
	public static void evennumbersrange() {
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Even Numbers starting from");
		i=sc.nextInt();
		System.out.println("ending to");
		int j=sc.nextInt();
		System.out.println("-----------------------------------");
		System.out.println("Even numbers from "+i+" to "+j+" are");
		System.out.println("-----------------------------------");
		while(i<=j) {
			if(i%2==0) {

				System.out.print(i+" ");	
			}
			i++;
		}
	}
	public static void countoddnos() {
		int count=0;
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.print("Odd numbers starting from :");

		i=sc.nextInt();
		System.out.print("ending to :");
		int j=sc.nextInt();
		while(i<=j) {
			if(i%2!=0) 
			{
				count++;
			}
			i++;
		}
		System.out.println("Total number of odd numbers are : "+count);
		}
	public static void palindrome() {
		int num;
		int rev=0;
		int sum=0;
		int n;
		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Check Whether given number is palindromaa@@@");
		num=sc.nextInt();
		temp=num;
		while(num>0) {
			n=num%10;
			rev=(rev*10)+ n;
			num/=10;
		}
		if(temp==rev) 
		{
		System.out.println("Palindrome number");	
		}
		else 
		{
			System.out.println("Go shit in your pants cuz its not a palindrome hermano");
		}
	}
	public static void digit() {
		long num,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value : ");
		num=sc.nextLong();
		for(;num!=0;num/=10,count++) {
			
		}
		System.out.println("Number of digits in the entered value is : "+count);
	}
	public static void digit1() {
		long num,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value : ");
		num=sc.nextLong();
	
	while(num>0) {

		num=num/10;
		count++;
	}
	System.out.println("Number of digits in the entered value is : "+count);
	}
	public static void armstrong() {
		int num,n,rev=0,temp;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		temp=num;
		while(num>0) {
			n=num%10;
			rev=rev+(n*n*n);
			num/=10;
		}
		if(temp==rev) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not Armstrong number");
		}
	}
	public static void sumofdigits() {
		int num,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		num=sc.nextInt();
		while(num>0) {
			int n=num%10;
			sum=sum+n;
			num/=10;
		}
		System.out.println(sum);
	}
	public static void swapping1() {
		int a=10,b=20,temp;
		System.out.println("Before swapping a="+a+" and b="+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping a="+a+" and b="+b);
	}
	public static void swapping2() {
		int a=10,b=20,temp;
		System.out.println("Before swapping a="+a+" and b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping a="+a+" and b="+b);
	}
	public static void factorial() {
		int fact=1;
		Scanner sc=new Scanner(System.in);
		int num1 = sc.nextInt();
		while(num1>0) {
			fact=fact*num1;
			num1-=1;
		}
		System.out.println(fact);
	}
	public static void repeatitive_words() {
		String s="Welcome Welcome to our hotel";
		String[] s1=s.split(" ");
		Map<String,Integer> m1=new LinkedHashMap<String,Integer>();
		for(int i=0;i<s1.length;i++) {

			if(m1.containsKey(s1[i])) {
				Integer n = m1.get(s1[i]);
				m1.put(s1[i], n+1);
			}
			else {
				m1.put(s1[i], 1);
				m1.containsKey(s1);
			}
		}
		System.out.println(m1);
	}
public static void main(String[] args) {
	repeatitive_words();
}
}
