package javabasicprograms1;

import java.util.Scanner;

public class oddnofrom1to10 {
public static void main(String[] args) {
	
	for(int j=1;j<=10;j++) {
	
		if(j%2==0) {
				System.out.println(j+" Its an even number");
			}
		if(j==1) {
			System.out.println(j+" is a composite number");
		}
		else if(j%2!=0) {
			System.out.println(j+" is an odd number");
		}
		
	}
}
}
