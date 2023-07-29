package java2;

import java.util.Scanner;

public class Snippet {
	public static void main(String[] args) {
	
	int n,a,i=0,j=0;
	Scanner input=new Scanner(System.in);
	int ma = input.nextInt();
	a=ma;
	while(ma>0) 
	{
		i=a%10;
		j=j+(i*i*i);
		a=a/10;
	}
	if(ma==j) {
		System.out.println("Armstrong number...");
	}
	else {
		System.out.println("Not armstrong number...");
	}
	
}}

