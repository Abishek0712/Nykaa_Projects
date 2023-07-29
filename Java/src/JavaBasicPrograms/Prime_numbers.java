package JavaBasicPrograms;

import java.util.Scanner;

public class Prime_numbers {
	public static void prime_no() {
	Scanner sc=new Scanner(System.in);
	int count=0;
	int n = sc.nextInt();
	for(int i=2;i<=n/2;i++) {
		if(n%i==0) {
			count=1;
		}
	}
	if(count==0) {
		System.out.println("Prime");
	}
	else {
		System.out.println("No prime");
	}
	}
	public static void prime_nos() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Check prime nos from");
		int i=sc.nextInt();
		System.out.println("To");
		int j=sc.nextInt();
		System.out.println();
		System.out.println("-------------------------------");
		System.out.println("The Prime nos from "+i+" to "+j+" are");
		System.out.println("-------------------------------");
		System.out.println();
		for(int n=i;i<=j;i++) {
			int count=0;
			for(int k=2;k<=i/2;k++) {
				if(i%k==0) {
				count=1;
				break;
			}
			}
			if(count==0) {
				System.out.println(i+" is a Prime");
			}
			else {
				System.out.println(i+" is not a prime");
			}
		}
	}
	public static void main(String[] args) {
prime_no();
prime_nos();
}

}
