package JavaBasicprogramspractice;

import java.util.Scanner;

public class Armstrongnumberfrom0to1000 {
	public static void main(String[] args) {
	
	int c=0;
	
	
	for(int n=1;n<=1000;n++) {
		int a,i,j=0;
		a=n;
		while(a>0) {
			i=a%10;
			j=j+(i*i*i);
			a=a/10;
		}
		if(j==n) {
			System.out.println(a+"  is Armstrong number");
			c++;
		}
		
	}
	
}
	
	}
