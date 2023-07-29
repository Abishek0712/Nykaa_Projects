package JavaBasicPrograms;

import java.util.Scanner;

public class Reverse {
	public static void reversenum() {
		int a,i=0,j=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be reversed :");
		int num = sc.nextInt();
		a=num;
		while(a>0) {
			i=a%10;
			j=(j*10)+i;
			a=a/10;
		}
		System.out.println("Reverse of the number is:");
		System.out.println(j);
	}
	public static void palindromenosforrange(){
		for(int n=50;n<=60;n++) {
			int i=0,j=0,a;
			
			a=n;
			while(a>0) {
				i=a%10;
				j=(j*10)+i;
				a=a/10;
			}
			if(n==j) {
				System.out.println(n+" is a Palindrome number");
				
			}

			else
			{
				System.out.println(n+" is not a palindrome number");
			}
		}
		
	}
	public static void palindrome() {
		Scanner sc=new Scanner(System.in);
		int  n = sc.nextInt();
		int i=0,j=0;
		while(n>0) {
			
		}
	}
	public static void main(String[] args) {
		reversenum();
		palindromenosforrange();
	}
}
