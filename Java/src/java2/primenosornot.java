package java2;

import java.util.Scanner;

public class primenosornot {
	public static void checkparticularnoprime() {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		a=sc.nextInt();
		int count=0;
		for(int i=2;i<=a/2;i++) {
			if(a%i==0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println("Prime number.");
		}
		else {
			System.out.println("Not Prime number.");
		}
	}
	public static void checkseriesofnosareprime() {
		for(int i=1;i<=100;i++) {
			int count=0;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0)
				count++;
			}
			if(count==0) {
			System.out.println(i+" Prime number");	
			}
			else {
				System.out.println(i+" is not a Prime number");
			}
		}
	}
public static void main(String[] args) {
	checkparticularnoprime();
	checkseriesofnosareprime();
}
}
