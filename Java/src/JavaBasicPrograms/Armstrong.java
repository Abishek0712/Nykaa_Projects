package JavaBasicPrograms;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		int n,a,i=0,j=0;
		Scanner sc=new Scanner(System.in);
//		int ma = input.nextInt();
		n=sc.nextInt();
		a=n;
		while(a>0) 
		{
			i=a%10;
			j=j+(i*i*i);
			a=a/10;
		}
		if(n==j) 
		{
			System.out.println("Armstrong number...");
		}
		else 
		{
			System.out.println("Not armstrong number...");
		}

	}
}
